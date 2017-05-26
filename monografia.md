 
 
# Paradigma lógico 
>  * Conceitos do paradigma
>  * Perspectiva histórica
>  * Exemplo de aplicação
>  * Vantagens e Desvantagens
>  * Linguagem PROLOG
>  * Fatos, Regras e Controle de Corte
>  * Operadores e Listas, etc.
 
## Conceitos do Paradigma Logico
Programas logicos sao uma colecao de fatos e regras. O paradigma se basea em cálculo de predicados, objetos e suas relacoes.  A computação é feita usando um mecanismo de inferência, e de lógica.  A computação pode ser realizada com variáveis não instanciadas. As linguagens de programacao  logicas sao tambem conhecidas como linguages declarativas. Portanto, sua semantica tambem é declarativa. 

O conceito da semantica declarativa é que tem um jeito simples de determinar o significado de cada afirmacao, e isso nao depende de como a afirmacao pode ser usada para resolver um problema. 

A semantica declarativa é mais simples do que a semantica de linguagens imperativas. Em uma linguagem logica de programacao uma dada proposicao pode ser determinada pela propria afirmacao, enquanto em linguagens imperativas a semantica requer examinar declaracoes locais, conhecimento do escopo de regras da linguagem, e ate mesmo examinar o programa em outros arquivos so para determinar o tipo de variaveis na declaracao de atribuicao. 

A programacao em linguagens logicas é nao processual. Programas nessas linguagem nao afirma extamente como o vai ser computado, mas sim descreve a forma do resultado. Entao, é esperado do computador que ele de alguma forma determine como o resultado vai ser computado. Para garantir que o computador consiga achar os resultados é necessario supri-lo com  informacoes relevantes and metodos de inferencia.

## Perspectiva Historica 
 
O  design do PROLOG foi criado em 1987 por Alain Colmerauer e Phillippe Roussel da Universidade de Aix-Marseille, e por Robert Kowalski da Universidade de Edinburgh. O primeiro interpretador de PROLOG foi desenvolvido em Marseille em 1972. O nome PROLOG veio da abreviacao de "Programacao Logica". A pesquisa do desenvolvimento da linguagem ficou focado em Marseille e Endiburgh ate 1981, quando o governo Japones anunciou o desenvolvimento do projeto chamado de "Fith Generation Computing Systems"(FGCS) e que o PROLOG foi a linguagem escolhida para ser a base deste projeto, cujo o objetivo era desenvolver maquinas inteligentes. Foi assim que o PROLOG ganhou visibilidade no mundo inteiro. Depois de uma decada, o projeto foi abandonado e poucas coisas significantes foram descobertas, assim levando uma linguagem de grande potencial ao declinio ( despopulirazacao). 

Apesar de tudo, PROLOG continua sendo a linguagem mais usada dentre as linguagens do paradigma logico. 

## Uso 
 
* Prova de Teorema 

* Expert Systems 

* Type Inference Systems 

* Planejamento Automatizado

* Processamento de Linguagem Natural

O intuito do desenvolvimento da linguagem de logica foi para poder realizar processamento de linguagens naturais. 
 
Essa linguagem tambem pode ser usada para tarefas específicas baseado em “rule base queries” com busca em banco de dados, sistema de controle de voz, e preencher “templates”. 
 
## Vantagens
 
A linguagem lógica consegue representar o mundo (problema) de forma mais realista 
Prolog consegue derivar novas regras atraves de regras contidas na base de conhecimento
 
## Desvantagens

Pode ser muito difícil fazer o design de banco de dados que represente com acurácia a relação entre os dados.
Nao é a melhor linguagem para resolver problemas computacionais aritméticos complexos
Prolog não serve muito bem para arquiteturas de computadores com execução sequencial. Ele é melhor otimizado para arquiteturas paralelas. 
 
 Fatos, Regras e Controle de corte, Operadores e listas:
 
 “Constraints and coroutining attach rules to (changing) data. Combined with backtracking, this can be used to solve many complicated combinatorial problems using a simple declarative specification. Classical examples are puzzles and planning problems.”
 
It provides semantic highlighting based on real time analysis of the code by the Prolog system itself. 

## Elementos Basicos de PROLOG

### Termos 

### Declaracao de Fatos 

### Declaracao de Regras 

### Declaracao de Objetivos 

### Estrutura de Listas 

## Deficiencias da Linguagem 

### Resolucao de Controle de Ordem 

### Assuncao de Mundo Fechado 

### Problema de Negacao 

### Limitacoes Intriscecas 


 
## Referencias:

[SWI-Prolog](http://www.swi-prolog.org/web/)

[York University Material](http://www-users.york.ac.uk/~sjh1/courses/L334css/complete/complete2su7.html)

 SEBESTA, R. W. Concepts of Programming Languages. Addison-Wesley. 2010.  
