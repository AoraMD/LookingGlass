package moe.aoramd.lookinglass.log

/**
 * 日志打印实现
 *
 * @author M.D.
 * @version 1
 */
abstract class Printer {

    /**
     * 打印 Info 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    open fun i(message: String, tag: String) {}

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
    open fun i(message: String, throwable: Throwable, tag: String) {
        i(message, tag)
        throwable.printStackTrace()
    }

    /**
     * 打印 Verbose 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    open fun v(message: String, tag: String) {}

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
    open fun v(message: String, throwable: Throwable, tag: String) {
        v(message, tag)
        throwable.printStackTrace()
    }

    /**
     * 打印 Debug 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    open fun d(message: String, tag: String) {}

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
    open fun d(message: String, throwable: Throwable, tag: String) {
        d(message, tag)
        throwable.printStackTrace()
    }

    /**
     * 打印 Warning 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    open fun w(message: String, tag: String) {}

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
    open fun w(message: String, throwable: Throwable, tag: String) {
        d(message, tag)
        throwable.printStackTrace()
    }

    /**
     * 打印 Error 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    open fun e(message: String, tag: String) {}

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
    open fun e(message: String, throwable: Throwable, tag: String) {
        e(message, tag)
        throwable.printStackTrace()
    }

    /**
     * 打印 What A Terrible Failure 级别日志
     *
     * @author M.D.
     * @since 1
     *
     * @param message 日志信息
     * @param tag 日志标签
     */
    open fun wtf(message: String, tag: String) {}

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
    open fun wtf(message: String, throwable: Throwable, tag: String) {
        wtf(message, tag)
        throwable.printStackTrace()
    }
}