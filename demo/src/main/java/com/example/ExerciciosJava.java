package com.example;

public class ExerciciosJava {
public static void main(String[] args) {

    // Atividade 1 - Somar todos os elementos de um vetor
    int[] v1 = {10, 20, 30, 40, 50};
    int somaV1 = 0;
    for (int i = 0; i < v1.length; i++) {
        somaV1 += v1[i];
    }
    System.out.println("Atividade 1 - Soma: " + somaV1);

    // Atividade 2 - Encontrar o maior elemento do vetor
    int[] v2 = {12, 45, 8, 90, 23};
    int maiorV2 = v2[0];
    for (int i = 1; i < v2.length; i++) {
        if (v2[i] > maiorV2) {
            maiorV2 = v2[i];
        }
    }
    System.out.println("Atividade 2 - Maior: " + maiorV2);

    // Atividade 3 - Contar números pares em um vetor
    int[] v3 = {4, 7, 8, 11, 16, 20};
    int paresV3 = 0;
    for (int i = 0; i < v3.length; i++) {
        if (v3[i] % 2 == 0) {
            paresV3++;
        }
    }
    System.out.println("Atividade 3 - Pares: " + paresV3);

    // Atividade 4 - Exibir vetor em ordem inversa
    int[] v4 = {1, 2, 3, 4, 5};
    System.out.print("Atividade 4 - Inverso: ");
    for (int i = v4.length - 1; i >= 0; i--) {
        System.out.print(v4[i] + " ");
    }
    System.out.println();

    // Atividade 5 - Calcular a média dos elementos
    double[] v5 = {8, 7, 9, 10, 6};
    double somaV5 = 0;
    for (int i = 0; i < v5.length; i++) {
        somaV5 += v5[i];
    }
    double mediaV5 = somaV5 / v5.length;
    System.out.println("Atividade 5 - Média: " + mediaV5);

    // Atividade 6 - Somar todos os elementos de uma matriz
    int[][] m6 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int somaM6 = 0;
    for (int i = 0; i < m6.length; i++) {
        for (int j = 0; j < m6[i].length; j++) {
            somaM6 += m6[i][j];
        }
    }
    System.out.println("Atividade 6 - Soma da matriz: " + somaM6);

    // Atividade 7 - Encontrar o maior valor de uma matriz
    int[][] m7 = {
        {10, 25, 3},
        {40, 5, 12},
        {7, 89, 2}
    };
    int maiorM7 = m7[0][0];
    for (int i = 0; i < m7.length; i++) {
        for (int j = 0; j < m7[i].length; j++) {
            if (m7[i][j] > maiorM7) {
                maiorM7 = m7[i][j];
            }
        }
    }
    System.out.println("Atividade 7 - Maior da matriz: " + maiorM7);

    // Atividade 8 - Somar os elementos de cada linha da matriz
    int[][] m8 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    System.out.println("Atividade 8 - Soma por linha:");
    for (int i = 0; i < m8.length; i++) {
        int somaLinha = 0;
        for (int j = 0; j < m8[i].length; j++) {
            somaLinha += m8[i][j];
        }
        System.out.println("Linha " + i + ": " + somaLinha);
    }

    // Atividade 9 - Contar números pares em uma matriz
    int[][] m9 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int paresM9 = 0;
    for (int i = 0; i < m9.length; i++) {
        for (int j = 0; j < m9[i].length; j++) {
            if (m9[i][j] % 2 == 0) {
                paresM9++;
            }
        }
    }
    System.out.println("Atividade 9 - Pares na matriz: " + paresM9);

    // Atividade 10 - Buscar um valor em uma matriz
    int[][] m10 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    boolean achou = false;
    for (int i = 0; i < m10.length; i++) {
        for (int j = 0; j < m10[i].length; j++) {
            if (m10[i][j] == 8) {
                achou = true;
                break;
            }
        }
        if (achou) break;
    }
    if (achou) {
        System.out.println("Atividade 10 - Valor 8 encontrado!");
    } else {
        System.out.println("Atividade 10 - Valor 8 não encontrado.");
    }

}
}