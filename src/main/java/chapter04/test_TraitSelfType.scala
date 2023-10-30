package chapter04

object test_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("jia", "123456")
    user.insert()
  }
}

class User(val name: String, val password: String)

trait UserDao{
  _: User =>
  def insert(): Unit = {
    println(s"intsert into db: ${this.name}")
  }
}
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao
