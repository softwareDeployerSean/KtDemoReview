package com.example.ktdemoreview.day04

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day04
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/20 21:18
 * <p>
 * 描述:
 */

fun main() {
    val a: String? = null
    println(a.isEmpty())
}

//扩展函数
fun String?.isEmpty(): Boolean {
    return this == null || this.length == 0
}