@file:Suppress("unused")

package moe.aoramd.lookinglass.tools

import android.content.Context
import android.content.SharedPreferences

/**
 * Shared Preferences 读写工具
 *
 * @author M.D.
 * @version 1
 */
object Box {

    private val core
        get() = ToolsCoreLoader.core

    /**
     * 读取 Shared Preferences 数据
     *
     * @author M.D.
     * @since 1
     *
     * @param sharedPreferencesFileName Shared Preferences 文件名
     * @return 数据读取工具
     */
    @JvmStatic
    fun read(sharedPreferencesFileName: String): Reader =
        Reader(
            core.context.getSharedPreferences(
                sharedPreferencesFileName,
                Context.MODE_PRIVATE
            )
        )

    /**
     * 写入 Shared Preferences 数据
     *
     * @author M.D.
     * @since 1
     *
     * @param sharedPreferencesFileName Shared Preferences 文件名
     * @return 数据写入工具
     */
    @JvmStatic
    fun write(sharedPreferencesFileName: String): Writer =
        Writer(
            core.context.getSharedPreferences(
                sharedPreferencesFileName,
                Context.MODE_PRIVATE
            ).edit()
        )

    /**
     * 实现链式调用的数据读取工具
     *
     * @author M.D.
     * @version 1
     *
     * @property sharedPreferences 初始化 Shared Preferences 读取对象
     */
    class Reader internal constructor(private val sharedPreferences: SharedPreferences) {

        /**
         * 读取 Int 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 0
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun int(key: String, default: Int = 0, result: Result<Int>): Reader {
            result.onResult(sharedPreferences.getInt(key, default))
            return this
        }

        /**
         * 读取 Int 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 0
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun int(key: String, default: Int = 0, result: (value: Int) -> Unit): Reader {
            result.invoke(sharedPreferences.getInt(key, default))
            return this
        }

        /**
         * 读取 Float 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 0.0
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun float(key: String, default: Float = 0F, result: Result<Float>): Reader {
            result.onResult(sharedPreferences.getFloat(key, default))
            return this
        }

        /**
         * 读取 Float 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 0.0
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun float(key: String, default: Float = 0F, result: (value: Float) -> Unit): Reader {
            result.invoke(sharedPreferences.getFloat(key, default))
            return this
        }

        /**
         * 读取 Boolean 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 false
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun boolean(key: String, default: Boolean = false, result: Result<Boolean>): Reader {
            result.onResult(sharedPreferences.getBoolean(key, default))
            return this
        }

        /**
         * 读取 Boolean 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 false
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun boolean(
            key: String,
            default: Boolean = false,
            result: (value: Boolean) -> Unit
        ): Reader {
            result.invoke(sharedPreferences.getBoolean(key, default))
            return this
        }

        /**
         * 读取 Long 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 0
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun long(key: String, default: Long = 0L, result: Result<Long>): Reader {
            result.onResult(sharedPreferences.getLong(key, default))
            return this
        }

        /**
         * 读取 Long 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 0
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun long(key: String, default: Long = 0L, result: (value: Long) -> Unit): Reader {
            result.invoke(sharedPreferences.getLong(key, default))
            return this
        }

        /**
         * 读取 String 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 null
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun string(key: String, default: String? = null, result: Result<String?>): Reader {
            result.onResult(sharedPreferences.getString(key, default))
            return this
        }

        /**
         * 读取 String 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为 null
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun string(key: String, default: String? = null, result: (value: String?) -> Unit): Reader {
            result.invoke(sharedPreferences.getString(key, default))
            return this
        }

        /**
         * 读取 String Set 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为空 Set
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun stringSet(
            key: String,
            default: Set<String> = setOf(),
            result: Result<Set<String>>
        ): Reader {
            result.onResult(sharedPreferences.getStringSet(key, default) ?: setOf())
            return this
        }

        /**
         * 读取 String Set 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param default 当数据不存在时的默认值，默认为空 Set
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        @JvmOverloads
        fun stringSet(
            key: String,
            default: Set<String> = setOf(),
            result: (value: Set<String>) -> Unit
        ): Reader {
            result.invoke(sharedPreferences.getStringSet(key, default) ?: setOf())
            return this
        }

        /**
         * 读取 Shared Preferences 中的所有数据
         *
         * @author M.D.
         * @since 1
         *
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        fun all(result: Result<Map<String, Any?>>): Reader {
            result.onResult(sharedPreferences.all)
            return this
        }

        /**
         * 读取 Shared Preferences 中的所有数据
         *
         * @author M.D.
         * @since 1
         *
         * @param result 数据获取回调
         * @return 工具自身，应用于链式调用
         */
        fun all(result: (value: Map<String, Any?>) -> Unit): Reader {
            result.invoke(sharedPreferences.all)
            return this
        }

