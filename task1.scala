object task1 {
  def main(args: Array[String]): Unit = {
    val shopping = List(("milk", 30.0,0.05, 2.0), ("egg", 5.0, 0.0, 3.0), ("sugar", 500.0, 0.05, 2.0),("soya",400.0,0.1,2.0))
    val item = for {
      num <- shopping
      if (num(1) > 50.0)
    } yield num
    println(item) //1
    val item1 = for {
       num1 <- shopping
       total = (num1(1) - (num1(1) * (num1(2)))) * num1(3)
    } yield total
    println(item1)//2
    val item3=for{
      num2<-shopping
      tot=(num2(1)-(num2(1)*num2(2))*num2(3))
      if (tot>300)

      }yield num2(0)

    println(item3)

  }

}