Algoritmo "Atividade8"
// Disciplina   : [Linguagem e Lógica de Programação]
// Trilha   : [Algoritimo]
// Professor   : José Erinaldo da Fonseca
// Autor(a)    : Mariana da Silva Gigliotti
// Data atual  : 17/01/2023
Var
   massa_inicial: real
   massa: real
   t: inteiro
   t_horas: real
   t_min: real
   t_seg: real

Inicio

   Escreval ("Digite a massa inicial do material:")
   leia (massa)
   massa_inicial <- massa
   
   repita
         massa <- massa / 2
         t <- t + 50
   ate massa <= 0.5
   
   escreval ()
   
   t_horas <- t \ 3600
   t_min <- (t % 3600)\60
   t_seg <- (t % 3600)%60
   
   escreval ("Massa Inicial:", massa_inicial)
   escreval ("Massa final:", massa)
   escreval ("tempo:", t_horas, " Horas", t_min, " minutos e", t_seg, " segundos")
   
Fimalgoritmo
