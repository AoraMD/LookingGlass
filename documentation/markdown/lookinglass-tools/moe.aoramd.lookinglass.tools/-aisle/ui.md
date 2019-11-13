[lookinglass-tools](../../index.md) / [moe.aoramd.lookinglass.tools](../index.md) / [Aisle](index.md) / [ui](./ui.md)

# ui

`@JvmStatic fun ui(runnable: `[`Runnable`](https://docs.oracle.com/javase/6/docs/api/java/lang/Runnable.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

将 Runnable 推送到主线程运行.

应用示例

```
Aisle.ui(
    Runnable {
        textView.text = sampleString
    }
)
```

### Parameters

`runnable` - 需要在界面更新线程运行的 Runnable 实现

**Author**
M.D.

**Since**
1

