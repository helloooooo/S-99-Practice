/**
  * Created by Yomi on 2017/10/22.
  */

class P014 {
  def duplicate[T](l:List[T]):List[T] ={ l match {
      case x ::xs  => x :: x  :: duplicate(xs)
      case Nil => Nil
    }

  }
}
