package com.example.ktdemoreview.day02

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day02
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/18 22:16
 * <p>
 * 描述:
 */
fun main() {
//    indifine()
    search()
}

fun indifine() {
    val a = arrayOf("张三", "李四")
    var b = arrayOf("a", 1)
    val c = IntArray(4) {
        5
    }
    val d = LongArray(4)
    val e = DoubleArray(1)
    for (s in a) {
        println(s)
    }
    b.forEach { println(it) }
}


fun search() {
    val a = arrayOf("张三", "里斯", "王五", "张三")
    println(a.indexOf("张三"))
    //高阶函数
    println(a.indexOfFirst { it.startsWith("张") })
    println(a.indexOfLast { it.equals("张三") })


}