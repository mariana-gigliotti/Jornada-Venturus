Algoritmo "Desafio"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor   : Jos? Erinaldo da Fonseca 
// Trilha   : [Algoritimo]
// Professor   : Jos? Erinaldo da Fonseca 
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
a: real
b: real
c: real

Inicio

Escreval ("Digite o tamanho dos lados do candidato a tri?ngulo:")
Escreval ("promeiro lado:")
leia (a)
Escreval ("segundo lado:")
leia (b)
Escreval ("terceiro lado:")
leia (c)

se ((a+b) > c) e ((a+c) > b) e ((b+c) > a) ent?o
   se (a = b) ou (a = c) ou (b = c) ent?o
      se (a <> c) ou (a <> b) ou (c <> b) ent?o
         escreval ("? um tri?ngulo is?celes")
      sen?o
         escreval ("? um tri?ngulo equil?tero")
      fimse
   sen?o
      escreval ("? um tri?ngulo escaleno")
   fimse
sen?o
   escreva("N?o ? poss?vel formar um tri?ngulo")
fimse

Fimalgoritmo
