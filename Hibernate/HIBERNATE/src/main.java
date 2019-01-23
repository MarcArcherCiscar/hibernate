import org.hibernate.Session;
import java.sql.Date;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Añadir empresas a la tabla
		 
	 Session session=hibernate_utilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Empresas e=new Empresas();
		e.setCIF("maincra");
		e.setDireccion("calle falsa");
		e.setEmpleados(120);
		e.setNombre("Juan");
		
		session.save(e);
		
		session.getTransaction().commit();
		
		session.close();
		hibernate_utilities.getSessionFactory().close();*/
		//----------------------------------------------------------------------------------------------------
		
		
		
		
		
		/*Recuperar empresas
		Session session=hibernate_utilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Empresas e= session.get(Empresas.class, "maincra");
		
if(e.getNombre().equalsIgnoreCase("juan")) {//Aqui estava provando otros metodos para hacer selects
	System.out.println("se ha encontrado"+e.getNombre()+" "+e.getCIF());
}
System.out.println("Nope");
		
		
session.getTransaction().commit();
		
		session.close();
		hibernate_utilities.getSessionFactory().close();
		
		*/
		
		
		
		
		//----------------------------------------------------------------------------------------------------
		 
		//insertar campos en tabla pedido
		/* Session session=hibernate_utilities.getSessionFactory().openSession();
			
			session.beginTransaction();
			
			pedido p=new pedido();
			
			java.util.Date utilDate = new java.util.Date();
			p.setFecha(new java.sql.Date(utilDate.getTime()));
			
			
			session.save(p);
			
			session.getTransaction().commit();
			
			session.close();
			hibernate_utilities.getSessionFactory().close();*/
			//----------------------------------------------------------------------------------------------------
		
		
		//recuperar campos de tabla pedido
		/*Session session=hibernate_utilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		pedido p= session.get(pedido.class, 1);
		
		System.out.println("se ha encontrado"+p.getFecha());
		
session.getTransaction().commit();
		
		session.close();
		hibernate_utilities.getSessionFactory().close();*/
		//----------------------------------------------------------------------------------------------------
		
		
		
		//insertar campos en tabla item
		/*Session session=hibernate_utilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Item i=new Item();
		

		i.setNombre("Bob Esponja");
		i.setCantidad(143);
		
		
		session.save(i);
		
		session.getTransaction().commit();
		
		session.close();
		hibernate_utilities.getSessionFactory().close();*/
		
		
		//----------------------------------------------------------------------------------------------------
		
		
		Session session=hibernate_utilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Item i= session.get(Item.class, 1);
		
		System.out.println("se ha encontrado"+i.getNombre()+" "+i.getCantidad());
		
session.getTransaction().commit();
		
		session.close();
		hibernate_utilities.getSessionFactory().close();
		
		
		
		
		
	}

}
