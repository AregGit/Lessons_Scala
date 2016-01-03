import scala.swing._
import java.awt.event._
import sys.process._


object NetGui {
	val Mframe = new MainFrame {
		val MtextF = new TextField() {
			maximumSize = new Dimension(600, 30)
		}
		val MtextA = new TextArea() {
			maximumSize = new Dimension(1100, 730)
			editable = false
		}
		var Host = ""
		var Com = "..."
		title = "Network Information"
		resizable = false
		contents = new BoxPanel(Orientation.Vertical) {
			contents += new BoxPanel(Orientation.Vertical) {
				contents += new BoxPanel(Orientation.Horizontal) {
					contents += new Label(" ")
					contents += new Label("This is simple Network information program") {
						font  = new Font("Helvetica", java.awt.Font.BOLD, 18)
					}
				}
				contents += new BoxPanel(Orientation.Horizontal) {
					contents += new Label("which use nmap, nikto and dig Net utils") {
						font = new Font("Helvetica", java.awt.Font.BOLD, 18)
					}
					contents += new Label(" ")
				}
			}
			contents += new Label(" ")
			contents += new BoxPanel(Orientation.Horizontal) {
				contents += new BoxPanel(Orientation.Horizontal) {
					contents += new Label("Host name or IP address: ") {
						maximumSize = new Dimension(200, 30)
					}
					contents += MtextF
				}
			}
			contents += new ComboBox(Array("...", "nmap -sS ", "nmap -mn ", "nikto -h ", "dig ")) {
				peer.addActionListener(new ActionListener() {
						def actionPerformed(e: ActionEvent) = {
							ModChange()
						}
				})
				def ModChange() = {
					val h =  MtextF.text
					val c =  peer.getSelectedItem
					Host = if(Host.isEmpty) h else Host
					if(c != "..." && !Host.isEmpty && (h != Host || c != Com)) {
						Host = h
						Com = c.toString
						val cm = c + h
						MtextA.text = "Pleasw wait!!!"
						try{
							MtextA.text = cm.!!
						} catch{
							case _: Throwable => println("Exception")
						}
					}
				}
				maximumSize = new Dimension(1100, 30)
			}
			contents += MtextA
		
		}
		size = new Dimension(1100, 900)
	}
	Mframe.visible = true
}

object NetInfo {

	def main(arg: Array[String]) {
		val l = NetGui	
	}

}
