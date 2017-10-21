
object P03{
  def nth[T](key:Int,l:List[T]):T = l match {
    case x :: _  if key == 0 => x
    case _ :: xs if key > 0 => nth(key - 1,xs)
    case  _ => sys.error("Please input List type")
  }
}
