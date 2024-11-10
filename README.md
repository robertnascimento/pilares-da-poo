# Estudos de POO em Java

Este repositório contém exemplos práticos de como implementar os pilares da Programação Orientada a Objetos (POO) em Java. O código aqui demonstrado cobre os conceitos fundamentais de **Encapsulamento**, **Herança**, **Polimorfismo** e **Abstração**.

## Descrição

O objetivo deste projeto é criar classes que simulam a modelagem de **Pessoas** e **Professores**, aplicando os pilares da POO. As classes são estruturadas para demonstrar:

- **Encapsulamento**: Atributos são privados e acessados por meio de métodos `get` e `set`.
- **Herança**: A classe `Professor` herda de `Pessoa`, reutilizando atributos e comportamentos.
- **Polimorfismo**: O método `imprimirInfo()` é sobrescrito na classe `Professor` para exibir informações adicionais.
- **Abstração**: O código expõe apenas a interface necessária, sem detalhes de implementação dos dados.

## Estrutura do Projeto

- **Pessoa**: Classe básica que representa uma pessoa com atributos como nome, idade e gênero.
- **Professor**: Classe que herda de `Pessoa` e adiciona informações adicionais como matrícula e formação.
