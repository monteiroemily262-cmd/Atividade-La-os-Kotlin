fun main() {
    val numero: Int = 6
    var fatorial: Long = 1L

    if (numero == 0 || numero == 1) {
        println("O fatorial de $numero é 1.")
    } else {
        for (i in numero downTo 1) {
            fatorial *= i
        }
        println("O fatorial de $numero é $fatorial.")
    }
}
