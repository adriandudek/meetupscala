object Recursion  extends App{

  def naturalNumberSum(in:Int):Int = {
    if(in<=0) 0
    else in+ naturalNumberSum(in-1)
  }


//  println(
//    naturalNumberSum(5)
//  )


  def naturalNumberSum1(in:Int):Int = {
    if(in<=0) 0
    else
      in + naturalNumberSum1(in - 1) +
        naturalNumberSum1(in - 1)
  }

  println(
    naturalNumberSum1(2)
  )


}
