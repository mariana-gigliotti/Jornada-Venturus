Algoritmo "Atividade8 - Se - sen?o"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Trilha   : [Algoritimo]
// Professor   : Jos? Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   massa: real
   altura: real
   IMC: real

Inicio

   Escreval ("C?lculo do IMC")
   Escreval ("Digite sua altura, em m:")
   leia (altura)
   Escreval ("Digite sua peso, em kg:")
   leia (massa)

   IMC <- massa/(altura^2)

   se (IMC < 16) ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: magreza grave")
   fimse
   se (IMC >= 16) e (IMC < 17) ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: magreza moderada")
   fimse
   se (IMC >= 17) e (IMC < 18.5) ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: magreza leve")
   fimse
   se (IMC >= 18.5) e (IMC < 25) ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: saud?vel")
   fimse
   se (IMC >= 25) e (IMC < 30) ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: sobrepeso")
   fimse
   se (IMC >= 30) e (IMC < 35) ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: obesidade grau I")
   fimse
   se (IMC >= 35) e (IMC < 40) ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: obesidade grau II (severa)")
   fimse
   se IMC > 40 ent?o
      escreval ("IMC =", IMC)
      escreval ("Clasificass?o: obesidade grau III (m?rbida)")
   fimse

Fimalgoritmo
