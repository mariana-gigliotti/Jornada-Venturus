Algoritmo "Desafio2"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
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
   escreval ("[2] - alimentação")
   escreval ("[3] - vestuário")
   leia (categoria)
   Escreval ("Digite a situacao do produto")
   escreval ("[1] - – produtos que necessitam de refrigeração")
   escreval ("[2] - produtos que não necessitam de refrigeração")
   leia (situacao)

   se (preco <= 25) então
      escolha categoria
      caso 1
         preco <- preco * 1.05
      caso 2
         preco <- preco * 1.08
      caso 3
         preco <- preco * 1.1
      fimescolha
   senão
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

   se (categoria = 2) ou (situacao = 1) então
      preco <- preco - (preco * 0.05)
   senão
      preco <- preco - (preco * 0.08)
   fimse
   
   escreval (preco)

   se (preco <= 120) então
      se (preco <= 50) então
         escreva ("Preço =", preco, " R$, Barato")
      senão
         escreva ("Preço =", preco, " R$, Normal")
      fimse
   senão
      escreva  ("Preço =", preco, " R$, Caro")
   fimse

Fimalgoritmo
