package com.example.ktdemoreview.day05

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day05
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/22 19:13
 * <p>
 * 描述:
 */

fun main() {

}


val list: ArrayList<String>? = arrayListOf()

//apply函数
//任何类型都有apply函数
//参数是有接收者得函数，有接收者得函数，相当于函数定义在接收者内部，可以调用接收者得属性和方法
//返回值是调用者自己
//相当于是把操作放在一起，一块解决
fun apply() {
    list?.add("a")
    list?.add("b")

    list?.apply {
        add("a")
        add("b")
    }?.add("c")
}

//任何类型都有let函数
//参数是普通函数
//let函数得返回值是函数参数得返回值

fun let() {
    list?.let {
        it.add("a")
        it.add("b")
        it
    }?.add("c")
}

//with函数是一个顶层函数
//有两个参数，第一个参数相当于是调用者，第二个参数是有接收者的函数，接收者就是第一个参数，所以可以调用第一个参数的属性和方法
//函数的返回值就是函数参数的返回值
fun withfun() {
    with(list) {
        this?.add("a")
        "a"
    }.length
}


//是任意类型的扩展函数
//参数是有接收者的函数，接收者是调用者自己，
//函数的返回值就是函数参数的返回值
fun run() {
    list?.run {
        add("a")
        add("c")
        true
    }
}












