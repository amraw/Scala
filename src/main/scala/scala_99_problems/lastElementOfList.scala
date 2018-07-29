package scala_99_problems

object lastElementOfList {
  def lastElement[A](x:List[A]): A = x match {
    case h :: Nil => h
    case _ :: tail=> lastElement(tail)
    case _ => throw new NoSuchElementException
  }
  def main(args: Array[String]): Unit = {
    print(lastElement(List(1,2,3,4,5)))
  }
}
