package com.gutu.aquaris.model

import jakarta.persistence.*
import lombok.Data
import lombok.NoArgsConstructor
import java.util.*

@Data
@NoArgsConstructor
@Entity
@Table(name = "projects")
class Project(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var projectId: String,
        var projectName: String,
        var budget: Long,
        var estimate: Date
)