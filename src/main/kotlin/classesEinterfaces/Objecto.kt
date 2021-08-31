package classesEinterfaces

class Aluno(var nome: String)

interface A {
    fun show(): String
}

class Teste: A{
    override fun show(): String {
       return "mostrando método implementado "
    }
}

class Test: A{
    override fun show() = "Teste em inglês"
}


fun passandoElementos(elemento: A){
    println(elemento.show())
}


fun main() {

    var m = Teste()
    var n: A = Teste()
    var k: A = Test()

    passandoElementos(m)
    passandoElementos(k)
    passandoElementos(n)


    /*
    var aluno = Aluno("Judson Paiva")
    println("meu nome é ${aluno.nome}")
    */
}

