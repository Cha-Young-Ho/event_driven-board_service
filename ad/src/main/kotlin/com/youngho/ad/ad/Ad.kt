package com.youngho.ad.ad

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.RequiredArgsConstructor
import lombok.ToString
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*


@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table("ads")
class Ad (

    @PrimaryKey()
    @Builder.Default
    val id: String = UUID.randomUUID().toString(),

    val title: String,

    val content: String,

    val tags: MutableList<String>,


    )