package com.example.kotlinspringsample.controller

import com.example.kotlinspringsample.model.Person
import com.example.kotlinspringsample.service.PersonService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("persons")
class PersonController(
    private val service: PersonService
) {

    @GetMapping
    fun index() = service.all()

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun read(@PathVariable id: Long) = service.get(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody person: Person) = service.add(person)

    @PutMapping("{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody person: Person
    ) = service.edit(id, person)

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) = service.remove(id)
}