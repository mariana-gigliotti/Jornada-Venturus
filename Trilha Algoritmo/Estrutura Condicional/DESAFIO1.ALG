Algoritmo "Desafio1"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Trilha   : [Algoritimo]
// Professor   : Jos? Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   a: real
   b: real
   c: real
   i: inteiro
   temp: real

Inicio

   Escreval ("Digite o primeiro n?mero para ordenar:")
   leia (a)
   Escreval ("Digite segundo n?mero")
   leia (b)
   Escreval ("Digite terceiro n?mero")
   leia (c)

   escreval ("Tipo de ordena??o")
   escreval ("[1] - crescente")
   escreval ("[2] - decrescente")
   escreval ("[3] - Maior ao meio")
   leia (i)

   se (a <= b) ent?o
      temp <- a
      a <- b
      b <- temp
   fimse
   se (a <= c) ent?o
      temp <- a
      a <- c
      c <- temp
   fimse
   se (b <= c) ent?o
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
      escreva ("Inv?lido")
   fimescolha

Fimalgoritmo
