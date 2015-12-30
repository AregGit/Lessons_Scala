/**
 * Array zangvac e fixvac chapi indexin dimelu hamar ogtagorcel ()
 * ArrayBuffer -@ c++ vectorin jamarjeqn e 
 * ArrayLike[A, X] pahum e A tipi obyektner voronq nman en B-in(erevi jarang??)
 * ArrayOps[T] wrap anelu hamar 
 * ArraySeq[A] pahum e miayn polimorfnerin
 * ArrayStack[T] 
 * WrappedArrayBuilder[A] builder class array-i hamar
 **/

import scala.collection.mutable.ArrayBuffer

object Arr {
	def main(arg: Array[String]) = {
		val arr1 = new Array[Int](10) // 10 chapi zangvac inicilizacvac zronerov
		val arr2 = Array("hi", "by") // aftomat 2 chapani String tipi zangvac compileri koxmic
		val arr3 = new ArrayBuffer[Int]() // c++ -> vector, java -> ArrayList, scala -> ArrayBuffer
		arr3 += 1
		arr3 += 2
		arr3 += 3
		arr3 += (4, 5, 6)
		arr3 ++= ArrayBuffer(7, 8, 9) //++= verjic avelacnum e cankacac collection
		println(arr3)
		arr3.trimEnd(2) //jnjum e verjic 2 hat@
		println(arr3)
		arr3.insert(2, 99) // 2 indexum grum e 99
		println(arr3)
		arr3.insert(5, 44,44,44,44) // 5 indexum 4 hat 44 e avelacnum 
		println(arr3)
		arr3.remove(6) //jnjum e 6 rd index@
		println(arr3)
		arr3.remove(6, 3) // jnjum e 6 indexic sksac 3 hat
		println(arr3)
		
		val arr4 = for(i <- arr3) yield 2 * i // veradarcnum e nuyn tipi zangvac bayc dublac
		println(arr4)
		
		val arr5 = for(i <- arr3 if i % 2 == 0) yield 2 * i  // arandznacnum e zuyger@ bazmapatkum 2
		println(arr5)
		
		val arr6 = arr3.filter(_ % 2 == 0).map(2 * _) // filtr@ veradarcnum e bazmutyun zuygeri map@ yuraqanchur@ bazmapatkum e 2 -ov
							      // klor pakagceri poxaren kareli e grel {}
		println(arr6)
		println(arr6.sum)
		println(arr6.mkString(": "))

		val mat = Array.ofDim[Int](4, 4) // matrix
		
		
	}
}
