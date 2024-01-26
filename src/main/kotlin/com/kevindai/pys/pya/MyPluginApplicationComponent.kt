package com.kevindai.pys.pya

import com.intellij.openapi.components.ApplicationComponent

/**
 *
 * @author daiwenkai
 * @version  MyPluginApplicationComponent.java, v 0.1 2024/1/26 11:57 AM daiwenkai Exp $
 */
class MyPluginApplicationComponent : ApplicationComponent {
    private val myPluginComponent = ProctectYourAssTask()

    override fun initComponent() {
        myPluginComponent.start()
    }

    override fun disposeComponent() {
        myPluginComponent.stop()
    }

    override fun getComponentName(): String {
        return "MyPluginApplicationComponent"
    }
}