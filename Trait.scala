/**
 * traiter@ nuynne inch javai interface@
 * trait kareli e jarangel miajamanak tarber traiteric
 * ete class@ jarangvac e miqani trait eric hajortakanutyun@ karevor e um method@ arajinne da piti verjum grvi
 * trait@ karox e unena voch miay abstract methodner ayl naev konkret
 * traiti methodner@ verasahmaneluc kariq chka ogtagorcel overrid bar@ kam grel methodi dimac abstract
 * A extends B with C with D 
 * javai bolorinterface ner kareli ogtagorcel vorpes trait
 * karelie trait@ miacnel obyekti stexcman pahin
 * ete A ,B, C traitic jarangenq X class verasahmanenq ff funkcian vor@ ka 3 umel u kanchenq ayd vunkciayic super.ff 
 * apa na kkanchi ayn ff @ ov amena verjinne grvac jarangman hertakanutyunum orinak class X extends A with B whit C
 * kkanchvi C -i f funkcian , ete greinq class X extends C with B whit A kkanchver A -i f  funkcian
 * konkret parenti i funkcia kanchelu hamar kareli e grel orinak super[B].ff
 * traitum haytararum@ ete skzbnavorvum e apa na darnum e konkret ev nranc hamar hatuk dasht e stexcvum jarangnerum(ev chi jarangvum ??)
 * arajin@ kanchvum e super classi constructr@
 * traiti constructr@ kancvhum e super classi constructric heto bayc minchev clasi constructr@
 * miqani traiteri depqum nranc constructrner@ kanchvum en dzaxic aj 
 * yuraqanchur traitic kancvhum e ir cnoxi constructr@
 * ete miqani traiter unen nuyn cnox@ apa cnoxi konstructor@ mek angam e kanchvum
 * ays amenic heto nor kkanchvi classi constructor@ 
 * traiter@ chen karox unenal parametrerov constructorner yuraqanchur trait uni ir himnakan konstructor@
 * ananun class jarangelu depqum ete ka trait zgush petq e linel qani vor konstructrneri hertakanutyunic karox e hxum lini chpatrastac obyekti vra 
 * ardyunqum klini exception kareli e blocki verjum ogtagorcel with vor@ aydqan graget chi kam layzi qani vor xndir@ kayanum e dashter@ inicilizacnelu mej
 * traiti hamar karelie voroshel this -i type @
 *
 * abstract override i imast@ na e vor cucum e vor der lriv che aysinqn pahanj@ verasahmanelu sharunakvum e
 **/

trait A {
	//def f ays depqum override petq chi grel
	def f = "A" // ays depqum petq e
	val s: Int
}

class B {
	val s: Int = 8
}

class C extends A {
	val s: Int = 1// aranc sahmanelu error
	override def f = super.f 
	//override def f = "C"
}

trait T1 {
	def f: String
}

trait T2 extends T1 {
	abstract override def f = {
		super.f	//aranc abstract overridi chi lini vortev f@ verevum abstract e
		"in T1"
	}
}

/*class T3 extends T2 {
	override def f = "a"
}*/

trait T {
	val s: String
}
class TT {
	val s = "TT"
}

trait ex {
	this: A => def l{} // na sarqum e sepakan A ev mianum nran
}

object Trait {
	def main(arg: Array[String]): Unit = {
		val x = new B with A // kareli e ayspes jarangel ete trait@ clasin chi partadrum
		println(x.f)
		val y = new C()
		println(y.f)
		
		val t = new TT()
		println(t.s)

		val tt = new T { //ete urish classerel linen ??
			val s = "zt"
		}
		println(tt.s)
	}
}
