package com.gutu.aquaris.service

import com.gutu.aquaris.model.WorkHours
import com.gutu.aquaris.repository.WorkHoursRepository
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture

@Service
class WorkHoursService(private val workHoursRepository: WorkHoursRepository) {

    fun create(workHours: WorkHours): CompletableFuture<WorkHours> {
        return workHoursRepository.save(workHours)
    }

    fun findById(workHoursId: Long): CompletableFuture<WorkHours> {
        return workHoursRepository.findWorkHoursByWorkHoursId(workHoursId)
    }

    fun update(workHours: WorkHours): CompletableFuture<WorkHours> {
        return workHoursRepository.save(workHours)
    }

    fun deleteById(workHoursId: Long): CompletableFuture<Void> {
        return workHoursRepository.deleteWorkHoursByWorkHoursId(workHoursId)
    }
}
