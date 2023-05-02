package org.example

class Example01 {
    fun main() {//코틀린에서의 public static void main의 기능과 같다, main함수가 자동으로 실행됨.
        //★1. 코틀린의 기본 규칙중 하나 변수는 var, val 2가지 키워드를 이용하여 선언 가능
        //val로 변수를 선언하면 초기화 후 값을 바꿀 수 없는 읽기전용 변수
        //var로 변수를 선언하면 계속해서 변경 가능

        //코틀린의 자료형은 참조형 자료형을 사용
        //기본형이란 가공되지 않은 순수한 자료형을 말하며
        //참조형이란 객체를 생성하고 동적 메모리영역에 데이터를 둔 다음 이것을 참조

        //정수형 변수 선언
        var age1: Int = 27
        var age2 = 30 //★2. 자료형을 빼면 코틀린이 자료형을 추론하여 Int로 생성됨, ctrl + shift + p를 누르면 추론한 자료형 말풍선 나옴
        var age3: Long = 1L
        var age4: Short = 2

        // 정수형 연산
        val a = 10
        val b = 3
        val sum = a + b // 더하기
        val sub = a - b // 빼기
        val mul = a * b // 곱하기
        val div = a / b // 나누기
        val mod = a % b // 나머지
        //★3. 코틀린은 문자열 템플릿을 지원한다 결과=sum: 13, sub: 7, mul: 30, div: 3, mod: 1
        println("sum: $sum, sub: $sub, mul: $mul, div: $div, mod: $mod")
        println("a == b = ${a == b}")

        //실수형 변수 선언
        var height1: Double = 175.5
        var height2 = 176.9//Double형으로 생성됨
        var height3: Float = 10.2F
        // 실수형 연산
        val c = 3.0
        val d = 2.5
        val add = c + d // 더하기
        val subtract = c - d // 빼기
        val multiply = c * d // 곱하기
        val divide = c / d // 나누기
        println("add: $add, subtract: $subtract, multiply: $multiply, divide: $divide")

        //문자열 변수 선언
        var name1: String = "John"
        var name2 = "Steve"
        // 문자열 연산
        val str1 = "Hello, "
        val str2 = "world!"
        val str3 = str1 + str2 // 문자열 합치기
        println(str3)

        //null값을 허용하는 변수 선언
        var name3: String? = null

        // 논리형 연산
        val bool1 = true
        val bool2 = false
        val and = bool1 && bool2 // 논리곱
        val or = bool1 || bool2 // 논리합
        val not = !bool1 // 부정
        println("and: $and, or: $or, not: $not")

        /**
         * 컬렉션 자료형 선언
         **/
        //immutable list(기본)
        val myArray: Array<Int> = arrayOf(1, 2, 3)
        val myList1: List<String> = listOf("apple", "banana", "orange")
        val myList2 = listOf("apple", "banana", "orange")
        val myList3: List<Int> = listOf(1,2,3)
        val myList4: List<Int> = List(3,  {i -> i})// {0,1,2}

        //Mutable 리스트 : add, remove가 가능한 자료형
        val myList5 = MutableList<Int>(3, {i -> i})
        val myList6 = mutableListOf<Int>(0, 1, 2)
        myList5[0] = 4 // index 0번 데이터 4로 변경
        myList5.set(0, 4) // index 0번 데이터 4로 변경
        myList6.remove(2) //값이 2인애 지우기
        myList6.removeAt(1) // index1 지우기

        myList6.removeAll(myList5)// 일치하는 값들을 삭제하고 true 반환, 삭제할 값이 없으면 false 반환
        myList6.clear()

        /**
         * 코틀린 자료형 변환
         **/
        //코틀린에서는 자료형이 다르면 변환 함수를 사용해야 함.
        val e : Int = 1
        val f : Double = a.toDouble() //더블 변환 함수
        val g = 1L + 3 //Long형 + Int형 -> result는 Long형 자료형이 더 큰쪽으로 자동 형변환됨

        /**
         * 코틀린 자료형 검사
         **/
        if (e is Int){
            println("결과 : ${e is Int}")
        } else if (e !is Int){
            println("결과 : ${e is Int}")
        }

        /**
         * 자료형 Any형
         **/
        val h : Any
        h = "im string"
        if (h is String){
            println("결과 : ${h is Int}")
        }
    }
}
    fun main(){
        //★4.코틀린은 변수에 null을 허용하지 않음
//        var nul3 : String = null //이건안됨
        //사용하려면 자료형 뒤에 ?를 붙여야함
        //★5.변수의 메서드를 사용할때 ?.를 사용하면(세이프콜) null인경우 null을 할당함
        //메소드 호출 뿐만 아니라 프로퍼티에 접근할때도 사용 가능
        var nul4 : String? = null
        println("nul4: $nul4")

    }