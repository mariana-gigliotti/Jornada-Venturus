Algoritmo "Desafio2"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Trilha   : [Algoritimo]
// Professor   : Jos? Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   preco: real
   categoria: inteiro
   situacao: inteiro

Inicio

   Escreval ("Digite o preco do produto:")
   leia (preco)
   escreval ("Digite a categoria do produto:")
   escreval ("[1] - limpeza")
   escreval ("[2] - alimenta??o")
   escreval ("[3] - vestu?rio")
   leia (categoria)
   Escreval ("Digite a situacao do produto")
   escreval ("[1] - ? produtos que necessitam de refrigera??o")
   escreval ("[2] - produtos que n?o necessitam de refrigera??o")
   leia (situacao)

   se (preco <= 25) ent?o
      escolha categoria
      caso 1
         preco <- preco * 1.05
      caso 2
         preco <- preco * 1.08
      caso 3
         preco <- preco * 1.1
      fimescolha
   sen?o
        escolha categoria
        caso 1
         preco <- preco * 1.12
        caso 2
         preco <- preco * 1.15
        caso 3
         preco <- preco * 1.18
        fimescolha
   fimse
   
   escreval(preco)

   se (categoria = 2) ou (situacao = 1) ent?o
      preco <- preco - (preco * 0.05)
   sen?o
      preco <- preco - (preco * 0.08)
   fimse
   
   escreval (preco)

   se (preco <= 120) ent?o
      se (preco <= 50) ent?o
         escreva ("Pre?o =", preco, " R$, Barato")
      sen?o
         escreva ("Pre?o =", preco, " R$, Normal")
      fimse
   sen?o
      escreva  ("Pre?o =", preco, " R$, Caro")
   fimse

Fimalgoritmo
