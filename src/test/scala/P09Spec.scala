/**
  * Created by Yomi on 2017/10/22.
  */
import org.scalatest._
class P09Spec extends FlatSpec with DiagrammedAssertions{
  val p09 = new P09
  val p010 = new P10
  assert(p09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  )
  assert(p010.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e')))
}
