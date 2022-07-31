object T4Q1 {
  def main(args:Array[String]): Unit ={
    print("Enter the deposit amount : ")
    val deposit = scala.io.StdIn.readInt()

    println("Total interest for a year = RS "+ interest(deposit))
  }
  def interest(deposit: Double): Double= deposit match{
    case x if x<=20000=> x*2/100
    case x if x<=200000=> x*4/100
    case x if x<=2000000=> x*3.5/100
    case x if x>2000000=> x*6.5/100

  }

}
