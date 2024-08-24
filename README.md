# Clean-Architecture-System

## Abordagem por modulos
1. Projeto foi pensando em uma estrutura de módulos, pois o mesmo segue mais a risca o princípio da inverção de dependencias, que o modelo em pacotes. Em pacotes uma classe pode mais facilmente ter acesso aos metos de outra que no modelo em odulos. 

   1. Assim o modulo infraestructure encherga todos os modulos e depende deles, sequido por.
   2. a. modulo apllicatiom encherga e depende de usecase e core
   3. use case so encherga e depende de core 
   4. core não encherga nemuhm outro e nem depende de nenhum outro modulo
<hr>

### Modulo Core

   criado um pacote core/domain onde ficaram as classes puramente em Java que representam nosas entidades de dominio, 
o que representa o négocio mesmo que ele fosse feito em papel.

Ex. na classe TaxNumber, está toda a lógica - inclusive matemática - em java puro, para a verificação se um CPF u CNPJ é válido.

   A classe Wallet dentro de core/domain também carrega consigo regras de negócio, como Keepshoppers não podem tranferir valores para Usuarios(um vendedor não transfere dinheiro para um comprador). 

   em TransactionPin tambem foi feita a validação se a senha contem mais que 8 digitos





