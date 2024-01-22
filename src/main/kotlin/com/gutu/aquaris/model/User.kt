package com.gutu.aquaris.model

import jakarta.persistence.*
import lombok.Data
import lombok.NoArgsConstructor

enum class UserRole{
    CEO, MANAGER, TEAM_LEAD, DEVELOPER
}
@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userId: Long,
    var username: String,
    var password: String,
    @Enumerated(EnumType.STRING)
    var role: UserRole
) {
}