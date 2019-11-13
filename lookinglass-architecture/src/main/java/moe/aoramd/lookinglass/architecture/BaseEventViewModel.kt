@file:Suppress("unused")

package moe.aoramd.lookinglass.architecture

import androidx.annotation.MainThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * 可发送事件的 ViewModel
 *
 * @author M.D.
 * @version 1
 */
abstract class BaseEventViewModel : ViewModel() {

    private val eventBackend: MutableLiveData<Event> = MutableLiveData()
    internal val event: LiveData<Event> = eventBackend

    /**
     * 向监听事件收发的 Activity 或 Fragment 发送信息
     * <p>发送的事件附加信息为 null
     * <p>**该函数只能在主线程调用**
     *
     * @author M.D.
     * @since 1
     *
     * @param message 发送事件的信息
     */
    @MainThread
    protected fun sendEvent(message: String) {
        eventBackend.value = Event(message)
    }

    /**
     * 向监听事件收发的 Activity 或 Fragment 发送信息
     * <p>**该函数只能在主线程调用**
     *
     * @author M.D.
     * @since 1
     *
     * @param EXTRA 附加信息类型
     * @param message 发送事件的信息
     * @param extra 发送事件的附加信息
     */
    @MainThread
    protected fun <EXTRA : Any> sendEvent(message: String, extra: EXTRA) {
        eventBackend.value = Event(message, extra)
    }

    /**
     * 向监听事件收发的 Activity 或 Fragment 发送信息
     * <p>发送的事件附加信息为 null
     * <p>该函数用于在非主线程发送信息
     *
     * @author M.D.
     * @since 1
     *
     * @param message 发送事件的信息
     */
    protected fun postEvent(message: String) {
        eventBackend.postValue(Event(message))
    }

    /**
     * 向监听事件收发的 Activity 或 Fragment 发送信息
     * <p>该函数用于在非主线程发送信息
     *
     * @author M.D.
     * @since 1
     *
     * @param EXTRA 附加信息类型
     * @param message 发送事件的信息
     * @param extra 发送事件的附加信息
     */
    protected fun <EXTRA : Any> postEvent(message: String, extra: EXTRA) {
        eventBackend.postValue(Event(message, extra))
    }
}