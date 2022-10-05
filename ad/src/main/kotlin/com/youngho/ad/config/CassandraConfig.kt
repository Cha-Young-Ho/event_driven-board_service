package com.youngho.ad.config

import lombok.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration
import org.springframework.data.cassandra.config.EnableCassandraAuditing
import org.springframework.data.cassandra.config.SchemaAction
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories

@EnableCassandraAuditing
@Configuration
@EnableReactiveCassandraRepositories
class CassandraConfig : AbstractReactiveCassandraConfiguration() {


    override fun getKeyspaceName(): String {
        return "ad";
    }

    override fun getKeyspaceDrops(): MutableList<DropKeyspaceSpecification> {
        return mutableListOf(DropKeyspaceSpecification.dropKeyspace("ad"))
    }

    override fun getContactPoints(): String {
        return "localhost"
    }

    override fun getSchemaAction(): SchemaAction {
        return SchemaAction.CREATE_IF_NOT_EXISTS
    }



}