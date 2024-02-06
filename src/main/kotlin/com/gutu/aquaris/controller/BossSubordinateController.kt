package com.gutu.aquaris.controller

import com.gutu.aquaris.model.BossSubordinate
import com.gutu.aquaris.model.BossSubordinateId
import com.gutu.aquaris.service.BossSubordinateService
import org.springframework.web.bind.annotation.*
import java.util.concurrent.CompletableFuture

@RestController
@RequestMapping("/boss-subordinates")
class BossSubordinateController(private val bossSubordinateService: BossSubordinateService) {

    @PostMapping
    fun createBossSubordinate(@RequestBody bossSubordinate: BossSubordinate): CompletableFuture<BossSubordinate> {
        return bossSubordinateService.create(bossSubordinate)
    }

    @GetMapping("/{bossId}/{subordinateId}")
    fun getBossSubordinateById(
            @PathVariable bossId: Long,
            @PathVariable subordinateId: Long
    ): CompletableFuture<BossSubordinate> {
        val bossSubordinateId = BossSubordinateId(bossId, subordinateId)
        return bossSubordinateService.findById(bossSubordinateId)
    }

    @PutMapping
    fun updateBossSubordinate(@RequestBody bossSubordinate: BossSubordinate): CompletableFuture<BossSubordinate> {
        return bossSubordinateService.update(bossSubordinate)
    }

    @DeleteMapping("/{bossId}/{subordinateId}")
    fun deleteBossSubordinateById(
            @PathVariable bossId: Long,
            @PathVariable subordinateId: Long
    ): CompletableFuture<Void> {
        val bossSubordinateId = BossSubordinateId(bossId, subordinateId)
        return bossSubordinateService.deleteById(bossSubordinateId)
    }
}
