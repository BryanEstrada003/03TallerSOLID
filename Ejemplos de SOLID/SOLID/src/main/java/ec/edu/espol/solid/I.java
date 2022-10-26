/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.solid;

/**
 *
 * @author sam sung
 */
public class I {
    
// se realiza un sistema educativo donde al iniciar sesion se muestra la informacion de los usuarios
    
    /**
     * CODIGO QUE VIOLA EL PRINCIPIO
    class SistemaAcademico{
        void mostrarInformacion(){
            //codigo que muestra la informacion al iniciar sesion
        };
    };
    
    class Estudiante extends SistemaAcademico{
        @Override
        void mostrarInformacion(){
            //codigo que muestra la informacion al iniciar sesion
        };
    };
    class Maestro extends SistemaAcademico{
        @Override
        void mostrarInformacion(){
            //codigo que muestra la informacion al iniciar sesion
        };
    };
    */
    
    interface SistemaAcademicoEstudiantil{
        //...
        void mostrarInformacionEstudiante();
        //...
    };
    interface SistemaAcademicoProfesor{
        //...
        void mostrarInformacionProfesor();
        //...
    };
    
    class Estudiante implements SistemaAcademicoEstudiantil{
        //...
        @Override
        public void mostrarInformacionEstudiante(){};
        //...
    };
    class Maestro implements SistemaAcademicoProfesor{
        //...
        @Override
        public void mostrarInformacionProfesor(){};
        //...
    };
}
