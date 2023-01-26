Algoritmo "Atividade4"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
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

   escreval ("Sua média é", media)
   escreval ("Por tanto você está:")

   se (media >= 5) então
      se (media >= 7) então
         escreva ("Aprovado")
      senão
         escreva ("Em recuperação")
      fimse
   senão
      escreva ("Reprovado")
   fimse

Fimalgoritmo
