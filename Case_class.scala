/**
 * match -i jamanak ete vocchmi hamnknum chi linum apa ex e
 * kareli e voroshel tiper@
 * /% veradarcnum e mnacord u amboxj mas
 * for -i mej ete inchvor payman chi bavararum na chi @ndatvum sharunakvum em minchevverj
 * kan case classer ev objectner voronq aveli optimizacvac en 
 * case class@ aftomat katarum e hetevyal@ 
 * 1 bolor constructri  argumentnerin sarqum e member (var ete haytararvac linen sovorakan depqerum kdarnan)
 * 2 object companion e sarqvum applay methodic aranc new ::::::::
 * 3 unaplay methodi tramadrum 
 * 4 toString equals hashCode copy methodneri sahmanum ete chkan copy(stacox argumentnerimijocov vorosh uxxutyun karox e stana funkcian)
 * urish tarberutyun chka
 * scalayi list@ implement e arvac case classov
 * case classer@ bnakanabar aveli dandax en qanc sovorakan@ sakayn cod@ darnum e karch
 * tramadrvum en funkcianer ev aranc new -i stanal obyekt => hesht kareli e manipulacnel
 * case classi tramadrac funkcianer@ jarang case classi hamar chen tramadrvum usti petq e zgushanal chnayac copili jamanak warning e linum
 * aveli lav e case classer@ linen amena nerqevi classer@ hirarxiayi mej
 * case classeri depqum cankaliklini vor compiler@@ vorosh stutgumner ani match -ov alternativ tarberakneri hamar
 * dra hamar kareli e haytararel @ndanur super class sealed vor@ kstipi irenic jarangvoxnerin gtnvel nuyn faylum
 * sealed abstract class A{}
 * case class B extends A{}
 * case class C extends A{}
 * sealed bar@ ete chgrnq C klas@ kareli kliner grel urish failum => arandzin compile kliner u stugm@ texi cher unena
 * ev ete urish mek@ uzena lini avelacnel nor jarang class A ic na stipvac klini da avelacnel ayn failum vortex A -n e
 * karcum em cankali e ete match petq e arven @ndanur jarangneri typer apa linen nuyn failum
 *
 * Enum kareli e stanal objectner@ jarangeluc
 * option funkcian veradarcnum e non kam element orinak ete uzumenq map-i value 
 * 
 **/
object Expressions {
	def main(arg: Array[String]) = {
		val c = "x"
		val r = c match {
				case "a" => 1
				case "b" => 2
				case "x" => 3
				case "c" => 4
				case _ => 0 //defoult
			}
		println(r)
		val (t1, t2) = (1,2)
		println(t1)
		
	}
}
