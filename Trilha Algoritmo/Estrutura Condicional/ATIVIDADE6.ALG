Algoritmo "Atividade6"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Trilha   : [Algoritimo]
// Professor   : Jos? Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 16/01/2023
Var
   n_escolha: inteiro
   doacao: real
   sem_doacao: logico

Inicio

   Escreval ("Programa Solid?rio")
   Escreval ("Digite a sua op??o:")
   Escreval ()
   Escreval ("[1] para doar R$10")
   Escreval ("[2] para doar R$25")
   Escreval ("[3] para doar R$50")
   Escreval ("[4] para doar outros valores")
   Escreval ("[5] para cancelar")
   leia (n_escolha)

   sem_doacao <- VERDADEIRO

   escolha n_escolha
   caso 1
      doacao <- 10
   caso 2
      doacao <- 25
   caso 3
      doacao <- 50
   caso 4
      escreval ("Digite o valor que gostaria de doar:")
      leia (doacao)
   caso 5
      escreval ("De qualquer modo, agradecemos a aten??o! :)")
      sem_doacao <- FALSO
   outrocaso
      ESCREVAL ("Digito Inv?lido")
      sem_doacao <- FALSO
   fimescolha

   se (sem_doacao = VERDADEIRO) ent?o
      escreval ()
      escreval ("O Valor doado foi de:", doacao, " R$")
      escreval ("Muito Obrigada!")
   senao
      escreval ()
   fimse

Fimalgoritmo
