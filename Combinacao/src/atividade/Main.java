package atividade;

import javax.swing.*;

public class Main {
    public static int n = 0;
    public static int con = 0;

    public static void main(String[] args) {
        int cont =1;
        n = Integer.parseInt((JOptionPane.showInputDialog("Digite quantas posição sera ultilizado")));
        int numero[] = new int[10];
        int vetor[] = new int[n];


        for (int i = 0; i < numero.length; i++) {
            numero[i] = Integer.parseInt((JOptionPane.showInputDialog("digie o numero" +cont++)));
        }
        if (n == 2) {
            combinacaodedoisnumeros(numero, vetor);
        }
        if (n == 3) {
            combinacaodetresnumeros(numero, vetor);
        }
        if (n == 4) {
            combinacaocomquatro(numero, vetor);
        }
        if (n == 5) {
            combinacaocomcinco(numero, vetor);
        }
        if (n == 6) {
            combinacaocomseis(numero, vetor);
        }
        if (n == 7) {
            combinacaocomsete(numero, vetor);
        }
        if (n == 8) {
            combinacaocomoito(numero, vetor);
        }
        if (n == 9) {
            combinacaocomnove(numero, vetor);
        }
        if (n == 10) {
            combinacaocomdez(numero, vetor);
        }
        if (n < 0 ){
            System.out.println("ERRO : o numero de posição ultilizado e menor que 0");
        }
        if (n > 10){
            System.out.println("ERRO : o numero de posição ultilizado e mairo que 10, podera travar o seu Computador");
        }
    }


