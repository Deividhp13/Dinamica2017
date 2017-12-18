public  class Principal {

    public static String maxLong(String s1, String s2) {
        String retorno = "";
        int pos1 = Integer.MIN_VALUE;
        int pos2 = Integer. MIN_VALUE ;
        int contador1 = 0 ;
        int contador2 = 0 ;
        int mayor, menor;

        if (s1.length() >= s2.length()) {
            mayor = s1.length() + 1;
            menor = s2.length() + 1;
        } else {
            mayor = s2.length() + 1;
            menor = s1.length() + 1;
        }

        for (int i = 1; i < mayor; i++) {
            for (int j = 1; j < menor; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    if (pos1 == Integer.MIN_VALUE) {
                        contador1++;
                        pos1 = j;
                    } else {
                        if (pos1 == (j - 1)) {
                            pos1 = j;
                            contador1++;
                        }
                        else{

                        }
                    }
                    if (contador1 > contador2) {
                        pos2 = pos1;
                        contador2 = contador1;
                    }
                }
                else {
                    contador1 = 0;
                    pos1 = Integer.MIN_VALUE;
                }



            }
        }
        System.out.println(contador2);
        System.out.println(pos2);

        if(pos2 == Integer.MIN_VALUE) retorno = "";
        else{
            return s2.substring((pos2 - contador2), pos2);
        }
        return retorno;
    }





}
