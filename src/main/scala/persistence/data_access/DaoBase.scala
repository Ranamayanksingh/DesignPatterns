package persistence.data_access

import scala.collection.mutable

trait DaoBase[T] {
  def insert(obj:T):Unit
  def update(obj:T):Unit
  def findById(id:Int):Option[T]
}

trait StudentDao extends DaoBase[Student]

class InMemoryStudentDao extends StudentDao {
  val student = mutable.HashMap[Int,Student]()

  override def insert(obj: Student): Unit = {
    if(student.get(obj.id).isEmpty){
      student.put(obj.id,obj)
    } else {
      throw new Exception(s"Records exists : $obj")
    }
  }

  override def update(obj: Student): Unit = {
    student.update(obj.id,obj)
  }

  override def findById(id: Int): Option[Student] ={
    student.get(id)
  }
}
