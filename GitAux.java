
package prgitejemplo;

/**
 *
 * @author Miguel
 */
public class GitAux {
    
    public void metodoAlumno1(){
	//Imprime el primer metodo
        System.out.println("metodo 1");
	System.out.println("modificado por alumno1"); // alumno 1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	//modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
    }
    
    public void testGitAux(){
	//metodo rama testing
	System.out.println("Metodo de testing");
    }
}
