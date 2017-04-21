# Analisador Léxico da linguagem LALG
## Feito durante a disciplina de Linguagens de Programação e Compiladores
### Requisitos


JDK e JavaCC instalados


### Instalação 

Download JDK: http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html 

Adicione o JDK ao Path do sistema.

----------------------------------------------------

Download Javacc: https://javacc.org/download

Adicione a pasta javacc-6.0/bin ao Path do sistema.*

*A versão 6.0 não apresenta os scripts necessários para ser utilizada.
Para isso, baixe a versão 5.0, e substitua o arquivo "javacc.jar" da versão 5.0 pelo "javacc.jar" da versão 6.0. Outra opção é apenas utilizar a versão 5.0.
 
### Instruções

Caso queira apenas testar os exemplos, pule para a etapa 3 (caso o projeto já esteja compilado)

1. No prompt de comando/terminal, execute o comando: 
>		"javacc LALG.jj"
   (ou execute o script runcc.bat, no Windows)
	
2. No prompt de comando/terminal, execute o comando: 
>		"javac *.java"
   (ou execute o script compile.bat, no Windows)
   
3. No prompt de comando/terminal, execute o comando:
>		"java LALG < exemploX.lalg"
	(onde "exemploX" é o arquivo .lalg desejado)

### Desenvolvido por 

Anna Paula Pawlicka Maule  

Henrique Pasquini Santos

Guilherme Tomaz Torres Pinto

Isadora Mendes de Souza