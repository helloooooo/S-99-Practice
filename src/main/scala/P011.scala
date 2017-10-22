/**
  * Created by Yomi on 2017/10/22.
  */

class P011 {
  def encodeModfified[T](l:List[(Int,T)]):List[Any] = {
    l.map{x =>  x._1 match {
      case 1=> x._2
      case n => (n,x._2)
      }
    }
  }
}
