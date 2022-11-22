package com.example.kotlinspringsample.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(

    @Id
    @JsonProperty("id")
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0L,

    @JsonProperty("name")
    @Column(name = "name", length = 50)
    val name: String,

    @JsonProperty("email")
    @Column(name = "email", length = 50)
    val email: String?,

    @JsonProperty("age")
    @Column(name = "age")
    val age: Int,
)