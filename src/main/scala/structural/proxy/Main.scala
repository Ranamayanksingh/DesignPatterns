package structural.proxy

object Main extends App{
  val computer = new LinuxComputer()
  val ssh = new SecurityShell(computer)
  println(ssh.run("shutdown"))
  println(ssh.run("cd /root"))
}
