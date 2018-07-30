package scala_99_problems

object numbElementList {
  def getNumbElement[A](ls:List[A]): Int={
    def getNumbElementsSub(n:Int, ls:List[A]):Int= ls match {
      case Nil => n
      case x::tail=> getNumbElementsSub(n+1, tail)
    }
    getNumbElementsSub(0, ls)
  }

  def main(args: Array[String]): Unit={
    val list = List(1,2,3,4,5)
    print("The number of Element in List "+ getNumbElement(list))
  }
}
