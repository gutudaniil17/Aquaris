package com.gutu.aquaris.service

import com.gutu.aquaris.model.User
import com.gutu.aquaris.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture

@Service
class UserService(private val userRepository: UserRepository) {

    fun findByUsername(username: String): CompletableFuture<User?> {
        return userRepository.findByUsername(username)
    }

    fun createUser(user: User): User {
        return userRepository.save(user)
    }

    fun editUser(user: User): User {
        // To update an existing user, simply save it again
        // The save method in Spring Data JPA will update the existing record
        return userRepository.save(user)
    }

    fun deleteUserByUsername(username: String): CompletableFuture<Long> {
        return userRepository.deleteByUsername(username)
    }
}
