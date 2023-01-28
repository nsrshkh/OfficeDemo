package org.example.demo.mapper

import org.example.demo.common.ChildClasses


abstract class BaseMapper(childClasses: ChildClasses) {
def execute(): Unit
}
