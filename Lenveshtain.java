
package json1;

public class Lenveshtain {
   
  public  int  Lenvesht( String s1, String s2 ) {
    return dist( s1.toCharArray(), s2.toCharArray() );
}

public  int dist( char[] s1, char[] s2 ) {

    // distance matrix - to memoize distances between substrings
    // needed to avoid recursion
    int[][] d = new int[ s1.length + 1 ][ s2.length + 1 ];

    // d[i][j] - would contain distance between such substrings:
    // s1.subString(0, i) and s2.subString(0, j)

    for( int i = 0; i < s1.length + 1; i++ ) {
        d[ i ][ 0 ] = i;
    }

    for(int j = 0; j < s2.length + 1; j++) {
        d[ 0 ][ j ] = j;
    }
     int  cost=0;
    for( int i = 1; i < s1.length + 1; i++ ) {
        for( int j = 1; j < s2.length + 1; j++ ) {
           
            if ( s1[ i - 1 ] == s2[ j - 1 ] ) {
             cost=0;
            }else
            {
                cost=1;
            }
            d[ i ][ j ] = Math.min( Math.min(d[i-1][j]+1, d[i][j-1]+1), d[i-1][j-1])+cost;
            
        }
    }
    
    return d[ s1.length ][ s2.length ];
}

    public  int min(int a, int b, int c) {
          return Math.min(Math.min(a, b), c);
    }    


    }
