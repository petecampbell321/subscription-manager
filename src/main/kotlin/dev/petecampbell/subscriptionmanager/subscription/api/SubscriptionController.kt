package dev.petecampbell.subscriptionmanager.subscription.api

import dev.petecampbell.subscriptionmanager.subscription.service.SubscriptionService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("subscriptions")
class SubscriptionController(val subscriptionService: SubscriptionService) {

}