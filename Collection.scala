/**
 * Bolor collectionner@ jarangvac en iterable trait ic
 * collectionner bajanvum en 3 xmbi hajortakanayin bzmutyun ev asocativ jarangvac iterable ic seq set map
 * Scalayum ka popoxvox ev chpopoxvox tarberakner himnakan collectionneri
 * @st nermucman hajortakanutyan order unecox collection@ da LinkedHashSet-n e, isk sortavorvaci hamar SortedSet
 * +: :+ gorcoxutyunner@ avelacnum en hajortakanutyan skzbic kam verjic + avelacnum e element
 * - -- jnjum e elementner 
 * ++ veradarcnum e 2 collectionneri miavorum A ++ B  nuyn@ A -- B veradarcnum e bazmutyun vortex B-i elementner@ chkan
 * iterable cankacac collection e vor@ ivichaki e veradarcni iterator vor@ apahovum e dostupcollectioni bolor elementneri
 * :: ::: Listi hamar nuyn principov inch +: ++:
 * | & &~ miavorum hanum tarberutyun en veradarcnum A | B
 * += ++= -= 
 * #:: veradarcnum e hosq stream elementner@ vercnelu hamar kareli e ogtagorcel take  funkcia ka vax outOfMemory
 *   
 * seq  xmbin patkanum en hajortakan collectionner@ array kam list. IndexedSeq sa  O(1) dostup e apahovum isk listum da chka
 * Set chi pahppanum hajortakanutyun@ sortavorvaci hamar ka SortedSet
 * bolor@ unen object companion vor@ applayi mijocov obyekti orinak e veradarcnum
 * 
 * chpopoxvox tiper@ harmar en multithredingi hamar
 * 
 * Listi head@ ev tail@ lister en
 *  
 * bazmutyan mej yuraqanchur taric ka 1 hat
 * hashi mej avelacvox yuraqanchyur obyekt uni HashCode vor@ lav klini verasahkamnel
 * SortedSet@ RB carov e implement arac
 *
 * Funkcianer
 * head last - araji kam verji element
 * tail veradarcnum e bolor@
 * length isEmpty
 * map flatMap collect foreach ays funkcianer@ collectioni bolor elementneri hamar en ashxatum
 * reductLeft reductRight foldLeft foldRight bolor elementneri hamar gorcoxutyun en anum erku chapaniov
 * sum max min exist forall count filter filterNot partition
 * take(n) drop(n) splitAll(n) - vercnum e araji n element@ , baci araji n elementic, mnacac@
 * mkString toArray.. copy... contains startsWith endsWith indexWher(pred) reverse sorted...
 * 
 * map -@ stanum e funkcia vor@ kirarum e collectioni vra ev transform arac@ veradarcnum
 * flatMap@ nuyn mapne uxaki iran poxancvac funkciayi bolor rezultatner@ veradarcnum e vorpes 1 amboxjutyun isk map@ bazmutynner arandzin arandzin
 * List(1,7,2,9).reductLeft(_ - _) kveradarci ( (1 - 7) - 2 ) - 9
 * List(1,7,2,9).reductRight(_ - _) kveradarci 1 - (7 - (2 - 9 ) )
 * foldLeft foldRight nuyn gorcoxutyunnernen reducti uxaki stanum en skizb foldLeft(0)(_ - _)
 * zip funkcian miavorum e katarum ete chaper@ 2 collectionneri tarber en avelacac ams@ antesvum e chantesvelu hamar ogtagorcelkaroxenq zipAll
 * view naxort@ hishum e ??
 * 
 * anvtang collectionner kan SynchronizedMap SynchronizedSet SynchronizedStack ...
 * 
 **/

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.LinkedList

object Collection {
	def main(arg: Array[String]) = {
		var arr = ArrayBuffer(1,2,3,4,5)
		arr = arr :+ 10
		arr = 10 +: arr
		println(arr)
		val it = arr.iterator
		while(it.hasNext) {
			println(it)
			it.next
		}
		val lst = LinkedList("A", "B", "C")
		var tmp = lst
		while(tmp != Nil) {
			println(tmp.elem)
			tmp = tmp.next //DoubleLinkedListi depqum avelanum e prev
		}
		println(lst zip arr)
		println((lst zip arr).filter(p=> p._2 > 2)) // pakagcer@ kap uni
			

	}
}
