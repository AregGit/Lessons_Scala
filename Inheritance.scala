/**
 * extends ev final gorcoxutyunner@ nuynn en inch java yum
 * verasahmanman jamanak anhrajesht e ogtagorcel override bar@ funkciayi skzbum
 * super classi constructor@ kareli e kanchel miayn himnakan constructoric
 * final classic chi kareli jarangel, final funkcian chi kareli verasahmanel
 * override generacnum e informacianer sxalneri hamar name conflicti hamar, sxal parametreri hamar
 * asInstanceOf[type] cast e porcum anel ete chi karoxanum exeption,  isInstanceOf[typ] stugum e classOf[type]
 * ob.getClass veradarcnum e classi definition
 * kareli e patern matchingov stugel A match { case B =>... case C=>... case_=>...} 
 * ka protectet[this], private[this] i principov, importi depqum voncor protected@ chi galis
 * kareli e jarangel java classeric
 * kareli e verasahmanel nayev popoxakanner@ ev constantner@ nranc hamarel e generacvum get funkcia ev verasahmanvum
 * sakayn def anunov sahmanum@ miayn def piti verasahmani nuyn@ val i hamar vari hamar ayn jamanak erb na abstract e sahmanvac
 * Abstract classi obyekt chi kareli sarqel nranic petq e jarangel
 **/

class base {
	def function = "Base"
}

class dir extends base {
	override def function = "dir"
	def dirfunc = "dirfunc"
}

class A(a: Int) {
}
class B(a: Int) extends A(a) { // kanchum e base classi constructor@ poxancelov argument
}

abstract class AAA {
	var ar: Int
}

class AA() {
	val l = 1
	var r = 1
}
class BB() extends AA {
	override val l = 2
	//override var r = 2 // error var karox e verasahmanvel ete haytararvac e abstractum
	var ar: Int = 11
}

object Inheritance {
	def main(arg: Array[String]) = {
		val b: base = new dir()	
		println(b.function)
 
		println(b.asInstanceOf[dir].dirfunc)		

		val d = new dir()
		println(d.dirfunc)
		
		
	}
}
