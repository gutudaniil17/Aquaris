package com.gutu.aquaris.repository

import com.gutu.aquaris.model.WorkHours
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.concurrent.CompletableFuture

@Repository
interface WorkHoursRepository : JpaRepository<WorkHours, Long> {
    @Modifying
    @Query("SELECT w FROM WorkHours w WHERE w.workHoursId = :workHoursId")
    fun findWorkHoursByWorkHoursId(workHoursId: Long): CompletableFuture<WorkHours>
    fun save(workHours: WorkHours): CompletableFuture<WorkHours>
    @Modifying
    @Query("DELETE FROM WorkHours w WHERE w.workHoursId = :workHoursId")
    fun deleteWorkHoursByWorkHoursId(workHoursId: Long): CompletableFuture<Void>
}
