package persistence.repository

trait Specfication[T] {
  def specified(entity:T):Boolean
  def toSqlClause():String
}

trait AccountSpecification extends Specfication[Account]

object AccountSpecification {

  class AgeBetweenSpec(from:Int, to:Int) extends AccountSpecification {
    override def specified(entity: Account): Boolean = {
      entity.age >= from && entity.age <= to
    }

    override def toSqlClause(): String = {
      s"""age >= $from and age <= $to"""
    }
  }

  class NameEqualSpec(name:String) extends AccountSpecification  {
    override def specified(entity: Account): Boolean = {
      entity.name.equalsIgnoreCase(name)
    }

    override def toSqlClause(): String = {
      s"""name = $name"""
    }
  }
}
