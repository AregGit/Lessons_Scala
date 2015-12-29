/**
 * Classneri incapsuliacian nuynne javayini nman
 * defoultov dashter@ public en
 * mutaator ayn method@ vor@  poxum e obyekt@
 * chi poxum obyekti dashter@
 * cankali e ete funkcian mutaator e apa kanchel () grelov, () ete chka apa kanchnel aranc dra piti lini
 * public arjeqner@ dzavapoxvum en private ev sahmanvum get set funkcia nranc hamar
 * var foo scalan tramadrum e set get
 * val foo scalan tramadrum e miayn get // const e val@
 * private[this] ays bar@ erb grvi andamic araj da aveli ksahmanapaki nran ev hnaravor chi lini poxel nran
 * classi funkcianeric voronq ogtagorcumen nuyn classi obyektner, nuyn classiurish obyektnerum chi kareli poxel 
 * Bolor classer@ unen constructor voroncic himnakan@ grvum e classi anuni koxq@ pakagcerum ev 
 * erb nra kanchne texi unenum scalan  talis chveragrel ayl dashteri  qani vor ayd andami ogtagorcman jamanak,
 * na ksarqi classi andam vorpes funkciayi argument@
 * Kareli e grel nerdrvac classer new A.B()
 * applay() funkcian sahmanelu depqum kanch@ klini ayn jamnak erb dimen ob() ayspes hamarjeq e ob.applay()
 * scalayum kareli e overload anel operatorner@ grete bolor simvolnelov
 * case bar@ erb grvum e classi dimac apa ayd classi hamar aftomat tramadrvum e equals(), toString(), hashCode() ev serialaiz.
 * baci ayd new chi grvum ev compile@ dandax e ogtagorcvum e decompoziciayi hamar ev jarangvac en mek @ndanur classic
 * class [T]Name template class
 **/

class Test {
	//var r: Int //error dasht@ piti inicilizacvi
	val Mm: Int = 11 // inicilizacvum e erb stexcvum em obyekt
	def f() = 1111
	private[this] var Mn: Int = 22
	//def tt(t: Test) = t.Mn = 33 // error

}

class Test_2(var aia: Int) { // ete var chgrvi apa vorpes member chi dzevavorvi
	println("Hyy") // constructoric e kanchvum
	var lll = 0
	def this(a: Int,  b: Int) { //Unit chpiti grvi vortev constructor@ da el chi veradarcnum
		this(a) // arajin@ petq e defoult@  kam myus construktr@ kanchvi inicilizacven dashter@ nor aynuhetev hnravaor klini myus gorcer@ anel
		this.lll = b
		println(b)
	}
	def apply() = "APPLAY"
}

case class test_3 {
	val i = 9
}
class test_4 {
	val i = 9
}

object Class {
	def main(arg: Array[String]) = {
		val l = new Test()
		val ll = new Test()
		println(l.Mm)
		println(l.f) // ok
		println(l.f()) // ok
		val s = new Test_2(33, 44)
		println(s.aia)
		println(s())
		val c1 = test_3()
		val c2 = test_3()
		if(c1 == c2) println("Yes") else println("No")
		val t1 = new test_4()
		val t2 = new test_4()
		if(t1 == t2) println("Yes") else println("No")
	}
}
