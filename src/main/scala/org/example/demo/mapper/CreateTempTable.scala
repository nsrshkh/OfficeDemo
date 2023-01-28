package org.example.demo.mapper

import org.example.demo.common.ChildClasses

class CreateTempTable(childClasses: ChildClasses) extends BaseMapper(childClasses) {
  override def execute(): Unit = println(childClasses.program)
}
