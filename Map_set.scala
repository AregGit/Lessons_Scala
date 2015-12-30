/**
 * By defoult assocaciv collectionner@ scalayum nerkayacvum en hash table ov
 * kareli e irenc nerkayacnel cari tesqov 
 * m("A") = 11 //error piti ogtagorcvi scala.collection.mutable.Map vor karoxananq poxel
 * get(key) veradarcnum e key obyekt kam null
 * kareli e ogtagorcel LinkedHashMap vorpisi shrjancvi mutqagrvac hajordakanutyamb 
 * zip  miacnum e
 * tuple cankacac tipi elementneri bazmutyun
 **/

import scala.collection.mutable.Map
import scala.collection.immutable.SortedMap

object Map_set {
	def main(arg: Array[String]) = {
		val m = Map("A" -> 1, "B" -> 2, "C" -> 3)// Map(("A", 1), (...), (...))
		m("A") = 11
		m += "D" -> 4
		println(m)
		m -= "A" 
		println(m)
		//for((i,j) <- m)
		val s = m.keySet
		println(s) //veradarcnum e set bazmutyun mapi key eric
		val sm = SortedMap("A" -> 1, "B" -> 2, "C" -> 3) // sortavorvac map // car
		println(sm)
	}
}
