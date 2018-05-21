package sri.victory

import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault => NoValue, OptionalParam => OP}
import sri.core.{CreateElementJSNoInline, JSComponent, ReactElement, ReactNode}
import sri.universal.{MergeJSObjects, PropTypes}

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("victory-native", "VictoryScatter")
object VictoryScatterComponent extends JSComponent[VictoryScatterProps]

object Symbols extends Enumeration {
//  type Alignments = Value
  val circle, diamond, plus, minus, square, star, triangleDown, triangleUp = Value
}
//import Alignments._

trait VictoryScatterProps extends js.Object {
  /*
    size: PropTypes.oneOfType([ CustomPropTypes.nonNegative, PropTypes.func ]),
    symbol: PropTypes.oneOfType([
      PropTypes.oneOf([
        "circle", "diamond", "plus", "minus", "square", "star", "triangleDown", "triangleUp"
      ]),
      PropTypes.func
    ])
   */
  def bubbleProperty: js.UndefOr[String] = js.undefined
  def maxBubbleSize: js.UndefOr[Double] = js.undefined
  def minBubbleSize: js.UndefOr[Double] = js.undefined
  def size: js.UndefOr[Double | js.Function] = js.undefined
  def symbol: js.UndefOr[Symbols.Value | js.Function] = js.undefined
}

object VictoryScatter {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            data: OP[js.Any] = NoValue,  // should be OP[js.Array[js.Any] | js.Object]
            size: OP[Double] = NoValue,
            symbol: OP[String] = NoValue,
//            width: OP[Int] = NoValue,
            @exclude dataProps: OP[VictoryDataProps] = NoValue,
            @exclude baseProps: OP[VictoryBaseProps] = NoValue,
            @exclude extraProps: OP[VictoryScatterProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryScatterComponent.type, Unit] = null)(
    children: ReactNode*)
  : ReactElement { type Instance = VictoryScatterComponent.type } = {
    val props = FunctionObjectMacro()
    Seq(extraProps, baseProps, dataProps).foreach(i =>
      i.foreach(v => {
        MergeJSObjects(props, v)
      })
    )
    CreateElementJSNoInline[VictoryScatterComponent.type](VictoryScatterComponent,
      props.asInstanceOf[VictoryScatterProps],
      key,
      ref,
      children.toJSArray)
  }
}
