package com.gutu.aquaris.controller

import com.gutu.aquaris.model.User
import com.gutu.aquaris.service.UserService
import org.springframework.web.bind.annotation.*
import java.util.concurrent.CompletableFuture

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping("/{username}")
    fun getUserByUsername(@PathVariable username: String): CompletableFuture<User?> {
        return userService.findByUsername(username)
    }

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }

    @PutMapping
    fun editUser(@RequestBody user: User): User {
        return userService.editUser(user)
    }

    @DeleteMapping("/{username}")
    fun deleteUserByUsername(@PathVariable username: String): CompletableFuture<Long> {
        return userService.deleteUserByUsername(username)
    }
}
