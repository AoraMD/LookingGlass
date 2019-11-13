[lookinglass-tools](../../../index.md) / [moe.aoramd.lookinglass.tools](../../index.md) / [Box](../index.md) / [Reader](index.md) / [float](./float.md)

# float

`@JvmOverloads fun float(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0F, result: Result<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>): Reader`
`@JvmOverloads fun float(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0F, result: (value: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Reader`

读取 Float 类型数据

### Parameters

`key` - 数据键

`default` - 当数据不存在时的默认值，默认为 0.0

`result` - 数据获取回调

**Author**
M.D.

**Since**
1

**Return**
工具自身，应用于链式调用

