package behavioral.loan

object Main extends App {

  using(new FakeFile()){
    file =>
    println(file.content)
  }

  using(TempFiles){
    fxn =>
      fxn.getTime()
  }

  locks(new FakeFile()){
    file =>
      println(file.content())
  }
}

class FakeFile() {
  def close():Unit = {
    println("closing fake file.")
  }

  def content():String = {
    "This is a fake File.."
  }
}

object TempFiles{
  def close():Unit = {
    println("closing temp files")
  }

  def getTime():Unit = {
    println(s"Current time is ${System.currentTimeMillis()}")
  }
}