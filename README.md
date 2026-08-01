# Java Fiasco — trilha de estudos

Repositório com exercícios, desafios e projetos práticos de Java, organizados por nível. Os exemplos usam o universo de *Naruto* para praticar desde a sintaxe básica até coleções, Streams, complexidade de algoritmos e uma API REST com Spring Boot.

## Organização do repositório

| Área | Conteúdo |
| --- | --- |
| [`src/NivelBasico`](src/NivelBasico) | Fundamentos da linguagem: tipos, condicionais, laços e arrays. |
| [`src/NivelIntermediario`](src/NivelIntermediario) | Orientação a objetos, coleções, generics e estruturas de dados. |
| [`src/NivelAvancado`](src/NivelAvancado) | Big O e Streams. |
| [`src/Desafios`](src/Desafios) | Desafios práticos independentes. |
| [`CadastroDeNinjas`](CadastroDeNinjas) | API REST de cadastro de ninjas com Spring Boot. |
| [`Conteudo`](Conteudo) | PDFs, imagens e materiais de apoio dos desafios. |

## Aulas — nível básico

Os arquivos-base estão em [`src/NivelBasico/JavaNinja/src`](src/NivelBasico/JavaNinja/src).

1. [Tipos de dados primitivos](src/NivelBasico/JavaNinja/src/TipoDeDados/DadosPrimitivos.java) — `int`, `double`, `char`, `boolean` e demais valores básicos.
2. [Tipos não primitivos](src/NivelBasico/JavaNinja/src/TipoDeDados/DadosNaoPrimitivos.java) — `String` e referências a objetos.
3. [If / else](src/NivelBasico/JavaNinja/src/Condicoes/IfElse.java) — tomada de decisão.
4. [Switch case](src/NivelBasico/JavaNinja/src/Condicoes/EstudoSwitchCases.java) — seleção entre alternativas.
5. [Laços de repetição](src/NivelBasico/JavaNinja/src/Condicoes/LacosDeRepeticao.java) — repetição com estruturas de controle.
6. [Operador ternário](src/NivelBasico/JavaNinja/src/Condicoes/Ternarios.java) — condição em uma expressão.
7. [Leitura com `Scanner`](src/NivelBasico/JavaNinja/src/Condicoes/ScannerDoUsuario.java) — entrada de dados pelo terminal.
8. [Arrays](src/NivelBasico/JavaNinja/src/Array/Array.java) e [arrays bidimensionais](src/NivelBasico/JavaNinja/src/Array/Array2D.java).
9. [Exercício: cadastro de Hokages](src/NivelBasico/JavaNinja/src/Array/ExCadastroHokage.java) — aplicação dos fundamentos.

## Aulas — nível intermediário

Os projetos deste nível estão em [`src/NivelIntermediario`](src/NivelIntermediario). Cada aula evolui os conceitos de orientação a objetos e, depois, introduz as coleções e estruturas de dados do Java.

