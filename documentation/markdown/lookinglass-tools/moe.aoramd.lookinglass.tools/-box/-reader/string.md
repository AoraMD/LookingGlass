[lookinglass-tools](../../../index.md) / [moe.aoramd.lookinglass.tools](../../index.md) / [Box](../index.md) / [Reader](index.md) / [string](./string.md)

# string

`@JvmOverloads fun string(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, result: Result<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?>): Reader`
`@JvmOverloads fun string(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, result: (value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Reader`

读取 String 类型数据

### Parameters

`key` - 数据键

`default` - 当数据不存在时的默认值，默认为 null

`result` - 数据获取回调

**Author**
M.D.

**Since**
1

**Return**
工具自身，应用于链式调用

