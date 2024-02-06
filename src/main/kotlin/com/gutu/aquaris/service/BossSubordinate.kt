package com.gutu.aquaris.service

import com.gutu.aquaris.model.BossSubordinate
import com.gutu.aquaris.model.BossSubordinateId
import com.gutu.aquaris.repository.BossSubordinateRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class BossSubordinateService(private val bossSubordinateRepository: BossSubordinateRepository) {

    fun create(bossSubordinate: BossSubordinate): BossSubordinate {
        return bossSubordinateRepository.save(bossSubordinate)
    }

    fun findById(bossSubordinateId: BossSubordinateId): Optional<BossSubordinate> {
        return bossSubordinateRepository.findById(bossSubordinateId)
    }

    fun update(bossSubordinate: BossSubordinate): BossSubordinate {
        return bossSubordinateRepository.save(bossSubordinate)
    }

    fun deleteById(bossSubordinateId: BossSubordinateId) {
        bossSubordinateRepository.deleteById(bossSubordinateId)
    }
}
