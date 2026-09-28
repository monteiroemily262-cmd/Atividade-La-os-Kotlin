fun main() {
    val numero: Int = 29
    var ehPrimo: Boolean = true

    for (i in 2 until numero) {
        if (numero % i == 0) {
            ehPrimo = false
            break
        }
    }

    if (ehPrimo && numero > 1) {
        println("O número $numero é primo.")
    } else {
        println("O número $numero não é primo.")
    }
}
