/**
 * baci operator = ev : -ic mnacac bolor@ katarvum en dzaxic aj
 * harmarecnum e grel val l = class1(1,2,3) * class1(3,4,2) // aranc new
 * update method@ kanchvum e orinak zagvaci tar poxeluc 
 * applay@ vercnum e construkcia e vercnum ev patrastum obyekt
 * unapplay@ anum e hakarak@ vercnum e obyekt ev veradarcnum construkcia sovorabar nuyn@ voric stacvel e obyekt
 * unapplay@ nayev hamarvum e extractor  
 **/

class mult(val x: Int) {
	def *(a: Int) = a * x
	def ^^() = x+x
}

object Operator {
	def main(arg: Array[String]) = {
		val aa = new mult(11);
		println(aa * 3)
		println(aa^^)
	}
}
