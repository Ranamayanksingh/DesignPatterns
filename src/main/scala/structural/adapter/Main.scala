package structural.adapter

object Main extends App{
  val soldier = new Soldier()
  println(soldier.fightWith(new AK47()))
  println(soldier.fightWith(new Knife()))
}
