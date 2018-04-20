package com.fedka27.github.lib.kotlin_extentions

import android.app.ActivityManager
import android.content.Context
import android.support.v4.app.NotificationManagerCompat

fun Context.appInForeground(): Boolean {
    val activityManager = this.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    val runningAppProcesses = activityManager.runningAppProcesses ?: return false
    return runningAppProcesses.any { it.processName == this.packageName && it.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND }
}

fun Context.isSystemNotificationEnabled() = NotificationManagerCompat.from(this).areNotificationsEnabled()