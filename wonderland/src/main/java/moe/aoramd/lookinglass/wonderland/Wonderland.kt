@file:Suppress("unused")

package moe.aoramd.lookinglass.wonderland

import android.content.Context
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.javaField
import moe.aoramd.lookinglass.core.GlassCoreLand

/**
 * Looking Glass 初始化中心
 * <p>
 * <i>本文档所有"核心"除非特殊说明，均指 Glass Core</i>
 * <p>
 * 可通过 Wonderland 初始化其它 Looking Glass 模块
 * <p>
 * **注意！**
 * <p>
 * 1、Wonderland 无法跨进程，每一个使用 Wonderland 的进程都需要初始化
 * <p>
 * 2、可能引发内存泄漏，注意及时调用 [unregister] 取消注册
 *
 * @author M.D.
 * @version 1
 */
object Wonderland {

    // 属性名，用于通过反射初始化默认核心
    private const val CORE_VALUE_NAME = "coreBackend"

    /**
     * 将 context 注册到 Wonderland
     * <p>建议与 [unregister] 置于对应的生命周期回调
     *
     * @author M.D.
     * @since 1
     *
     * @param context context
     */
    fun register(context: Context) {
        Aka.apply {
            contextBackend = context
            state = Aka.State.ACTIVE
        }
    }

    /**
     * 将 context 从 Wonderland 取消注册
     * <p>建议与 [register] 置于对应的生命周期回调
     *
     * @author M.D.
     * @since 1
     */
    fun unregister() {
        Aka.apply {
            contextBackend = null
            state = Aka.State.DESTROY
        }
    }

    /**
     * 设置 Looking Glass 模块的默认核心为 Aka
     *
     * @author M.D.
     * @since 1
     */
    fun initializeGlasses() {
        GlassCoreLand::class.memberProperties
            .filter {
                it.name == CORE_VALUE_NAME
            }
            .map {
                it.isAccessible = true
                it.javaField?.set(GlassCoreLand, Aka)
            }
    }
}