package com.example.ktdemoreview.day03

/**
 * Author: sean
 * Date: 2019/6/20 14:55
 * 泛型
 */

fun main() {
    val b = Box<String>("sadf")
    val f = FroutBox(Aple())
    f.add(Banner())
    paseType("")
    paseType(Banner())
}

open class Box<T>(t: T)
class FroutBox(t: Frout) : Box<Frout>(t) {
    fun add(t: Frout) {

    }
}

//泛型上限
class Flout<T : Frout>(t: T) : Box<T>(t)


class SonBox<T>(t: T) : Box<T>(t)


open class Frout()
class Aple : Frout()
class Banner : Frout()


fun <T> paseType(t: T) {
    when (t) {
        is Int -> println("整形")
        is Double -> println("双精度")
        else -> println("不知道了")
    }
}












