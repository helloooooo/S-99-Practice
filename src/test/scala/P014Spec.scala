/**
  * Created by Yomi on 2017/10/22.
  */
import org.scalatest.{FlatSpec, _}
class P014Spec extends  FlatSpec with DiagrammedAssertions{
  val p014 = new P014()
  val p16 = new P16()
  val p15 = new P15()
  val p17 = new P17()
  val p18 = new P18()
  assert(p014.duplicate(List('a','b','c','c','d')) ==List('a','a','b','b','c','c','c','c','d','d'))
  assert(p16.drop(3,List('a','b','c','d','e','f','g','h','i','j','k')) == List('a','b','d','e','g','h','j','k'))
  assert(p15.duplicateN(3,List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  assert(p17.split(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  assert(p18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==  List('d, 'e, 'f, 'g))
}
