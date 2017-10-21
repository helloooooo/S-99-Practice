/**
  * Created by Yomi on 2017/06/29.
  */
import org.scalatest._
class P04Spec extends FlatSpec with DiagrammedAssertions {
  val p04 = new P04
  assert(p04.length(List(1,2,3,3,554)) === 5)
}
