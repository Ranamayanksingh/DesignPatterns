package structural.proxy

trait Computer {
  def run(command:String):String
}

class LinuxComputer extends Computer {
  override def run(command: String): String = s"running $command in linux"
}

class SecurityShell(realComputer:Computer) extends Computer {
  override def run(command: String): String = {
    command match {
      case "shutdown" => "shutdown is prohibited"
      case _ => realComputer.run(command)
    }
  }
}
