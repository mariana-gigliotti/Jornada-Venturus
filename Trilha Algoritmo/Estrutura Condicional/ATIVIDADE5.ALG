Algoritmo "Atividade5"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   salario: real
   nome: caractere
   novo_salario: real
   aumento_pc: inteiro

Inicio

   Escreval ("Digite o seu nome:")
   leia (nome)
   Escreval ("Digite o seu salário atual:")
   leia (salario)

   escolha salario
   caso 0,1,2,3
      novo_salario <- (salario * 1.2)
      aumento_pc <- 20
   caso 4,5,6
      novo_salario <- (salario * 1.15)
      aumento_pc <- 15
   caso 7,8,9
      novo_salario <- salario * 1.12
      aumento_pc <- 12
   caso 10,11,12
      novo_salario <- salario * 1.1
      aumento_pc <- 10
   caso 13,14,15
      novo_salario <- salario * 1.07
      aumento_pc <- 7
   outrocaso
      novo_salario <- salario
      aumento_pc <- 0
   fimescolha

   escreval ()
   escreval (nome, ", sua situação atual é:")
   escreval ("Aumento em:", aumento_pc, "%")
   escreval ("Salario atual:", salario)
   escreva ("Novo salario:", novo_salario)

Fimalgoritmo
