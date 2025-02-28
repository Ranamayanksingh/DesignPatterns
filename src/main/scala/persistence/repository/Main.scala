package persistence.repository

object Main extends App {
  val repository = new AccountRespositoryInMemory()
  val abby = Account(1,"abby",10)
  val bobby = Account(2,"bobby",11)
  val cathy = Account(3,"cathy",12)

  repository.save(abby)
  repository.save(bobby)
  repository.save(cathy)
  println(repository.findAll())

  val bobby2 = bobby.copy(age = 15)
  repository.save(bobby2)
  println(repository.findAll())

  repository.delete(cathy)
  repository.deleteById(bobby2.id)
  println(repository.findAll())

  println(repository.findById(2))

  println(repository.findAll(new AccountSpecification.AgeBetweenSpec(5,11)))

  println(repository.findAll(new AccountSpecification.NameEqualSpec("abby")))

}
