package com.side.tiggle.domain.reaction.dto.resp

import com.side.tiggle.domain.reaction.model.Reaction
import com.side.tiggle.domain.reaction.model.ReactionType

data class ReactionRespDto(
    val txId: Long,
    val senderId: Long,
    val receiverId: Long,
    val type: ReactionType
) {
    companion object {
        fun fromEntity(reaction: Reaction): ReactionRespDto {
            return ReactionRespDto(
                txId = reaction.tx.id!!,
                senderId = reaction.sender.id,
                receiverId = reaction.receiver.id,
                type = reaction.type
            )
        }
    }
}