package UTN.TP4_GRUPO_15;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import UTN.TP4_GRUPO_15.entidad.Especialidad;
import UTN.TP4_GRUPO_15.entidad.Medico;
import UTN.TP4_GRUPO_15.entidad.Paciente;
import UTN.TP4_GRUPO_15.entidad.Usuario;
import UTN.TP4_GRUPO_15.negocio.especialidadNegocio;
import UTN.TP4_GRUPO_15.negocio.medicoNegocio;
import UTN.TP4_GRUPO_15.negocio.pacienteNegocio;
import UTN.TP4_GRUPO_15.negocio.turnoNegocio;
import UTN.TP4_GRUPO_15.negocio.usuarioNegocio;
import UTN.TP4_GRUPO_15.entidad.Turno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;


/**
 * Hola Mundo!
 *
 */
public class App 
{
	static ApplicationContext appContext;
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println( "ABM Medicos / Turnos" );
    	System.out.println( "Opcion 1 - Altas" );
    	System.out.println( "Opcion 2 - Modificacion" );
    	System.out.println( "Opcion 3 - Borrado" );
    	System.out.println( "Opcion 4 - Listar" );
    	System.out.println( "-------------------------------------------------------" );
    	System.out.println( "Opcion 5 - Listar médicos de forma ascendente" );
    	System.out.println( "Opcion 6 - Listar médicos de forma descendente" );
    	System.out.println( "Opcion 7 - Listar turnos del médico con legajo 1234" );
    	System.out.println( "Opcion 8 - Listar todos los legajos de los médicos" );
    	System.out.println( "Opcion 9 - Mostrar médico con mayor número de legajo" );
    	System.out.println( "Opcion 10 - Mostrar porcentajes de estados presente y ausente entre 2024-01-01 - 2024-03-01" );
    	System.out.println( "Opcion 11 - Uso de Beans pra la clase usuario" );
    	System.out.println( "Opcion 12 - Uso de Beans pra la clase medico" );
    	System.out.println( "Seleccionar Opcion: " );
    	
    	int opcion = sc.nextInt();
    	sc.nextLine(); //Agregado para evitar saltar el nombre
    	
    	System.out.println( "El dato ingresado es: " +  opcion);
    	
