Algoritmo "Atividade3"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   salario: real
   financiamento: real

Inicio

   Escreval ("Digite o valor do salário (valor mensal):")
   leia (salario)
   Escreval ("Digite o valor total do financiamento pretendido:")
   leia (financiamento)

   se ((salario * 5) <= financiamento) então
         escreva ("Financiamento NEGADO")
   senão
         escreval ("Financiamento CONCEDIDO")
   fimse
   
   escreval ()
   escreval ("Obrigada por nos cosultar!")

Fimalgoritmo
