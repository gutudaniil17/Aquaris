package com.gutu.aquaris.repository

import com.gutu.aquaris.model.BossSubordinate
import com.gutu.aquaris.model.BossSubordinateId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BossSubordinateRepository : JpaRepository<BossSubordinate, BossSubordinateId> {
    // You can add custom query methods if needed
}
