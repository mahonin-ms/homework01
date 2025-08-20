package ru.otus.homework

import java.lang.IllegalArgumentException


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    //var intArray: IntArray = emptyArray<Int>().toIntArray()
    val indexes = ArrayList<Int>()

    for((index, currentValue) in numbers.withIndex()) {
        var i = 1

        while (i < numbers.size) {
            if(currentValue + numbers[i] == target){
                indexes.add(index)
                indexes.add(i)
                return indexes.toIntArray()
            }
            ++i;
        }
    }

    throw IllegalArgumentException("Сумма не найдена!")

}