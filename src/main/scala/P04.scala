object P04 {
  def length[T](il:List[T]):Int = {
    def loop[T](l: List[T], count: Int): Int =
      l match {
        case x :: xs => loop(xs, count + 1)
        case x :: Nil => count
        case _ => sys.error("Error occurerd :plz list")
      }
    loop(il, 0)
  }
}