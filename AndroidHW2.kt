fun main() {
    fun sum(list: List<Int>): Int {
        var sum = 0
        list.forEach { i -> sum += i }
        return sum
    }

    fun max(list: List<Int>): Int {
        return list.max()!!
    }

    fun findIndex(list: List<Int>, what: Int): Int? {
        return list.indexOf(what)
    }

    fun isOdd(number: Int): Boolean {
        return number % 2 == 1
    }

    fun evenItems(list: List<Int>): List<Int> {
        return list.filter { i -> !isOdd(i) }.toList()
    }
}