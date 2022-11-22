package com.example.kotlinspringsample.service

import com.example.kotlinspringsample.model.Person
import com.example.kotlinspringsample.repository.PersonRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonService(
    private val repository: PersonRepository
) {

    fun all(): Iterable<Person> = repository.findAll()

    fun get(id: Long): Optional<Person> = repository.findById(id)

    fun add(person: Person): Person = repository.save(person)

    fun edit(id: Long, person: Person): Person = repository.save(person.copy(id = id))

    fun remove(id: Long) = repository.deleteById(id)
}