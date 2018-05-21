package sri.victory

import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault => NoValue, OptionalParam => OP}
import sri.core.{CreateElementJSNoInline, JSComponent, ReactElement, ReactNode}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("victory-native", "VictoryLine")
object VictoryLineComponent extends JSComponent[VictoryLineProps]

object Interpolations extends Enumeration {
  type Interpolations = Value
  val basis, bundle, cardinal, catmullRom, linear, monotoneX,
  monotoneY, natural, step, stepAfter, stepBefore = Value
}
import Interpolations._

trait VictoryLineProps extends js.Object {
  def interpolation: js.UndefOr[Interpolations] = js.undefined
}

object VictoryLine {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            data: OP[js.Any] = NoValue,  // should be OP[js.Array[js.Any] | js.Object]
            width: OP[Int] = NoValue,
            interpolation: OP[String] = NoValue, // should be OP[Alignments]
            @exclude dataProps: OP[VictoryDataProps] = NoValue,
            @exclude baseProps: OP[VictoryBaseProps] = NoValue,
            @exclude extraProps: OP[VictoryLineProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryLineComponent.type, Unit] = null)(
    children: ReactNode*)
  : ReactElement { type Instance = VictoryLineComponent.type } = {
    val props = FunctionObjectMacro()
    Seq(extraProps, baseProps, dataProps).foreach(i =>
      i.foreach(v => {
        MergeJSObjects(props, v)
      })
    )
    CreateElementJSNoInline[VictoryLineComponent.type](VictoryLineComponent,
      props.asInstanceOf[VictoryLineProps],
      key,
      ref,
      children.toJSArray)
  }
}
