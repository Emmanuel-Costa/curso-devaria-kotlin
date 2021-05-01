import java.math.BigDecimal

fun calculaOperacao(primeiroNumero:BigDecimal, segundoNumero:BigDecimal, operador:String) : BigDecimal{
    when(operador) {
        "+" -> return (primeiroNumero + segundoNumero)
        "-" -> return (primeiroNumero - segundoNumero)
        "*" -> return (primeiroNumero * segundoNumero)
        "/" -> return (primeiroNumero / segundoNumero)
        "%" -> return (primeiroNumero % segundoNumero)
        else -> return BigDecimal.ZERO
    }
}
fun main() {
    println("Digite um número válido: ")
    val primeiroNumero = readLine()?.toBigDecimalOrNull()

    if (primeiroNumero == null){
        println("Número inválido.")
        return
    }

    println("Digite o segundo número:")
    val segundoNumero = readLine()?.toBigDecimalOrNull()

    if (segundoNumero == null){
        println("Segundo número inválido.")
        return
    }

    println("Digite um operador(+, -, *, /, %):")
    val operador = readLine()

    if(operador.isNullOrEmpty() || operador.isNullOrBlank() || (operador != null && operador != "+" && operador !=
                "-" && operador != "*" && operador != "/" && operador != "%")){
        println("Operador inválido!")
        return
    }

    val resultado = calculaOperacao(primeiroNumero, segundoNumero, operador)
    println("O resultado da sua operação foi: $resultado")


}