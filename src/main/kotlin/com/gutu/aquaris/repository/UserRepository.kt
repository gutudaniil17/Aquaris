package com.gutu.aquaris.repository
import com.gutu.aquaris.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.concurrent.CompletableFuture

@Repository
interface UserRepository : JpaRepository<User, Long> {
    // Asynchronous methods to perform CRUD operations on User entity
    fun findByUsername(username: String): CompletableFuture<User?>
    fun existsByUsername(username: String): CompletableFuture<Boolean>
    fun deleteByUsername(username: String): CompletableFuture<Long>
    fun save(user: User): User
}
