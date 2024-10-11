import scala.collection.mutable

class MiniDatabase {
  private val data: mutable.Map[Int, String] = mutable.Map()
  
  def addEntry(id: Int, value: String): Unit = {
    data(id) = value
    println(s"Entry added: ID = $id, Value = $value")
  }
  
  def getEntry(id: Int): Option[String] = {
    data.get(id)
  }
  
  def listEntries(): Unit = {
    println("Current Entries:")
    data.foreach { case (id, value) => println(s"ID: $id, Value: $value") }
  }
  
  def deleteEntry(id: Int): Unit = {
    data.remove(id)
    println(s"Entry with ID = $id has been deleted.")
  }
}

object Main extends App {
  val db = new MiniDatabase()
  
  db.addEntry(1, "First Entry")
  db.addEntry(2, "Second Entry")
  
  db.listEntries()
  
  println(db.getEntry(1))
  println(db.getEntry(3)) 
  
  db.deleteEntry(1)
  
  db.listEntries()
}
