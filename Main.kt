import kotlin.random.Random

fun main(args: Array<String>) {
    exercicioUm()
    exercicioDois()
    exercicioTres()
    exercicioQuatro()
}
//# Exercício 1
//Faça um programa que peça os 3 lados de uma forma. O programa deverá informar se os valores podem ser um triângulo.
//  Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//- *Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro.*
//- Triângulo Equilátero: três lados iguais;
//- Triângulo Isósceles: quaisquer dois lados iguais;
//- Triângulo Escaleno: três lados diferentes;
fun exercicioUm(): Unit {
    println("Digite o tamanho do primeiro lado do triângulo:")
    val lado1 = readLine()!!.toFloat()
    println("Digite o tamanho do segundo lado do triângulo:")
    val lado2 = readLine()!!.toFloat()
    println("Digite o tamanho do terceiro lado do triângulo:")
    val lado3 = readLine()!!.toFloat()
    if (lado1 == lado2 && lado2 == lado3) {
        println("O tamanho dos lados é respectivamente: ($lado1), ($lado2) e ($lado3), então, o triângulo é equilátero, ou seja, todos os lados são iguais!!")
    } else if
                   (lado1 == lado3 && lado2 != lado1)
        println("O tamanho dos lados é respectivamente:($lado1), ($lado2) e ($lado3), então, o triângulo é isósceles, ou seja, um dos lados é desigual aos outros!")
    else {
        (lado1 != lado2 || lado2 != lado3)
        println("O tamanho dos lados é respectivamente:($lado1), ($lado2) e ($lado3), então, o triângulo é escaleno, ou seja, todos os lados são diferentes!")
    }

}


//# Exercício 2
//Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano e ou não bissexto.
fun exercicioDois(): Unit {
    println("Digite um ano que seja maior que 2004, e descubra se ele é ou não bissexto:")
    val anoEscolhido = readLine()!!.toFloat()
    for (numero in 0..3000 step 4) {
        println("O ano escolhido é bissexto")
    }
}


//Exercício 3
//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//- “Telefonou para a vítima? “
//- “Esteve no local do crime?”
//- “Mora perto da vítima? “
//- “Devia para a vítima? “
//- “Já trabalhou com a vítima? “
//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada
//como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“. Caso contrário, ele será classificado como “Inocente“.
fun exercicioTres(): Unit {
    println("Cada resposta positiva corresponde ao número 1. Some todas as respostas,digite o resultado e descubra se você é inocente,suspeito, cúmplice ou assassino.")
    println("Você telefonou para a vitima?")
    println("Você esteve no local do crime?")
    println("Você mora perto da vitima?")
    println("Você devia para a vitima?")
    println("Você já trabalhou com a vitima?")
    val questoes = readLine()!!.toInt()
    if (questoes <= 1) {
        println("Você não é inocente.")
    } else if (questoes == 2) {
        println("Você é suspeito.")
    } else if (questoes == 3 || questoes == 4) {
        println("Você é cúmplice!")
    } else if (questoes == 5) {
        println(" Você é o assassino!!")
    } else (questoes <= 1 || questoes >= 6)
    println("Resposta não aceita, número válido de 1 a 5.")
}


//Exercício 4
//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool:
//- Até 20 litros: desconto de 3% por litro;
//- Acima de 20 litros: Desconto de 5% por litro.
//Gasolina:
//- Até 20 litros: desconto de 4% por litro;
//- Acima de 20 litros, desconto de 6% por litro.
//Escreva um programa que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool.
// G-gasolina), calcule e imprima o valor a ser pago pelo cliente
fun exercicioQuatro(): Unit {
    println("Digite o total de litros :")
    val totalDelitros = readLine()!!.toFloat()
    println("Escolha o tipo de combustível:\nalcool -  Álcool\ngasolina- Gasolina")
    val tipoCombustivel = readLine()!!.toString()
    //alcool
    when (totalDelitros <= 20) {
        alcool -> println("total a pagar ${totalDelitros - totalDelitros * 0.3}")
        else(totalDeLitros >=20){ alcool ->
            println("total a pagar ${totalDelitros - totalDelitros * 0.5}")
        }
        //gasolina
        when (totalDelitros <= 20) {
            gasolina -> println("total a pagar ${totalDelitros - totalDelitros * 0.4}")
            else(totalDeLitros >=20){ gasolina ->
                println("total a pagar ${totalDelitros - totalDelitros * 0.6}")
            }
        }
/* when (tipoCombustivel) {
    // 1 -> println("total a pagar: ${totalDelitros - totalDelitros * 0.1}")
 //    2 -> println("Total a pagar: ${totalDelitros - totalDelitros * 0.05}")
     else -> println("Total a pagar: $totalDelitros")
 }
}
 */
