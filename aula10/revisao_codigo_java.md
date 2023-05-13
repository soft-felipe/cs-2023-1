### Tarefa 008: Prática de Revisão de Código - 12/05/2023
##

- Agrupando as classes de **excecoes**
Do ponto de vista de escrita, elas possuem apenas problemas na meneira como foi identada e como a abertura de chaves não segue um padrão bem definido, visto que aparece grudada a classe 'RuntimeException' e separada no construtor da classe. Por outro lado, várias classes de exception com apenas uma linha, um único construtor, um único parâmetro, não me parece ser muito adequado, poderia ter um número menor de classes, com mais parâmetros que possam especificar a exceção desejada ou que seja para mostrar um resultado para o cliente (nesse caso sendo necessário um 'trataExceptionOperacao' por exemplo). Além disso, disso vejo as exceptions apenas como algo negativo nessas classes, e sabemos que uma exceção nem sempre é algo ruim ou não esperado, e não há trativas para isso nesse sentido.
##

- Classe **Cliente**
Ponto positivo pelo uso da dependência Lombok, tem um objetivo muito claro em diminuir o número de linhas repetidas. Porem, pontos negativos aqui existem muitos, os construtores usando métodos do tipo set para preencherem um atributo, apenas para verificar se atende as possíveis opções, como sexo masculino e feminino, isso nem de perto é útil, se é necessário definir opções para o usuário, uma opção é o enum. E também deixar essas opções hardcode está muito sujeito a falhas, Masculino é diferente de masculino, isso vai gerar problemas. E novamente erros de identação e boas práticas de escrita de código.
##

- Classe **PremioSeguro**
Falta de boas práticas na declaração de variáveis e métodos. Cinco 'if' alinhados dentro um do outro, existem maneiras mais legíveis de fazer essas verificações e tratativas separadamente, de modo a favorecer a manutenabilidade [Exemplo de Padrao](https://blog.webdevsimplified.com/2020-01/guard-clauses/). Ademais, as tratativas para cada caso em relação ao percentual de desconto, o uso do enum no tópico anterior iria novamente nos favorecer e também com a utilização de um switch em atributos idênticos. E também os comentários como "Masculino, casado, maior que 25 anos.", as condições já dizem exatamente isso, não é necessário reafirmar com um comentário, nesse caso prejudica a legibilidade, bem como os comentários no início da classe.
##

- Classe **CpfValidator**
Lógica desorganizada, tratativa de CPF como vetor de números, muitos laços de repetição com leitura prejudicada e sem comentário do que está fazendo, verificações hardcode, falta de boas práticas para condições, laços, identação.
##

- Classe **CpfValidatorRefactored**
Espaços desnessários, novamente tratando CPF como números inteiros, falta de boas práticas para condições, laços, identação, verificação de dígitos hardcode, métodos avulsos sem descrição, resumidamente não é possível entender o que está acontecendo nessa classe, para seguir com isso em um empresa quem fez esse código tem que explicar o que está acontecendo e depois de algum tempo nem o próprio desenvolvedor terá domínio sobre o que está acontecendo.
##

- Classe **DataUtils**
Novamente  falta de boas práticas para condições, laços, identação. Condições feitas e verificadas de maneira complexa e nenhum pouco adequada. Trativas em hardcord, com números e condições mirabolantes, prejudica muito a legibilidade, uso exagerado de vetores com indices e justificativas complexas. Nenhum comentário explicando o que pode estar acontecendo aqui.
##

- Classe **EstadoCivilValidator**
O atributo 'estadoCivil' tem de ser um enum para não haver essa verificações diferenciando letra maiúscula e minúscula. E ainda, possibilita o surgimento de atributos a mais para cada caso no enum.
##

- Classes **NacionalidadeValidator**, **PassaporteValidator**, **SexoValidator**
Todas estas seguem o mesmo padrão da classe anterior, EstadoCivilValidator, e seus atributos também devem ser tratados como enum por serem possíveis opções para o cliente, tratar eles dessa maneira com certeza trata problemas de sintaxe, pois não aceita variações em sua escrita.