    	switch(opcion){
    	
    	case 1:
    		
    		
    		
    		//Creación de usuarios
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		usuarioNegocio usuarioNegocio = (usuarioNegocio) appContext.getBean("beanUsuarioNegocio");

    		Usuario usuario1 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario2 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario3 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario4 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario5 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario6 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario7 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario8 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario9 = (Usuario) appContext.getBean("beanUsuario");
    		Usuario usuario10 = (Usuario) appContext.getBean("beanUsuario");

    		usuario1.setUsuario("UserGonzalo");
    		usuario1.setContrasenia("123");
    		usuario1.setActivo(true);
    		usuario2.setUsuario("UserGaston");
    		usuario2.setContrasenia("123");
    		usuario2.setActivo(true);
    		usuario3.setUsuario("UserLeonel");
    		usuario3.setContrasenia("123");
    		usuario3.setActivo(true);	
    		usuario4.setUsuario("UserLaura");
    		usuario4.setContrasenia("123");
    		usuario4.setActivo(true);
    		usuario5.setUsuario("UserGuido");
    		usuario5.setContrasenia("123");
    		usuario5.setActivo(true);
    		usuario6.setUsuario("UserWalter");
    		usuario6.setContrasenia("123");
    		usuario6.setActivo(true);
    		usuario7.setUsuario("UserTamara");
    		usuario7.setContrasenia("123");
    		usuario7.setActivo(true);
    		usuario8.setUsuario("UserPepito");
    		usuario8.setContrasenia("123");
    		usuario8.setActivo(true);
    		usuario9.setUsuario("UserPepita");
    		usuario9.setContrasenia("123");
    		usuario9.setActivo(true);
    		usuario10.setUsuario("UserJuan");
    		usuario10.setContrasenia("123");
    		usuario10.setActivo(true);

    		
    		System.out.println(usuarioNegocio.create(usuario1));
    		System.out.println(usuarioNegocio.create(usuario2));
    		System.out.println(usuarioNegocio.create(usuario3));
    		System.out.println(usuarioNegocio.create(usuario4));
    		System.out.println(usuarioNegocio.create(usuario5));
    		System.out.println(usuarioNegocio.create(usuario6));
    		System.out.println(usuarioNegocio.create(usuario7));
    		System.out.println(usuarioNegocio.create(usuario8));
    		System.out.println(usuarioNegocio.create(usuario9));
    		System.out.println(usuarioNegocio.create(usuario10));

    		
    		//Creación de especialidades
    		
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		Especialidad especialidad1 = (Especialidad)appContext.getBean("beanEspecialidad");
    		
    		Especialidad especialidad2 = (Especialidad)appContext.getBean("beanEspecialidad");
    		especialidad2.setNombre("Cardiologo");
    		especialidad2.setActivo(false);
    		
    		Especialidad especialidad3 = (Especialidad)appContext.getBean("beanEspecialidad");
    		especialidad3.setNombre("Neurologo");
    		especialidad3.setActivo(true);
    		
    		
    		System.out.println(new especialidadNegocio().create(especialidad1));
    		System.out.println(new especialidadNegocio().create(especialidad2));
    		System.out.println(new especialidadNegocio().create(especialidad3));
    		/*
    		Especialidad especialidad1 = new Especialidad("Clinico", true);
    		Especialidad especialidad2 = new Especialidad("Cardiologo", true);
    		Especialidad especialidad3 = new Especialidad("Nefrologo", true);
    		
    		System.out.println(new especialidadNegocio().create(especialidad1));
    		System.out.println(new especialidadNegocio().create(especialidad2));
    		System.out.println(new especialidadNegocio().create(especialidad3));
    		*/

    		//Creación de medicos
    		
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		
    		Medico medico01 = (Medico)appContext.getBean("beanMedico");
    		//medico01.setUsuario(usuario1);
    		//medico01.setEspecialidad(especialidad1);
    		
    		Medico medico02 = (Medico)appContext.getBean("beanMedico");
    		medico02.setLegajo(1111);
    		medico02.setNombre("Gaston");
    		medico02.setApellido("Argañaz");
    		medico02.setGenero("Masculino");
    		medico02.setNac("01/06/1996");
    		medico02.setCorreo("gaston@prueba.com");
    		medico02.setDireccion("falsa 222");
    		medico02.setLocalidad("Pacheco");
    		medico02.setTelefono("11-12229");
    		medico02.setUsuario(usuario2);
    		medico02.setEspecialidad(especialidad2);
    		medico02.setDiasAtencion("Lunes,Martes");
    		medico02.setHorariosAtencion("16:00-21:00");
    		
    		System.out.println(new medicoNegocio().create(medico01));
    		System.out.println(new medicoNegocio().create(medico02));
    		/*
    		Medico medico01 = new Medico(1234, "Gonzalo", "Alderete", "Masculino", "12/02/1996", "gonzalo@prueba.com", "falsa 111", "Pacheco", "11-12229", usuario1, especialidad1, true);
    		Medico medico02 = new Medico(1111, "Gaston", "Argañaz", "Masculino", "01/06/1996", "gaston@prueba.com", "falsa 222", "Pacheco", "11-12229", usuario2, especialidad1, true);
    		Medico medico03 = new Medico(2222, "Leonel", "Herrera", "Masculino", "30/12/2000", "leonel@prueba.com", "falsa 333", "Pacheco", "11-12229", usuario3, especialidad1, true);
    		Medico medico04 = new Medico(3333, "Guido", "Romero", "Masculino", "11/02/2001", "guido@prueba.com", "falsa 444", "Pacheco", "11-12229", usuario4, especialidad2, true);
    		Medico medico05 = new Medico(4444, "Walter", "Pizzo", "Masculino", "29/02/1998", "walter@prueba.com", "falsa 555", "Pacheco", "11-12229", usuario5, especialidad3, true);
    		Medico medico06 = new Medico(5555, "Tamara", "Herrera", "Femenina", "14/05/2000", "tamara@prueba.com", "falsa 666", "Pacheco", "11-12229", usuario6, especialidad3, true);
    		Medico medico07 = new Medico(6666, "Pepito", "Perez", "Masculino", "12/02/1996", "pepito@prueba.com", "falsa 777", "Pacheco", "11-12229", usuario7, especialidad2, true);
    		Medico medico08 = new Medico(7777, "Pepita", "Perez", "Femenina", "04/04/1999", "pepita@prueba.com", "falsa 888", "Pacheco", "11-12229", usuario8, especialidad1, true);
    		Medico medico09 = new Medico(8888, "Juan", "Diaz", "Masculino", "12/02/1996", "juan@prueba.com", "falsa 999", "Pacheco", "11-12229", usuario9, especialidad1, true);
    		Medico medico10 = new Medico(9999, "Laura", "Morales", "Femenina", "02/12/2000", "laura@prueba.com", "falsa 321", "Pacheco", "11-12229", usuario10, especialidad3, true);
			
    		
    		System.out.println(new medicoNegocio().create(medico01));
    		System.out.println(new medicoNegocio().create(medico02));
    		System.out.println(new medicoNegocio().create(medico03));
    		System.out.println(new medicoNegocio().create(medico04));
    		System.out.println(new medicoNegocio().create(medico05));
    		System.out.println(new medicoNegocio().create(medico06));
    		System.out.println(new medicoNegocio().create(medico07));
    		System.out.println(new medicoNegocio().create(medico08));
    		System.out.println(new medicoNegocio().create(medico09));
    		System.out.println(new medicoNegocio().create(medico10));
    		*/
    		
    		// Creación de pacientes
    		
    		/*
    		Paciente paciente1 = new Paciente("María", "González", "123456789", "1234567890", "Calle Falsa 123", "Ciudad", "Provincia", LocalDate.of(1980, 5, 15), "maria@example.com", true);
    		Paciente paciente2 = new Paciente("Juan", "Martínez", "987654321", "0987654321", "Av. Libertador 456", "Otra Ciudad", "Otra Provincia", LocalDate.of(1975, 10, 8), "juan@example.com", true);
    		Paciente paciente3 = new Paciente("Luis", "López", "456789123", "0123456789", "Av. Rivadavia 789", "Otra Ciudad", "Otra Provincia", LocalDate.of(1990, 12, 20), "luis@example.com", true);
    		Paciente paciente4 = new Paciente("Ana", "Rodríguez", "789123456", "6789012345", "Av. Belgrano 101", "Otra Ciudad", "Otra Provincia", LocalDate.of(1985, 7, 3), "ana@example.com",true);
    		Paciente paciente5 = new Paciente("Carlos", "Sánchez", "321654987", "5432109876", "Calle Principal 555", "Otra Ciudad", "Otra Provincia", LocalDate.of(1970, 3, 28), "carlos@example.com", true);
    		Paciente paciente6 = new Paciente("Laura", "Díaz", "654987321", "9876543210", "Av. Corrientes 222", "Otra Ciudad", "Otra Provincia", LocalDate.of(1982, 8, 12), "laura@example.com", true);
    		Paciente paciente7 = new Paciente("José", "Gómez", "159753468", "1597534680", "Av. San Martín 333", "Otra Ciudad", "Otra Provincia", LocalDate.of(1978, 6, 5), "jose@example.com", true);
    		Paciente paciente8 = new Paciente("Lucía", "Pérez", "753951852", "7539518520", "Av. Santa Fe 777", "Otra Ciudad", "Otra Provincia", LocalDate.of(1995, 9, 17), "lucia@example.com", true);
    		Paciente paciente9 = new Paciente("Pedro", "Fernández", "258369147", "2583691470", "Calle Mayor 999", "Otra Ciudad", "Otra Provincia", LocalDate.of(1987, 2, 9), "pedro@example.com", true);
    		Paciente paciente10 = new Paciente("Sofía", "Álvarez", "147258369", "1472583690", "Av. 9 de Julio 666", "Otra Ciudad", "Otra Provincia", LocalDate.of(1993, 11, 30), "sofia@example.com", true);
			*/
    		
    		
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		pacienteNegocio pacienteNegocio = (pacienteNegocio) appContext.getBean("beanPacienteNegocio");
    		
    		Paciente paciente1 = (Paciente) appContext.getBean("beanPaciente");
    		
    		paciente1.setApellido("González");
    		paciente1.setNombre("María");
    		paciente1.setCorreo("maria@example.com");
    		paciente1.setDni("123456");
    		paciente1.setLocalidad("San Fernando");
    		paciente1.setProvincia("Buenos Aires");
    		paciente1.setTelefono("44444");
    		paciente1.setFechaNacimiento(LocalDate.of(1980, 5, 15));
    		
    		// Creación de turnos
    		
    		
    		Turno turno1 = new Turno(medico01, paciente1, LocalDate.of(2024, 01, 11), LocalTime.of(14, 01), "observación1", "presente", true);
    		Turno turno2 = new Turno(medico01, paciente1, LocalDate.of(2024, 01, 01), LocalTime.of(14, 01), "observación2", "ausente", true);
    		Turno turno3 = new Turno(medico01, paciente1, LocalDate.of(2024, 02, 12), LocalTime.of(14, 01), "observación3", "ausente", true);
    		Turno turno4 = new Turno(medico01, paciente1, LocalDate.of(2024, 01, 01), LocalTime.of(14, 01), "observación4", "ausente", true);
    		/*
    		Turno turno5 = new Turno(medico05, paciente5, LocalDate.of(2024, 02, 13), LocalTime.of(14, 01), "observación5", "presente", true);
    		Turno turno6 = new Turno(medico06, paciente6, LocalDate.of(2024, 01, 13), LocalTime.of(14, 01), "observación6", "presente", true);
    		Turno turno7 = new Turno(medico07, paciente7, LocalDate.of(2024, 02, 14), LocalTime.of(14, 01), "observación7", "presente", true);
    		Turno turno8 = new Turno(medico08, paciente8, LocalDate.of(2024, 01, 14), LocalTime.of(14, 01), "observación8", "presente", true);
    		Turno turno9 = new Turno(medico09, paciente9, LocalDate.of(2024, 04, 15), LocalTime.of(14, 01), "observación9", "ausente", true);
    		Turno turno10 = new Turno(medico10, paciente10, LocalDate.of(2024, 01, 15), LocalTime.of(14, 01), "observación10", "presente", true);
    		 */
    		
    		
    		
    		/*
    		Turno turno1 = new Turno(medico01, paciente1, LocalDate.of(2024, 01, 11), "14:00", "observación1", "presente");
    		Turno turno2 = new Turno(medico01, paciente2, LocalDate.of(2024, 01, 01), "14:00", "observación2", "ausente");
    		Turno turno3 = new Turno(medico01, paciente3, LocalDate.of(2024, 02, 12), "14:00", "observación3", "ausente");
    		Turno turno4 = new Turno(medico01, paciente4, LocalDate.of(2024, 01, 01), "14:00", "observación4", "ausente");
    		Turno turno5 = new Turno(medico05, paciente5, LocalDate.of(2024, 02, 13), "14:00", "observación5", "presente");
    		Turno turno6 = new Turno(medico06, paciente6, LocalDate.of(2024, 01, 13), "14:00", "observación6", "presente");
    		Turno turno7 = new Turno(medico07, paciente7, LocalDate.of(2024, 02, 14), "14:00", "observación7", "presente");
    		Turno turno8 = new Turno(medico08, paciente8, LocalDate.of(2024, 01, 14), "14:00", "observación8", "presente");
    		Turno turno9 = new Turno(medico09, paciente9, LocalDate.of(2024, 04, 15), "14:00", "observación9", "ausente");
    		Turno turno10 = new Turno(medico10, paciente10, LocalDate.of(2024, 01, 15), "14:00", "observación10", "presente");
    		*/
   
    		
    		
    		
    		
    		System.out.println(new turnoNegocio().create(turno1));
    		System.out.println(new turnoNegocio().create(turno2));
    		System.out.println(new turnoNegocio().create(turno3));
    		System.out.println(new turnoNegocio().create(turno4));
    		/*
    		System.out.println(new turnoNegocio().create(turno5));
    		System.out.println(new turnoNegocio().create(turno6));
    		System.out.println(new turnoNegocio().create(turno7));
    		System.out.println(new turnoNegocio().create(turno8));
    		System.out.println(new turnoNegocio().create(turno9));
    		System.out.println(new turnoNegocio().create(turno10));
    		*/
    		break;
    		
    	case 2:
    		Usuario usuario11 = new Usuario("Gonzalo", "123", true);
    		Especialidad especialidad4 = new Especialidad("Clinico", true);
    		Medico medicoUpdate = new Medico(1234, "Gonzalo", "Alderete", "Masculino", "12/02/1996", "gonzalo@prueba.com", "falsa 111", "Pacheco", "11-12229", usuario11, especialidad4, true, "Lunes,Martes", "18:00-23:00");
    		medicoUpdate.setLegajo(1);
    		String updateMedcio = new medicoNegocio().update(medicoUpdate);
    		
    		System.out.println(updateMedcio);
    		break;
    		
    		
    		
    	case 3:
    		/*
    		medicoController medicoDelete = new medicoController();
    		medicoDelete.delete(9);
    		*/
    		
    		especialidadNegocio especialidadNeg = new especialidadNegocio();
    		especialidadNeg.delete(5);
    		
    		break;
    		
    		
    		
    	case 4:
    		System.out.println( "Listado de médicos: " );

    		List<Medico> listMedicos = new medicoNegocio().listMedicos();
    		
    		for (Medico medico : listMedicos) {
    		    System.out.println(medico);
    		}
    		break;
    		
    	case 5:
    		new medicoNegocio().listMedicsAscending();
    		break;
    		
    	case 6:
    		new medicoNegocio().listMedicsDescending();
    		break;
    		
    	case 7:
			new turnoNegocio().listTurnosInnerJoin();
    		break;
    	case 8:
    		new medicoNegocio().listMedicsIds();
    		break;
    	case 9:
    		new medicoNegocio().listMedicWithHighestId();
    		break;
    	case 10:
        	new turnoNegocio().listTurnStatusPercentages();
    		break;
    		
    	case 11:
    		//Listar usuarios con spring core
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		Especialidad esp01 = (Especialidad)appContext.getBean("beanEspecialidad");
    		
    		Especialidad esp02 = (Especialidad)appContext.getBean("beanEspecialidad");
    		esp02.setNombre("Cardiologo");
    		esp02.setActivo(false);
    		
    		Especialidad esp03 = (Especialidad)appContext.getBean("beanEspecialidad");
    		esp03.setNombre("Neurologo");
    		esp03.setActivo(true);
    		
    		System.out.println(esp01.toString());
    		System.out.println(esp02.toString());
    		System.out.println(esp03.toString());
    		break;
    		
    	case 12:
    		/*
    		ApplicationContext appcontext02 = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		Medico medic01 = (Medico)appcontext02.getBean("beanMedico");
    		System.out.println(medic01.toString());
    		
    		*/
    		
    		ApplicationContext appcontext02 = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		Medico medic01 = (Medico)appcontext02.getBean("beanControladorMedico");
    		System.out.println(medic01.toString());
    		
    		break;
    	}
    }
}
