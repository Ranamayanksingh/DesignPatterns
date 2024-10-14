package behavioral.command

object Command {
  type Type = (Television) => Television

  def setChannel(channel:Int)(tv:Television):Television = {
    Television(channel,tv.volume)
  }

  def setVolumne(volume:Int)(tv:Television):Television = {
    Television(tv.channel,volume)
  }
}
