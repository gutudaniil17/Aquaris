package com.gutu.aquaris.model

import jakarta.persistence.*
import lombok.Data
import lombok.NoArgsConstructor
import java.io.Serializable


@Data
@NoArgsConstructor
@Entity
@Table(name = "boss_subordinate")
class BossSubordinate(
    @EmbeddedId
    var bossSubordinateId: BossSubordinateId,

    @ManyToOne
    @JoinColumn(name = "boss_id")
    var boss: User,

    @ManyToOne
    @JoinColumn(name = "subordinate_id")
    var subordinate: User
)

@Embeddable
class BossSubordinateId(
    var bossId: Long,
    var subordinateId: Long
): Serializable
