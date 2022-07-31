object T4Q3 {
  def main(args:Array[String]): Unit ={
    print("Enter an Integer : ")
    val num = scala.io.StdIn.readInt()
    number_type(num)

  }

  def number_type(num: Int): Unit=num match{
    case x if x<=0 => println("Negative/Zero is input")
    case x if x%2==0=> println("Even number is input")
    case x if x%2==1=> println("Odd number is input")
  }

}
