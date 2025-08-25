package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> = Array(n){ i ->
        when {
            i == 0 || (i % 3 == 0 && i % 5 == 0) -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }
}