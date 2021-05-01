fun main() {
    println("Favor informar o nome do convidado: ")
    //readLine lê a linha de comando e salva na constante nome
    val nome = readLine()

    //if verifica se é vazio, nulo ou branco, se for retorna invalido
    if(nome.isNullOrEmpty() || nome.isNullOrBlank()){
        println("Nome informado não é válido.")
        return
    }

    println("Favor informar a idade do convidado: ")
    //readLine recebe idade e converte de string para inteiro ou nulo
    val idade = readLine()?.toIntOrNull()

    //if verifica se idade é nula, zero ou negativa
    if(idade == null || idade <= 0){
        println("A idade informada não é válida.")
        return
    }

    //verifica se nome informado esta na lista de convidados e da valor para a boolean
    var estaConvidado: Boolean
    when (nome){
        "Jonas" -> estaConvidado = true
        "Antônio" -> estaConvidado = true
        "Lúcio" -> estaConvidado = true
        "Ricardo" -> estaConvidado = true
        else -> estaConvidado = false
    }


    if(estaConvidado && idade >= 18) {
        //verifica se está convidado e se tem idade igual ou maior que 18 anos
        println("Seja bem vindo!")
    }else if (!estaConvidado){
        //se não esta convidado informa que não está na lista
        println("Você não está na lista de convidados, favor verificar com o encarregado.")
    }else{
        //se não tiver idade maior ou igual a 18 informa idade insuficiente
        println("Você não tem idade suficiente para entrar!")
    }


}