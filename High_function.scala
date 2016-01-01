/**
 * Scalayum funkcianer@ sovorakan obyektner en
 * Funkcian kareli e poxancel vorpes argument
 * cankacac funkcia karox e stanal funkcia ev veradarcnel
 * ayspisi sahmanumner@ trvumen barcr astichani funkcianerin 
 * funkciayum kareli e funkcia grel bayc zgushanal zamikaniyaneric 
 * reduceLeft funkcian stanum e erku argumentanoc funkcia ev katanchum bolor elementneri hamar reduceLeft(_ * _) 
 * nayev sort funkcianernel nman kerp en ashxatum
 * corresponds funkcian 2 hajortakanutyamb katarum e gorcoxutyun
 **/
object High_function {
	var sum = 0
	def f(a: Int): Unit = sum+= a
	def ff(a: Int, call: (Int) => Unit) = call(a) // funkcia stanum e funkcia
	def fff(a: Int, call: (Int) => Unit) = (xx: Int) => Unit // stanum ev veradarcnum e funkcia
	def ffff(a: Int, call: (Int) => Unit): (Int) => Unit = {/*...*/  (Int) => Unit} // stanum ev veradarcnum e funkcia
	
	def two(a: Int) = (y: Int) => a + y
	def three(x: Int) = (y: Int) => (z: Int) => x + y + z

	def main(arg: Array[String]) = {
		val a = Array(1,2,3,4,5).map(f) // kanchum e f funkcian yuraqanchur elementi hamar 
		println(sum)

		val b = (x: Int) => 2 * x
		println(b(3)) // ananun funkcia e

		val c = Array(1,2,3,4,5).map{ (x: Int) => { 
							val l = x * 2
							l * 2
						}
					    }
		println(c.sum)
		sum = 0
		val l = Array(20,2,3,4,1,2,3).map(ff(_, f))
		println(sum)
	
		println(two(2)(2))
		println(three(2)(2)(2))
	}
}
