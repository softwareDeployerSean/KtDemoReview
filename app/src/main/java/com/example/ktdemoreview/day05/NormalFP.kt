package com.example.ktdemoreview.day05

/**
 * 版    权 ：xt的code
 * 项目名称 : ktdemo
 * 包    名 : com.example.ktdemoreview.day05
 * 作    者 : xiao_tao
 * 创建时间 : 2019/06/22 10:10
 * <p>
 * 描述: 常用得一些高阶函数
 */

fun main() {
    /*   val dd = filter1();
       dd.forEach { println(it) }
       println(filter2())
       println(find2())*/
//    sout()
//    val aa = group()
//    aa.forEach { s, list ->
//        println("$s  $list")
//    }

//    distinct()
//    mapv()
//    val c = chai()
//    println(c.first)
//    println(c.second)
    sum()
}

data class Girl(var place: String, var age: Int)

val aa = arrayListOf(Girl("四川", 165), Girl("山东", 175), Girl("四川", 155), Girl("广东", 170), Girl("安徽", 166), Girl("山西", 158), Girl("江西", 157), Girl("湖南", 164), Girl("江苏", 166), Girl("上海", 171)
)

//查询
fun filter1(): List<Girl> {
    val c = aa.filter { it.place == "四川" }
    return c
}

fun filter2(): List<Girl> {
    return aa.filter { it.age == 144 }
}

//过滤

fun find(): Girl? {
    val v = aa.find { it.age == 175 }
    return v
}

fun find1() {
    val list = mutableListOf<Girl>()
    aa.filterTo(list) {
        it.place == "广东"
    }
    aa.filterTo(list) {
        it.place == "山东"
    }
}

fun find2(): List<Girl> {
    return aa.filterIndexed { index, girl ->
        index % 2 == 0 && girl.place == "四川"
    }
}


//排序
fun sout() {
    aa.sortBy { it.age }
    println(aa)
    aa.sortByDescending { it.age }
    println(aa)
}

//分组
fun group(): Map<String, List<Girl>> {
    val cc = aa.groupBy {
        it.place
    }
    return cc
}

//最值
fun max() {
    println(aa.maxBy { it.age })
    println(aa.minBy { it.place })
}

//去重复
fun distinct() {
    println(aa.distinctBy {
        it.place
    })
}

//集合重新组合
fun mapv() {
    println(aa.map { it.place })
}

fun chai(): Pair<List<Girl>, List<Girl>> {
    return aa.partition { it.place == "四川" }
}

fun sum() {
    println(aa.sumBy { it.age })
}















