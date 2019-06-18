package com.example.ktdemoreview.day01

/**
 * Author: sean
 * Date: 2019/6/18 10:54
 */

fun main() {
//    indifine()
//    compare()
    spilt()
}

fun indifine() {
    var a = "4565"
    val b = """我
        |     是
        |中
        |国
        |人
    """.trimMargin()
    val c = """
        a
        b
        c
    """.trimIndent()
    println(a)
    println(b)
    println(c)
}

fun compare() {
    val a = "a"
    val b = String(charArrayOf('a'))
    //比较值的大小
    println(a.equals(b))
    println(a == b)
    //比较内存地址
    println(a === b)
}

//字符串截取
fun spilt() {
    val a = "users/path/page"
    val b = "users,777-999"
    //切割
    val c = b.split(",", "-")
    println(c)
    println(a.substring(5))
    println(a.substring(0..5))
    println(a.substringBefore("p"))
    println(a.substringBeforeLast("p"))
}

//字符串占位符
fun dairy(place: String) {
    val d = "今天真好玩，我去了${place}玩"
    println(d)
}