    public static void combinacaodedoisnumeros(int[] numero, int vetor[]) {

        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; j++) {
                vetor[1] = numero[j];

                con++;
                System.out.println("Combinação " + con + ": " + vetor[0] + "-" + vetor[1]);

            }
        }


    }

    public static void combinacaodetresnumeros(int[] numeros, int vetor[]) {

        for (int a = 0; a < numeros.length; a++) {
            vetor[0] = numeros[a];
            for (int b = 0; b < numeros.length; b++) {
                vetor[1] = numeros[b];
                for (int c = 0; c < numeros.length; c++) {
                    vetor[2] = numeros[c];
                    con++;

                    System.out.println("Combinação " + con + ": " + vetor[0]
                            + "-" + vetor[1]
                            + "-" + vetor[2]);

                }
            }
        }
    }

    public static void combinacaocomquatro(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; j++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    for (int l = 0; l < numero.length; l++) {
                        vetor[3] = numero[l];
                        con++;
                        System.out.println("Combinação " + con + ": " + vetor[0]
                                + "-" + vetor[1]
                                + "-" + vetor[2]
                                + "-" + vetor[3]);
                    }
                }
            }
        }
    }

    public static void combinacaocomcinco(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; i++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    for (int l = 0; l < numero.length; l++) {
                        vetor[3] = numero[l];
                        for (int m = 0; m < numero.length; m++) {
                            vetor[4] = numero[m];
                            con++;
                            System.out.println("Combinação " + con + ": " + vetor[0]
                                    + "-" + vetor[1]
                                    + "-" + vetor[2]
                                    + "-" + vetor[3]
                                    + "-" + vetor[4]);

                        }
                    }
                }
            }
        }
    }

    public static void combinacaocomseis(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; i++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    for (int l = 0; l < numero.length; l++) {
                        vetor[3] = numero[l];
                        for (int m = 0; m < numero.length; m++) {
                            vetor[4] = numero[m];
                            for (int o = 0; o < numero.length; o++) {
                                vetor[5] = numero[o];
                                con++;
                                System.out.println("Combinação " + con + ": " + vetor[0]
                                        + "-" + vetor[1]
                                        + "-" + vetor[2]
                                        + "-" + vetor[3]
                                        + "-" + vetor[4]
                                        + "-" + vetor[5]);

                            }
                        }
                    }
                }
            }

        }
    }

    public static void combinacaocomsete(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; i++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    for (int l = 0; l < numero.length; l++) {
                        vetor[3] = numero[l];
                        for (int m = 0; m < numero.length; m++) {
                            vetor[4] = numero[m];
                            for (int o = 0; o < numero.length; o++) {
                                vetor[5] = numero[o];
                                for (int p = 0; p < numero.length; p++) {
                                    vetor[6] = numero[p];
                                    con++;
                                    System.out.println("Combinação " + con + ": " + vetor[0]
                                            + "-" + vetor[1]
                                            + "-" + vetor[2]
                                            + "-" + vetor[3]
                                            + "-" + vetor[4]
                                            + "-" + vetor[5]
                                            + "-" + vetor[6]);
                                }
                            }
                        }
                    }
                }

            }
        }

    }

    public static void combinacaocomoito(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; i++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    for (int l = 0; l < numero.length; l++) {
                        vetor[3] = numero[l];
                        for (int m = 0; m < numero.length; m++) {
                            vetor[4] = numero[m];
                            for (int o = 0; o < numero.length; o++) {
                                vetor[5] = numero[o];
                                for (int p = 0; p < numero.length; p++) {
                                    vetor[6] = numero[p];
                                    for (int q = 0; q < numero.length; q++) {
                                        vetor[7] = numero[q];
                                        con++;
                                        System.out.println("Combinação " + con + ": " + vetor[0]
                                                + "-" + vetor[1]
                                                + "-" + vetor[2]
                                                + "-" + vetor[3]
                                                + "-" + vetor[4]
                                                + "-" + vetor[5]
                                                + "-" + vetor[6]
                                                + "-" + vetor[7]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void combinacaocomnove(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; i++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    for (int l = 0; l < numero.length; l++) {
                        vetor[3] = numero[l];
                        for (int m = 0; m < numero.length; m++) {
                            vetor[4] = numero[m];
                            for (int o = 0; o < numero.length; o++) {
                                vetor[5] = numero[o];
                                for (int p = 0; p < numero.length; p++) {
                                    vetor[6] = numero[p];
                                    for (int q = 0; q < numero.length; q++) {
                                        vetor[7] = numero[q];
                                        for (int t = 0; t < numero.length; t++) {
                                            vetor[8] = numero[t];
                                            con++;
                                            System.out.println("Combinação " + con + ": " + vetor[0]
                                                    + "-" + vetor[1]
                                                    + "-" + vetor[2]
                                                    + "-" + vetor[3]
                                                    + "-" + vetor[4]
                                                    + "-" + vetor[5]
                                                    + "-" + vetor[6]
                                                    + "-" + vetor[7]
                                                    + "-" + vetor[8]);

                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void combinacaocomdez(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; i++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    for (int l = 0; l < numero.length; l++) {
                        vetor[3] = numero[l];
                        for (int m = 0; m < numero.length; m++) {
                            vetor[4] = numero[m];
                            for (int o = 0; o < numero.length; o++) {
                                vetor[5] = numero[o];
                                for (int p = 0; p < numero.length; p++) {
                                    vetor[6] = numero[p];
                                    for (int q = 0; q < numero.length; q++) {
                                        vetor[7] = numero[q];
                                        for (int t = 0; t < numero.length; t++) {
                                            for (int y = 0; y < numero.length; y++) {
                                                vetor[8] = numero[y];
                                                for (int x = 0; x < numero.length; x++) {
                                                    vetor[9] = numero[x];
                                                    con++;
                                                    System.out.println("Combinação " + con + ": " + vetor[0]
                                                            + "-" + vetor[1]
                                                            + "-" + vetor[2]
                                                            + "-" + vetor[3]
                                                            + "-" + vetor[4]
                                                            + "-" + vetor[5]
                                                            + "-" + vetor[6]
                                                            + "-" + vetor[7]
                                                            + "-" + vetor[8]
                                                            + "-" + vetor[9]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