1. [Herança](src/NivelIntermediario/Projeto01/Heranca) — reaproveitamento de atributos e comportamentos da classe `Ninja` em classes como `Uchiha`, `Hyuga`, `Haruno` e `Uzumaki`.
2. [Interfaces](src/NivelIntermediario/Projeto02/Interfaces) — contratos de comportamento que as classes devem implementar, sem definir toda a sua lógica.
3. [Polimorfismo](src/NivelIntermediario/Projeto03/Polimorfismo) — uma referência `Ninja` pode representar objetos de subclasses diferentes e executar comportamentos específicos.
4. [Construtores](src/NivelIntermediario/Projeto04/Construtores) — inicialização dos objetos no momento da criação, com os dados necessários.
5. [Classes abstratas](src/NivelIntermediario/Projeto05/ClassesAbstratas) — classes-modelo que não são instanciadas diretamente e servem de base para classes concretas.
6. [Classes abstratas e interfaces](src/NivelIntermediario/Projeto06/ClassesAbstratasXInterfaces) — combinação entre uma base compartilhada e contratos adicionais de comportamento.
7. [Polimorfismo e abstração](src/NivelIntermediario/Projeto07/PolimorfismoAbstracao) — estratégias de batalha diferentes aplicadas a partir de uma ideia comum.
8. [`super` e subclasses](src/NivelIntermediario/Projeto08/SuperESubClasse) — acesso a construtores, atributos e métodos da superclasse para complementar o comportamento herdado.
9. [Herança múltipla com interfaces](src/NivelIntermediario/Projeto09/HerancaMultipla) — uma classe pode implementar vários contratos, como `AnbuInterface`, `HokageInterface` e `SharinganInterface`.
10. [Sobrecarga de construtores](src/NivelIntermediario/Projeto10/SobrecargaConstrutores) — várias formas de criar um objeto usando construtores com parâmetros diferentes.
11. [Sobrecarga de métodos](src/NivelIntermediario/Projeto11/SobrecargaMetodos) — métodos com o mesmo nome, mas listas de parâmetros diferentes; o compilador escolhe a versão adequada.
12. [Referência, valor, `equals` e `toString`](src/NivelIntermediario/Projeto12/ReferenciaMemXValorMemIgualtoString) — diferença entre comparar referências e valores, além da representação de objetos em texto.
13. [Métodos `final`](src/NivelIntermediario/Projeto13/FinalMethods) — métodos herdados que não podem ser sobrescritos pelas subclasses.
14. [Classes `final`](src/NivelIntermediario/Projeto14/FinalClass) — classes que não podem ser estendidas por herança.
15. [Getters e setters](src/NivelIntermediario/Projeto15/GettersSetters) — encapsulamento dos atributos e acesso controlado aos dados do objeto.
16. [Enums](src/NivelIntermediario/Projeto16/Enums) — conjuntos fechados de valores, como os ranks de missões.
17. [`List`](src/NivelIntermediario/Projeto17/List) — coleções ordenadas e redimensionáveis para armazenar vários elementos.
18. [Generics](src/NivelIntermediario/Projeto18/Generics) — classes e coleções reutilizáveis com segurança de tipos, comparando versões com e sem generics.
19. [Records](src/NivelIntermediario/Projeto19/Records) — forma concisa de modelar dados imutáveis com construtor, acessores, `equals`, `hashCode` e `toString` gerados pelo Java.
20. [Stack](src/NivelIntermediario/Projeto20/Stack) — estrutura LIFO (*last in, first out*), em que o último elemento inserido é o primeiro removido.
21. [Array × List × Stack](src/NivelIntermediario/Projeto21/ArrayxListxStack) — comparação entre array de tamanho fixo, lista dinâmica e pilha.
22. [Queue](src/NivelIntermediario/Projeto22/Queue) — estrutura FIFO (*first in, first out*), em que o primeiro elemento inserido é o primeiro atendido.
23. [LinkedList](src/NivelIntermediario/Projeto23/LinkedList) — lista encadeada que liga seus elementos e tem características próprias para inserções e remoções.
24. [HashSet](src/NivelIntermediario/Projeto24/HashSet) — conjunto sem elementos duplicados e sem garantia de ordem de inserção.
25. [Complexidade de algoritmos](src/NivelIntermediario/Projeto25/ComplexidadeAlgoritmos) — impacto de estruturas e algoritmos no tempo de execução à medida que os dados crescem.

## Aulas — nível avançado

1. [Big O](src/NivelAvancado/BigO) — escalabilidade e exemplos de complexidade `O(1)`, `O(n)` e `O(n²)`.
2. [Streams](src/NivelAvancado/Streams) — operações `filter`, `sorted`, `map`, `max`, lambdas e referências de método.

## Desafios

- [Desafio 01](src/Desafios/Desafio01) — modelagem de ninja, atributos e comportamento de missão.
- [Desafio 03](src/Desafios/Desafio03) — herança e habilidade especial da classe `Uchiha`.
- [Desafio 06](src/Desafios/Desafio06) — gerenciamento de ninjas com `LinkedList`.
- [Materiais complementares](Conteudo) — enunciados dos desafios 1 a 6 e diagramas de Collections.

## Projeto prático — Cadastro de Ninjas

[`CadastroDeNinjas`](CadastroDeNinjas) é uma aplicação Spring Boot com Java 21. O projeto reúne:

- API REST para criar, listar, atualizar e remover ninjas;
- JPA, H2 e migrations com Flyway;
- DTOs e `NinjaMapper` para separar a API das entidades de persistência;
- interface web com Thymeleaf;
- documentação da API com Swagger/OpenAPI.

### Principais rotas

| Método | Rota | Ação |
| --- | --- | --- |
| `POST` | `/ninjas/criar` | Cria um ninja. |
| `GET` | `/ninjas/listar` | Lista todos os ninjas. |
| `GET` | `/ninjas/listar/{id}` | Busca um ninja pelo identificador. |
| `PUT` | `/ninjas/alterar/{id}` | Atualiza um ninja. |
| `DELETE` | `/ninjas/deletar/{id}` | Remove um ninja. |

### Como executar a API

Pré-requisito: JDK 21.

```powershell
cd CadastroDeNinjas
$env:DATABASE_URL = 'jdbc:h2:mem:cadastrodeninjas'
$env:DATABASE_USERNAME = 'sa'
$env:DATABASE_PASSWORD = ''
.\mvnw.cmd spring-boot:run
```

Com a aplicação em execução, acesse a documentação interativa em `http://localhost:8080/swagger-ui/index.html`.

## Como estudar os exemplos

Os exercícios fora de `CadastroDeNinjas` são exemplos Java independentes. Abra a classe `Main.java` (ou a classe de execução do desafio) pela IDE e execute-a. Como há vários projetos com classes de mesmo nome e pacotes distintos, execute uma aula por vez, usando o diretório correspondente como referência.
