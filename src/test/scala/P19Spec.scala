/**
  * Created by Yomi on 2017/10/26.
  */
import org.scalatest.{FlatSpec, _}
class P19Spec extends FlatSpec with DiagrammedAssertions {
  val p19 = new P19()
  assert(p19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
}
