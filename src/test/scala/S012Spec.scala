/**
  * Created by Yomi on 2017/10/22.
  */
import  org.scalatest._
class S012Spec extends FlatSpec with DiagrammedAssertions{
  val p12 = new P012()
  assert(p12.decode( List((4,'a'), (1,'b'),(2,'c'), (2,'a'), (1,'d'), (4,'e')))== List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
}
