Algoritmo "Atividade8 - Se - senão"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   massa: real
   altura: real
   IMC: real

Inicio

   Escreval ("Cálculo do IMC")
   Escreval ("Digite sua altura, em m:")
   leia (altura)
   Escreval ("Digite sua peso, em kg:")
   leia (massa)

   IMC <- massa/(altura^2)

   se (IMC < 16) então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: magreza grave")
   fimse
   se (IMC >= 16) e (IMC < 17) então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: magreza moderada")
   fimse
   se (IMC >= 17) e (IMC < 18.5) então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: magreza leve")
   fimse
   se (IMC >= 18.5) e (IMC < 25) então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: saudável")
   fimse
   se (IMC >= 25) e (IMC < 30) então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: sobrepeso")
   fimse
   se (IMC >= 30) e (IMC < 35) então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: obesidade grau I")
   fimse
   se (IMC >= 35) e (IMC < 40) então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: obesidade grau II (severa)")
   fimse
   se IMC > 40 então
      escreval ("IMC =", IMC)
      escreval ("Clasificassão: obesidade grau III (mórbida)")
   fimse

Fimalgoritmo
