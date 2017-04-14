package model;

import java.util.Arrays;

/**
 * @Autor Warney
 */
public abstract class Vetor {
    
    //Métodos de inserir (todos os tipos)
    public static char[] inserirValor(char vetor[], char valor){
        char newVetor[] = new char[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    
    public static String[] inserirValor(String vetor[], String valor){
        String newVetor[] = new String[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    
    public static byte[] inserirValor(byte vetor[], byte valor){
        byte newVetor[] = new byte[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    
    public static short[] inserirValor(short vetor[], short valor){
        short newVetor[] = new short[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    
    public static int[] inserirValor(int vetor[], int valor){
        int newVetor[] = new int[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    
    public static long[] inserirValor(long vetor[], long valor){
        long newVetor[] = new long[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    
    public static float[] inserirValor(float vetor[], float valor){
        float newVetor[] = new float[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    
    public static double[] inserirValor(double vetor[], double valor){
        double newVetor[] = new double[vetor.length + 1];
        for (int i = 0; i < newVetor.length; i++) {
            if(i == newVetor.length - 1){
                newVetor[i] = valor;
            }else{
                newVetor[i] = vetor[i];
            }
        }
        return newVetor;
    }
    //Fim dos métodos de inserir
    
    
    //Métodos de procura
    public static boolean existe(char vetor[], char valor){
        return Arrays.binarySearch(vetor, valor) >= 0;
    }
    
    public static boolean existe(String vetor[], String valor, boolean ignoreCase){
        int c = 0;
        for (String v: vetor) {
            if(ignoreCase){
                if(v.equalsIgnoreCase(valor)){
                    c++;
                }
            }else{
                if(v.equals(valor)){
                    c++;
                }
            }
        }
        return c > 0;
    }
    
    public static boolean existe(byte vetor[], byte valor){
        return Arrays.binarySearch(vetor, valor) >= 0;
    }
    
    public static boolean existe(short vetor[], short valor){
        return Arrays.binarySearch(vetor, valor) >= 0;
    }
    
    public static boolean existe(int vetor[], int valor){
        return Arrays.binarySearch(vetor, valor) >= 0;
    }
    
    public static boolean existe(long vetor[], long valor){
        return Arrays.binarySearch(vetor, valor) >= 0;
    }
    
    public static boolean existe(float vetor[], float valor){
        return Arrays.binarySearch(vetor, valor) >= 0;
    }
    
    public static boolean existe(double vetor[], double valor){
        return Arrays.binarySearch(vetor, valor) >= 0;
    }
    //Fim dos métodos de procura
}
