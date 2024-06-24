object Task3{
  //initialize balance
  var balance: Int = 10000
  def bankingMenu():Unit={
    //
    //1check balance
    //2withdraw amount
    //3deposit
    //4exit
    var continue=true

    while(continue){
      print("enter choice\n")
      println("1.check balance")
      println("2.withdraw")
      println("3.deposit")
      println("4.exit")
      import scala.io.StdIn

      val choice=StdIn.readInt()
      if(choice==1){
       println(s"Balance: ${balance}")
      }

      else if(choice==2){
        if(balance==0){
          println("zero balance")
        }
        else{
          println("enter amount")
          val amount=StdIn.readInt()
          if(amount<0){
            println("not accepted")
          }
          else {
            if (amount < balance) {
              balance = balance - amount
              println(s"$balance")
            }
            else {
              println("insufficient balance")
            }
          }
        }


      }
      else if(choice==3){
        println("enter amount")
        val deposit=StdIn.readInt()
        if(deposit<0){
          println("negative amount not accepted")
        }
        else {
          balance = balance + deposit
          println(balance)
        }

      }
      else if(choice==4){
        continue=false

      }
    }
  }
  def main(args:Array[String]):Unit={
        bankingMenu()

  }
}
