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
@JSImport("victory-native", "VictoryAxis")
object VictoryAxisComponent extends JSComponent[VictoryAxisProps]

trait VictoryAxisProps extends js.Object {
  def crossAxis: js.UndefOr[Boolean] = js.undefined
  def dependentAxis: js.UndefOr[Boolean] = js.undefined
  def fixLabelOverlap: js.UndefOr[Boolean] = js.undefined
  def label: js.UndefOr[String] = js.undefined

  /*
    axisComponent: PropTypes.element,
    axisLabelComponent: PropTypes.element,
    categories: PropTypes.oneOfType([
      PropTypes.arrayOf(PropTypes.string),
      PropTypes.shape({
        x: PropTypes.arrayOf(PropTypes.string), y: PropTypes.arrayOf(PropTypes.string)
      })
    ]),
    dependentAxis: PropTypes.bool,
    events: PropTypes.arrayOf(PropTypes.shape({
      target: PropTypes.oneOf(["axis", "axisLabel", "grid", "ticks", "tickLabels"]),
      eventKey: PropTypes.oneOfType([
        PropTypes.array,
        CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
        PropTypes.string
      ]),
      eventHandlers: PropTypes.object
    })),
    fixLabelOverlap: PropTypes.bool,
    gridComponent: PropTypes.element,
    groupComponent: PropTypes.element,
    invertAxis: PropTypes.bool,
    label: PropTypes.any,
    offsetX: PropTypes.number,
    offsetY: PropTypes.number,
    orientation: PropTypes.oneOf(["top", "bottom", "left", "right"]),
    origin: PropTypes.shape({ x: PropTypes.number, y: PropTypes.number }),
    stringMap: PropTypes.object,
    style: PropTypes.shape({
      parent: PropTypes.object, axis: PropTypes.object, axisLabel: PropTypes.object,
      grid: PropTypes.object, ticks: PropTypes.object, tickLabels: PropTypes.object
    }),
    tickComponent: PropTypes.element,
    tickCount: CustomPropTypes.allOfType([
      CustomPropTypes.integer, CustomPropTypes.greaterThanZero
    ]),
    tickFormat: PropTypes.oneOfType([ PropTypes.func, CustomPropTypes.homogeneousArray ]),
    tickLabelComponent: PropTypes.element,
    tickValues: CustomPropTypes.homogeneousArray
 */
}

object VictoryAxis {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            crossAxis: OP[Boolean] = NoValue,
            dependentAxis: OP[Boolean] = NoValue,
            domain: OP[js.Array[Int]] = NoValue,
            label: OP[String] = NoValue,
            @exclude baseProps: OP[VictoryBaseProps] = NoValue,
            @exclude extraProps: OP[VictoryAxisProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryAxisComponent.type, Unit] = null)(
    children: ReactNode*)
  : ReactElement { type Instance = VictoryAxisComponent.type } = {
    val props = FunctionObjectMacro()
    Seq(extraProps, baseProps).foreach(i =>
      i.foreach(v => {
        MergeJSObjects(props, v)
      })
    )
    CreateElementJSNoInline[VictoryAxisComponent.type](VictoryAxisComponent,
      props.asInstanceOf[VictoryAxisProps],
      key,
      ref,
      children.toJSArray)
  }
}
