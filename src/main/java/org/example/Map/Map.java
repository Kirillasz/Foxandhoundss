package org.example.Map;

    public class Map {
        public static void main() {
            int szam=0;
            int[][] twoDimArray = new int[8][8];
            for (int i=0; i<twoDimArray.length; i++) {
                for (int j=0; j<twoDimArray[i].length; j++) {
                    twoDimArray[i][j] = szam;

                    System.out.print( ""+ twoDimArray[i][j]);
                }
                System.out.println("");
            }
        }
    }

