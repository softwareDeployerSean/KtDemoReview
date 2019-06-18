package com.example.ktdemoreview.day02

/**
 * Author: sean
 * Date: 2019/6/18 18:09
 * 区间
 *
 */
fun main() {
    range()
}

fun range() {
    val a = 1..10
    a.reversed()
    for (i in a) {
        println(i)
    }
    for (i in a.withIndex()) {
        println(i)
    }
    val b = 10 downTo 1
    b.forEach { println(it) }
    for (i in b step 2) {
        println(i)
    }

}
