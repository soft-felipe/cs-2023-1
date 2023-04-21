## Tarefa 002 - 17/04/2022 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto **no formato markdown** de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

##

O surgimento desse padrão para utilização em API's se deu em estilo arquitetônico Representational State Transfer (REST) para os sistemas em rede, tal conceito foi descrito pelo norte-americano Roy Fielding, fortemente influenciado pela especificação Hypertext Transfer Protocol (HTTP) na qual ele foi também um dos principais autores.

API REST se trata basicamente de uma interface de programação de aplicações, mais conhecida como API que nada mais é do que um conjunto de ferramentas, definições e protocolos para criação de aplicações, sendo elas web ou não, sua principal função é conectar soluções e serviços de maneira mais efetiva e rápida, independente de como as partes ligadas foram implementadas, ou seja, servindo para interoperabilidade de dados, mantendo a segurança, controle e a obrigatoriedade de autenticação.

Partindo desse ponto de vista, é válido lembrar que REST não é um padrão, mas sim restrições que delimitam uma arquitetura para as APIs. Uma API REST envia uma conjunto de informações do estado do recurso ao solicitante ou endpoint sempre que um cliente usa essa API por meio de uma requisição. Javascript Object Notation (JSON), HTML, XLT, Python, PHP ou texto simples são formas possíveis de fornecer essas informações (ou representações) entregues via HTTP. O formato JSON é a linguagem de mais utilizada pois, apesar de seu nome, é independente de qualquer outra linguagem e pode ser lido por máquinas e humanos, facilitando bastante a comunicação e entendimento.

Ademais, é importante ressaltar também que os cabeçalhos e parâmetros são de suma importância nos métodos HTTP de uma requisição HTTP de API REST já que contêm informações relevantes para a autenticação, bem como metadados, autorização, Uniform Resource Identifier (URI), cache, cookies e outras referências da solicitação. Há os cabeçalhos da solicitação e os cabeçalhos da resposta, cada um contendo as informações de suas respectivas conexões HTTP e códigos de status.

Para que uma API seja do tipo REST, ela necessariamente precisa atender alguns critérios, como:
- Possuir uma arquitetura cliente/servidor formada por clientes, servidores e recursos, com solicitações gerenciadas por meio HTTP.
- Prover uma comunicação stateless entre cliente e servidor, ou seja nenhuma informação do cliente é armazenada entre solicitações GET e todas as solicitações são separadas e desconectadas.
- Armazenar dados em cache para otimizar as interações entre cliente e servidor, possibilitando assim uma melhor enficiência em tempo e custo.
- Apresentar uma interface uniforme entre os componentes para que as informações sejam transferidas em um formato padronizado, garantindo que os dados corretos chegaram nos lugares certos, sem perdas de informações.
- Possuir um sistema em camadas que organiza os tipos de servidores (responsáveis pela segurança, pelo carregamento de carga e assim por diante) envolvidos na recuperação das informações solicitadas em hierarquias ocultadas do cliente, basicamente para identificação de recursos.

Por fim, concluímos que apesar de tantos requisitos, a utilização de uma API é bem mais fácil de usar no dia a dia, pelos seus benefícios de entendimento, performance, coerência, segurança, escalabidade, custos, aplicabilidade e entre outros, e com certeza na sua implementação pode haver adaptações conforme o necessário, sem a necessidade de algo estritamente bem definido sob padrões.
