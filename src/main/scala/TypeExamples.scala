package object CurringPack{
  trait Curring[T]{
    def curring(a:T)(b:T):T
  }

  implicit object IntInstane extends Curring[Int]{
    def curring(a: Int)(b: Int): Int = a+b
  }
  implicit object StringInstane extends Curring[String]{
    def curring(a: String)(b: String): String = a+b
  }
  def curr[T:Curring](a:T)(b:T): T ={
    val instance = implicitly[Curring[T]]
    instance.curring(a)(b)
 }
}

object TypeExamples extends App{

  val a:Char = 61
  println(a)

  val a1 = 61:Char
  println(a1)

  val a2 = 61
  println(a2)

  val x = Nil:List[String]

  import CurringPack._
  println(curr(2)(3))
  println(curr("test1")("test2"))



//  def I[T]:T=>T = (t:T) => t
//  println(I("test"))
//  println(I(I))
//  println(I)


}
