Algoritmo "Atividade3"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Trilha   : [Algoritimo]
// Professor   : Jos? Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   salario: real
   financiamento: real

Inicio

   Escreval ("Digite o valor do sal?rio (valor mensal):")
   leia (salario)
   Escreval ("Digite o valor total do financiamento pretendido:")
   leia (financiamento)

   se ((salario * 5) <= financiamento) ent?o
         escreva ("Financiamento NEGADO")
   sen?o
         escreval ("Financiamento CONCEDIDO")
   fimse
   
   escreval ()
   escreval ("Obrigada por nos cosultar!")

Fimalgoritmo
