[lookinglass-architecture](../../index.md) / [moe.aoramd.lookinglass.architecture](../index.md) / [BaseEventViewModel](./index.md)

# BaseEventViewModel

`abstract class BaseEventViewModel : ViewModel`

可发送事件的 ViewModel

**Author**
M.D.

**Version**
1

### Constructors

| [&lt;init&gt;](-init-.md) | 可发送事件的 ViewModel`BaseEventViewModel()` |

### Functions

| [postEvent](post-event.md) | 向监听事件收发的 Activity 或 Fragment 发送信息`fun postEvent(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun <EXTRA : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> postEvent(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, extra: EXTRA): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [sendEvent](send-event.md) | 向监听事件收发的 Activity 或 Fragment 发送信息`fun sendEvent(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun <EXTRA : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> sendEvent(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, extra: EXTRA): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

