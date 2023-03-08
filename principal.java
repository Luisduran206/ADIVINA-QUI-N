import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t BIENVENIDO A \n\t\t ADIVINA QUIÉN \n");
		System.out.println("Tus personajes y sus respectivos atributos son los siguientes: \n");
		System.out.println("1. El personaje tiene LENGUA VERDE");
		System.out.println("2. El personaje tiene CABELLO AFRO");
		System.out.println("3. El personaje tiene ALAS DE ÁNGEL");
		System.out.println("4. El personaje tiene COLA DE BURRO \n");
		String[] names = {"Nemo", "Gru", "Dory", "BlancaNieves", "Aladdín", "MikeWasaousky", "Sullyvan", "DarthVader", "RalphElDemoledor", "MannyALaObra"};
		Persona[] individuos = new Persona[10];
		individuos[0] = new Persona();
		individuos[1] = new Persona();
		individuos[2] = new Persona();
		individuos[3] = new Persona();
		individuos[4] = new Persona();
		individuos[5] = new Persona();
		individuos[6] = new Persona();
		individuos[7] = new Persona();
		individuos[8] = new Persona();
		individuos[9] = new Persona();
		
		Random generadorAleatorio = new Random();
        for (int i = names.length - 1; i > 0; i--) {
            int indiceAleatorio = generadorAleatorio.nextInt(i + 1);
            String temporal = names[indiceAleatorio];
            names[indiceAleatorio] = names[i];
            names[i] = temporal;
        }
        for(int x = 0; x < names.length; x++) {
        	String name = names [x];
        	individuos[x].setNombre(name);
        }
        
		int contadorLenguaVerde = 0;
		int contadorCabelloAfro = 0;
		int contadorAlasDeAngel = 0;
		int contadorColaDeBurro = 0;
		
		for(int i = 0; i < individuos.length; i++) {
			if(individuos[i].getLenguaVerde()) {
				contadorLenguaVerde++;
			}
			if(individuos[i].getCabelloAfro()) {
				contadorCabelloAfro++;
			}
			if(individuos[i].getAlasDeAngel()) {
				contadorAlasDeAngel++;
			}
			if(individuos[i].getColaDeBurro()) {
				contadorColaDeBurro++;
			}
			System.out.print(individuos[i].getNombre()+": "+ individuos[i].getLenguaVerde() +", " + individuos[i].getCabelloAfro() +", "+ individuos[i].getAlasDeAngel() +", "+ individuos[i].getColaDeBurro() + "\n");
		}
		System.out.println("\nEl número de personajes que tienen LENGUA VERDE es: " + contadorLenguaVerde);
		System.out.println("El número de personajes que tienen CABELLO AFRO es: " + contadorCabelloAfro);
		System.out.println("El número de personajes que tienen ALAS DE ÁNGEL es: " + contadorAlasDeAngel);
		System.out.println("El número de personajes que tienen COLA DE BURRO es: " + contadorColaDeBurro);
		String[] nombres = names;
		Random random = new Random();
		int elegido = random.nextInt(10);
		System.out.println(individuos[elegido].getNombre());
		//String chosenOne = names[elegido.nextInt(10)];
		System.out.println("\n\tPara adivinar el personaje que el programa amablemente escogió, \n\tdeberás selecccionar el atributo que quieres evaluar\t");
		System.out.println("1. Lengua verde  2. Cabello Afro  3. Alas de ángel  4. Cola de burro\t");
		System.out.println("TEN CUIDADO, SOLO PUEDES HACERME 3 PREGUNTAS PARA CONOCER MI PERSONAJE");
		boolean[] bool = {true, true, true, true, true, true, true, true, true, true};
		for(int i = 0; i < 3; i++) {
			System.out.println("\n¿Qué atributo quisieras evaluar en mi personaje? Intruce el número acontinuación: ");
			String str = scan.nextLine();
			int elección = Integer.parseInt(str);
			switch(elección) {
			case 1:                                           //LENGUA VERDE
			   if(individuos[elegido].getLenguaVerde()) {
				   System.out.println("Mi personaje SI tiene lengua verde, y te elimino los que no");
				   for(int o = 0; o < bool.length; o++) {
						if(bool[o]) {
							if(individuos[o].getLenguaVerde()) {
								bool[o] = true;
							} else {
								bool[o] = false;
							}
						}
					}
				} else {
					System.out.println("Mi personaje NO tiene lengua verde, y te elimino los que si");
					for(int o = 0; o < names.length; o++) {
						if(individuos[o].getLenguaVerde()) {
							bool[o] = false;
						} else {
							bool[o] = true;
						}
					}
				}
				for(int x = 0; x < bool.length; x++) {
					if(bool[x]) {
						System.out.println("\t"+ individuos[x].getNombre());
					}
				}
				break;
				
			case 2:                                          //CABELLO AFRO
				if(individuos[elegido].getCabelloAfro()) {
					 System.out.println("Mi personaje SI tiene cabello afro, y te elimino los que no");
					  for(int o = 0; o < bool.length; o++) {
							if(bool[o]) {
								if(individuos[o].getCabelloAfro()) {
									bool[o] = true;
								} else {
									bool[o] = false;
								}
							}
						}
					} else {
						System.out.println("Mi personaje NO tiene cabello afro, y te elimino los que si");
						for(int o = 0; o < names.length; o++) {
							if(individuos[o].getCabelloAfro()) {
								bool[o] = false;
							} else {
								bool[o] = true;
							}
						}
					}
					for(int x = 0; x < bool.length; x++) {
						if(bool[x]) {
							System.out.println("\t"+ individuos[x].getNombre());
						}
					}
				break;
				
			case 3:	                                        //ALAS DE ANGEL
				if(individuos[elegido].getAlasDeAngel()) {
					   System.out.println("Mi personaje SI tiene alas de ángel, y te elimino los que no");
					   for(int o = 0; o < bool.length; o++) {
							if(bool[o]) {
								if(individuos[o].getAlasDeAngel()) {
									bool[o] = true;
								} else {
									bool[o] = false;
								}
							}
						}
					} else {
						System.out.println("Mi personaje NO tiene alas de ángel, y te elimino los que si");
						for(int o = 0; o < names.length; o++) {
							if(individuos[o].getAlasDeAngel()) {
								bool[o] = false;
							} else {
								bool[o] = true;
							}
						}
					}
					for(int x = 0; x < bool.length; x++) {
						if(bool[x]) {
							System.out.println("\t"+ individuos[x].getNombre());
						}
					}
				break;
				
			case 4:                                          //COLA DE BURRO
				if(individuos[elegido].getColaDeBurro()) {
					   System.out.println("Mi personaje SI tiene cola de  burro, y te elimino los que no");
					   for(int o = 0; o < bool.length; o++) {
							if(bool[o]) {
								if(individuos[o].getColaDeBurro()) {
									bool[o] = true;
								} else {
									bool[o] = false;
								}
							}
						}
					} else {
						System.out.println("Mi personaje NO tiene cola de burro, y te elimino los que si");
						for(int o = 0; o < names.length; o++) {
							if(individuos[o].getColaDeBurro()) {
								bool[o] = false;
							} else {
								bool[o] = true;
							}
						}
					}
					for(int x = 0; x < bool.length; x++) {
						if(bool[x]) {
							System.out.println("\t"+ individuos[x].getNombre());
						}
					}
				break;
				
			default:
				System.out.println("Opción inválida...");
				break;	
		}
	}	

		System.out.println("\n¿Ahora lo sabes? Adivina el nombre de mi personaje y escríbelo a continuación...");
		System.out.println("Tómate la molestia de escribirlo tal como está en la primera lista: ");
		String miPersonaje = individuos[elegido].getNombre().replace(" ", "");
		String intento = scan.next();
		String intentoFinal = intento.replace(" ", "");
		if(intentoFinal.equals(miPersonaje)) {
			System.out.println("FELICIDADES, en efecto "+individuos[elegido].getNombre()+" era mi personaje");
			System.out.println("Gracias por jugar conmigo <3");
		} else {
			System.out.println("LO SIENTO MUCHO, mi personaje era "+ individuos[elegido].getNombre() +", pero fue un buen intento");
			System.out.println("Gracias por jugar conmigo <3");
		}
}
}