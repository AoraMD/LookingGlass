[lookinglass-tools](../../../index.md) / [moe.aoramd.lookinglass.tools](../../index.md) / [Box](../index.md) / [Reader](index.md) / [map](./map.md)

# map

`fun map(pairs: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, instance: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): Reader`

通过反射将 Shared Preferences 中的数据设置到实例中

### Parameters

`pairs` - 数据键与实例中成员变量变量名的对应关系

`instance` - 需要设置数据的实例

### Exceptions

`NoSuchFieldException` - 设置过程中寻找不到对应成员变量时抛出

**Return**
工具自身，应用于链式调用

