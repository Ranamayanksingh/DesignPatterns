package persistence.data_access

object Main extends App {
  val database = new InMemoryStudentDao()

  database.insert(Student(1,"abby",11))
  database.insert(Student(2,"bobby",2))

  println(database.findById(1).get)
  println(database.findById(2).get)
  database.update(Student(2, "bobby", 15))
  println(database.findById(2).get)
}
