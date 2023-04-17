fun main() {
ageNumber(12)
    ageNumber(34)
   ageNumber(75)
    numbers()
    oddNumber(45)
    oddNumber(50)
    asses("password123")
    asses("123")
    factorial(arrayOf(1,2,3,4,5,6,7,8,9,10))
    fibonacci(arrayOf(1,2,3,4,5,6,7,8,9))
    statement(arrayOf("1","2","3","4","5","6","7","8","9","10"))
    error()
    days("monday")
    days("friday")
    days("wednesday")
}
fun ageNumber(age:Int){
    if (age <18){
        println("You are not old enough to vote")
    }
    else if (age in 18..65){
        println("You are eligible to vote")
    }
    else if (age > 65){
        println("You are eligible to work")
    }
    else{
       println(null)
    }
}
fun numbers(){
    for (i in 1..10){
        println(i)
    }

}
fun oddNumber(num: Int){
if (num%2==0){
    println("even")
}
    else{
        println("odd")
    }

}
fun asses(password:String){
    if (password=="password123"){
        println("Access granted")
    }
    else{
        println("Access  not granted")
    }
}
fun factorial(number:Array<Int>){
    var num=10
    var factorial:Long=1
    for (i in 2..num){
        factorial *=i.toLong()
    }
    println("Factorial of $num=$factorial")
}
fun fibonacci(number: Array<Int>){
    var num=20
    var num1=0
    var num2=1
    for (i in 1..num){
        println("$num1 + ")
    }

}
fun statement(number: Array<String>){
   for (i in 1..10)
       if (i ==8)
       {
           break
       }
    println(number)
}
fun error(){
    var a=7
    var b=0
    var c:Int
    try {
        c=a/b
    }
    catch (e:Exception){
        println("Exception is handled")
    }
}
fun vowel(string:Array<String>){
for (i in string){

}


}
fun days(day:String){
  when (day){
      in "monday"-> println("Monday blues")
      in "friday"-> println("TGIF!")
      else-> println("Just another day")
  }


}


