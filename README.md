# Desafio06
[Desafio] BE-JV-005 TÉCNICAS DE PROGRAMAÇÃO - 6

Questão #1

Vale 100

Enunciado

Uma produção agrícola precisa gerar periodicamente relatórios.

Para já deram apenas como exemplo como pode ser gerado um dos seus relatórios mensais.

Assim os outros relatórios podem ser gerados a partir da mesma implementação deste.

A forma da construção dos relatórios precisa ser dinâmica, onde tem que relacionar a informação em um arquivo de variáveis com um arquivo de modelo.

Processe o arquivo de exemplo de variaveis.txt:

    tomate=200
    melao=80
    laranja=140
    desperdicio=5

São apenas variáveis de exemplo, então pode conter outras quaisquer seguindo este mesmo padrão.

E o arquivo de modelo modelo.txt que deve ser processado:

    Relatório Mensal <% mes %>/<% ano %>
    
    Neste mês de <%mes%> do ano <%ano%> a produção acumulada até o momento é de:
    
    - <% tomate %> toneladas de TOMATES
    - <% melao %> toneladas de MELÃO
    - <% laranja %> toneladas de LARANJA
    
    A taxa média de desperdício foi de <%desperdicio%>%.
    
Há algumas variáveis padrão como de ano e mês, mas pode fazer uso de qualquer outra variáveis des que esteja definida no arquivo de variáveis.

Por fim o relatório final produzido dinamicamente deverá ser assim:

    Relatório Mensal julho/2022
    
    Neste mês de julho do ano 2022 a produção acumulada até o momento é de:
    
    - 200 toneladas de TOMATES
    - 80 toneladas de MELÃO
    - 140 toneladas de LARANJA
    
    A taxa média de desperdício foi de 5%.
    
Grave o relatório final no arquivo relatorio-<%mes%>.txt e imprima o seu conteúdo no terminal.
Resposta
