package com.gutu.aquaris.repository

import com.gutu.aquaris.model.BossSubordinate
import com.gutu.aquaris.model.BossSubordinateId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.concurrent.CompletableFuture

@Repository
interface BossSubordinateRepository : JpaRepository<BossSubordinate, BossSubordinateId> {
    @Modifying
    @Query("SELECT b FROM BossSubordinate b WHERE b.bossSubordinateId = :bossSubordinateId")
    fun findBossSubordinateById(bossSubordinateId: BossSubordinateId): CompletableFuture<BossSubordinate>
    fun save(bossSubordinate: BossSubordinate): CompletableFuture<BossSubordinate>
    @Modifying
    @Query("DELETE FROM BossSubordinate b WHERE b.bossSubordinateId = :BossSubordinateId")
    fun deleteBossSubordinateById(bossSubordinateId: BossSubordinateId): CompletableFuture<Void>
}
