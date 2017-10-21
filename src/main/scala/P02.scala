
object P02 {
  def pnultimate[T](l:List[T]):T = l match {
    case x :: _ ::Nil => x
    case _  :: x :: xs => pnultimate(x :: xs)
    case _ => sys.error("please push list for Integer")
  }
}
