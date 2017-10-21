/**
  * Created by Yomi on 2017/06/30.
  */
import org.scalatest._
class P05Spec extends  FlatSpec with DiagrammedAssertions {
  val p05 = new P05
  val p06 = new P06
  val p07 = new P07
  val p08 = new P08
  assert(p05.reverse(List(1,2,3,4,5)) === List(5,4,3,2,1))
  assert(p06.isPalindrome(List(1,2,3,2,1)) === true)
  assert(p06.isPalindrome(List(1,2,3,2,2)) === false)
  assert(p07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1,1,2,3,5,8))
  assert(p08.comperess(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
}
