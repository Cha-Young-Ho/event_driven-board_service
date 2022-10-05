package com.youngho.ad.ad

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository

interface AdRepository : ReactiveCassandraRepository<Ad, String>{
}