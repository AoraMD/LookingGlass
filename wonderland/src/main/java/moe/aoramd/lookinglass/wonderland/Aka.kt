package moe.aoramd.lookinglass.wonderland

import android.annotation.SuppressLint
import android.content.Context
import moe.aoramd.lookinglass.core.GlassCore

/**
 * Wonderland 提供的默认 Glass Core
 * <p>
 * <i>本文档所有"核心"除非特殊说明，均指 Glass Core</i>
 * <p>
 * 当 Wonderland 通过调用 [Wonderland.initializeGlasses] 时，
 * Aka 将被设定为所有需要核心的 Looking Glass 模块的默认核心，
 * 但一个 Looking Glass 模块是否将 Aka 作为使用的核心，根据其配置而定
 * <p>
 * 同时 Aka 可当作工具类调用
 *
 * @author M.D.
 * @version 1
 */
@SuppressLint("StaticFieldLeak")
object Aka : GlassCore() {

    internal enum class State {
        NOT_INITIALIZE, ACTIVE, DESTROY
    }

    internal var state: State = State.NOT_INITIALIZE

    internal var contextBackend: Context? = null

    override val context: Context
        get() = contextBackend ?: when (state) {
            State.NOT_INITIALIZE -> throw IllegalStateException("aka core is not initialize")
            State.DESTROY -> throw IllegalStateException("aka core is destroy")
            else -> throw IllegalStateException("aka core context is null while state is ACTIVE")
        }
}