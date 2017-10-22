
class P01 {
  def last(l:List[Int]):Int = l match {
    case x :: Nil => x
    case x :: xs => last(xs)
    case _ => sys.error("please input list with Integer")
  }
}

