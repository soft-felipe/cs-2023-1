### Tarefa 007: Revisão de Código - 10/05/2023
##

É de suma importância compreendermos melhor os principais aspectos acerca da revisão de código. Dentre elas, podemos destacar as principais vantagens dessa prática, como melhora da qualidade final, garantia da manutenabilidade, redução de custos, prevenção de erros e inconsistências. Com tantos pontos positivos afinal, é praticamente impossível ser um bom desenvolvedor de software sem possuir uma visão clara sobre esse conceito. Além disso, devemos entender que a revisão não é simplesmente aquilo que as IDEs fazem atualmente para nós programadores, visto que elas conseguem identificar apenas erros de sintaxe e semântica, enquanto que erros na pragmática, ponto principal de um código, ela não consegue nos alertar. Para um entendimento mais claro, podemos definir este último conceito como a ordem das funções e métodos, como os procedimentos vão se conectar para fazer com que o objetivo da aplicação ou serviço seja alcançado, mais resumidamente: as regras de negócio.

Hoje em dia, para realizar revisões de maneira mais natural uma boa prática adotada é a programação em par, bem como a utilização de ferramentas de validação de casos de testes, tudo isso para garantir o funcionamento correto e a prevenção de falhas. O ato em si de revisar é normalmente feito por outro programador, não sendo aquele que de fato fez o código, para facilitar a troca de informações, obtenção de informações de qual o propósito da alteração e etc. Partindo desse ponto de vista, o revisor desse código pode adotar um checklist das principais competências a serem verificadas: execução (depuração), segurança, legibilidade (garantir que outros entendam o código, afinal de contas não se trata de um conhecimento individual), duplicidade (aumento desnecessário de linhas), nomeação e testes (principal, para garantir o funcionamento), documentação (descrever aquilo que vai ser feito, para lembrança mesmo), possíveis melhorias, atualizar o código (acompanhar novas alterações não mapeadas), feedback (compartilhar os resultados).
##

Ferramentas utilizadas para **revisão**:
- [SonarQube](https://docs.sonarqube.org/latest/), inspeção contínua de códigos, open source, auxilia na detecção de problemas.
- [ESLint](https://eslint.org/), encontrar bugs no código de maneira rápida, integrado as IDEs.
- [PMD](https://pmd.github.io/), identificar falhas mais comuns, para deixar o código mais coerente, disponível para várias linguagens.
- [FindBugs](https://findbugs.sourceforge.net/), analisador dedicado para linguagem Java.
##

Ferramentas utilizadas para **testes**:
- [JUnit](https://junit.org/junit5/), framework open source para testes em Java.
- [NUnit](https://nunit.org/), similar ao JUnit só que para C# e .NET
- [pytest](https://docs.pytest.org/en/7.3.x/), estrutura de rede para definir casos de teste, bastante completo.
##

Com tantas opções boas, temos uma vasta diversidade para escolher a que melhor adapta ao nosso caso, e ainda por cima, elas possibilitam a revisão automatizada, ao fazer um PR para a branch principal a ferramente já analisa o código, retorna sua avaliação, sugere alterações e melhorias e ainda pode até abrir um novo PR para corrigir a sua branch, isso é simplesmente incrível, facilita o nosso dia a dia de uma maneira ímpar. Ademais, ainda temos as extensões que sugerem e nos corrigem instantaneamente nas nossas IDEs, recebendo um feedback confiável e muito rápido, com a possibilidade de personalização completa para se adaptar ao nosso caso.
##

**Extensões** utilizadas:
- [DependaBot](https://github.com/dependabot), identifica falhas de seguranças e vulnerabilidades e abre PRs para melhorias.
- [SonarLint](https://www.sonarsource.com/products/sonarlint/), muito utilizada para garantir a prevenção a falhas de segurança.
