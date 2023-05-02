package org.example

/**
 * 함수형 프로그래밍
 **/

fun sum(a: Int, b: Int): Int{
    var sum = a + b
    return sum
}

fun sumPrintln(a: Int, b: Int): Unit{//반환값이 없는 경우
    println(a + b)
}

/**
 * 디폴트 파라미터
 **/
fun add(id: String, email: String = "default") {
    println("ID : $id, email : $email 이 등록되었습니다")
}

/**
 * 가변 파라미터
 **/
fun normalVarargs(vararg counts : Int) {
    for (num in counts){
        println("normalVarargs = $num")
    }
}

fun main(){
    val result1 = sum(3, 2)
    sumPrintln(3, 2)
    val result2 = sum(6,7)
    sumPrintln(6,7)
    normalVarargs(1,2,3,4,5,6,7)
    println(result1)
    println(result2)

    /**
     * 람다식
     **/
    val multi = {x:Int, y:Int -> x + y}
    println(multi(1,2))

}