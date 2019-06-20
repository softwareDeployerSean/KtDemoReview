package com.example.ktdemoreview.day04

/**
 * Author: sean
 * Date: 2019/6/20 15:54
 * 中缀表达式
 */

fun main() {

    val p = Person()
    p sayHelloTo "张三"

}

class Person {

    infix fun sayHelloTo(name: String) {
        println("你好  $name")
    }
}