Algoritmo "Atividade4"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Trilha   : [Algoritimo]
// Professor   : Jos? Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   n1: real
   n2: real
   n3: real
   media: real

Inicio

   Escreval ("Digite a primeira nota:")
   leia (n1)
   Escreval ("Digite a segunda nota:")
   leia (n2)
   Escreval ("Digite a terceira nota:")
   leia (n3)

   media <- (n1 + n2 + n3)/3

   escreval ("Sua m?dia ?", media)
   escreval ("Por tanto voc? est?:")

   se (media >= 5) ent?o
      se (media >= 7) ent?o
         escreva ("Aprovado")
      sen?o
         escreva ("Em recupera??o")
      fimse
   sen?o
      escreva ("Reprovado")
   fimse

Fimalgoritmo
