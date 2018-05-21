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
@JSImport("victory-native", "VictoryVoronoiContainer")
object VictoryVoronoiContainerComponent extends JSComponent[VictoryVoronoiContainerProps]

trait VictoryVoronoiContainerProps extends js.Object {
/*
children: PropTypes.oneOfType([
      PropTypes.arrayOf(PropTypes.node),
      PropTypes.node
    ]),
    defaultAxes: PropTypes.shape({
      independent: PropTypes.element,
      dependent: PropTypes.element
    }),
    defaultPolarAxes: PropTypes.shape({
      independent: PropTypes.element,
      dependent: PropTypes.element
    }),
    endAngle: PropTypes.number,
    innerRadius: CustomPropTypes.nonNegative,
    startAngle: PropTypes.number
 */
}

object VictoryVoronoiContainer {
  @inline
  def apply(width: OP[Int] = NoValue,
            @exclude extraProps: OP[VictoryVoronoiContainerProps] = NoValue,
            @exclude baseProps: OP[VictoryBaseProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryVoronoiContainerComponent.type, Unit] = null)(
    children: ReactNode*)
  : ReactElement { type Instance = VictoryVoronoiContainerComponent.type } = {
    val props = FunctionObjectMacro()
    Seq(extraProps, baseProps).foreach(i =>
      i.foreach(v => {
        MergeJSObjects(props, v)
      })
    )
    CreateElementJSNoInline[VictoryVoronoiContainerComponent.type](VictoryVoronoiContainerComponent,
      props.asInstanceOf[VictoryVoronoiContainerProps],
      key,
      ref,
      children.toJSArray)
  }
}
