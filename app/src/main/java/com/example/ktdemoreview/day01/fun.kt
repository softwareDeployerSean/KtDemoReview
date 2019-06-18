package com.example.ktdemoreview.day01

/**
 * Author: sean
 * Date: 2019/6/18 15:30
 */

//函数是一等公民
fun main() {

}


fun f() {
    println("hello")
}

fun f1(name: String): String {
    return "hello" + name
}

fun f2(name: String) {

}

fun f4(): String {
    return "hello"
}

//函数里面可以嵌套函数
fun f5() {
    fun f6() {

    }
}