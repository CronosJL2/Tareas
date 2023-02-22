package e521;

public class pitagoras2 {

public int Tamano = 500;
public void Pitagoras()
{  
  
System.out.print("\nEste programa prueba e imprime todas las ternas");
System.out.printf(" pitagoricas para numeros no mayores que %d ", Tamano);
System.out.print(" mediante la fuerza bruta.\n");

for ( int i = 1; i <= Tamano; i++ )
for ( int j = 1; j <= Tamano; j++ )
for ( int k = 1; k <= Tamano; k++ )
{       
if ( i*i == j*j + k*k )
System.out.printf("%3d\t%3d\t%3d\n", i, j, k);
}

} 
}
