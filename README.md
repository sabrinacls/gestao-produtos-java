# 📦 Sistema de Gestão de Produtos (Java POO)

Este projeto foi desenvolvido como um exercício prático para consolidar os fundamentos da **Programação Orientada a Objetos (POO)** em Java. O sistema simula um gerenciamento de inventário simples, lidando com diferentes tipos de produtos e regras de negócio específicas.

## 🚀 Conceitos Aplicados

O objetivo principal foi sair da teoria e aplicar os pilares de POO em um cenário real:

* **Encapsulamento:** Todos os atributos (`nome`, `preco`, etc.) foram definidos como `private`, garantindo a proteção dos dados e o acesso exclusivo através de métodos **Getters e Setters**.
* **Herança:** Utilizei uma classe base (`Produtos`) e subclasses especializadas (`Livro` e `Eletronico`) para demonstrar o reaproveitamento de código e a estrutura hierárquica.
* **Polimorfismo:** Implementei a sobrescrita de métodos (`@Override`), permitindo que cada tipo de produto exiba suas informações de forma personalizada e aplique regras de desconto distintas (ex: desconto exclusivo para livros).
* **Arrays:** Uso de arrays para armazenar e iterar sobre uma lista de objetos de diferentes tipos, tratando-os de forma genérica através da classe mãe.
* **Construtores:** Uso de construtores personalizados e da palavra-chave `super()` para inicializar objetos das classes filhas corretamente.

## 🛠️ Tecnologias Utilizadas

* **Java** (Versão 17+)
* **IntelliJ IDEA** (IDE)
* **Git/GitHub** (Versionamento)

## 💻 Como rodar o projeto

1.  Certifique-se de ter o JDK instalado em sua máquina.
2.  Clone este repositório
3.  Abra o projeto em sua IDE de preferência.
4.  Execute a classe `Main.java`.

---
Desenvolvido por **[Sabrina Clemente]** ✨
