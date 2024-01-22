package com.gutu.aquaris.model

import jakarta.persistence.*
import lombok.Data
import lombok.NoArgsConstructor
import java.math.BigDecimal
import java.time.LocalDateTime

@Data
@NoArgsConstructor
@Entity
@Table(name = "work_hours")
class WorkHours(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var workHoursId: Long,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User,

    @ManyToOne
    @JoinColumn(name = "project_id")
    var project: Project,

    var startTime: LocalDateTime,

    var endTime: LocalDateTime? = null,

    var hoursWorked: BigDecimal? = null
)
