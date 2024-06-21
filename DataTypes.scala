object DataTypes{
  def main(args:Array[String]):Unit={
    //integer data type
    val intNum: Int = 20
    val longNum: Long = 1234567890L
    val shotNum:Short=32765
    val byteNum:Byte =127
    //floating datatypes
    val FloatingNum: Float=3.14f
    val doubleNum: Double=3.14159132445
    //string datatype
    val stringVar:String ="Hello Scala"
    //character datatype
    val charVar:Char='A'
    //unit datatype
    val unitValue:Unit =()
    // mutable datatypes
    var boolvar:Boolean=true
    print("boolean"+boolvar)
    var intVar:Int=1234
    print("integervariable:"+intVar)
    intVar=intVar+1000
    print("updated value"+intVar)


    println(s"Integer:$intNum")
    println(s"Long:$longNum")
    println(s"Short:$shotNum")
  }
}