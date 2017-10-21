/**
  * Created by Yomi on 2017/06/29.
  */
import org.scalatest._
class P01Spec extends FlatSpec with DiagrammedAssertions{
  val p01 = new P01
  assert(p01.last(List(1,2,3,4,5)) === 5)
}
