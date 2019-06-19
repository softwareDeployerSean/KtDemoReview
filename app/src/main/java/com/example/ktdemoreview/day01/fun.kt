package com.example.ktdemoreview.day01

/**
 * Author: sean
 * Date: 2019/6/18 15:30
 */

//函数是一等公民
fun main() {

    //函数引用 用::加上函数名
    /*  val f11 = ::f1
      println(f11("涨三倍"))
      println(f11.invoke("里斯"))
      //匿名函数
      val f22: (Int, Int) -> Int = { a, b ->
          a + b
      }*/
    sendRequest("www.baidu.com")
    //具名参数
    sendRequest(method = "Post", path = "www.baidu.com")
    add(1, 2)
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

//函数表达式，函数体只有一行代码都可以用函数表达式
fun f6(a: Int, b: Int) = a + b


//默认参数
fun sendRequest(path: String, method: String = "GET") {
    print("${path} 请求方法${method}")
}

//可变参数vararg
fun add(vararg a: Int): Int {
    var result: Int = 0
    a.forEach {
        result += it
    }
    return result
}


