package dev.petecampbell.subscriptionmanager.subscription.model

import java.util.*

enum class Status { ACTIVE, INACTIVE }

data class Subscription(
        val name: String,
        val status: Status,
        val fee: Double,
        val dueDate: Date
)