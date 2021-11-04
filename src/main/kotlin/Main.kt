fun main(args: Array<String>) {


    val pedro = Aluno("Pedro", "Silva", 76557, 75.0, 7)
    val rafael = Aluno("Rafael", "Silva", 76558, 70.0, 7)
    val maria = Aluno("Maria", "Souza", 76559, 40.0, 7)
    val gabriel = Aluno("Gabriel", "Almeida", 76560, 90.0, 7)





    val cursoIngles = Cursos("Inglês",1, "Genivaldo")

    cursoIngles.cadastrar(pedro)
    cursoIngles.cadastrar(maria)

    cursoIngles.contAluno()

    cursoIngles.remover(gabriel)

    val aluno: Array<Aluno?> = arrayOf(pedro, maria)

    cursoIngles.cadastrar(aluno)

    cursoIngles.contAluno()

    cursoIngles.melhorNota()

    cursoIngles.mostrarEstudante()






}