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
        
        /*Estudiante estudianteA = new Estudiante();
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
        */
        
 
        
        // crea variable de referencia para objetos Lista Estudiante
        ListaEstudiante listaEstudiante;
        // crea objeto para la lista
        listaEstudiante = new ListaEstudiante();
        
        // crea los 3 objetos indicados en práctica anterior
        Estudiante estudianteA = new Estudiante();
        Estudiante estudianteB = new Estudiante();
        Estudiante estudianteC = new Estudiante();
        
        estudianteA.Estudiante("Martha" , 10018, "IC", "Femenino",11114444);
        estudianteB.Estudiante("William" , 10025, "IC", "Masculino", 22223333);
        estudianteC.Estudiante("David" , 10027, "IC", "Masculino", 55557777);
        
        //  agrega a la lista de objetos
        listaEstudiante.agregarAListaEstudiante(estudianteA);
        listaEstudiante.agregarAListaEstudiante(estudianteB);
        listaEstudiante.agregarAListaEstudiante(estudianteC);
        
        // prueba que no se agreguen a la lista identificaciones repetidas
        boolean agregado = listaEstudiante.agregarAListaEstudiante(estudianteB);
        
        if (agregado) {
            System.out.println("Estudiante B se agregó a la lista");
        } else {
            System.out.println("Estudiante B no se pudo agregar a la lista: identificación repetida");
        }
        
        // despliega la información de cada estudiante en la lista
        System.out.println("Información de estudiantes:");
        listaEstudiante.desplegarListaEstudiante();
        
        // elimina de la lista un objeto
        boolean eliminado = listaEstudiante.eliminarDeLaListaEstudiante(estudianteC);
        
        if (eliminado) {
            System.out.println("Estudiante C se eliminó");
        } else {
            System.out.println("Estudiante C no se pudo eliminar");
        }
        
        // prueba que no se traten de eliminar de la lista identificaciones que no existen
         Estudiante estudianteE = new Estudiante();
         estudianteE.Estudiante("Eduardo", 10100, "IM", "Masculino", 77778888);
        eliminado = listaEstudiante.eliminarDeLaListaEstudiante(estudianteE);
        
        if (eliminado) {
            System.out.println("Estudiante E se eliminó");
        } else {
            System.out.println("Estudiante E no se pudo eliminar: no está en la lista");
        }
        
        System.out.println("Información de estudiantes después de la eliminación:");
        listaEstudiante.desplegarListaEstudiante();
    }
}
