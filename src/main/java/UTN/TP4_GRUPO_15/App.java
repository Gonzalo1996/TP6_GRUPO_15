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

    		//Creación de medicos
    		
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		
    		Medico medico1 = (Medico)appContext.getBean("beanMedico");
    		//medico01.setUsuario(usuario1);
    		//medico01.setEspecialidad(especialidad1);
    		
    		Medico medico2 = (Medico)appContext.getBean("beanMedico");
    		medico2.setLegajo(1111);
    		medico2.setNombre("Gaston");
    		medico2.setApellido("Argañaz");
    		medico2.setGenero("Masculino");
    		medico2.setNac("01/06/1996");
    		medico2.setCorreo("gaston@prueba.com");
    		medico2.setDireccion("falsa 222");
    		medico2.setLocalidad("Pacheco");
    		medico2.setTelefono("11-12229");
    		medico2.setUsuario(usuario2);
    		medico2.setEspecialidad(especialidad2);
    		medico2.setDiasAtencion("Lunes,Martes");
    		medico2.setHorariosAtencion("16:00-21:00");
    		
    		Medico medico3 = (Medico) appContext.getBean("beanMedico");
    		medico3.setLegajo(1003);
    		medico3.setNombre("Ana");
    		medico3.setApellido("González");
    		medico3.setGenero("Femenino");
    		medico3.setNac("20/11/1985");
    		medico3.setCorreo("ana.gonzalez@prueba.com");
    		medico3.setDireccion("Calle Falsa 456");
    		medico3.setLocalidad("Tigre");
    		medico3.setTelefono("11-33333");
    		medico3.setUsuario(usuario3);
    		medico3.setEspecialidad(especialidad3);
    		medico3.setDiasAtencion("Martes,Jueves");
    		medico3.setHorariosAtencion("09:00-15:00");

    		Medico medico4 = (Medico) appContext.getBean("beanMedico");
    		medico4.setLegajo(1004);
    		medico4.setNombre("José");
    		medico4.setApellido("Martínez");
    		medico4.setGenero("Masculino");
    		medico4.setNac("05/03/1975");
    		medico4.setCorreo("jose.martinez@prueba.com");
    		medico4.setDireccion("Calle Falsa 789");
    		medico4.setLocalidad("San Isidro");
    		medico4.setTelefono("11-44444");
    		medico4.setUsuario(usuario4);
    		medico4.setEspecialidad(especialidad1);
    		medico4.setDiasAtencion("Miércoles,Viernes");
    		medico4.setHorariosAtencion("10:00-16:00");

    		Medico medico5 = (Medico) appContext.getBean("beanMedico");
    		medico5.setLegajo(1005);
    		medico5.setNombre("Lucía");
    		medico5.setApellido("Fernández");
    		medico5.setGenero("Femenino");
    		medico5.setNac("14/02/1990");
    		medico5.setCorreo("lucia.fernandez@prueba.com");
    		medico5.setDireccion("Calle Falsa 101");
    		medico5.setLocalidad("Vicente López");
    		medico5.setTelefono("11-55555");
    		medico5.setUsuario(usuario5);
    		medico5.setEspecialidad(especialidad2);
    		medico5.setDiasAtencion("Lunes,Miércoles");
    		medico5.setHorariosAtencion("12:00-18:00");

    		Medico medico6 = (Medico) appContext.getBean("beanMedico");
    		medico6.setLegajo(1006);
    		medico6.setNombre("Sofía");
    		medico6.setApellido("García");
    		medico6.setGenero("Femenino");
    		medico6.setNac("18/07/1992");
    		medico6.setCorreo("sofia.garcia@prueba.com");
    		medico6.setDireccion("Calle Falsa 102");
    		medico6.setLocalidad("Morón");
    		medico6.setTelefono("11-66666");
    		medico6.setUsuario(usuario6);
    		medico6.setEspecialidad(especialidad3);
    		medico6.setDiasAtencion("Jueves,Viernes");
    		medico6.setHorariosAtencion("14:00-20:00");

    		Medico medico7 = (Medico) appContext.getBean("beanMedico");
    		medico7.setLegajo(1007);
    		medico7.setNombre("Juan");
    		medico7.setApellido("Rodríguez");
    		medico7.setGenero("Masculino");
    		medico7.setNac("22/08/1988");
    		medico7.setCorreo("juan.rodriguez@prueba.com");
    		medico7.setDireccion("Calle Falsa 103");
    		medico7.setLocalidad("La Plata");
    		medico7.setTelefono("11-77777");
    		medico7.setUsuario(usuario7);
    		medico7.setEspecialidad(especialidad1);
    		medico7.setDiasAtencion("Martes,Jueves");
    		medico7.setHorariosAtencion("08:00-14:00");

    		Medico medico8 = (Medico) appContext.getBean("beanMedico");
    		medico8.setLegajo(1008);
    		medico8.setNombre("Valentina");
    		medico8.setApellido("Sánchez");
    		medico8.setGenero("Femenino");
    		medico8.setNac("30/09/1993");
    		medico8.setCorreo("valentina.sanchez@prueba.com");
    		medico8.setDireccion("Calle Falsa 104");
    		medico8.setLocalidad("Quilmes");
    		medico8.setTelefono("11-88888");
    		medico8.setUsuario(usuario8);
    		medico8.setEspecialidad(especialidad2);
    		medico8.setDiasAtencion("Miércoles,Viernes");
    		medico8.setHorariosAtencion("09:00-15:00");

    		Medico medico9 = (Medico) appContext.getBean("beanMedico");
    		medico9.setLegajo(1009);
    		medico9.setNombre("Diego");
    		medico9.setApellido("Méndez");
    		medico9.setGenero("Masculino");
    		medico9.setNac("12/12/1970");
    		medico9.setCorreo("diego.mendez@prueba.com");
    		medico9.setDireccion("Calle Falsa 105");
    		medico9.setLocalidad("Berazategui");
    		medico9.setTelefono("11-99999");
    		medico9.setUsuario(usuario9);
    		medico9.setEspecialidad(especialidad3);
    		medico9.setDiasAtencion("Lunes,Martes");
    		medico9.setHorariosAtencion("16:00-21:00");

    		Medico medico10 = (Medico) appContext.getBean("beanMedico");
    		medico10.setLegajo(1010);
    		medico10.setNombre("Camila");
    		medico10.setApellido("Hernández");
    		medico10.setGenero("Femenino");
    		medico10.setNac("25/06/1982");
    		medico10.setCorreo("camila.hernandez@prueba.com");
    		medico10.setDireccion("Calle Falsa 106");
    		medico10.setLocalidad("Avellaneda");
    		medico10.setTelefono("11-101010");
    		medico10.setUsuario(usuario10);
    		medico10.setEspecialidad(especialidad1);
    		medico10.setDiasAtencion("Lunes,Miércoles");
    		medico10.setHorariosAtencion("10:00-16:00");
    		
    		
    		medicoNegocio medicoNegocio = (medicoNegocio) appContext.getBean("beanMedicoNegocio");
    		System.out.println(medicoNegocio.create(medico1));
    		System.out.println(medicoNegocio.create(medico2));
    		System.out.println(medicoNegocio.create(medico3));
    		System.out.println(medicoNegocio.create(medico4));
    		System.out.println(medicoNegocio.create(medico5));
    		System.out.println(medicoNegocio.create(medico6));
    		System.out.println(medicoNegocio.create(medico7));
    		System.out.println(medicoNegocio.create(medico8));
    		System.out.println(medicoNegocio.create(medico9));
    		System.out.println(medicoNegocio.create(medico10));

    		
    		
    		// Creación de pacientes
    		
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

    		Paciente paciente2 = (Paciente) appContext.getBean("beanPaciente");
    		paciente2.setApellido("Pérez");
    		paciente2.setNombre("Jesús");
    		paciente2.setCorreo("jesus@example.com");
    		paciente2.setDni("654321");
    		paciente2.setLocalidad("Tigre");
    		paciente2.setProvincia("Buenos Aires");
    		paciente2.setTelefono("55555");
    		paciente2.setFechaNacimiento(LocalDate.of(1985, 7, 20));

    		Paciente paciente3 = (Paciente) appContext.getBean("beanPaciente");
    		paciente3.setApellido("López");
    		paciente3.setNombre("Ana");
    		paciente3.setCorreo("ana@example.com");
    		paciente3.setDni("987654");
    		paciente3.setLocalidad("Pilar");
    		paciente3.setProvincia("Buenos Aires");
    		paciente3.setTelefono("66666");
    		paciente3.setFechaNacimiento(LocalDate.of(1990, 3, 10));

    		Paciente paciente4 = (Paciente) appContext.getBean("beanPaciente");
    		paciente4.setApellido("Martínez");
    		paciente4.setNombre("Carlos");
    		paciente4.setCorreo("carlos@example.com");
    		paciente4.setDni("321654");
    		paciente4.setLocalidad("San Isidro");
    		paciente4.setProvincia("Buenos Aires");
    		paciente4.setTelefono("77777");
    		paciente4.setFechaNacimiento(LocalDate.of(1975, 11, 25));

    		Paciente paciente5 = (Paciente) appContext.getBean("beanPaciente");
    		paciente5.setApellido("Fernández");
    		paciente5.setNombre("Lucía");
    		paciente5.setCorreo("lucia@example.com");
    		paciente5.setDni("789123");
    		paciente5.setLocalidad("Vicente López");
    		paciente5.setProvincia("Buenos Aires");
    		paciente5.setTelefono("88888");
    		paciente5.setFechaNacimiento(LocalDate.of(1995, 2, 5));

    		Paciente paciente6 = (Paciente) appContext.getBean("beanPaciente");
    		paciente6.setApellido("García");
    		paciente6.setNombre("Sofía");
    		paciente6.setCorreo("sofia@example.com");
    		paciente6.setDni("456789");
    		paciente6.setLocalidad("Morón");
    		paciente6.setProvincia("Buenos Aires");
    		paciente6.setTelefono("99999");
    		paciente6.setFechaNacimiento(LocalDate.of(2000, 12, 30));

    		Paciente paciente7 = (Paciente) appContext.getBean("beanPaciente");
    		paciente7.setApellido("Rodríguez");
    		paciente7.setNombre("Juan");
    		paciente7.setCorreo("juan@example.com");
    		paciente7.setDni("147258");
    		paciente7.setLocalidad("La Plata");
    		paciente7.setProvincia("Buenos Aires");
    		paciente7.setTelefono("101010");
    		paciente7.setFechaNacimiento(LocalDate.of(1988, 8, 18));

    		Paciente paciente8 = (Paciente) appContext.getBean("beanPaciente");
    		paciente8.setApellido("Sánchez");
    		paciente8.setNombre("Valentina");
    		paciente8.setCorreo("valentina@example.com");
    		paciente8.setDni("369852");
    		paciente8.setLocalidad("Quilmes");
    		paciente8.setProvincia("Buenos Aires");
    		paciente8.setTelefono("11111");
    		paciente8.setFechaNacimiento(LocalDate.of(1993, 9, 9));

    		Paciente paciente9 = (Paciente) appContext.getBean("beanPaciente");
    		paciente9.setApellido("Méndez");
    		paciente9.setNombre("Diego");
    		paciente9.setCorreo("diego@example.com");
    		paciente9.setDni("258369");
    		paciente9.setLocalidad("Berazategui");
    		paciente9.setProvincia("Buenos Aires");
    		paciente9.setTelefono("121212");
    		paciente9.setFechaNacimiento(LocalDate.of(1970, 4, 22));

    		Paciente paciente10 = (Paciente) appContext.getBean("beanPaciente");
    		paciente10.setApellido("Hernández");
    		paciente10.setNombre("Camila");
    		paciente10.setCorreo("camila@example.com");
    		paciente10.setDni("369147");
    		paciente10.setLocalidad("Avellaneda");
    		paciente10.setProvincia("Buenos Aires");
    		paciente10.setTelefono("131313");
    		paciente10.setFechaNacimiento(LocalDate.of(1982, 6, 16));
    		
    		

    		
    		// Creación de turnos
    		
    		
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		turnoNegocio turnoNegocio = (turnoNegocio) appContext.getBean("beanTurnoNegocio");
    		
    
    		Turno turno1 = (Turno) appContext.getBean("beanTurno");
    		turno1.setMedico(medico1);
    		turno1.setPaciente(paciente1);
    		turno1.setFecha(LocalDate.of(2024, 1, 11));
    		turno1.setHora(LocalTime.of(14, 1));
    		turno1.setObservacion("observación1");
    		turno1.setEstado("presente");
    		turno1.setActivo(true);

    		Turno turno2 = (Turno) appContext.getBean("beanTurno");
    		turno2.setMedico(medico2);
    		turno2.setPaciente(paciente7);
    		turno2.setFecha(LocalDate.of(2024, 1, 1));
    		turno2.setHora(LocalTime.of(14, 1));
    		turno2.setObservacion("observación2");
    		turno2.setEstado("ausente");
    		turno2.setActivo(true);

    		Turno turno3 = (Turno) appContext.getBean("beanTurno");
    		turno3.setMedico(medico3);
    		turno3.setPaciente(paciente6);
    		turno3.setFecha(LocalDate.of(2024, 2, 12));
    		turno3.setHora(LocalTime.of(14, 1));
    		turno3.setObservacion("observación3");
    		turno3.setEstado("ausente");
    		turno3.setActivo(true);

    		Turno turno4 = (Turno) appContext.getBean("beanTurno");
    		turno4.setMedico(medico4);
    		turno4.setPaciente(paciente8);
    		turno4.setFecha(LocalDate.of(2024, 1, 1));
    		turno4.setHora(LocalTime.of(14, 1));
    		turno4.setObservacion("observación4");
    		turno4.setEstado("ausente");
    		turno4.setActivo(true);

    		Turno turno5 = (Turno) appContext.getBean("beanTurno");
    		turno5.setMedico(medico5);
    		turno5.setPaciente(paciente1);
    		turno5.setFecha(LocalDate.of(2024, 2, 13));
    		turno5.setHora(LocalTime.of(14, 1));
    		turno5.setObservacion("observación5");
    		turno5.setEstado("presente");
    		turno5.setActivo(true);

    		Turno turno6 = (Turno) appContext.getBean("beanTurno");
    		turno6.setMedico(medico6);
    		turno6.setPaciente(paciente6);
    		turno6.setFecha(LocalDate.of(2024, 1, 13));
    		turno6.setHora(LocalTime.of(14, 1));
    		turno6.setObservacion("observación6");
    		turno6.setEstado("presente");
    		turno6.setActivo(true);

    		Turno turno7 = (Turno) appContext.getBean("beanTurno");
    		turno7.setMedico(medico7);
    		turno7.setPaciente(paciente7);
    		turno7.setFecha(LocalDate.of(2024, 2, 14));
    		turno7.setHora(LocalTime.of(14, 1));
    		turno7.setObservacion("observación7");
    		turno7.setEstado("presente");
    		turno7.setActivo(true);

    		Turno turno8 = (Turno) appContext.getBean("beanTurno");
    		turno8.setMedico(medico8);
    		turno8.setPaciente(paciente8);
    		turno8.setFecha(LocalDate.of(2024, 1, 14));
    		turno8.setHora(LocalTime.of(14, 1));
    		turno8.setObservacion("observación8");
    		turno8.setEstado("presente");
    		turno8.setActivo(true);

    		Turno turno9 = (Turno) appContext.getBean("beanTurno");
    		turno9.setMedico(medico9);
    		turno9.setPaciente(paciente9);
    		turno9.setFecha(LocalDate.of(2024, 4, 15));
    		turno9.setHora(LocalTime.of(14, 1));
    		turno9.setObservacion("observación9");
    		turno9.setEstado("ausente");
    		turno9.setActivo(true);

    		Turno turno10 = (Turno) appContext.getBean("beanTurno");
    		turno10.setMedico(medico10);
    		turno10.setPaciente(paciente10);
    		turno10.setFecha(LocalDate.of(2024, 1, 15));
    		turno10.setHora(LocalTime.of(14, 1));
    		turno10.setObservacion("observación10");
    		turno10.setEstado("presente");
    		turno10.setActivo(true);
    
    		
    			
    		System.out.println(turnoNegocio.create(turno1));
    		System.out.println(turnoNegocio.create(turno2));
    		System.out.println(turnoNegocio.create(turno3));
    		System.out.println(turnoNegocio.create(turno4));
    		System.out.println(turnoNegocio.create(turno5));
    		System.out.println(turnoNegocio.create(turno6));
    		System.out.println(turnoNegocio.create(turno7));
    		System.out.println(turnoNegocio.create(turno8));
    		System.out.println(turnoNegocio.create(turno9));
    		System.out.println(turnoNegocio.create(turno10));

    		break;
    		
    	case 2:
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		Usuario usuario11 = (Usuario) appContext.getBean("beanUsuario");
    		usuario11.setUsuario("Gonzalo");
    		usuario11.setContrasenia("123");
    		usuario11.setActivo(true);
    		
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		Especialidad especialidad4 = (Especialidad) appContext.getBean("beanEspecialidad");
    		especialidad4.setNombre("Clínico");
    		especialidad4.setActivo(true);
    		
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		Medico medicoUpdate = (Medico) appContext.getBean("beanMedico");
    		medicoUpdate.setNombre("Gonzalo");
    		medicoUpdate.setApellido("Alderete");
    		medicoUpdate.setGenero("Masculino");
    		medicoUpdate.setNac("12/02/1996");
    		medicoUpdate.setCorreo("gonzalo@prueba.com");
    		medicoUpdate.setDireccion("falsa 111");
    		medicoUpdate.setLocalidad("Pacheco");
    		medicoUpdate.setTelefono("11-12229");
    		medicoUpdate.setUsuario(usuario11);
    		medicoUpdate.setEspecialidad(especialidad4);
    		medicoUpdate.setActivo(true);
    		medicoUpdate.setDiasAtencion("Lunes,Martes");
    		medicoUpdate.setHorariosAtencion("18:00-23:00");
    		medicoUpdate.setLegajo(1234);
    		
    		medicoNegocio medNeg = (medicoNegocio) appContext.getBean("beanMedicoNegocio");
    		String updateMedcio = medNeg.update(medicoUpdate);
    		
    		System.out.println(updateMedcio);
    		break;
    		
    		
    		
    	case 3:
    		/*
    		medicoController medicoDelete = nsew medicoController();
    		medicoDelete.delete(9);
    		*/
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		especialidadNegocio especialidadNegocio = (especialidadNegocio) appContext.getBean("beanEspecialidadNegocio");
    		especialidadNegocio.delete(4);
    		
    		break;
    		
    		
    		
    	case 4:
    		System.out.println( "Listado de médicos: " );

    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		medicoNegocio listMedicoNegocio = (medicoNegocio) appContext.getBean("beanMedicoNegocio");
    		
    		List<Medico> listMedicos = listMedicoNegocio.listMedicos();
    		
    		for (Medico medico : listMedicos) {
    		    System.out.println(medico);
    		}
    		break;
    		
    	case 5:
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		medicoNegocio listMedicoNegocio2 = (medicoNegocio) appContext.getBean("beanMedicoNegocio");
    		
    		listMedicoNegocio2.listMedicsAscending();
    		break;
    		
    	case 6:
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		medicoNegocio listMedicoNegocio3 = (medicoNegocio) appContext.getBean("beanMedicoNegocio");
    		
    		listMedicoNegocio3.listMedicsDescending();
    		break;
    		
    	case 7:
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		turnoNegocio listTurnoNegocio4 = (turnoNegocio) appContext.getBean("beanTurnoNegocio");
    		
    		listTurnoNegocio4.listTurnosInnerJoin();
    		break;
    	case 8:
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		medicoNegocio listMedicoNegocio5 = (medicoNegocio) appContext.getBean("beanMedicoNegocio");
    		
    		listMedicoNegocio5.listMedicsIds();
    		break;
    	case 9:
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		medicoNegocio listMedicoNegocio6 = (medicoNegocio) appContext.getBean("beanMedicoNegocio");
    		
    		listMedicoNegocio6.listMedicWithHighestId();
    		break;
    	case 10:
    		appContext = new ClassPathXmlApplicationContext("UTN/TP4_GRUPO_15/resources/beans.xml");
    		turnoNegocio listTurnoNegocio2 = (turnoNegocio) appContext.getBean("beanTurnoNegocio");
    		
    		listTurnoNegocio2.listTurnStatusPercentages();
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
