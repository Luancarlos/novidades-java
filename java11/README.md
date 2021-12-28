# FUNCIONALIDADES DO JAVA 11

## Manipulação de Strings

Novos métodos para a classe java.lang.String

- **repeat(int)**- Repete a string quantas vezes forem fornecidas pelo int parâmetro.

- **lines()** - Usa um divisor para fornecer linhas preguiçosamente da string de origem.

- **isBlank()** - Indica se a string está vazia ou contém apenas caracteres de espaço em branco.

- **stripLeading()** - Remove o espaço em branco do início.

- **stripTrailing()** - Remove o espaço em branco do final.

- **strip()** - Remove o espaço em branco de ambos, início e fim da string.

Para executar o exemplo:

```bash
  java Strings.java
```

## Variáveis por inferência

É possível definir variáveis assim: 
```bash
  var texto = "JAVA 11";
  var lista = new ArrayList<String>();
```

No lambda expression podemos adicionar anotações na entrada da função:
```bash
    String valor = lista.stream()
            .map((@NotNull var s) -> s.toUpperCase())
            .collect(Collectors.joining(","));
```

Para executar o exemplo:
```bash
  java VariavelInferencia.java
```
## Manipulação de arquivos

Novos métodos para ler e escrever arquivos.
- readString()
- writeString()

Para executar o exemplo:
```bash
  java Arquivo.java
```

## HTTP Client

Implementação do HTTP Client API que suporte HTTP 1.1, HTTP 2 e Websocket.

Para executar o exemplo:
```bash
  java ClienteHttp.java
```

## Referência

- https://qastack.com.br/programming/51266582/difference-between-string-trim-and-strip-methods-in-java-11

- https://dev.to/bilbolixeiro/novidades-do-java-11-4pj7
