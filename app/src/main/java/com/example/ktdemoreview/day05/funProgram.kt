package com.example.ktdemoreview.day05

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day05
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/22 00:16
 * <p>
 * 描述: 函数式编程，lambda表达式
 */

fun main() {
    //::函数名是获取函数对象
    println(cacel(10, 20, ::add))
    val a = cacel(10, 20, ::divide)
    println(a)
    //lambda表达式  其实就是匿名函数
    println(cacel(10, 20, { a, b ->
        a + b
    }))
    //函数参数是最后一个参数可以把括号前移,其实就是语法糖，这样看起来更简洁
    val e = cacel(10, 20) { m, n ->
        m - n
    }
    println(e);
    //lambda表达式单独存在
    val cc = { a: Int, b: Int ->
        a + b
    }(10, 20)
    println(cc)
    val dd = { a: Int, b: String ->
        a.toString() + b
    }.invoke(1, "a")
    println(dd)

}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun divide(a: Int, b: Int): Int {
    return a - b
}


fun cacel(a: Int, b: Int, block: (Int, Int) -> Int): Int {
    block.invoke(a, b)
    return block(a, b)
}















