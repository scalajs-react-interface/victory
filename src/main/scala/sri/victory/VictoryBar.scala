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
@JSImport("victory-native", "VictoryBar")
object VictoryBarComponent extends JSComponent[VictoryBarProps]

object Alignments extends Enumeration {
//  type Alignments = Value
  val start, middle, end = Value
}
//import Alignments._

trait VictoryBarProps extends js.Object {
  def alignment: js.UndefOr[Alignments.Value] = js.undefined
  def barRatio: js.UndefOr[Double] = js.undefined
  def cornerRadius: js.UndefOr[Int] = js.undefined
  def horizontal: js.UndefOr[Boolean] = js.undefined
}

object VictoryBar {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            data: OP[js.Any] = NoValue,  // should be OP[js.Array[js.Any] | js.Object]
            width: OP[Int] = NoValue,
            @exclude dataProps: OP[VictoryDataProps] = NoValue,
            @exclude baseProps: OP[VictoryBaseProps] = NoValue,
            @exclude extraProps: OP[VictoryBarProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryBarComponent.type, Unit] = null)(
    children: ReactNode*)
  : ReactElement { type Instance = VictoryBarComponent.type } = {
    val props = FunctionObjectMacro()
    Seq(extraProps, baseProps, dataProps).foreach(i =>
      i.foreach(v => {
        MergeJSObjects(props, v)
      })
    )
    CreateElementJSNoInline[VictoryBarComponent.type](VictoryBarComponent,
      props.asInstanceOf[VictoryBarProps],
      key,
      ref,
      children.toJSArray)
  }
}
