import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Principal {

	public static void main(String[] args) {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		
		
		//Creamos sesión
		
		Session sesion = sf.openSession();
		
		//Creamos objetos 
		
		Jugador jugador1 = new Jugador(100,"Pepito", "Portero");
		Jugador jugador2 = new Jugador(200,"Fulanito", "Defensa");
		
		//Comenzamos la transaccion
		
		sesion.beginTransaction();
		
		sesion.save(jugador1);
		sesion.save(jugador2);
		
		//Commiteamos transacción
		
		sesion.getTransaction().commit();
		
		
		sesion.close();
		sf.close();
	}

}
