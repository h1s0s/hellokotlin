package org.example

class Example04 {
    fun main(){
        var a = 1
        var b = 2
        add(a,b)
    }

    fun add(a: Int, b: Int): Int{
        return a +b
    }

    fun setNm(a: Int): Unit{//자바의 void = 코틀린의 Unit
     println(a);
    }
}