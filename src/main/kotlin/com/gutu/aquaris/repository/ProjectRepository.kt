package com.gutu.aquaris.repository

import com.gutu.aquaris.model.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.concurrent.CompletableFuture

@Repository
interface ProjectRepository : JpaRepository<Project, String> {
    fun findByProjectId(projectId: String): CompletableFuture<Project?>

    @Modifying
    @Query("DELETE FROM Project p WHERE p.projectId = :projectId")
    fun deleteProjectById(@Param("projectId") project: String): CompletableFuture<Void>
}
