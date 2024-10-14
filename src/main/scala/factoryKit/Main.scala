package factoryKit

object Main extends App{
  val factory = WeaponFactoryKit.factory {
    builder =>
      builder.put("axe",() => new Axe())
      builder.put("bow",() => new Bow())
      builder.put("sword",() => new Sword())
  }

  val axe = factory.create("axe")
  axe.setWeaponName("manika")

  val fire =factory.create("bow")
  fire.setWeaponName("kailash")

  println(axe.name)
  println(fire.name)

}
