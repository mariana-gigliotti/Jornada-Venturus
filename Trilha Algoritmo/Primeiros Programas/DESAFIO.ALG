Algoritmo "Desafio"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : José Erinaldo da Fonseca 
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca 
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
a: real
b: real
c: real

Inicio

Escreval ("Digite o tamanho dos lados do candidato a triângulo:")
Escreval ("promeiro lado:")
leia (a)
Escreval ("segundo lado:")
leia (b)
Escreval ("terceiro lado:")
leia (c)

se ((a+b) > c) e ((a+c) > b) e ((b+c) > a) então
   se (a = b) ou (a = c) ou (b = c) então
      se (a <> c) ou (a <> b) ou (c <> b) então
         escreval ("É um triângulo isóceles")
      senão
         escreval ("É um triângulo equilátero")
      fimse
   senão
      escreval ("É um triângulo escaleno")
   fimse
senão
   escreva("Não é possível formar um triângulo")
fimse

Fimalgoritmo
