package org.example.demo

case class StorageDetails(tenantName: String, connections: List[Connections])

case class Connections(dataSourceType: String, connectionMethod: String, connectionName: String, scope: String, connectionProperties: List[ConnectionProperties])

case class ConnectionProperties(name: String, value: String, valueType: String)


