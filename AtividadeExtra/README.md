# EXERCICIOS - ATIVIDADE EXTRA
<hr>

# Os Exercicios propostos foram realizados com o objetivo de reforçar o conhecimento em tratamento de exceções.

<hr>

## No exercício 1:

- **Foi adicionado um try/catch para tratar o ArrayIndexOutOfBoundsException e exibir uma mensagem que diz "O limite de indices do vetor foi atingido e não pode ser ultrapassado"**
- **A linha 20 foi alterada de "i <= 15" para "i < array.lenght", para que o programa consiga ser executado normalmente**

## No exercício 2:

- **Foi adicionado um try/catch para tratar as possíveis exceções, como o IllegalArgumentException, ArithmeticException e InputMismatchException**
- **Para exception IllegalArgumentException, uma condição foi implementada no código, onde caso a entrada de dados seja um número negativo, o sistema retorna a mensagem "O programa não recebe números negativos"**
- **Para exception ArithmeticException, a mensagem diz "O programa não pode dividir um número por zero"**
- **Para exception InputMismatchException, a mensagem diz "O programa só recebe números inteiros"**
- **Foi criada uma variável do tipo boolean (chamada system) que controla o laço de repetição, ou seja, trata a execução de todo programa, enquanto a variável for true, o programa retornará ao início, mas isso só ocorrerá caso alguma exceção seja lançada.**

## No exercicio 3:

### **Classe Conta:** 
- Foram criados atributos: saldo, conta, agencia e limite e um Map chamado user.
- Foram criados os métodos Get e Set, e o método construtor.
- O método deposita espera um valor inteiro, verifica a agencia e a conta do usuário e só realiza o procedimento caso as informações estejam iguais aos registros do Map(user) e o valor inserido seja maior que um.
- O método saca recebe a assinatura da Exception ContaExcecao e espera um valor do tipo double, também verifica a agencia e a conta do usuário e realiza os procedimentos caso as informações estejam iguais aos registros no Map(user), caso o valor de saque seja maior que o saldo, a exceção throws ContaExcecao é lançada com a mensagem "Não foi possível sacar o valor solicitado, insira um valor menor ou igual o saldo já existente", caso contrário, o saque é efetuado e retira o valor diretamente do saldo.
- Caso a agencia e a conta não estejam inseridas no Map(user), a mensagem de erro "Conta ou Agencia não existem" aparecerá e encerrará o programa.
- Dentro do Catch, a exceção ContaExececao é lançada juntamente com o saldo do usuário.