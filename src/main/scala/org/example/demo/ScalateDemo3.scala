//package org.example.demo
//
//import org.apache.spark.sql.SparkSession
//import org.fusesource.scalate.TemplateEngine
//
//
//object ScalateDemo3 extends App{
//
//  val spark = SparkSession.builder()
//    .master("local[*]")
//    .appName("OfficeDemo")
//    .getOrCreate()
//
//  val sourceDataPath = new java.io.File("src/main/resources/function_example3.mustache").getCanonicalPath
//  val engine = new TemplateEngine
//  val someAttributes = Map(
//    "column_names" -> "first_name as first, last_name as last, age as ages",
//    "table_name" -> "fun_people"
//  )
//
//val sourceFilePath = "C:\\Users\\nasir\\IdeaProjects\\OfficeDemo\\src\\main\\resources\\fun_people.csv"
//
//  val dfRead = spark.read.format("csv").option("header","true").load(sourceFilePath)
//  dfRead.createOrReplaceTempView("fun_people")
////  dfRead.show()
//
//  val sqlQuery = engine.layout(sourceDataPath, someAttributes)
//  println(sqlQuery)
//
//val sqlRead = spark.sql(sqlQuery)
//  sqlRead.show()
//
//
//}
