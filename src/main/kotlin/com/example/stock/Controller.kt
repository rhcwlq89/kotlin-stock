package com.example.stock

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController(private val userRepository : UserRepository) {

    @GetMapping("/")
    fun findAll() = userRepository.findAll()
}