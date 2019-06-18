package com.example.ktdemoreview.day02

/**
 * Author: sean
 * Date: 2019/6/18 17:30
 */

fun main() {
    for1()
}

fun for1() {
    val a = "abcd"
    for (c in a) {
        println(c)
    }
    for ((index, value) in a.withIndex()) {
        print("$index $value")
    }
    a.forEach {
        println(it)
    }

    a.forEachIndexed { index, c ->
        print("$index  $c")
    }
}

//标签处break
fun for2() {
    val a = "12"
    val b = "ab"
    a@ for (c in a) {
        b@ for (c in b) {
            if (b == a) {
                break@a
            }
        }
    }
}





