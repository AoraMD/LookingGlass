[lookinglass-tools](../../index.md) / [moe.aoramd.lookinglass.tools](../index.md) / [Aisle](index.md) / [io](./io.md)

# io

`@JvmStatic fun io(runnable: `[`Runnable`](https://docs.oracle.com/javase/6/docs/api/java/lang/Runnable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

将 Runnable 推送到后台线程运行.

后台线程实现见 [Executors.newCachedThreadPool](https://docs.oracle.com/javase/6/docs/api/java/util/concurrent/Executors.html#newCachedThreadPool())

应用示例

```
Aisle.io(
    Runnable {
        networkRequest()
    }
)
```

### Parameters

`runnable` - 需要在后台线程运行的 Runnable 实现

**Author**
M.D.

**Since**
1

