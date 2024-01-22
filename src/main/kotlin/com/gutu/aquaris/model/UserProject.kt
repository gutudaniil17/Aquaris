package com.gutu.aquaris.model

import jakarta.persistence.*
import lombok.Data
import lombok.NoArgsConstructor
import java.io.Serializable


@Data
@NoArgsConstructor
@Entity
@Table(name = "user_projects")
class UserProject(
    @EmbeddedId
    var id: UserProjectId,

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    var user: User,

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    var project: Project
)

@Embeddable
class UserProjectId(
    var userId: Long,
    var projectId: Long
): Serializable
