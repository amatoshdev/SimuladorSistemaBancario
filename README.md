<h1> Simulador de Sistema Bancário </h1>

<h2> Descrição do Projeto </h2>

**Explicação e instruções acerca do programa:**

À primeira vista, o programa exibe uma mensagem de saudação ao usuário e solicita um nome. Após a inserção do nome por parte do usuário, o prompt exibe uma interface básica simulando um caixa bancário contendo informações, como: nome, tipo de conta e saldo atual da conta (que está definido com um valor fixo em R$ 2.500,00).

O prompt, imediatamente após esse evento anterior, exibe então uma lista de opções enumeradas. Essa opções, que possuem suas devidas funcionalidades distintas, podem ser selecionadas (uma por vez) pelo usuário por meio da inserção de um número correspondente a uma opção. O programa discorerrá enquanto o usuário não finalizá-lo e estará apto a receber uma opção enquanto estiver rodando.

Se o usuário inserir o número 1, o programa verificará qual o saldo atual da conta.

Se inserido o número 2, a função de receber um valor estará habilitada e o prompt exibirá uma mensagem solicitando um valor ao usuário que será depositado em sua conta e somado ao saldo anterior.

Se inserido o número 3, desta vez a função de transferir um valor estará habilitada e o prompt exibirá uma mensagem solicitando um valor ao usuário que será transferido de sua conta e subtraido de seu saldo atual.

Se inserido o número 4, o programa é finalizado.
___

**Explicação do código:**

Para capturar as entradas do usuário, foi usada a classe Scanner.

A lógica do sistema bancário é toda escrita dentro de um laço do-while.

O saldo inicial, atual e as variáveis que armazenam os valores de depósito e transferência da conta são do tipo double.

Cada uma das operações catalogadas na lista de opções está escrita dentro de estruturas condicionais if-else e são ativadas por elas.

Caso o usuário digite o número 4, o laço do-while é interrompido e o programa é finalizado.

___

<h2> Habilidades adquiridas: </h2>

Esse projeto foi feito quando eu ainda estava aprendendo a aprender linguagens; ou seja, quando ainda estava no começo da minha jornada como programador back-end. Dessa forma, para não parecer redundante as informações colocadas nos tópicos dessa apresentação, listei no tópico "Habilidades requisitadas" não só as habilidadess necessárias para programar esse projeto, mas também as adquiridas por mim nesse processo (que são exatamente as mesmas).

<h2> Habilidades requisitadas: </h2>

Para (re)criar esse projeto você necessitará consolidar e aplicar certos conhecimentos específicos:

1. Declaração de variáveis e tipos primitivos (tipos utilizados: int e double);
2. Estruturas de repetição (estruturas utilizadas: do-while);
3. Estruturas condicionais (estruturas utilizadas: if-else);
4. Operadores de igualdade (operadores utilizados: == e !=);
5. Operadores de atribuição composta (operadores utilizados: += e -=).
6. Declaração de Strings;
7. Importação e aplicação da classe Scanner de acordo com os tipos primitivos e a classe String;

<h2> Linguagens Utilizadas: </h2>

- <b> Java 17 </b> 

<h2> Ambiente utilizado: </h2>

- <b> Windows 11 </b>
- <b> IntelliJ IDEA </b>

<h2> Ilustrações do programa: </h2>

<p align="center">
Solicitação inicial de um nome ao usuário: <br/> <br/>
<img src="https://imgur.com/PI0gbky.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Interface do sistema bancário com a lista de opções: <br/> <br/>
<img src="https://imgur.com/nqbmODt.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Entrada com o número 1: checagem e exibição do saldo atual <br/> <br/>
<img src="https://imgur.com/qAvGnv4.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Entrada com o número 2: recebimento de um valor e adesão desse valor ao saldo anterior <br/> <br/>
<img src="https://imgur.com/xKVQDNX.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Entrada com o número 3: subtração de um valor e retirada desse valor do saldo atual <br/> <br/>
<img src="https://imgur.com/5LmZ8hg.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Verificando se o saldo resultante das operações anteriores está correto: <br/> <br/>
<img src="https://imgur.com/24evut4.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Entrada com o número 4: finalização da operação e do programa <br/> <br/>
<img src="https://imgur.com/0wZI3rw.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />

___

*Gostaria de agradecer à escola de programação Alura por ter esse projeto em meio ao seu material didático. Sem ele, eu não teria aprendido tanto e muito menos feito esse projeto tão rico para quem está iniciando sua carreira no mundo da tecnologia.*

                     Muito obrigado por acompanhar a leitura dessa apresentação até aqui! Desfrute-o como quiser! 😁☕
