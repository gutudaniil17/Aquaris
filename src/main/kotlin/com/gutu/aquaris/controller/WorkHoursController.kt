package com.gutu.aquaris.controller

import com.gutu.aquaris.model.WorkHours
import com.gutu.aquaris.service.WorkHoursService
import org.springframework.web.bind.annotation.*
import java.util.concurrent.CompletableFuture

@RestController
@RequestMapping("/work-hours")
class WorkHoursController(private val workHoursService: WorkHoursService) {

    @PostMapping
    fun createWorkHours(@RequestBody workHours: WorkHours): CompletableFuture<WorkHours> {
        return workHoursService.create(workHours)
    }

    @GetMapping("/{workHoursId}")
    fun getWorkHoursById(@PathVariable workHoursId: Long): CompletableFuture<WorkHours> {
        return workHoursService.findById(workHoursId)
    }

    @PutMapping
    fun updateWorkHours(@RequestBody workHours: WorkHours): CompletableFuture<WorkHours> {
        return workHoursService.update(workHours)
    }

    @DeleteMapping("/{workHoursId}")
    fun deleteWorkHoursById(@PathVariable workHoursId: Long): CompletableFuture<Void> {
        return workHoursService.deleteById(workHoursId)
    }
}
