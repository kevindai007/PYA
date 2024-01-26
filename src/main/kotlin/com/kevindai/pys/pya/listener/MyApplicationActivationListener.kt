package com.kevindai.pys.pya.listener;

import com.intellij.openapi.application.ApplicationActivationListener
import com.intellij.openapi.wm.IdeFrame
import com.kevindai.pys.pya.ProctectYourAssTask
import java.util.*

//internal class MyApplicationActivationListener : ApplicationActivationListener {
//
//    private var timer: Timer? = null
//
//    override fun applicationActivated(ideFrame: IdeFrame) {
//        if (timer != null) {
//            timer?.cancel()
//            timer = null
//        }
//        timer = Timer().apply {
//            schedule(ProctectYourAssTask(), 1000, (3600000/2).toLong())
//        }
//    }
//
//    override fun applicationDeactivated(ideFrame: IdeFrame) {
//        timer?.cancel()
//    }
//}
