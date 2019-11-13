[lookinglass-architecture](../../index.md) / [moe.aoramd.lookinglass.architecture](../index.md) / [BaseEventFragment](./index.md)

# BaseEventFragment

`abstract class BaseEventFragment : Fragment`

可接收 ViewModel 发送事件的 Fragment

**Author**
M.D.

**Version**
1

### Constructors

| [&lt;init&gt;](-init-.md) | 可接收 ViewModel 发送事件的 Fragment`BaseEventFragment()` |

### Properties

| [viewModel](view-model.md) | 可发送事件的 ViewModel`abstract val viewModel: `[`BaseEventViewModel`](../-base-event-view-model/index.md) |

### Functions

| [onCreate](on-create.md) | `open fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onEventReceive](on-event-receive.md) | 事件接收回调函数`open fun onEventReceive(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun onEventReceive(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, extra: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

