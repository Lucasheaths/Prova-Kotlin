//André Marques Aquino de Souza - RGM: 30187591
//Lucas dos Santos Bastos - RGM: 30187524

fun main() {

    val nomes = arrayOf("Maria Silva", "João Santos", "Ana Pereira", "Pedro Oliveira", "Mariana Sousa", "Lucas Fernandes", "Carolina Almeida", "Gustavo Barbosa", "Isabela Castro", "Rafael Ferreira", "Beatriz Gomes", "Daniel Rodrigues", "Juliana Costa", "Matheus Martins", "Larissa Rocha", "Julia Mancini")

    val notas = arrayOf(7, 8, 3, 7, 2, 10, 9, 8, 6, 7, 4, 6, 8, 9, 9, 1)

    val rgms = arrayOf(3345, 3362, 3331, 3372, 3389, 3344, 3367, 3390, 3361, 3322, 3342, 3351, 3353, 3398, 3309, 3304)

    var somaParesNotas = 0;

    var somaImparNotas = 0;
    for (i in 0 until rgms.size) {
        if (rgms[i] % 2 == 0) {
            somaParesNotas += notas[i]
        } else {
            somaImparNotas += notas[i]
        }
    }

    //----------------------------------------------------------------------------------------------

    var notaMaxima = notas[0];

    var alunoNotaMaior = nomes[0];
    for (i in 1 until 16) {
        if (notas[i] > notaMaxima) {
            notaMaxima = notas[i]
            alunoNotaMaior = nomes[i]
        }
    }

    //--------------------------------------------------------------------------------------------

    var notasMinima = notas[0];

    var alunoNotaMenor = nomes[0];
    for (i in 1 until 16) {
        if (notas[i] < notasMinima) {
            notasMinima = notas[i]
            alunoNotaMenor = nomes[i]
        }
    }
    println("A soma das notas de todos os alunos com RGM com final par é: $somaParesNotas");
    println("A soma das notas de todos os alunos com RGM com final ímpar é: $somaImparNotas");
    println("Aluno com a maior nota: $alunoNotaMaior, Nota: $notaMaxima");
    println("Aluno com a menor nota: $alunoNotaMenor, nota: $notasMinima");
    println("Notas dos alunos aprovados ou reprovados:");

    //--------------------------------------------------------------------------------
    for (i in 0 until 16) {
        val status = if (notas[i] >= 6) "Aprovado" else "Reprovado"
        println("Aluno: ${nomes[i]}, Nota: ${notas[i]}, Status: $status")
    }
}