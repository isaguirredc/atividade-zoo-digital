# Zoo Digital (Maven CLI)

Projeto desenvolvido no curso de **Ciência da Computação** na **ATITUS Educação**.

---

## Descrição

Sistema de zoológico digital em **Java**, aplicando **POO completa**: Herança, Polimorfismo, Classes Abstratas, Interfaces, Casting e Encapsulamento.
Permite gerenciar animais via **linha de comando (CLI)**, com operações de CRUD e simulação de comportamentos específicos.

---

## Funcionalidades

* **Cadastrar animais** com atributos específicos (nome, idade, espécie)
* **Listar animais** com todos os detalhes
* **Atualizar dados** de animais
* **Remover animais** do zoológico
* **Simular comportamentos**: emitir som, comer, se mover
* **Validação de dados**: prevenção de duplicidade e entradas inválidas

---

## Estrutura do Projeto

### Classe Animal (Abstrata)

* **Atributos privados**: nome, idade
* **Métodos abstratos**: `emitirSom()`, `comer()`
* **Construtores**: default e parametrizado
* **Encapsulamento**: getters e setters

### Classes de Animais Concretos

* **Exemplo**: Leão, Pinguim, Ornitorrinco
* **Sobrescrita de métodos** da classe `Animal`
* **Comportamentos específicos** implementados via interfaces (ex: `Voar`, `Nadar`)

### Interfaces de Comportamento

* **Exemplo**: `Voar`, `Nadar`, `Correr`
* Define métodos que podem ser implementados por qualquer animal que possua o comportamento

### Classe Biblioteca

* **Lista de animais**: `List<Animal>` usando `ArrayList`
* **Regras de negócio**: adicionar, remover, pesquisar, validar duplicidade

### Classe ZooDigitalApp (Main)

* **Menu interativo**: operações numeradas para CRUD e simulação
* **Funções auxiliares**: cadastro, edição, remoção, pesquisa, simulação de ações

---

## Como Executar

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/zoo-digital.git
```

1. Abrir no **Eclipse** ou **IntelliJ** como **projeto Maven**
2. Executar a classe principal: `ZooDigitalApp.java`
3. Seguir o menu no terminal

---

## Responsável

**Isadora Aguirre Dal Conte** — RA: **1136123**
