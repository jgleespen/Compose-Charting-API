package com.example.composecharting.data.bundle

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class GraphDataList(
    var coordinates: MutableList<DataSet>
) {
    val totalYMax = mutableStateOf(maxOf(coordinates[0].yMax, coordinates[1].yMax))
    val totalXMax = mutableStateOf(maxOf(coordinates[0].xMax, coordinates[1].xMax))
    val totalYMin = mutableStateOf(minOf(coordinates[0].yMin, coordinates[1].yMin))
    val totalXMin = mutableStateOf(minOf(coordinates[0].xMin, coordinates[1].xMin))
}