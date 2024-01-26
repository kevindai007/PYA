package com.kevindai.pys.pya

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

/**
 *
 * @author daiwenkai
 * @version  DrinkWaterReminderTask.java, v 0.1 2024/1/26 10:19 AM daiwenkai Exp $
 */
class ProctectYourAssTask {
    private val executorService = Executors.newSingleThreadScheduledExecutor()

    fun start() {
        executorService.scheduleAtFixedRate(::runTask, 0, 30, TimeUnit.MINUTES)
    }

    fun stop() {
        executorService.shutdown()
    }

    private fun runTask() {
        val notification =
            Notification("protect-your-ass", "你锻炼了吗？", "3! 2! 1! 跟我一起收紧臀部！", NotificationType.INFORMATION)
        Notifications.Bus.notify(notification)
    }
}