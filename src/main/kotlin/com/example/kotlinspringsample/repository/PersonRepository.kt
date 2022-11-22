package com.example.kotlinspringsample.repository

import com.example.kotlinspringsample.model.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long>