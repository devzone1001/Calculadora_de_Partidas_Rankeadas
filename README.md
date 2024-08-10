
# Calculadora de Partidas Rankeadas

## Descrição do Projeto

O projeto **Calculadora de Partidas Rankeadas** é uma aplicação simples desenvolvida em Java que tem como objetivo determinar o nível de um jogador em um sistema de partidas ranqueadas com base na quantidade de vitórias e derrotas. A aplicação calcula o saldo de vitórias e classifica o nível do jogador de acordo com a quantidade de vitórias acumuladas.

## Funcionalidade

O programa realiza as seguintes funções:

1. **Cálculo do Saldo de Vitórias** :

* O saldo de vitórias é calculado subtraindo o número de derrotas do número de vitórias.

1. **Classificação do Nível** :

* O nível do jogador é determinado com base na quantidade de vitórias acumuladas:
  * **Ferro** : Menos de 10 vitórias.
  * **Bronze** : Entre 10 e 20 vitórias.
  * **Prata** : Entre 21 e 50 vitórias.
  * **Ouro** : Entre 51 e 80 vitórias.
  * **Diamante** : Entre 81 e 90 vitórias.
  * **Lendário** : Entre 91 e 100 vitórias.
  * **Imortal** : 101 vitórias ou mais.

1. **Exibição do Resultado** :

* O programa exibe uma mensagem indicando o saldo de vitórias e o nível do jogador.

## Estrutura do Código

O código é composto por:

* **Função `main`** :
* Define as variáveis de vitórias e derrotas.
* Calcula o nível do jogador e o saldo de vitórias.
* Exibe uma mensagem com o resultado.
* **Função `calcularNivel`** :
* Recebe o número de vitórias como parâmetro.
* Usa uma série de condições para determinar o nível do jogador com base na quantidade de vitórias.
* Retorna o nível correspondente.

Este projeto ilustra o uso de variáveis, operadores, estruturas de decisão e funções em Java, fornecendo uma solução prática para a classificação de jogadores com base em seu desempenho em partidas ranqueadas.
