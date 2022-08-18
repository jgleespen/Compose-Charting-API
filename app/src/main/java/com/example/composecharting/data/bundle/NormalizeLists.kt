package com.example.composecharting.data.bundle

class NormalizeLists {
    fun normalize(
        max: Float,
        min: Float,
        list: MutableList<Float>
    ): MutableList<Float> {
        var l: MutableList<Float> = mutableListOf<Float>()
        list.forEachIndexed { i, it ->
            l.add((it - min) / (max - min))
        }
        return l
    }
}