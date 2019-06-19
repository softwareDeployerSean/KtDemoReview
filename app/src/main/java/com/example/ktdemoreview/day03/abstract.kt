package com.example.ktdemoreview.day03

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day03
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/19 23:12
 * <p>
 * 描述:
 */

fun main() {

}

abstract class Human() {
    abstract var color: String
    abstract var language: String
    abstract fun eat()
}

//接口反应得是对象得能力，对象可以有多个能力
interface speak {
    fun talk()
}

//接口可以默认实现方法
interface drive {
    var number: String
    fun driveing() {

    }

}


//继承反应得是事物得本质，本质只有一个
class Chinese() : Human(), speak, drive {
    override var color: String = "黄色"
    override var language: String = "中文"
    override fun eat() {
        println("筷子吃饭")
    }

    override fun talk() {
        println("中文交流")
    }

    override var number: String = "asdfa"
}

class UsMan() : Human(), speak {
    override var color: String = "白色"
    override var language: String = "英语"

    override fun eat() {
        println("刀叉")
    }

    override fun talk() {
        println("英文交流")
    }
}
