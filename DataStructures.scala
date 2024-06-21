//collection in scala programminf
object DataStructures{
  def main(args:Array[String]):Unit={
    val fruits:List[String]=List("apple","oranges","watermelon","grapes","guava")
    print("first element:"+fruits.head)
    println("Value excludng first"+fruits.tail)
    println("last"+fruits.last)

    val List1=List("hadoop","spark","flume",10000,true,3.14)
    print(List1)
    println(List1.getClass)
    //emptylist
    val emptylist:List[Nothing]=List()
    //list declaration
    val List2=10::20::30::40::Nil
    //list buffer of type mutable
    import scala.collection.mutable.ListBuffer
    var cities=new ListBuffer[String]()
    cities+= "Tvm"
    cities+= ("Mumbai","Delhi")
    cities-= "Mumbai"
    println(cities)
    cities.toList //typecasting in scala is done by toDatatype()

    //array data type:array is mutable,fixed size collection of datastructures
    //array is homogeneous collection
    val arryData=Array("apple","oranges","watermelon","grapes","guava")
    //prints element by element o/p in newline
    //arryData.foreach(println)
   println(arryData.mkString(","))
    arryData(0)="banana"
    println(arryData.mkString(","))
    //declare an empty array
    val arr_1=new Array[String](10)
    val arr_2=Array.ofDim[Int](2,2)
    arr_2(0)(0)=23
    arr_2(0)(1)=25
    arr_2(1)(0)=43
    arr_2(1)(1)=102
    val flattenArr:Array[Int]=arr_2.flatten
    println(flattenArr.mkString(","))
    arr_2(0)(1)=10
    println(flattenArr.mkString(","))
    //set collection:immutable collection
    //hashset-mutable sets
    val set_1:Set[String]=Set()
    val set_2=Set("apple","oranges","watermelon","grapes","guava")
    import scala.collection.mutable.Set
    val mutableSet=Set("apple","oranges","watermelon","grapes","guava")
    mutableSet+="blueberry"
    mutableSet-="apple"
    //tuple declaration
    //immutable
    //tuple fixed size,can hold multiple data types
    val Tuple_1=(10,20,30,40,50,60,70,80)
    //Tuple_1._1="String"update will fail
    println(Tuple_1._2)
    //map in scala is collection of key value pairbwhere each key is unique.similar
    //to dictionary in python

    //import scala.collection.immutable.Map
    //empty variable declaration
    var MapVar:Map[String,Int]=Map()
    var Mapvar1=Map("UST10001"->"Sandeep","UST10002"->"Midhun","UST1003"->"vinesh")
    println(Mapvar1.contains("UST10002"))
    println(Mapvar1.get("UST1003"))
    println(Mapvar1.keys)//print all keys
    println(Mapvar1.values)//print all values
    import scala.collection.mutable.Map
    //declare mutable map datatypes
   val  mutable_var=Map("UST10001"->"Sandeep","UST10002"->"Midhun","UST1003"->"vinesh")
    //update
    mutable_var("UST1001")="Rohit"
    //insert a new key value pair
    mutable_var+=("UST1005"->"Siva")
    //iterator in scala represent a sequence of elements allows you to traverse through a collection sequentially
  val myList=List(20,30,40,50,60,70,80,90)
    val iter=myList.iterator
      //method of iterator to check if there is more elements(.hasNext()),.next() to retrieve next value
      //.remove()-to remove elements from mutable iterators
      println(iter.next())
    println(iter.next())
    lazy val donuts:Int=100
    println(donuts*5)
    //lazy cant be used with var
    lazy val donuts_1:Int=20
  }
}