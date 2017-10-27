/**
  * Created by Yomi on 2017/10/26.
  */
import org.scalatest.{FlatSpec, _}
class P19Spec extends FlatSpec with DiagrammedAssertions {
  val p19 = new P19()
  val p20 = new P20()
  assert(p20.removeAt(1, List('a, 'b, 'c, 'd)) ==  (List('a, 'c, 'd),'b) )
  assert(p19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
}
