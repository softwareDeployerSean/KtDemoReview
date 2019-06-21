package com.example.ktdemoreview.day05

import android.util.ArraySet
import java.util.*
import kotlin.collections.HashMap

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day05
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/21 23:21
 * <p>
 * 描述:
 */

fun main() {
    map()
}

//arraylist
fun arraylist() {
    //不可变
    val a = listOf<String>("a", "b", "c")
//    a[0] = "a"
    //可变
    val b = mutableListOf<String>("a", "b", "c")
    b.add("d")
    b[0] = "e"
    //没值
    val c = ArrayList<String>()
    //有值
    val d = arrayListOf("e")
    c.forEach { }
    for (s in d) {

    }
}

//存不重复得值
fun set() {
    val a = setOf("a", "b")
    val b = mutableSetOf<String>("a", "b")
    val c = TreeSet<String>()
}


fun map() {
    val a = mapOf<String, Int>("a" to 1)
    val b = mutableMapOf<String, Int>()
    val c = HashMap<String, String>()
    val d = hashMapOf<String, Int>()
    for (entry in a) {
        println(entry)
    }
    a.forEach { s, i ->
        println("$s $i")
    }

}













