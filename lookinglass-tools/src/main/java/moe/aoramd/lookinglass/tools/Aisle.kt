@file:Suppress("unused")

package moe.aoramd.lookinglass.tools

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors

/**
 * 线程调度工具
 *
 * @author M.D.
 * @version 1
 */
object Aisle {

    @JvmStatic
    private val mainHandler = Handler(Looper.getMainLooper())

    @JvmStatic
    private val ioExecutor = Executors.newCachedThreadPool()

    /**
     * 将 Runnable 推送到主线程运行.
     *
     * 应用示例
     *
     * ```
     * Aisle.ui(
     *     Runnable {
     *         textView.text = sampleString
     *     }
     * )
     * ```
     *
     * @author M.D.
     * @since 1
     *
     * @param runnable 需要在界面更新线程运行的 Runnable 实现
     */
    @JvmStatic
    fun ui(runnable: Runnable) = mainHandler.post(runnable)

    /**
     * 将 Runnable 推送到后台线程运行.
     *
     * 后台线程实现见 [Executors.newCachedThreadPool]
     *
     * 应用示例
     *
     * ```
     * Aisle.io(
     *     Runnable {
     *         networkRequest()
     *     }
     * )
     * ```
     *
     * @author M.D.
     * @since 1
     *
     * @param runnable 需要在后台线程运行的 Runnable 实现
     */
    @JvmStatic
    fun io(runnable: Runnable) = ioExecutor.execute(runnable)

    /**
     * 判断当前线程是否为主线程
     *
     * @author M.D.
     * @version 1
     *
     * @return 如果当前线程为主线程，返回 true
     */
    @JvmStatic
    fun onUi(): Boolean {
        return Looper.getMainLooper() == Looper.myLooper()
    }
}