package com.example.ktdemoreview.day01

/**
 * Author: sean
 * Date: 2019/6/18 14:06
 */
fun main() {
    tuple()
}

//元组
fun tuple() {
    val t: Pair<String, Int> = Pair("漳卅", 15)
    val p = "张三" to 15
    println(t.first)
    println(t.second)
    println(p.first)
    val u: Triple<String, String, Int> = Triple("里斯", "成都", 170)
    println(u.first)
    println(u.second)
    println(u.third)

}