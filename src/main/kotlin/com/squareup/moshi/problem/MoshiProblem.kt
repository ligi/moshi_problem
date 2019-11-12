package com.squareup.moshi.problem

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

@JsonClass(generateAdapter = true)
data class Foo(
        val bar: List<String>?
)

fun main() {
    val adapter=Moshi.Builder().build().adapter<Foo>(Foo::class.java)
    adapter.fromJson("{}")
}