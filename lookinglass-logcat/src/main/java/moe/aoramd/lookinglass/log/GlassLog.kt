@file:Suppress("unused")

package moe.aoramd.lookinglass.log

import moe.aoramd.lookinglass.core.GlassCore
import moe.aoramd.lookinglass.log.printer.DebugPrinter
import moe.aoramd.lookinglass.log.printer.DefaultPrinter

/**
 * 日志打印工具
 * <p>
 * Debug 模式下日志打印实现优先级：debugPrinter、printer、默认 Debug 日志打印实现
 * <p>
 * Release 模式下日志打印实现优先级：printer、默认日志打印实现
 *
 * @author M.D.
 * @version 1
 */
object GlassLog {

    private const val DEFAULT_TAG = "looking glass logcat tag"

    private val core: GlassCore
        get() = GlassLogCoreLoader.core

    private val current: Printer
        get() = (if (core.isDebug) debugPrinter ?: printer else printer)
            ?: if (core.isDebug) DebugPrinter else DefaultPrinter

    private val tag: String
        get() = defaultTag ?: DEFAULT_TAG

    /**
     * 自定义日志打印实现
     *
     * @author M.D.
     * @since 1
     */
    var printer: Printer? = null

    /**
     * 自定义 Debug 模式日志打印实现
     *
     * @author M.D.
     * @since 1
     */
    var debugPrinter: Printer? = null

    /**
     * 默认日志标签
     * <p>若未设置，则默认日志标签为 "looking glass logcat tag"
     *
     * @author M.D.
     * @since 1
     */
    var defaultTag: String? = null

    /**
     * 打印 Info 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun i(message: String, tag: String = this.tag) =
        current.i(message, tag)

    /**
     * 打印 Info 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param throwable 需要在日志中打印的异常
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun i(message: String, throwable: Throwable, tag: String = this.tag) =
        current.i(message, throwable, tag)

    /**
     * 打印 Verbose 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun v(message: String, tag: String = this.tag) =
        current.v(message, tag)

    /**
     * 打印 Verbose 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param throwable 需要在日志中打印的异常
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun v(message: String, throwable: Throwable, tag: String = this.tag) =
        current.v(message, throwable, tag)

    /**
     * 打印 Debug 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun d(message: String, tag: String = this.tag) =
        current.d(message, tag)

    /**
     * 打印 Debug 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param throwable 需要在日志中打印的异常
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun d(message: String, throwable: Throwable, tag: String = this.tag) =
        current.d(message, throwable, tag)

    /**
     * 打印 Warning 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun w(message: String, tag: String = this.tag) =
        current.w(message, tag)

    /**
     * 打印 Warning 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param throwable 需要在日志中打印的异常
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun w(message: String, throwable: Throwable, tag: String = this.tag) =
        current.w(message, throwable, tag)

    /**
     * 打印 Error 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun e(message: String, tag: String = this.tag) =
        current.e(message, tag)

    /**
     * 打印 Error 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param throwable 需要在日志中打印的异常
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun e(message: String, throwable: Throwable, tag: String = this.tag) =
        current.e(message, throwable, tag)

    /**
     * 打印 What A Terrible Failure 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun wtf(message: String, tag: String = this.tag) =
        current.wtf(message, tag)

    /**
     * 打印 What A Terrible Failure 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param throwable 需要在日志中打印的异常
     * @param tag 日志标签
     */
    @JvmOverloads
    @JvmStatic
    fun wtf(message: String, throwable: Throwable, tag: String = this.tag) =
        current.wtf(message, throwable, tag)
}