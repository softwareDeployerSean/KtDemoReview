package com.example.ktdemoreview.day04

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day04
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/20 22:41
 * <p>
 * 描述:数据类
 */

data class News(var title: String, var comtent: String)

fun main() {
    val n = News("中国", "富强")
    println(n.comtent)
    println(n.title)
    val (title, cmnet) = News("中国", "壮大")
    println(title)
}