package com.example.ktdemoreview.day04

import kotlin.reflect.KProperty

/**
 * Author: sean
 * Date: 2019/6/20 16:36
 * 代理模式
 */
fun main() {
//    val f = smallFather()
//    f.washing()
//    val ff = SmallFather1(BigSon())
//    ff.washing()
    val m = Monther()
    val s = son()
    s.money = 100
    println(s.money)
    println(m.myMoney)


}

class smallFather : WashPower by BigSon() {

}

class SmallFather1(var washPower: WashPower) : WashPower by washPower {
    override fun washing() {
        println("给你一块钱")
        washPower.washing()
        println("下次继续")
    }
}


class BigSon : WashPower {
    override fun washing() {
        println("大头儿子洗碗了")
    }
}

interface WashPower {
    fun washing()
}


class son {
    var money: Int by Monther()
}

class Monther {
    operator fun getValue(son: son, property: KProperty<*>): Int {
        return sonMoney
    }

    operator fun setValue(son: son, property: KProperty<*>, i: Int) {
        sonMoney += 50
        myMoney += i - 50
    }

    var sonMoney: Int = 0
    var myMoney = 0


}

















