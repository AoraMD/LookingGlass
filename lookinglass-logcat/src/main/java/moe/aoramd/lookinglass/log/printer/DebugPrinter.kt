package moe.aoramd.lookinglass.log.printer

import android.util.Log
import moe.aoramd.lookinglass.log.Printer

/**
 * 默认 Debug 模式日志打印实现
 * <p>
 * 采用 [android.util.Log] 实现
 *
 * @author M.D.
 * @version 1
 */
internal object DebugPrinter : Printer() {

    override fun i(message: String, tag: String) {
        Log.i(tag, message)
    }

    override fun i(message: String, throwable: Throwable, tag: String) {
        Log.i(tag, message, throwable)
    }

    override fun v(message: String, tag: String) {
        Log.v(tag, message)
    }

    override fun v(message: String, throwable: Throwable, tag: String) {
        Log.v(tag, message, throwable)
    }

    override fun d(message: String, tag: String) {
        Log.d(tag, message)
    }

    override fun d(message: String, throwable: Throwable, tag: String) {
        Log.d(tag, message, throwable)
    }

    override fun w(message: String, tag: String) {
        Log.w(tag, message)
    }

    override fun w(message: String, throwable: Throwable, tag: String) {
        Log.w(tag, message, throwable)
    }

    override fun e(message: String, tag: String) {
        Log.e(tag, message)
    }

    override fun e(message: String, throwable: Throwable, tag: String) {
        Log.e(tag, message, throwable)
    }

    override fun wtf(message: String, tag: String) {
        Log.wtf(tag, message)
    }

    override fun wtf(message: String, throwable: Throwable, tag: String) {
        Log.wtf(tag, message, throwable)
    }

}