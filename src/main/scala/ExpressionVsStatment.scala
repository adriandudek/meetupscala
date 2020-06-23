object ExpressionVsStatment extends App{

  //side effects mutubility
  def checkIfRedState(r:Int) = {
    var isRed:Boolean= false
    if(r>= 255){
      isRed = true
    }else{
      isRed = false
    }
    isRed
  }


  //expression
  def checkIfRedExpression(r:Int) = if(r>= 255) true else false

  val r=23
  val isRed =  if(r>= 255) true else false


}
