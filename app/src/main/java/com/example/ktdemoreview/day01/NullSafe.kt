package com.example.ktdemoreview.day01

/**
 * Author: sean
 * Date: 2019/6/18 15:02
 */

fun main() {
    //可空类型
    val a: String? = null
    //不检查空
//    val b=a!!.toInt()
    //空安全检查
    val c = a?.toInt()
    println(c)
    //elves运算符   ？：
    val d = a?.toInt() ?: -1
    println(d)

}