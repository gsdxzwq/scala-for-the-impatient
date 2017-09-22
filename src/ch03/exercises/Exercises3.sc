import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import java.util.TimeZone

import scala.collection.mutable.ArrayBuffer
import scala.util.{Random, Sorting}

//3.1随机数组
def makeArr(n:Int):Array[Int] = {
  val a = new Array[Integer](n)
  for(i<-a) yield Random.nextInt(n)
}

makeArr(10)

//3.2交换相邻元素
def swapArr(arr:Array[Int])= {
  for (i <- 0 until (arr.length - 1, 2)) {
    val t = arr(i)
    arr(i) = arr(i + 1)
    arr(i + 1) = t
  }
}

val a=Array(1,2,3,4,5)
swapArr(a)
a.foreach(println)

//3.3
def swapArrNew(arr:Array[Int])= {
  for (i <- 0 until arr.length) yield {
    if(i < (arr.length - 1) && i%2==0) {
      val t = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = t
    }
    arr(i)
  }
}

val b=Array(1,2,3,4,5)
swapArrNew(b).foreach(println)

//3.4
def sort(arr:Array[Int])={
  var positive = new ArrayBuffer[Int]()
  var negative = new ArrayBuffer[Int]()
  for(i<-arr.indices){
    if(arr(i)>0) positive+=arr(i) else negative+=arr(i)
  }
  positive ++= negative
}

sort(Array(2,-3,0,4,4,-9)).foreach(println)

//3.5
val arr = Array(3.0, 3.5, 4.0)
arr.sum/arr.length

//3.6
Array(1,2,3,4,5, 4,3,2).reverse

//3.7
Array(1,2,3,4,5, 4,3,2).distinct

//3.8
def func8(arr:Array[Int])= {
  var buffer = new ArrayBuffer[Int]()
  for(i <- arr.indices){
    if(arr(i)<0) buffer+=i
  }
  buffer = buffer.reverse
  buffer.trimEnd(1)
  val tmp = arr.toBuffer
  for(i<-buffer) {
    tmp.remove(i)
  }
  tmp
}
func8(Array(-1, 7, -4, 6, 7, -5)).foreach(println)

//3.9
def func9() = {
  val zoneArr = for (i <- TimeZone.getAvailableIDs if i.startsWith("America/")) yield i.drop(8)
  //Sorting.quickSort(zoneArr)
  zoneArr.foreach(println)
}

//3.10
def func10() = {
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  val res = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
}