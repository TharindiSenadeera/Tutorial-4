object T4Q2 {
  def main(args:Array[String]): Unit ={
    class shoppingcart_item(var name: String, var price: Double, var quantity: Int)

    val item1 = new shoppingcart_item("Vanilla ice cream", 3.99, 13)

    val item2 = new shoppingcart_item("Chocolate Buscuits", 4.00, 6)

    val item3 = new shoppingcart_item("Cupcakes", 7.77, 7)

    var shopping_cart = List(item1, item2, item3)

    def printCartItems(shopping_cart : List[shoppingcart_item]): Unit= {
      for (element <- shopping_cart) {
        println(element.quantity +" "+ element.name + " at Rs" + element.price+" each" )
      }
    }
    printCartItems(shopping_cart)

    def IceCream_Products(x : shoppingcart_item): Unit= x match{
      case x if x.name=="Vanilla ice cream" => println("Found a Vanilla ice cream product")
      case xx if x.name!="Vanilla ice cream" => println("Found another item")

    }

    for (element <-shopping_cart){
      IceCream_Products(element)
    }
  }





}