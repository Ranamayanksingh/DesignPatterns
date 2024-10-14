package behavioral.command

object Main extends App {

  val remote: RemoteController = new RemoteController(Television())
  remote.invoke(Command.setChannel(1))
  remote.invoke(Command.setChannel(5))
  remote.invoke(Command.setVolumne(15))
  println(remote.get())
}
