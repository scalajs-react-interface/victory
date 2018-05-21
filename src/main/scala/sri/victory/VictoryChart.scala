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
@JSImport("victory-native", "VictoryChart")
object VictoryChartComponent extends JSComponent[VictoryChartProps]

trait VictoryChartProps extends js.Object {
/*
export const voronoiContainerMixin = (base) => class VictoryVoronoiContainer extends base {
  static propTypes = {
    ...VictoryContainer.propTypes,
    activateData: PropTypes.bool,
    activateLabels: PropTypes.bool,
    disable: PropTypes.bool,
    labelComponent: PropTypes.element,
    labels: PropTypes.func,
    onActivated: PropTypes.func,
    onDeactivated: PropTypes.func,
    radius: PropTypes.number,
    voronoiBlacklist: PropTypes.arrayOf(PropTypes.string),
    voronoiDimension: PropTypes.oneOf(["x", "y"]),
    voronoiPadding: PropTypes.number
  };

export default class VictoryContainer extends React.Component {
  static propTypes = {
    children: PropTypes.oneOfType([
      PropTypes.arrayOf(PropTypes.node),
      PropTypes.node
    ]),
    className: PropTypes.string,
    containerId: PropTypes.oneOfType([PropTypes.number, PropTypes.string]),
    containerRef: PropTypes.func,
    desc: PropTypes.string,
    events: PropTypes.object,
    height: CustomPropTypes.nonNegative,
    origin: PropTypes.shape({ x: CustomPropTypes.nonNegative, y: CustomPropTypes.nonNegative }),
    polar: PropTypes.bool,
    portalComponent: PropTypes.element,
    portalZIndex: CustomPropTypes.integer,
    responsive: PropTypes.bool,
    style: PropTypes.object,
    theme: PropTypes.object,
    title: PropTypes.string,
    width: CustomPropTypes.nonNegative
  }

   */
}

object VictoryChart {
  @inline
  def apply(width: OP[Int] = NoValue,
            containerComponent: OP[ReactElement] = NoValue,
            @exclude extraProps: OP[VictoryChartProps] = NoValue,
            @exclude baseProps: OP[VictoryBaseProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryChartComponent.type, Unit] = null)(
    children: ReactNode*)
  : ReactElement { type Instance = VictoryChartComponent.type } = {
    val props = FunctionObjectMacro()
    Seq(extraProps, baseProps).foreach(i =>
      i.foreach(v => {
        MergeJSObjects(props, v)
      })
    )
    CreateElementJSNoInline[VictoryChartComponent.type](VictoryChartComponent,
      props.asInstanceOf[VictoryChartProps],
      key,
      ref,
      children.toJSArray)
  }
}
