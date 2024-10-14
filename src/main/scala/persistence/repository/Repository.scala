package persistence.repository

import scala.collection.mutable

trait Repository[T,ID] {
  def save(entity:T):Unit
  def delete(entity:T):Unit
  def deleteById(id:ID):Unit
  def findById(id:ID):Unit
  def findAll(spec:Specfication[T]=null):List[T]
}


trait AccontRepositroy extends Repository[Account,Int]

class AccountRespositoryInMemory extends AccontRepositroy {
  val repository: mutable.HashMap[Int,Account] = new mutable.HashMap[Int,Account]()

  override def save(entity: Account): Unit = {
    repository.put(entity.id,entity)
  }

  override def delete(entity: Account): Unit = {
    repository.remove(entity.id)
  }


  override def deleteById(id: Int): Unit = {
    repository.remove(id)
  }

  override def findById(id: Int): Unit = {
    repository.get(id)
  }

  override def findAll(spec: Specfication[Account]=null): List[Account] = {
    if(spec==null) repository.values.toList
    else repository.values.filter(x => spec.specified(x)).toList
  }
}

