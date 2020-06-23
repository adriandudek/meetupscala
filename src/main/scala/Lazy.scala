object Lazy extends App {
 // util.Properties.setProp("scala.time","true")


  /**
   * evaluation and call by value
   */
  val arg = {println("eval arg 4"); 4}
  funExample({println("funExample(in)");arg})


  println("-"*20)

  /**
   * lazy evaluation and call by value
   */
  lazy val arg1 = {println("eval arg1"); 4}
  funExample({println("funExample(in)");arg1})

  println("-"*20)

  /**
   * lazy evaluation and call by name function
   */
  funExampleLazy(()=>{println("eval arg2"); 4})


  println("-"*20)
  /**
   * lazy evaluation and call by name scala syntax
   */
  funExampleLazyScalaSyntax({println("eval arg3"); 4})


  /**
   * functions
   *
   */
  def funExample(in:Int) = {
    println(s"eval..funExample")
  }


  def funExampleLazy(in:()=> Int) = {
    println(s"eval..funExampleLazy")
    in() + in()
  }


  def funExampleLazyScalaSyntax(in: => Int) = {
    println(s"eval..funExampleLazyScalaSyntax")
    in +in
  }

}

