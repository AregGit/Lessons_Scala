/**
 * Funkcian sksvum e def barov aynuhetev anun pakagcerum stacvoxargumentner veradarcnox tip em marmin
 * Kan defoult argumentner
 * Kan tarber qanakutyan argumentner 
 * recursianeri jamanak partadir petq e nshvi return typ@
 * kan ananun funkcianer
 * Goyutyun uni funkciayi masnaki kanch aysinqn argumentneri mi mas@ poxancvi aynuhetyev myus@ ev erb myusnel poxancvi kirakanacvi funkcian
 * kareli e funkciayum funkcia grel
 * Hnaravor e rekursiv funkciayin cucel vor na darna iterativ
 * Ka function overloading
 **/
object Function {
	def A() = println("A") // veradarci tip@ voroshvum e aftomat kerpov
	def B = println("B") // B-n aranc pakagcer eete aydpes e apa nra kanchnel petq e aranc pakagcer lini
	def C: Unit = println("C") // C  funkciai veradarci tipne Unit
	def D = println("D"); println("D") // tpum e miayn arajin@
	def E = {
		print("E")
		println("E")
	}
	def F(a: Int) = a + 9 // stanum e argument voroshum tip@ ev veradarcnum
	def G(a: Int = 99) = a + 1 // defoult argument
	def H(a: Int) {println(a)} // aystex = chka usti anvanvum e procedura ev na arjeq chi veradarcnum  = -i bacakayum@ dra cucumn e
	def FAC(a: Int): Int = if(a <= 0) 1 else a * FAC(a - 1)
	def sum(arg: Int*) = { // ansahmanapak qnakutyan argumentner
		var res = 0
		for(i <- arg) {
			res+= i
		}
		res
	}
	def main(arg: Array[String]) = {
		A()
		B
		C
		D; E
		H(22)
		println(F(0))
		println(G())
		println(FAC(5))
		println(sum(1,2,3,4,5))
		println(sum(1 to 7: _*)) // 1-7 tver _* @ndunven vorpes hajortakanutyun aranc sra ansahmanapak argumentnerov toxeri het
					 // chenq karox ashxatel recursianerum
		val unname = (a: Int) => a * a //unnamed function
		println(unname(11)) // unnamed function call
		val unname2 = { // ananun funkcia myus tesak
			println("Unnamed")
		}
		unname2 // warning
		def part(a: Int, b: Int) = {
			a + b
		}
		val l = part(1, _:Int) // veragrel l -in funkcia vori arajin arjeq! 1  e isk erkrord@ anorosh
				       // l -@ darnum e funkcia vor stanum e 1 argument ev ir mejic kanchum part funkciayin
				       // poxancelov ir mej hishac 1 @ ev poxancvac 11 -@
		println(l(11))
		def part2(a: Int)(b: Int) = a * b * a * b	
		val l2 = part2(2)_
		println(l2(2))
		
		def delayed( t: => Long ) = {
			println("Param: " + t)
		}
		delayed(System.nanoTime)
		def template[T](t: T) = println(t) // [T] cucum e vor funkcian template e T ic kareli e grel [T, R]
		template("aaa")
	}
}
