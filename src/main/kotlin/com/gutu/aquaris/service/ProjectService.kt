package com.gutu.aquaris.service

import com.gutu.aquaris.model.Project
import com.gutu.aquaris.repository.ProjectRepository
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture

@Service
class ProjectService(private val projectRepository: ProjectRepository) {

    fun findById(projectId: String): CompletableFuture<Project?> {
        return projectRepository.findByProjectId(projectId)
    }

    fun create(project: Project): Project {
        return projectRepository.save(project)
    }

    fun update(project: Project): Project {
        return projectRepository.save(project)
    }

    fun deleteById(projectId: String): CompletableFuture<Void> {
        return projectRepository.deleteProjectById(projectId);
    }
}
