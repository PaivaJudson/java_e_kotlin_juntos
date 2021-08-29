import java.util.Scanner;


fun main() {
    inputScannerNvalores()
}


fun input(){
    println("Informe o valor: ")
    val(a, b) = readLine()!!.split(' ')
    println(a.toInt() + b.toInt())
}

fun inputScanner(){
    with(Scanner(System.`in`)){
        println("Informe o primeiro valor ")
        val a = nextInt()

        println("Informe o segundo valor ")
        val b = nextInt()
        println(a + b)
    }
}

fun inputScannerNvalores(){

    val sc = Scanner(System.`in`)
    var total: Int = 0
    var valor: Int = 0
    var qtd: Byte = 0

    do {
        println("Informe um valor ou -1 para sair: ")
        valor = sc.nextInt()
        if (valor != -1) {
            total += valor
            qtd++
        }
    }while (valor != -1)

    println("Valor total = $total e média = ${total.toFloat()/qtd}")
}

