# 🔐 Cifra de César em Java

Este é um projeto simples em Java que implementa a *Cifra de César*, uma técnica clássica de criptografia por substituição de letras. O programa permite criptografar e descriptografar textos com um deslocamento definido pelo usuário.

### 🏛 História

Por volta de 58 a.C., Júlio César , o lendário general romano, estava ocupado conquistando as atuais França e Bélgica, mas tinha um problema: suas mensagens continuavam sendo interceptadas por inimigos. Para resolver isso, César teve uma ideia genial: deslocar cada letra de suas mensagens em 3 posições no alfabeto.

Essa técnica simples, mas eficaz, tornou suas comunicações muito mais difíceis de decifrar sem o conhecimento do deslocamento, dando origem à famosa Cifra de César, uma das primeiras formas conhecidas de criptografia.

## 📁 Estrutura do Projeto

```
CifraDeCesar/
│
├── README.md
├── .gitignore                 # Arquivos que não serão versionados pelo Git
│
└── src/
    ├── Main.java              # Classe principal (entrada do programa)
    └── Cifra.java             # Lógica (método) da Cifra de César
```

## 💡 Funcionalidades

- Criptografar textos com um deslocamento específico
- Descriptografar textos já criptografados
- Suporte para letras maiúsculas e minúsculas
- Mantém caracteres não alfabéticos (espaços, pontuação e números) inalterados
- Validação de entradas do usuário

## ▶️ Como executar

### Pré-requisitos

- Ter o **Java JDK** instalado (utilizei o [JDK 17](https://www.oracle.com/br/java/technologies/downloads/#jdk25-windows))
- Ter acesso ao *terminal ou prompt de comando*

Verifique se o Java está instalado:
```bash
java -version
javac -version
```

### Compilação e Execução

1. No terminal, navegue até a pasta do projeto:

```bash
cd CifraDeCesar
```

2. Compile os arquivos:

```bash
javac Main.java Cifra.java
```

3. Após a compilação, execute:

```bash
java Main
```
