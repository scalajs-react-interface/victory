package sri.victory

import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault => NoValue, OptionalParam => OP}
import sri.core.{CreateElementJSNoInline, JSComponent, ReactElement, ReactNode}
import sri.universal.{MergeJSObjects, PropTypes}

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

trait VictoryCategories3D  extends js.Object {
  val x: js.UndefOr[js.Array[String]] = js.undefined
  val y: js.UndefOr[js.Array[String]] = js.undefined
}

trait VictoryPadding extends js.Object {
  def top: js.UndefOr[Int] = js.undefined
  def bottom: js.UndefOr[Int] = js.undefined
  def left: js.UndefOr[Int] = js.undefined
  def right: js.UndefOr[Int] = js.undefined
}

trait VictoryDomainPaddingXY extends js.Object {
  def x: js.UndefOr[Int | js.Array[Int]] = js.undefined
  def y: js.UndefOr[Int | js.Array[Int]] = js.undefined
}

trait VictoryStyle extends js.Object {
  def parent: js.UndefOr[js.Object] = js.undefined
  def data: js.UndefOr[js.Object] = js.undefined
  def labels: js.UndefOr[js.Object] = js.undefined
}

trait VictoryDataProps extends js.Object {
  def categories: js.UndefOr[js.Array[String] | VictoryCategories3D] = js.undefined
  def data: js.UndefOr[js.Array[js.Any] | js.Object] = js.undefined
  def dataComponent: js.UndefOr[ReactElement] = js.undefined
  def labelComponent: js.UndefOr[ReactElement] = js.undefined
  def labels: js.UndefOr[js.Object => js.Object | js.Array[_]] = js.undefined
  def style: js.UndefOr[VictoryStyle] = js.undefined
  def x: js.UndefOr[(js.Object) => _ | Int | String | js.Array[String]] = js.undefined
  def y: js.UndefOr[(js.Object) => _ | Int | String | js.Array[String]] = js.undefined
  /*
    samples: CustomPropTypes.nonNegative,
    sortKey: PropTypes.oneOfType([
      PropTypes.func,
      CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
      PropTypes.string,
      PropTypes.arrayOf(PropTypes.string)
    ]),
    sortOrder: PropTypes.oneOf(["ascending", "descending"]),
    x: PropTypes.oneOfType([
      PropTypes.func,
      CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
      PropTypes.string,
      PropTypes.arrayOf(PropTypes.string)
    ]),
    y: PropTypes.oneOfType([
      PropTypes.func,
      CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
      PropTypes.string,
      PropTypes.arrayOf(PropTypes.string)
    ]),
    y0: PropTypes.oneOfType([
      PropTypes.func,
      CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
      PropTypes.string,
      PropTypes.arrayOf(PropTypes.string)
    ])
  };
   */
}

trait VictoryDomain extends js.Object {
  def x: js.UndefOr[js.Array[Float]] = js.undefined
  def y: js.UndefOr[js.Array[Float]] = js.undefined
}

trait VictoryBaseProps extends js.Object {
  def width: js.UndefOr[Int] = js.undefined
  def height: js.UndefOr[Int] = js.undefined
  def name: js.UndefOr[String] = js.undefined
  def animate: js.UndefOr[Boolean | js.Object] = js.undefined
  def padding: js.UndefOr[Int | VictoryPadding] = js.undefined
  def domainPadding:  js.UndefOr[Int | js.Array[Int] | VictoryDomainPaddingXY ] = js.undefined
  def theme: js.UndefOr[js.Object] = js.undefined
  def domain: js.UndefOr[js.Array[Float] | VictoryDomain] = js.undefined
  def containerComponent: js.UndefOr[ReactElement] = js.undefined
  /*
    animate: PropTypes.oneOfType([PropTypes.bool, PropTypes.object]),
    containerComponent: PropTypes.element,
    domain: PropTypes.oneOfType([
      CustomPropTypes.domain,
      PropTypes.shape({ x: CustomPropTypes.domain, y: CustomPropTypes.domain })
    ]),
    eventKey: PropTypes.oneOfType([
      PropTypes.func,
      CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
      PropTypes.string
    ]),
    events: PropTypes.arrayOf(PropTypes.shape({
      target: PropTypes.oneOf(["data", "labels", "parent"]),
      eventKey: PropTypes.oneOfType([
        PropTypes.array,
        CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
        PropTypes.string
      ]),
      eventHandlers: PropTypes.object
    })),
    externalEventMutations: PropTypes.arrayOf(PropTypes.shape({
      callback: PropTypes.function,
      childName: PropTypes.oneOfType([
        PropTypes.string,
        PropTypes.array
      ]),
      eventKey: PropTypes.oneOfType([
        PropTypes.array,
        CustomPropTypes.allOfType([CustomPropTypes.integer, CustomPropTypes.nonNegative]),
        PropTypes.string
      ]),
      mutation: PropTypes.function,
      target: PropTypes.oneOfType([
        PropTypes.string,
        PropTypes.array
      ])
    })),
    groupComponent: PropTypes.element,
    origin: PropTypes.shape({ x: PropTypes.number, y: PropTypes.number }),
    polar: PropTypes.bool,
    range: PropTypes.oneOfType([
      CustomPropTypes.domain,
      PropTypes.shape({ x: CustomPropTypes.domain, y: CustomPropTypes.domain })
    ]),
    scale: PropTypes.oneOfType([
      CustomPropTypes.scale,
      PropTypes.shape({ x: CustomPropTypes.scale, y: CustomPropTypes.scale })
    ]),
    sharedEvents: PropTypes.shape({
      events: PropTypes.array,
      getEventState: PropTypes.func
    }),
    standalone: PropTypes.bool,
 */
}
