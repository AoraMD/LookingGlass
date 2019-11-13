[lookinglass-tools](../../../index.md) / [moe.aoramd.lookinglass.tools](../../index.md) / [Box](../index.md) / [Reader](index.md) / [all](./all.md)

# all

`fun all(result: Result<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>>): Reader`
`fun all(result: (value: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Reader`

读取 Shared Preferences 中的所有数据

### Parameters

`result` - 数据获取回调

**Author**
M.D.

**Since**
1

**Return**
工具自身，应用于链式调用

