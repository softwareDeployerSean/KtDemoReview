package com.example.ktdemoreview.day05

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day05
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/22 22:15
 * <p>
 * 描述:
 */
fun main() {
    post() {
        println(it)
    }
    post(null)

}


fun post(black: ((a: String) -> Unit)?) {
    Thread {
        Thread.sleep(2000)
        val a = "back"
        black?.invoke(a)
    }.start()
}