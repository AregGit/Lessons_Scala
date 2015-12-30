/**
 * package name verabervum e amboxj failin
 * package {...} verabervum e konkret blokin
 * itarberutyun javayi partadir che nuyn folderum lini packeg@
 * import A.B._ import kani B-i bolor classer@ javayum * , import A.B.C.{X,Y,Z} import e anum miayn X, Y, Z -@ 
 * scalan voch bacahayt import e anum java.lang._ scala._ Predef._
 **/

package com {
	package host {
		package name {
			class Name {
				def name = "name.host.com"
				val pack_nam = pn
			}
		}
		package object name {
			val pn = "package_function"
		}
		class Name {
			def name = "host.com"
		}
	}
	package com.host.name.name_other { //chain packeg
		//...
	}
}
// package com.host
// package name
object Package {
	def main(arg: Array[String]) = {
		val n1 = new com.host.name.Name()
		println(n1.name)
		val n2 = new com.host.Name()
		println(n2.name)
		
		println(com.host.name.pn) //kanch funkciayi vor@ paketi mej e << vochte classi>>
		
	}
}
