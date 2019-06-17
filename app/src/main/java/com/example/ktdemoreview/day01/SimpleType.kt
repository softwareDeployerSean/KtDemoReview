package com.example.ktdemoreview.day01

import java.math.BigDecimal

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day01
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/17 21:22
 * <p>
 * 描述:
 */
fun main() {
//    baseType()
//    maxMin()
    ktUseJava()
}

/**
 * 8种数据类型
 */
fun baseType() {
    var byte: Byte = 0
    var boolean: Boolean = false
    var char: Char = 'a'
    var short: Short = 1
    var int: Int = 1
    var float: Float = 1.2f
    var double: Double = 5.22
    var long: Long = 4
    //没有封装类型
    var b = int + 1
    println(b.hashCode())
}


fun maxMin() {
    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)
}

fun ktUseJava() {
    var m: Double = 5.3561531656864556
    println(m)
    var m1 = "5.3561531656864556"
    var money: BigDecimal = BigDecimal(m1)
    println(money)
}