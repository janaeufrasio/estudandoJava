public class Main {
    public static void main(String[] args) {
        //Desafio 1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        /*System.out.println("Média decimal");

        double nota1 = 2.3;
        double nota2 = 3.5;
        double media = (nota1 + nota2) /2;

        System.out.println("Média: " + media);*/

        //Desafio 2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        /*double var1 = 15.7;
        int var2 = (int) var1;
        System.out.println("Casting: " + var2);*/

        //Desafio 3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        /*char letra = 'A';
        String palavra = "Amor";
        System.out.println(letra + " de " +  palavra);*/

        //Desafio  - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        /*double precoProduto = 3.50;
        int quantidade = 3;
        int calculo = (int) (precoProduto * quantidade);
        System.out.println("O resultado é " + calculo);*/

        //Desafio 5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        /*double valorEmDolares = 10.9;
        double taxaDeCOnversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeCOnversao;
        System.out.println("A conversão para reais é " +  valorEmReais);*/

        //Desafio 6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 58.90;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;

        System.out.println("O preço original é R$ " + precoOriginal);
        System.out.println("O desconto é de " + valorDesconto);

        double novoPreco = precoOriginal - valorDesconto;
        System.out.println("O novo preço é R$ " + novoPreco);






        /*int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0)/ 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);*/

    }
}