Algoritmo "Atividade2"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   numero: inteiro

Inicio

   Escreval ("Digite um número qualquer:")
   leia (numero)

   se (numero > 0) então
      se ((numero % 2) = 0) então
         escreva ("O número", numero, " é PAR!")
      senão
         escreval ("O número", numero, " é IMPAR!")
      fimse
   senão
      escreva ("Esse número não é positivo")
   fimse


Fimalgoritmo
