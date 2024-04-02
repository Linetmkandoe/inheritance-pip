import java.awt.Window

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val noiseMakers = arrayOf("Brenda","perl","john","chris")
    for (noisy in noiseMakers){

        {       continue
        }
        else {
            println(noisy)
        }
    }
    val fruits= arrayOf("banana","apple","mango","grapes")
    for(fruit in fruits){
        println(fruit.reversed())
    }
    val continent = "Asia"
    for(letter in continent){
        println(letter)
    }
 printNationality("Morocco")
    printNationality("Djibouti")
    printNationality("Egypt")
    printNationality("Djibouti")
    calculate(7,9,"/")
    printSquare()
    printSquares()
}
fun printNationality(country:String) {
    if (country == "Eritrea") {
        println("Eritrean")
    }
    else if(country=="Djibouti")
        println("Djiboutian")
    else if(country=="Egypt"){
        println("Egyptian")}

    else{
        println("Foreigner")
    }
}
fun printNationalityWhen(country: String){
        when(country){
        "Eritrea"-> println("Eritrean")
            "Djibouti"-> println("Djiboutian")
            "Egypt"-> println("Egyptian")
            else -> println("Foreigner")
    }
}
fun calculate(x:Int,y:Int, sign:String) :Int {
    var result = 0
    when (sign) {
        "+" -> {
            result = x + y
        }

        "-" -> {
            result = x - y
        }

        ".","*"-> {
            result = x*y
        }
        "÷","/" -> {
            result = x - y
        }
    }
    println(result)
    return result}
fun assignSchool(marks:Int){
    if(marks> 390){
        println("National")
}
    else if(marks in 350..389){
   println("Provincial")

}
else{
    println("District")
}}
fun printSquare(){
    for(num in 1..100){
        val square = num * num
        if(square<1000){
        println(square)
    }
}}


fun printSquares(){
    for(num in 1..100){
        val square = num * num
        if(square<1000){
            println(square)
        } else{
            break
        }
    }}