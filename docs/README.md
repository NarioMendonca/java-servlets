3) 
Model: Camada utilizada para a criação da lógica de negócio, integrações, funcionalidades principais e/ou comunicações com banco de dados, sendo a camada mais interna de uma aplicação. 

View: Camada mais externa e que tem o contato direto com o usuário, utilizada para criar as interfaces e meios de se comunicar com o usuário, rastreando suas ações e se comunicando com as outras camadas seja enviando ou recebendo dados.

Controller: É a camada que atua entre a Model e a View, que costuma existir para repassar a comunição com a camada View para a controller e vice versa, podendo proteger o Model para não ser acessado de forma indevida, protegendo a camada mais interna da aplicação, além de possibilitar diferentes tipos de comunicação entre o usuário e a aplicação. 

4) Quando o usuário acessa o domínio do servidor, o cliente começa a buscar em servidores DNS o endereço IP desse servudor, e quando encontra guarda em cache para evitar requisições repetidas, então ao fazer uma requisição HTTP para o servidor com uma determinada rota (no caso de fazer uma requisição diretamente para o tomcat, a rota deve iniciar com o nome do projeto) para um determinado arquivo (ou apenas para uma rota que retorna um arquivo de index, por exemplo), e o servidor java retorna o arquivo solicitado.
Caso o cliente envie um formulário através do arquivo, o formulário irá enviar os dados para uma rota de destino com os campos que estavam presentes no momento da submissão, então o servidor busca o Servlet correspondente aquela rota e se ela possui implementada o método da requisição HTTP, e se sim a função responsável por essa implementação processará o que foi enviado a ela, retonando uma resposta para o cliente, seja um redirecionamento ou apenas um erro ao processador os dados.

Quando um Servlet recebe uma requisição, ele verifica se tem implementado um método referente ao método HTTP solicitado (doGet para get, doPost para post e assim por diante), e caso seja encontrado, o método do Servlet recebera um request com os dados da requisição e da chamada HTTP, e um response com a resposta que será retornada, podendo ser utilizado métodos já prontos dentro do request para, por exemplo, alterar cabeçalhos ou definir um status code de resposta.

5- a) Em uma solicitação de um arquivo estático, um servidor Java Web apenas o envia para o cliente, mas ao ser solicitado uma página dinâmica, o servidor irá processar o arquivo JSP para gerar um arquivo estática a partir dos dados que tinha a disposição, e só assim enviar o arquivo para o cliente. Então ambos os tipos de arquivos conseguem servir o cliente, mas de maneiras diferentes

b) Em um projeto jakarta é utilizado a pasta webapp que fica em src/main, tanto os arquivos estáticos padrão como os arquivos JSP ficam dentro dessa pasta, e por padrão, todos são acessíveis publicamente, a não ser que estejam em uma subpasta nomeada WEB-INF

c) normalmente por os arquivos JSPs serem dinâmicos e acessados através de um Servlet, eles devem ficar em uma subpasta WEB-INF dentro de webapp, o que impede de acessa-los diretamente pelo navegador, e por padrão, os arquivos dentro de WEB-INF não são acessíveis publicamente