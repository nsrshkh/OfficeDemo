import org.example.demo.common.ChildClasses
import org.example.demo.mapper.BaseMapper

import java.lang.reflect.Constructor
import scala.language.reflectiveCalls



object Execute {

  def main(args: Array[String]): Unit = {
//    val foo = Class.forName("Foo").newInstance.asInstanceOf[Foo]
//    println(foo.hello("Walter")) // prints "Hello there, Walter"

    case class ExecuteProgram(childClasses: ChildClasses) {
      val clazz: Class[_] = Class.forName("org.example.demo.mapper.CreateTempTable")
      val constructor: Constructor[_] = clazz.getConstructor(classOf[ChildClasses])

      val classInstance: BaseMapper = constructor.newInstance(childClasses).asInstanceOf[BaseMapper]

      val executeProgram: Unit = classInstance.execute()
    }


    ExecuteProgram(childClasses = new ChildClasses("Nasir")).executeProgram


  }
}