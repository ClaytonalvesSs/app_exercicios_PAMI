# app_exercicios_PAMI
## Aplicativo com dois exercícios escolhidos pelos desenvolvedores (Clayton Alves e Evelyn Karina)

Para iniciar nosso passo a passo no Git, primeiro iremos abrir o Git bash diretamente na pasta desejada.

O primeiro comando que utilizamos foi o ' $ git init ', ou seja, ele irá inicializar o Git .
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/3616d65d-4ad1-4459-b10c-28250cdf0cec)

Precisamos vincular o GitHub com o Git e para isso é necessário configurar para informar seu usuário e o email utilizado no GitHub (Caso não esteja configurado) para realizar essa configuração utilizamos o '$ git config --global user.name “nome_do_usuário”' e '$ git config --global user.email “email_usuario”'. Como o nosso já estava configurado fomos para o próximo passo.

Com o seu projeto na pasta indicada no início utilizaremos o comando '$ git status' que irá mostrar o que está acontecendo dentro da sua pasta. Se o arquivo não está adicionado no Git ele irá aparecer em vermelho, ou seja, ele está no radar do Git, porém ele não reconhece o que está armazenado dentro da pasta. Nessa mesma resposta ele já diz para utilizar o '$ git add' para que ele possa reconhecer os arquivos.
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/cc8d38b4-14c4-4a5e-a5a0-85e9d01db045)

Logo após, como recomendado usaremos o '$ git add' , mas juntamente com o “.”, que irá adicionar todos os arquivos. 
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/3c4162cd-fb43-4ec0-937b-eb8a1ff761a7)

Depois para conferir se foi adicionado utilizaremos o '$ git status' novamente. Se os arquivos estiverem verdes é porque deu certo.
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/f68e21ce-14f0-435b-a59e-e027a394f915)

Agora, precisamos fazer um commit nesses arquivos. Para isso utilizaremos o comando '$ git commit -m “Início do desenvolvimento do app de exercícios”' (o -m nesse comando quer dizer “mensagem”)
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/40fab2ed-7f01-42a5-b75b-5664f5002ebb)

Para verificar se o commit deu certo usamos o seguinte comando, '$ git log'. Ele irá mostrar os commits feitos.
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/125facf2-48bf-4df1-9050-44380bb9c797)

No GitHub iremos criar um repositório.
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/fd8b10f6-296d-4e50-87cd-1be44be5b930)

Iremos copiar o link e digitar o seguinte comando '$ git remote add origin https://github.com/ClaytonalvesSs/app_exercicios_PAMI.git', ele é utilizado para linkar o repositório local (da nossa máquina), ao repositório remoto(GitHub).
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/2d6900a7-8f79-48d1-8bb9-b5ad532e9273)
 
Depois na outra linha iremos utilizar o comando '$ git branch -m main', ao executar o comando, a branch atual será renomeada para main, mesmo que essa branch já exista (efeito causado pelo --force). 
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/b6748aa2-ab26-49cb-a364-4aa40f5af677)

E por último utilizaremos o '$ git pull --allow-unrelated-histories' ele é usado para atualizar suas branches locais de acordo com as branches remotas. E o '$ git push origin main', que irá puxar tudo do Git para o GitHub.
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/df7ced93-997f-40c7-9460-d13418f79952)
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/27121381-69af-4a62-b56f-1a60fb9e12fe)

E aqui está o resultado:
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/127456560/3a84d953-4e8a-4e26-85f4-5d0c782e6d6d)

<h2>Android Studio</h2>
<h3>Actyvities</h3>
O APP contém um total de três acyvities, uma é a principal, outra sobre o exercício 1, e mais uma sobre o exercício 4.

<h3>Main</h3>
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/a8ef9eeb-d81f-43bf-be1d-55213c2eaa3b)
Todas as suas activities possuem um design simples, no caso da Main, ela possui 4 elementos, uma TextView, indicando o tema do app, uma ImageView para dar uma complementada a mais no design e dois ImageButtons, no qual cada um redireciona para a activity representada pelo número do exercicio que escolhemos (no caso o 1 e o 4).

