package com.example.ktdemoreview.day02

/**
 * Author: sean
 * Date: 2019/6/19 9:43
 */

fun main() {

}

fun when1(age: Int): String {
    when (age) {
        in 1..6 -> {
            return "上幼儿园"
        }
        7 -> {
            return "上小学"
        }
        in 7..12 -> {
            return "正在上小学"
        }
        else -> {
            return "你猜"
        }
    }
}

fun when2(age: Int) {
    when {
        age == 8 -> {

        }
        age is Int -> {

        }
        age in 9..16 -> {

        }

    }
}

//返回值是最后一行
fun when3(age: Int): String {
    return when (age) {
        in 1..6 -> {
            "在读幼儿园"
        }
        7 -> {
            "步入小学"
        }
        else -> {
            "未知"
        }
    }
}


