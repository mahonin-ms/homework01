package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var strings: Array<String> = emptyArray()
    var isDivisionBy3 = false
    var isDivisionBy5 = false

    for(currentValue in 0.rangeUntil(n)) {
        if(currentValue != 0) {
            isDivisionBy3 = currentValue % 3 == 0
            isDivisionBy5 = currentValue % 5 == 0
        }

        strings += if(isDivisionBy3 && isDivisionBy5 || currentValue == 0){
            "FizzBuzz"
        } else if(isDivisionBy3){
            "Fizz"
        } else if(isDivisionBy5){
            "Buzz"
        } else {
            currentValue.toString()
        }

    }

    return strings
}