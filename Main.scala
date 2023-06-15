class Add(name:String, var1:Int,var2:Int){
  var result = var1+var2
  var nam=name
  println("My name is "+ name +" and sum is "+result)
}


object Main {
  def main(args: Array[String]): Unit = {
        var var1=22
        var var2=23
        val name ="Lemon"
        var instance = new Add(name,var1,var2)
  }
}

//Break
//import scala.util.control.Breaks._
//breakable {
//   for (i <- 1 to 3) {
//     for (j <- 'a' to 'c') {
//       if (i == 2 && j == 'b') {
//          break() // Breaks out of the outer loop
//       }
//       println(s"($i, $j)")
//      }
//    }
//}


    //Map
//    val numbers1 = List(1, 2, 3, 4, 5)
//    val squaredNumbers = numbers1.map(x => x * x)
//    println(squaredNumbers)

    //parallelize
//    import org.apache.spark.{SparkConf, SparkContext}
//    val conf = new SparkConf().setAppName("ParallelizeExample").setMaster("local[*]")
//    val sc = new SparkContext(conf)
//    val data = Array(1, 2, 3, 4, 5)
//    val distributedData = sc.parallelize(data)
//    distributedData.foreach(println)

    //reduce
//    val numbers = List(1, 2, 3, 4, 5)
//    val sum = numbers.reduce((x, y) => x + y)
//    println(sum)

    //zip()
//    val list1 = List(1, 2, 3)
//    val list2 = List("A", "B", "C")
//    val zipped = list1.zip(list2)
//    println(zipped)

//    Linear_Search
//    def Linear(arr:Array[Int],target:Int): Option[Int] = {
//      for (i <- 0 until arr.length) {
//        if (arr(i) == target) {
//          return Some(i)
//        }
//      }
//      None
//    }
//    val array = Array(1, 4, 6, 9, 12, 15)
//    val target = 2
//    val result = Linear(array, target)
//    println(s"Linear Search Result: $result")

    //Binary Search
//    def Binary(arr:Array[Int],target:Int): Option[Int] = {
//      var low=0
//      var high=arr.length-1
//      while(low<=high){
//        val mid=low+(high-low)/2
//        if(arr(mid)==target){
//          return Some(mid)
//        }
//        else if (arr(mid)>target){
//          high=mid-1
//        }
//        else{
//          low=mid+1
//        }
//      }
//      None
//    }
//    val array = Array(1, 4, 6, 9, 12, 15)
//    val target =  1
//    val result = Binary(array, target)
//    println(s"Binary Search Result: $result")
//Map,List,Set
//var scores: Map[Int, String] = Map(2 -> "Real", 0 -> "MC", -2 -> "Barca")
//for ((key, value) <- scores) {
//  println("key" + key, "Value" + value);
//}
//var numbers = List(1, 2, 3, 4, 5);
//for (element <- numbers) {
//  print(element)
//}
//println("  ")
//var unique = Set(1, 2, 3, 4, 5, 1)
//for (element <- unique) {
//  print(element)
//}

//case class Person(name: String, age: Int)
//
//// Creating instances of the case class
//val john = Person("John", 30)
//val jane = Person("Jane", 25)
//
//// Accessing fields of the case class
//println(john.name) // Output: John
//println(jane.age)  // Output: 25
//
//// Structural equality
//val johnCopy = john.copy()
//println(john == johnCopy) // Output: true
//
//// Pattern matching
//def greet(person: Person): String = person match {
//  case Person("John", _) => "Hello John!"
//  case Person(name, age) => s"Hello $name, you are $age years old."
//}
//
//println(greet(john)) // Output: Hello John!
//println(greet(jane)) // Output: Hello Jane, you are 25 years old.
//
//object MyClass {
//  def add(x:Int, y:Int) = x + y;
//
//  def main(args: Array[String]) {
//    print("sum of x + y = " + add(25,10));
//  }
//}