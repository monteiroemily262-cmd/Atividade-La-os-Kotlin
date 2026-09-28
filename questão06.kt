fun main() {
    var somaPares: Int = 0
    for (i in 2..50 step 2) {
        somaPares += i
    }
    println("Soma acumulada dos números pares: $somaPares")
}