<h3>Main Java</h3>
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/191649f2-34ea-42f4-b6b7-4844537b4709)
Aqui temos no total dois metodos, no qual cada um tem uma intent explicita que redireciona para a tela de cada exercício.


<H3>Activity Exercicio 1</H3>
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/3cf7b36c-ce40-4178-9631-16a76614b1f7)
Ela possui diversos elementos como: 3 EditText, no caso 2 servindo para o usuário digitar os números e uma para apresentar o resultado que será gerado após o usuário clicar no botão, uma TextView indicando o usuário para que assista o video abaixo, no qual usamos uma VideoView.

<h3>Java do Exercicio 1</h3>
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/54b7cd0b-8c43-4993-9082-e11ff0955b5c)
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/f38c9aa8-94f1-4271-8796-afe7a5052004)
Agora sobre o código, começamos primeiro declarando as views, e logo depois "chamando" elas pela ID.

![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/4de1e65b-6a1e-4893-bcbb-1239b57d04c8)
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/8c1c1b6e-0340-47a1-a04f-78a9375bd99c)
Nessas duas imagens acima, são os codigos para a programação da exibição do video em si, começando desde a definição do caminho em que o video se encontra, configuração da Uri do video, criação dos controladores do video e seu instanciamento, a utilização dos controladores dentro da VideoView (colocando eles abaixo do video para o usuário conrolá-lo), exibição dos controladores abaixo da VideoView e eles também irão segir o comportamento da VideoView, e por fim, a definição da URI na VideoView.

![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/9f01f254-bc65-43f6-bd9d-85daf9d1a528)
Agora, sobre a criação do método para ver se o número informado é multiplo ou não, criamos ele com o nome de "vmultiplo", no qual ele sera chamado através desse nome na propriedade OnClick do botão. Inicialmente criamos duas váriaveis, a valora e a valorb, que irão receber os números digitados pelo usuário e a variável resultado, como o próprio nome diz, irá apresentar o resultado dizendo se é múltiplo ou não. Após isso, criamos uma condição que ira verificar o resto de uma divisão, caso o resto seja 0, é considerado múltiplo, e caso o resto seja maior que 0, não é considerado múltiplo.


<h3>Acivity Exercicio 4</h3>
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/edfdee26-36ce-4e58-abbd-9f4be4fa7ee2)
alguns dos elementos utilizados foram: Uma EditText para o usuáario informar o horário de entrada, um botão para calcular e que fará o retorno do horario de saída numa TextView, além disso, temos outra TextView que indicará logo abaixo uma textClock, que retorna o horário atual.

<h3>Exercicio 4 XML</h3>
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/b5e5bef5-c4f1-4b48-a1b3-b7d4ca5d60b6)
No caso do TextClock, ele é elaborado pelo XML, podendo usar códigos para deixar em formato de 12 horas ou 24 horas.

<h3>Exercicio 4 Java</h3>
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/f75d54cb-3527-4336-8868-e020e793f8c3)
![image](https://github.com/ClaytonalvesSs/app_exercicios_PAMI/assets/128047894/86a98f3a-234a-49cf-bd6d-94f5b16b38b3)
Aqui no Java do exercício 4 é quase o mesmo esquema do exercício 1, porém um pouco mais simples, começando pela declaração das views, depois, chamando elas pelo ID e por fim, criando o método HoraCalculo que irá ser chamado na propriedade OnClick do botão, dentro desse método, criamos tres variáveis, a entrada, que será o horário informado pelo usuário, a saida que é o cálculo caso o horario de entrada informado pelo usuário seja menor que 18 e a saida2 que fará o cálculo caso o horário de entrada seja maior ou igual a 18.

<h2>Vídeo da execução do APP</h2>
Assista o vídeo da execução do aplicativo logo abaixo:


