# Sistema de Cadastro de Produtos

Mini projeto em Java que demonstra encapsulamento e validação de dados em um cadastro de produtos. O programa cria dois produtos em memória e calcula o valor de cada estoque multiplicando o preço unitário pela quantidade.

## Como executar

O projeto foi verificado com o **JDK 25** e usa apenas a biblioteca padrão do Java.

No IntelliJ IDEA, abra a pasta do repositório, configure o JDK do projeto e marque `src` como **Sources Root**. Em seguida, execute o método `main` de `ProdutoTest01`.

Pelo terminal, na raiz do repositório:

```sh
javac -encoding UTF-8 -d out src/dominio/Produto.java src/test/ProdutoTest01.java
java -cp out test.ProdutoTest01
```

## Regras de cadastro

- O nome deve conter pelo menos um caractere que não seja espaço.
- O preço deve ser finito e maior ou igual a zero.
- A quantidade deve ser maior ou igual a zero.
- Quando um valor é inválido, o método exibe uma mensagem e preserva o valor anterior.

## Cenários demonstrados

| Produto | Preço unitário | Quantidade inicial | Valor em estoque |
| --- | ---: | ---: | ---: |
| Teclado | R$ 150,00 | 5 | R$ 750,00 |
| Mouse | R$ 80,00 | 10 | R$ 800,00 |

O programa tenta atribuir um preço de `-500` ao Teclado e uma quantidade de `-10` ao Mouse. As duas alterações são rejeitadas. No desafio extra, `adicionarEstoque(3)` aumenta o estoque do Teclado de 5 para 8 unidades.

Os atributos da classe são privados. Se a linha comentada `produto01.preco = 500;` for ativada no programa de teste, o compilador rejeitará o acesso direto ao campo.

## Estrutura do código

- [`src/dominio/Produto.java`](src/dominio/Produto.java) contém os atributos privados, os métodos de consulta e validação e as operações de estoque.
- [`src/test/ProdutoTest01.java`](src/test/ProdutoTest01.java) contém o programa que demonstra as regras pelo console.
