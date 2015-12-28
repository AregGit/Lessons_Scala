/**
 * Scala-i aravelutyunneric e vor na staticc tipizacvac lezu e
 * Primitiv tiper chkan nranq obyektner en Boolean Int Char Double...
 * -- ++ chka da grvum e ` a += 1 
 * Scalan karoxanum e voroshel popoxakanin veragrvac arjeqi tip@
 * a + b hamarjeq e a.+(b)
 * void tip@ aystex Unit e kochvum vor@ uni miayn 1 argument ev vornel asum e na vochinch e
 * ; -@ chi ogtagorcvum toxer@ bajanelu hamar kariq chka ayn dnel 
 * Kardalu hamar naxatesvac funkcianernen readInt, readDouble, readLine
 **/
object Expressions {
	def main(arg: Array[String]) = {
		val a = 1 // constant l, chi kareli poxel
		var b = 1 // b-@ kareli e poxel
		val c: Int = 1 // Int tip 
 		val d = readInt()
 		val e = readLine()
		val f = null
		val g = {val a1 = 2 + 3; val a2 = 3 + 4; val a3 = 4 + 5; a1 + a2 + a3} // g -in veragrvum e verji gorcoxutyunneri gumar@
		val h = {val a1 = 2 + 3; val a2 = 3 + 4; val a3 = 4 + 5} // h-in veragrvum e ()
		lazy val i = 1 // lazy-i mijocov i -n chi inicilizacvi aynqan jamanak qani der chi ogtagorcvel	
		println(a + "  " + b + "  " + c + "  " + d + "  " + e + "  " + f + "  " + g + "  " + h + "  " + i)
	}
}