        /**
         * 通过反射将 Shared Preferences 中的数据设置到实例中
         * <p>
         * 注意，当 Shared Preferences 中查找不到数据键对应的值时，
         * 对应的成员变量会被设为 null，可能会引发未预知的空指针异常
         *
         * @param pairs 数据键与实例中成员变量变量名的对应关系
         * @param instance 需要设置数据的实例
         * @exception NoSuchFieldException 设置过程中寻找不到对应成员变量时抛出
         * @return 工具自身，应用于链式调用
         */
        fun map(pairs: Map<String, String>, instance: Any): Reader {
            val clazz = instance::class.java
            pairs.map {
                clazz.getDeclaredField(it.value).apply {
                    isAccessible = true
                    set(instance, sharedPreferences.all[it.key])
                }
            }
            return this
        }

        /**
         * 结束链式调用
         *
         * @author M.D.
         * @since 1
         */
        fun end() = null

        /**
         * 数据回调接口
         *
         * @author M.D.
         * @version 1
         *
         * @param T 数据类型
         */
        interface Result<T> {

            /**
             * 数据回调函数
             *
             * @author M.D.
             * @version 1
             *
             * @param value 获得的数据
             */
            fun onResult(value: T)
        }
    }


    /**
     * 实现链式调用的数据写入工具
     *
     * @author M.D.
     * @version 1
     *
     * @property editor 初始化 Shared Preferences 写入对象
     */
    class Writer internal constructor(private val editor: SharedPreferences.Editor) {

        /**
         * 写入 Int 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param value 数据值
         * @return 工具自身，应用于链式调用
         */
        fun int(key: String, value: Int): Writer {
            editor.putInt(key, value)
            return this
        }

        /**
         * 写入 Float 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param value 数据值
         * @return 工具自身，应用于链式调用
         */
        fun float(key: String, value: Float): Writer {
            editor.putFloat(key, value)
            return this
        }

        /**
         * 写入 Boolean 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param value 数据值
         * @return 工具自身，应用于链式调用
         */
        fun boolean(key: String, value: Boolean): Writer {
            editor.putBoolean(key, value)
            return this
        }

        /**
         * 写入 Long 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param value 数据值
         * @return 工具自身，应用于链式调用
         */
        fun long(key: String, value: Long): Writer {
            editor.putLong(key, value)
            return this
        }

        /**
         * 写入 String 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param value 数据值
         * @return 工具自身，应用于链式调用
         */
        fun string(key: String, value: String): Writer {
            editor.putString(key, value)
            return this
        }

        /**
         * 写入 String Set 类型数据
         *
         * @author M.D.
         * @since 1
         *
         * @param key 数据键
         * @param value 数据值
         * @return 工具自身，应用于链式调用
         */
        fun stringSet(key: String, value: MutableSet<String>): Writer {
            editor.putStringSet(key, value)
            return this
        }

        /**
         * 结束链式调用
         *
         * @author M.D.
         * @since 1
         */
        fun end() = editor.apply()
    }
}