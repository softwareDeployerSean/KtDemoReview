package com.example.ktdemoreview.day04a

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day04
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/20 21:01
 * <p>
 * 描述: 惰性加载  by lazy修饰val  lateinit修饰var
 */

fun main() {

}


val name: String by lazy {
    "我是谁"
}
lateinit var phone: String

class Person {
    val foot: Int by lazy {
        "两只脚"
        2
    }
    lateinit var height: String
}