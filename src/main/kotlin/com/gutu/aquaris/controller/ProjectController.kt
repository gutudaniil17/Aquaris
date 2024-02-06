package com.gutu.aquaris.controller

import com.gutu.aquaris.model.Project
import com.gutu.aquaris.service.ProjectService
import org.springframework.web.bind.annotation.*
import java.util.concurrent.CompletableFuture

@RestController
@RequestMapping("/projects")
class ProjectController(private val projectService: ProjectService) {

    @GetMapping("/{projectId}")
    fun getById(@PathVariable projectId: String): CompletableFuture<Project?> {
        return projectService.findById(projectId)
    }

    @PostMapping
    fun create(@RequestBody project: Project): Project {
        return projectService.create(project)
    }

    @PutMapping("/{projectId}")
    fun update(@PathVariable projectId: String, @RequestBody project: Project): Project {
        // Ensure the projectId in the path matches the one in the request body
        project.projectId = projectId
        return projectService.update(project)
    }

    @DeleteMapping("/{projectId}")
    fun deleteById(@PathVariable projectId: String): CompletableFuture<Void> {
        return projectService.deleteById(projectId)
    }
}
