package moe.aoramd.lookinglass.architecture

internal data class Event(
    val message: String,
    val extra: Any? = null
)