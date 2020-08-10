# Exemplo simples de Dagger 2
Esse repositório apresenta um exemplo simples de injeção de dependências utilizando Dagger2.

## Bibliotecas
- [Dagger2](https://github.com/google/dagger)

## Como funciona?
A ideia por trás do projeto é bem simples: mostrar como configurar uma injeção de dependências BEM simples
utilizando a ferramenta Dagger2. 

No projeto, existem 5 classes que serão injetadas (com algumas dependências entre si), as classes são: **People, Glass, Window, Door e House**. No caso, **House** depende de **Door, People, e Window**, enquanto **Window** depende de **Glass**. Tanto o Component quanto o Module são encontrados em ApplicationDI, já a injeção pode ser vista dentro da MainActivity.

Caso tenha se interessado pelo assunto, o meu repositório sobre [Cicerone com Dagger2](https://github.com/abe2602/cicerone_dagger) possui um uso um pouco mais avançado do Dagger2, sinta-se livre para dar uma conferida!

## Autor
Bruno Abe

## License
[MIT](https://choosealicense.com/licenses/mit/)
