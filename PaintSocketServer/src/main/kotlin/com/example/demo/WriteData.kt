package com.example.demo

import java.io.Serializable


data class WriteData(val pointArray : List<PointData>,val style : StyleData)

data class StyleData(val color : String = "#000", val width : Int = 0);