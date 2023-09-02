/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package universidad.estudiantes;

/**
 *
 * @author elite
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        Estudiante estudianteA = new Estudiante();
        Estudiante estudianteB = new Estudiante();
        Estudiante estudianteC = new Estudiante();
        
        estudianteA.Estudiante("Martha" , 10018, "IC", "Femenino",11114444);
        estudianteB.Estudiante("William" , 10025, "IC", "Masculino", 22223333);
        estudianteC.Estudiante("David" , 10027, "IC", "Masculino", 55557777);
        
        
        System.out.println(estudianteA.toString());
        System.out.println(estudianteB.toString());
        System.out.println(estudianteC.toString());
        
        estudianteC.setNombre("Carlos");
        estudianteC.setId(10096);
        estudianteC.setCarrera("IM");
        estudianteC.setTelefono(88889999);
        
        System.out.println(estudianteC.toString());
        
    }
}
