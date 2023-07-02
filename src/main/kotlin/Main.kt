//Programa básico com paradigmas procedurais em Kotlin (usando vários recursos da linguagem Java) para controlar os assentos de um teatro.
//Caso o usuário entre com um valor de assento maior que o número de elementos presentes em cada vetor, o programa encerrará automaticamente.
//By: Douglas Holanda

import java.util.Scanner;
import java.util.ArrayList;

object Main
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        val cadeiras = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        val local = IntArray(20)
        val local1 = IntArray(20)
        val local2 = IntArray(20)
        val local3 = IntArray(20)
        val local4 = IntArray(20)
        var opcao : Int
        var opcaoPeca : Int
        var assento : Int
        var assento1 : Int
        var assento2 : Int
        var assento3 : Int
        var assento4 : Int
        val valor = true
        val scanner = Scanner(System.`in`)
        println("Bem-vindo(a) ao nosso sistema de vendas de ingressos para peças de teatro.\n")

        println("Para todas as peças, disponibilizamos a quantidade de assentos com as mesmas numerações, porém as peças são realizadas em locais diferentes.\n")

        println("Opções de assento:\n")

        println("==============================================================\n")

        for (i in 0..19)
        {
            System.out.printf("%s\t", cadeiras[i])
        }

        println("\n")

        while (valor)
        {
            System.out.printf("Digite uma das opções:\n1-Garantir assento.\n2-Encerrar programa.\n")
            opcao = scanner.nextInt()

            if (opcao == 1)
            {
                System.out.printf("Digite uma opção de peça que queiras assistir:\n1-O burguês fidalgo;\n2-Os dias da comuna\n3-A beata Maria do Egito.\n4-O pagador de promessas.\n5-O quebra-nozes.\n")
                opcaoPeca = scanner.nextInt()

                if (opcaoPeca == 1)
                {
                    println("Você escolheu assistir à peça 'O Burguês Fidalgo' de Jean-Baptiste Poquelin, mais conhecido como Molière,\nse já assistiu antes, desejamos uma boa reapresentação, caso não, boa estreia.")

                    println("\n")

                    System.out.printf("Digite uma opção de assento mediante as cadeiras que você já visualizou:\n")
                    assento = scanner.nextInt()


                    if (local[assento - 1] == 0)
                    {
                        println("Assento garantido com sucesso.\n")
                        local[assento - 1] = 1
                    }
                    else
                    {
                        println("Assento já ocupado. Por favor escolha outro.\n")
                    }
                }
                else if (opcaoPeca == 2)
                {
                    println("Você escolheu assistir à peça 'Os dias da Comuna' de Bertolt Betch,\n se já assistiu antes, desejamos uma boa reapresentação, caso não, boa estreia.")

                    println("\n")

                    System.out.printf("Digite uma opção de assento mediante as cadeiras que você já visualizou:\n")
                    assento1 = scanner.nextInt()


                    if (local1[assento1 - 1] == 0)
                    {
                        println("Assento garantido com sucesso.\n")
                        local1[assento1 - 1] = 1
                    }
                    else
                    {
                        println("Assento já ocupado. Por favor escolha outro.\n")
                    }
                }
                else if (opcaoPeca == 3)
                {
                    println("Você escolheu assistir à peça 'A Beata Maria do Egito' da literata modernista brasileira Rachel de Queiroz,\n se já assistiu antes, desejamos uma boa reapresentação, caso não, boa estreia.")

                    println("\n")

                    System.out.printf("Digite uma opção de assento mediante as cadeiras que você já visualizou:\n")
                    assento2 = scanner.nextInt()


                    if (local2[assento2 - 1] == 0)
                    {
                        println("Assento garantido com sucesso.\n");
                        local2[assento2 - 1] = 1;
                    }
                    else
                    {
                        println("Assento já ocupado. Por favor escolha outro.\n")
                    }
                }
                else if (opcaoPeca == 4)
                {
                    println("Você escolheu assistir à peça 'O Pagador de Promessas' do dramaturgo brasileiro Dias Gomes, se já assistiu antes,\n desejamos uma boa reapresentação, caso não, boa estreia.")

                    println("\n")

                    System.out.printf("Digite uma opção de assento mediante as cadeiras que você já visualizou:\n")
                    assento3 = scanner.nextInt()


                    if (local3[assento3 - 1] == 0)
                    {
                        println("Assento garantido com sucesso.\n")
                        local3[assento3 - 1] = 1
                    }
                    else
                    {
                        println("Assento já ocupado. Por favor escolha outro.\n")
                    }
                }
                else if (opcaoPeca == 5)
                {
                    println("Você escolheu assistir à peça 'O Quebra-Nozes' de Piotr Ilitch Tchaikovsky, se já assistiu antes,\n desejamos uma boa reapresentação, caso não, boa estreia.")

                    println("\n")

                    System.out.printf("Digite uma opção de assento mediante as cadeiras que você já visualizou:\n")
                    assento4 = scanner.nextInt()


                    if (local4[assento4 - 1] == 0)
                    {
                        println("Assento garantido com sucesso.\n")
                        local4[assento4 - 1] = 1
                    }
                    else
                    {
                        println("Assento já ocupado. Por favor escolha outro.\n")
                    }
                }
                else if (opcaoPeca != 1 && opcaoPeca != 2 && opcaoPeca != 3 && opcaoPeca != 4 && opcaoPeca != 5)
                {
                    println("Peça não disponível em cartaz.\n")
                }
            }
            else if (opcao == 2)
            {
                println("Agradecemos sua interação conosco, até logo!")

                break
            }
            else if (opcao != 1 && opcao != 2)
            {
                println("Opção inexistente.\n")
            }
        }

    }
}