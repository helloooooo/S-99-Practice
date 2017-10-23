/**
  * Created by Yomi on 2017/10/22.
  */
import org.scalatest.{FlatSpec, _}
class P014Spec extends  FlatSpec with DiagrammedAssertions{
  val p014 = new P014()
  assert(p014.duplicate(List('a','b','c','c','d')) ==List('a','a','b','b','c','c','c','c','d','d'))
}
