package com.example.ktdemoreview.day01

/**
 * Author: sean
 * Date: 2019/6/18 15:59
 */
fun main() {

}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//对kt来说 表达式都是有返回值的
fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b: Int): Int {
    val c = if (a > b) b else a
    return c
}

