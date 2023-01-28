
case class ClassFlow(className: String, classPath: String)

case class ExecutionFlow(id: String, `type`: String, flow: List[ClassFlow])

case class ExecutionMapper(executionId: String, executionFlow: List[ExecutionFlow])


import org.example.demo.common.ChildClasses
import org.example.demo.mapper.{BaseMapper, CreateTempTable}
import org.json4s.DefaultFormats
import org.json4s.native.JsonMethods

import scala.io.Source
import scala.language.reflectiveCalls


val jsonString: String = Source.fromResource("ExecutionMapper.json").mkString

implicit val formats: DefaultFormats.type = DefaultFormats
val executionMapper = {
  JsonMethods.parse(jsonString).extract[ExecutionMapper]
}

//executionMapper.executionFlow.filter(_.`type`.equalsIgnoreCase("transformation"))

case class ExecuteProgram(childClasses: ChildClasses) {
  val clazz = Class.forName("org.example.demo.mapper.CreateTempTable")
  val constructor = clazz.getConstructor(classOf[ChildClasses])

  val classInstance = constructor.newInstance(childClasses).asInstanceOf[BaseMapper]

  val executeProgram: Unit = classInstance.execute()
}



  ExecuteProgram(new ChildClasses("Nasir")).executeProgram



