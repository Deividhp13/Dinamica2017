public  class Principal {

    public static String maxLong(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        //Array de enteros para almacenar las posiciones comunes.
        //Por cada acierto, sumo 1 al resultado anterior
        //int[][] elementosComunes = new int[m+1][n+1];

        int contador1 = -1;
        int maxValorSubstring = Integer.MIN_VALUE, posFinalDelSubarray = -1;
        for(int i = 1; i < m+1; i++) {
            for(int j = 1; j < n+1; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    contador1++;
                    if(contador1 > maxValorSubstring) {
                        maxValorSubstring = contador1;
                        posFinalDelSubarray = i;
                    }
                }
                else
                    contador1 = Integer.MIN_VALUE;
            }
        }
        return s1.substring(posFinalDelSubarray-maxValorSubstring,posFinalDelSubarray);
    }





}
