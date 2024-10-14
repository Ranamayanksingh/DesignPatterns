package behavioral.memento

class Notebook {
  private var content = new StringBuffer()

  def getMomento:NotebookMomento = {
    NotebookMomentoInternal(content.toString)
  }

  def setMomento(momento:NotebookMomento):Unit = momento match {
    case NotebookMomentoInternal(state) => content = new StringBuffer(state)
    case _ => throw new IllegalArgumentException
  }

  def write(words:String):Unit  = {
    content.append(words)
  }

  def show() = {
    println(content)
  }

  private case class NotebookMomentoInternal(content:String) extends NotebookMomento
}
