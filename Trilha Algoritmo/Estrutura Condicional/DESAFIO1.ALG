Algoritmo "Desafio1"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   a: real
   b: real
   c: real
   i: inteiro
   temp: real

Inicio

   Escreval ("Digite o primeiro número para ordenar:")
   leia (a)
   Escreval ("Digite segundo número")
   leia (b)
   Escreval ("Digite terceiro número")
   leia (c)

   escreval ("Tipo de ordenação")
   escreval ("[1] - crescente")
   escreval ("[2] - decrescente")
   escreval ("[3] - Maior ao meio")
   leia (i)

   se (a <= b) então
      temp <- a
      a <- b
      b <- temp
   fimse
   se (a <= c) então
      temp <- a
      a <- c
      c <- temp
   fimse
   se (b <= c) então
      temp <- b
      b <- c
      c <- temp
   fimse

   escolha i
   caso 1
      escreva (c," ", b," ", a)
   caso 2
      escreva (a," ", b," ", c)
   caso 3
      escreva (b," ", a," ", c)
   outrocaso
      escreva ("Inválido")
   fimescolha

Fimalgoritmo
