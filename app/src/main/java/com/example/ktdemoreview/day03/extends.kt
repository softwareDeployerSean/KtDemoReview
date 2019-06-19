package com.example.ktdemoreview.day03

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day03
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/19 22:52
 * <p>
 * 描述:  继承
 */

fun main() {

}

open class Father(open var name: String, open var age: Int) {

    open fun read() {
        println("父亲喜欢读三国志")
    }

}

class Son(override var name: String, override var age: Int) : Father(name, age) {

    override fun read() {
        println("儿子喜欢读皇叔")
    }
}