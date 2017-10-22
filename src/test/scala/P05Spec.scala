/**
  * Created by Yomi on 2017/06/30.
  */
import org.scalatest._
class P05Spec extends  FlatSpec with DiagrammedAssertions {
  val p05 = new P05

  assert(p05.reverse(List(1,2,3,4,5)) === List(5,4,3,2,1))

}
