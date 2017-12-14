public  class Principal {

    public static String maxLong(String s1, String s2) {
        int mayor, menor;

        if (s1.length() >= s2.length()) {
            mayor = s1.length() + 1;
            menor = s2.length() + 1;
        } else {
            mayor = s2.length() + 1;
            menor = s1.length() + 1;
        }

        int cont = 0, pos = -1;
        int[][] solucion = new int[2][mayor];

        for (int i = 1; i < mayor; i++) {
            for (int j = 1; j < menor; j++) {
                if (s1.length() >= s2.length()) {
                    if (s1.charAt(i - 1) == s2.charAt((j - 1))) {
                        solucion[i % 2][j] = solucion[(i - 1) % 2][j - 1] + 1;
                        if (solucion[i % 2][j] > cont) {
                            cont = solucion[i % 2][j];
                            pos = j;
                        }
                    } else
                        solucion[i % 2][j] = 0;

                } else {
                    if (s2.charAt(i - 1) == s1.charAt((j - 1))) {
                        solucion[i % 2][j] = solucion[(i - 1) % 2][j - 1] + 1;
                        if (solucion[i % 2][j] > cont) {
                            cont = solucion[i % 2][j];
                            pos = j;
                        }
                    } else
                        solucion[i % 2][j] = 0;
                }
            }
        }
        if (s1.length() >= s2.length()) return s2.substring((pos - cont), pos);
        else return s1.substring((pos - cont), pos);
    }





}
