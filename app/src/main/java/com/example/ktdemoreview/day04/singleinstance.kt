package com.example.ktdemoreview.day04

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day04
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/20 21:48
 * <p>
 * 描述: d单利
 *
 * object 修饰类  就是java得单例模式
 * 但是用object修饰，字段会全部变成静态，所以只有字段不多得情况下用object修饰实现单利模式
 */

fun main() {
    println(Utils.name)
    println(Utils.number)
    Utils.say()
    Teacher.age
    Teacher.say()
    Teacher.name
    Retrofit.instance.name
    Retrofit.instance.say()
}


object Utils {
    var number = 5
    val name = "TAG"

    fun say() {

    }

}


class Teacher {
    //这里面定义得所有属性和方法都属于静态  companion object
    companion object {
        var age = 0
        val name = ""
        fun say() {

        }
    }
}


//第一步 构造函数私有
class Retrofit private constructor() {
    var name = ""

    companion object {
        //第二步 用变量保存
        //第三步 只实例一次  lazy 就是只实例一次，并且县城安全，并且是用的时候才初始化
        val instance: Retrofit by lazy { Retrofit() }
    }

    fun say() {

    }

}








