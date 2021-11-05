import alunos.Cursos

fun main(args: Array<String>) {



    val pedro = Aluno("Pedro", "Silva", 76557, 75.0, 7)
    val rafael = Aluno("Rafael", "Silva", 76558, 70.0, 7)
    val maria = Aluno("Maria", "Souza", 76559, 40.0, 7)
    val gabriel = Aluno("Gabriel", "Almeida", 76560, 90.0, 7)





    val cursoIngles = Cursos("Inglês",1, "Genivaldo")

    cursoIngles.cadastrar(pedro)
    cursoIngles.cadastrar(maria)

    cursoIngles.contAluno()



    val aluno: Array<Aluno?> = arrayOf(pedro, maria)

    cursoIngles.cadastrar(aluno)

    cursoIngles.contAluno()

    cursoIngles.melhorNota()



    val consulta = Aluno("", "")

    println("Qual o nome do Aluno: ")
    var nome = readLine()!!

    try {
        cursoIngles.verificaAluno(nome)
        println("O Aluno foi removido com sucesso!")
    }catch (e: Exception){
        println(e.message)
    }










}