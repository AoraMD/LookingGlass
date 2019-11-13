@file:Suppress("unused")

package moe.aoramd.lookinglass.architecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

/**
 * 可接收 ViewModel 发送事件的 Fragment
 * <p>须配合 BaseViewModel 使用
 *
 * @author M.D.
 * @version 1
 */
abstract class BaseEventFragment : Fragment() {

    /**
     * 可发送事件的 ViewModel
     *
     * @author M.D.
     * @since 1
     */
    abstract val viewModel: BaseEventViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.event.observe(this, Observer {
            it.extra ?: onEventReceive(it.message)
            onEventReceive(it.message, it.extra)
        })
    }

    /**
     * 事件接收回调函数
     * <p>当接收到附加信息为 null 的事件时，该回调函数将被调用
     * <p>该函数优先于 onEventReceive(message: String, extra: Any?) 被调用
     *
     * @author M.D.
     * @since 1
     *
     * @param message 接收事件的信息
     */
    protected open fun onEventReceive(message: String) {}

    /**
     * 事件接收回调函数
     * <p>当接收到事件时，该回调函数将被调用，**无论该事件是否已经被 onEventReceive(message: String) 处理**
     * <p>该函数滞后于 onEventReceive(message: String) 被调用
     * <p>如果 ViewModel 所发送的所有事件均不包含附加信息，则仅需要重写 onEventReceive(message: String)
     *
     * @author M.D.
     * @since 1
     *
     * @param message 接收事件的信息
     * @param extra 接收事件的附加信息
     */
    protected open fun onEventReceive(message: String, extra: Any?) {}
}