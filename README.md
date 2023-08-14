# app_exercicios_PAMI
## Aplicativo com dois exercícios escolhidos pelos desenvolvedores

Para iniciar nosso passo a passo no Git, primeiro iremos abrir o Git bash diretamente na pasta desejada.

O primeiro comando que utilizamos foi o '$ git init', ou seja, ele irá inicializar o Git .
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



