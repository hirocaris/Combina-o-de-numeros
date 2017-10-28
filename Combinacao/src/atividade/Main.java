package atividade;

import javax.swing.*;

public class Main {
    public static int n = 0;
    public static int con = 0;

    public static void main(String[] args) {
        CombinacaoCom2Numero combinacaoCom2Numero = new CombinacaoCom2Numero();
        CombinacaoCom3Numero combinacaoCom3Numero = new CombinacaoCom3Numero();
        CombinacaoCom4Numero combinacaoCom4Numero = new CombinacaoCom4Numero();
        CombinacaoCom5Numero combinacaoCom5Numero = new CombinacaoCom5Numero();
        CombinacaoCom6numero combinacaoCom6numero = new CombinacaoCom6numero();
        CombinacaoCom7Numero combinacaoCom7Numero = new CombinacaoCom7Numero();
        CombinacaoCom8Numero combinacaoCom8Numero = new CombinacaoCom8Numero();
        CombinacaoCOm9Numero combinacaoCOm9Numero = new CombinacaoCOm9Numero();
        CombinacaoCom10Numero combinacaoCom10Numero = new CombinacaoCom10Numero();

        n = Integer.parseInt((JOptionPane.showInputDialog("Digite")));

        int numero[] = new int[n];
        int vetor[] = new int[10];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = Integer.parseInt((JOptionPane.showInputDialog("digie o numero")));
        }

        if (n == 2) {
            combinacaoCom2Numero.combo2(numero, vetor);

        }
        if (n == 3) {
            combinacaoCom3Numero.combo3(numero, vetor);
        }
        if (n == 4) {
            combinacaoCom4Numero.combo4(numero, vetor);
        }
        if (n == 5) {
            combinacaoCom5Numero.combo5(numero, vetor);
        }
        if (n == 6) {
            combinacaoCom6numero.combo6(numero, vetor);
        }
        if (n == 7) {
            combinacaoCom7Numero.combo7(numero, vetor);

        }
        if (n == 8) {
            combinacaoCom8Numero.combo8(numero, vetor);
        }
        if (n == 9) {
            combinacaoCOm9Numero.combo9(numero, vetor);
        }
        if (n == 10) {
            combinacaoCom10Numero.combo10(numero, vetor);
        }
        if (n < 0) {
            System.out.println("ERRO : o numero de posição ultilizado e menor que 0");
        }
        if (n > 10) {
            System.out.println("ERRO : o numero de posição ultilizado e mairo que 10, podera travar o seu Computador");
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
}

class CombinacaoCom2Numero {
    public void combo2(int numero[], int vetor[]) {

        int con = 0;
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; j++) {
                vetor[1] = numero[j];
                con++;
                System.out.println("Combinação " + con + ": " + vetor[0] + "-" + vetor[1]);

            }
        }

    }
}

class CombinacaoCom3Numero {
    int con = 0;

    public void combo3(int numero[], int vetor[]) {
        for (int i = 0; i < numero.length; i++) {
            vetor[0] = numero[i];
            for (int j = 0; j < numero.length; j++) {
                vetor[1] = numero[j];
                for (int k = 0; k < numero.length; k++) {
                    vetor[2] = numero[k];
                    con++;
                    System.out.println("Combinação " + con + ": " + vetor[0] + "-" + vetor[1] + "-" + vetor[2]);
                }
            }
        }
    }
}

class CombinacaoCom4Numero {

    public void combo4(int numero[], int vetor[]) {
        int con = 0;
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
}

class CombinacaoCom5Numero {
    public void combo5(int numero[], int vetor[]) {
        int con = 0;
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
}

class CombinacaoCom6numero {
    public void combo6(int numero[], int vetor[]) {
        int con = 0;
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
}

class CombinacaoCom7Numero {
    public void combo7(int numero[], int vetor[]) {
        int con = 0;
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
}

class CombinacaoCom8Numero {
    public void combo8(int numero[], int vetor[]) {
        int con = 0;
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
}

class CombinacaoCOm9Numero {
    public void combo9(int numero[], int vetor[]) {
        int con = 0;
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

}

class CombinacaoCom10Numero {
    public void combo10(int numero[], int vetor[]) {
        int con = 0;
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
