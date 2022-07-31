object T4Q4 {
  def main(args:Array[String]): Unit ={
    println(formatNames("Benny")()(toUpper(_)))
    println(formatNames("Niroshan")(indexList=0,1)(toUpper(_)))
    println(formatNames(name = "Saman")()(toLower(_)))
    println(formatNames("Kumara")(indexList=5)(toUpper(_)))
  }

  def toUpper(s : String): String ={
    s.toUpperCase()
  }

  def toLower(s: String): String ={
    s.toLowerCase()
  }

  def formatNames(name : String)(indexList : Int*)(function : String => String): String={
    if(indexList.isEmpty){
      function(name)
    }
    else{
      var temp = ""
      var i=0
      while(i<name.length()){
        if(indexList.contains(i)){
          temp=temp + function(name.charAt(i).toString)
        }
        else{
          temp=temp + name.charAt(i).toString
        }
        i=i+1
      }
      temp
    }


  }


}
