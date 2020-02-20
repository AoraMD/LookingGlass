[lookinglass-tools](../../../index.md) / [moe.aoramd.lookinglass.tools](../../index.md) / [Box](../index.md) / [Reader](index.md) / [boolean](./boolean.md)

# boolean

`@JvmOverloads fun boolean(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, result: Result<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>): Reader`
`@JvmOverloads fun boolean(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, result: (value: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Reader`

读取 Boolean 类型数据

### Parameters

`key` - 数据键

`default` - 当数据不存在时的默认值，默认为 false

`result` - 数据获取回调

**Author**
M.D.

**Since**
1

**Return**
工具自身，应用于链式调用

`suspend fun boolean(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

通过协程读取 Boolean 类型数据

### Parameters

`key` - 数据键

`default` - 当数据不存在时的默认值，默认为 false

**Author**
M.D.

**Since**
2

**Return**
获取的数据

