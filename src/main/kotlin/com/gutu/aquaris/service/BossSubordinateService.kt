package com.gutu.aquaris.service

import com.gutu.aquaris.model.BossSubordinate
import com.gutu.aquaris.model.BossSubordinateId
import com.gutu.aquaris.repository.BossSubordinateRepository
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture

@Service
class BossSubordinateService(private val bossSubordinateRepository: BossSubordinateRepository) {

    fun create(bossSubordinate: BossSubordinate): CompletableFuture<BossSubordinate> {
        return bossSubordinateRepository.save(bossSubordinate)
    }

    fun findById(bossSubordinateId: BossSubordinateId): CompletableFuture<BossSubordinate> {
        return bossSubordinateRepository.findBossSubordinateById(bossSubordinateId)
    }

    fun update(bossSubordinate: BossSubordinate): CompletableFuture<BossSubordinate> {
        return bossSubordinateRepository.save(bossSubordinate)
    }

    fun deleteById(bossSubordinateId: BossSubordinateId): CompletableFuture<Void> {
        return bossSubordinateRepository.deleteBossSubordinateById(bossSubordinateId)
    }
}
