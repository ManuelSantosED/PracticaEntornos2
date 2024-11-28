fun main() {
    var opcion: Int? // ? --> para que admita null
    do {
        println("▭▭▭▭▭▭   MENÙ   ▭▭▭▭▭▭")
        println("▭ 01. Calcular Cuadrado    ▭")
        println("▭ 01. Calcular Rectangulo  ▭")
        println("▭ 02. Calcular Círculo     ▭")

        opcion = readln().toIntOrNull()
        println()

    } while ((opcion == null) || opcion !in (1..16))
}