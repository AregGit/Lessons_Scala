/**
 * Kardaluc heto petq e close arvi  
 * karrdalu hamar kanchvum e buffer method@ Source classi
 * kareli e kardal url ic bayt failic...
 * scalayum directorianeri het ashxatox tooler@ der normal chen kareli e javaic ogtvel
 * import sys.process._ anelov karox enq systemai processnerin dimel processBuillderi mijocov
 **/
import sys.process._
import scala.io.Source
import java.io.PrintWriter
import scala.util.matching.Regex

object Fail_regexp {
	def main(arg: Array[String]) = {
		val sr = Source.fromFile("fail.txt", "UTF-8") // arajin@ kam tox e kam java.io.File obyekt, kodirovkan partadir che
		val line = sr.getLines
		for(i <- line) {
			println(i) // tpum e tox ar tox
		}
		//var bfit = sr.buffered // mec faileri depqum tox tox ancnelu hamar
		//val ss = sr.mkString.split("\\s+")
		//val num = ss.map(_.toInt) // kta numberFormatException
		
		val url =  Source.fromURL("http://google.com", "UTF-8")
		for(i <- url) {
			print(i)
		}
		
		val out = new PrintWriter("HI.txt")
		for(i <- 1 to 100) out.println(i) // kareli e ogtagorcel printf formatavorvac tpelu hamar
		"ls"! //katarum e hraman@

		sr.close

		val nums = "aaa vv bb 44 33 dd 3 d3d 33ddd 3333ddd333 @!#!12!k"
		val numPat = "[0-9]+".r
		val m = numPat.findAllIn(nums);
		println()
		for(i <- m) println(i)
		
	}
}
