package classesEinterfaces

class Aluno(var nome: String)

interface A {
    fun show()
}

class Teste: A{
    override fun show() {
       println("mostrando método implementado ")
    }
}



fun main() {

    var m = Teste()

    /*
    var aluno = Aluno("Judson Paiva")
    println("meu nome é ${aluno.nome}")
    */
}

