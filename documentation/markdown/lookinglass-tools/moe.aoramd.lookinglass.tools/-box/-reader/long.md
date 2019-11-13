[lookinglass-tools](../../../index.md) / [moe.aoramd.lookinglass.tools](../../index.md) / [Box](../index.md) / [Reader](index.md) / [long](./long.md)

# long

`@JvmOverloads fun long(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 0L, result: Result<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): Reader`
`@JvmOverloads fun long(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 0L, result: (value: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Reader`

读取 Long 类型数据

### Parameters

`key` - 数据键

`default` - 当数据不存在时的默认值，默认为 0

`result` - 数据获取回调

**Author**
M.D.

**Since**
1

**Return**
工具自身，应用于链式调用

