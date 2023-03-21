package org.example

class Example02 {

    fun main(){

        //기본 조건문
        var age = 20
        if (age >=20){
            println("성인입니다")
        } else {
            println("미성년자입니다")
        }

        //변수에 값을 조건으로 할당하기
        var result = if(age >= 20){
            "성인"
        } else {
            "미성년자"
        }
        println(result)

        //엘비스 연산자를 이용한 null처리
        var str: String? = null
        var result2 = str ?: "default"//str이 null이 아니면 그값일 반환하고, null이면 오른쪽의 피 연산자의 값을 반환
        //코틀린에는 삼항연산자가 존재하지 않음
    }
}