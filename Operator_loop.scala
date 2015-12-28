/**
 * Scala-um if-@ arjeq e veradarcnum, ; petq chi, kareli e 1 toxov grel,
 * ? operator chka bayc karelie 1 toxanoc if elser grel
 * switch chka sakayn urish aveli chkun operator ka match
 * Defoult bajin chka match um sakayn heriq e ayntex grel popoxakan kam _ vor@
 * kashxati vorpes defoulte
 * while, do while nuyn principov en
 * break continue chka dra hamar petq e dzerqov kazmakerpel
 * try, flag... scala.util.control.break
 * 
 **/
object Operator_loop {
	def main(arg: Array[String]) = {
		var l = 1
		if(l == 1) {
			l+= 10
		} else {
			l-= 1
		}
		l match {
			case 1 => println("A")
			case 2 => println("B")
			case 3 => println("C")
			case _ => println("?") 
		}
		println("-----------------")
		for (i <- 1 to 10) { //to -n veradarcnum e range tipi obyekt vor@ ir mej uni 1-10 tver@ ev hertov veragrvum i-in
			print(i + " ")
		}
		println()
		for (i <- 1 until 10) { // until -@ nuynn e inch to -n aranc verevisahmani aysinqn 1-9
			print(i + " ")
		}
		/// to -n ev until@ richInt classi andamner en
		println()
		for (i <- "HELLO SCALA") { //Tar ar tar e ancnum
			print(i + " ")
		}
		println()
		for (i <- 1 until 10; j <- 1 until 5 if i != j) { //nerdrvac cikl, antesvum e i == j depq@
			print(i + " " + j + "  ")
		}
		println()
		val vec = for (i <- 1 until 10) yield i // veradarcnum e vector 1-10 tveric
		println(vec)
		val v = for (i <- 1 until 10) yield i % 2 // 1 0 1 0 ...
		println(v)
	}
}
