# Tarefa 016 - Expressões Regulares - 28/06/2023

1. Elaborar expressões regulares para validação dos objetos constantes da tabela a seguir:

|Objeto|Formato|Observação|Regex
|--|--|--|--|
|Data|dd/mm/aa|as "//" (barras) devem fazer parte da regex| \d{2}\/\d{2}\/\d{2}
|Data|dd/mm/aaa|as "//" (barras) devem fazer parte da regex| \d{2}\/\d{2}\/\d{4}
Data|dd/mm/aaa hh:mm:ss|as "//" (barras), os ":" dois pontos e o espaço devem fazer parte da regex| \d{2}\/\d{2}\/\d{4} \d{2}:\d{2}:\d{2}
|Data|yy/mm/dd|as "//" (barras) devem fazer parte da regex| \d{2}\/\d{2}\/\d{2}
|Data|yyyy/mm/dd|as "//" (barras) devem fazer parte da regex| \d{4}\/\d{2}\/\d{2}
|Número decimal|dd.ddd,ddd|Os "." (pontos ) devem fazer parte da regex. Tanto a parte inteira, como a fracionária podem conter de 1 a 5 casas| [1-9]\d{0,1}\.\d{1,5}\,\d{1,5}
|Nomes de Arquivos / documentos|nome.(doc,docx,xls,xlsx,pdf,csv,txt)|pode utilizar outras extensões para teste.| nome\.(doc\|docx\|xls\|xlsx\|pdf\|csv\|txt)
|E-mail|nome@dominio|dominio pode ser ".com", ".com.br", ".goias.gov.br", "(.mil, .gov, .esp, .edu).(br,ar,uk,fr,ru,es,it)"| \w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}(\.[a-zA-Z]{2,3})?
|Codigo Cor HTML ||#00ccff| #([a-fA-F0-9]{6}\|[a-fA-F0-9]{3})
|Arquivo de Imagem||*.(jpg,gif,png), etc.| .*\.(jpg\|gif\|png)
|Endereco IP ||192.168.1.1| \d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}
|Arquivos Multimedia ||*.(swf,mov,wma,mpg,mp3,wav)| .*\.(swf\|mov\|wma\|mpg\|mp3\|wav)
|Telefone (BR) ||(11) 5555-1977 | \(\d{2}\) \d{4}-\d{4}
|Celular (BR)|(55) (62) 9834.1243|os parênteses e pontos fazem parte da regex.| \(\d{2}\) \(\d{2}\) \d{4}\.\d{4}
|Hora|(HH:MM)|Os ":" dois pontos, fazem parte da regex.| \d{2}:\d{2}
|Hora|(HH:MM:SS)|Os ":" dois pontos, fazem parte da regex.| \d{2}:\d{2}:\d{2}
|URL||http://www.google.com, https://www.google.com.br | (http\|https):\/\/[a-zA-Z0-9]+\.[a-zA-Z]{2,3}(\.[a-zA-Z]{2,3})?
|Domínio||www.yahoo.com, www.yahoo.com.br| www\.[a-zA-Z_]+?\.[a-zA-Z]{2,3}(\.[a-zA-Z]{2,3})?
|Telefone Internacional |1.245.532.3422|os "." pontos fazem parte da regex.| ^\d+(\.\d+)*$




**INSTRUÇÕES**
1. Esta é uma tarefa para ser elaborada individualmente, embora possa ser discutida com seu colega do lado.
2. Testar se suas regex estão funcionando. Sugestão de site para teste: [regex101](regex101.com)
3. Commitar este arquivo em uma pasta chamada **Tarefa016**, no seu repositório pessoal.
4. O prazo para entrega desta tarefa é as 20h20min do dia 28/06/2023.
