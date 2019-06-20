package com.example.ktdemoreview.day02

import com.example.ktdemoreview.day01.f

/**
 * Author: sean
 * Date: 2019/6/19 14:09
 *
 */

fun main() {
    /*  val girl = Girl()
      val girl2 = Girl()
      girl2.age = 17
      girl.greeting()
      println(girl + 19)*/
//    val nesw = Nesw()
//    nesw.title = "haha"

//    val p = Person1("aa", 14, "甜美")
//    println(p.name)
//    p.voice = "aa"

//    val s=Student("zhangsan ",19,22)

    //智能类型推断
    val sleepDog: Dog = SheepDog()
    if (sleepDog is SheepDog) {
        sleepDog.fangYang()
    }
    val homedog: Dog = HomeDog()
    //类型强转  用as
    homedog as HomeDog
    homedog.kanjia()


}

class Girl() {
    var name = "张三"
    var age = 20

    fun greeting() {
        println("hello")
    }

    //运算符重载,主要就是重写运算符方法，先找到运算符方法，然后再去重写
    operator fun plus(age: Int): Int {
        return this.age + age
    }

}

class Nesw() {
    //默认实现了get和set方法,用private修饰方法，控制访问权限
    var title = "你是睡"
        private set
    var comtent = "你说呢"
        set(value) {
            if (value.contains("十八大")) {
                print("敏感 词")
            } else {
                field = value
            }
        }
        get() {
            field = field + "hahah"
            return field
        }

}

//构造函数，主构函数
class Person(name: String, age: Int) {
    var name = ""
    var age = 0

    //init代码块会执行在构造函数里面，我们可以在init方法里面做一些初始化操作
    init {
        this.name = name
        this.age = age
    }
}

//加了var关键字，就相当于创建了两个字段去接收构造函数里面的参数，就可以直接使用
//val也是同理，只是val是常量，不能修改
class Person1(var name: String, var age: Int, val voice: String)


class Student(name: String, age: Int) {

    var id: Int = 0

    init {
        println("init")
    }

    //次构函数，用constructor修饰，调用了主构造方法
    constructor(name: String, age: Int, id: Int) : this(name, age) {
        this.id = id
        println("次构造函数")
    }

}


abstract class Dog


class SheepDog : Dog() {
    fun fangYang() {
        println("牧羊犬放羊")
    }

}


class HomeDog : Dog() {
    fun kanjia() {
        println("土狗看家")
    }
}


class outClass {
    val name = "aa"

    //嵌套类 相当于java的静态内部类
    class innerClass() {
        val name = "bb"
        fun pp() {
            println(name)
            println()
        }
    }

    //使用inner关键字，创建内部类
    inner class innClass() {
        val name = "cc"
        fun pp() {
            println(this@outClass.name)
        }
    }

}









