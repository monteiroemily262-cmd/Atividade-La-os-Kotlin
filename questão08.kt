fun main() {
    val pratos = listOf("Hambúrguer", "Pizza", "Massa", "Salada")
    val itemEsgotado: String = "Pizza"
    for (item in pratos) {
        if (item == itemEsgotado) {
            continue
        }
        println("Item disponível: $item")
    }
}
