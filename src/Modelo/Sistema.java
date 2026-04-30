package Modelo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Sistema {
	//Atributos
	private List<Festival> lstFestivales= new ArrayList< Festival>();
	private List<UnidadesDeVenta> lstUnidadesDeVenta = new ArrayList<UnidadesDeVenta>();
	private List<Empleado> lstEmpleados = new ArrayList<Empleado>();
	private List<Plato>lstPlatos = new ArrayList<Plato>();
	private List<Pedido> lstPedidos = new ArrayList<Pedido>();

	//Constructor
		
	public Sistema() {
		super();
	}

	// Getters & Setters
	public List<Festival> getLstFestivales() {
		return lstFestivales;
	}

	public void setLstFestivales(List<Festival> lstFestivales) {
		this.lstFestivales = lstFestivales;
	}

	public List<UnidadesDeVenta> getLstUnidadesDeVenta() {
		return lstUnidadesDeVenta;
	}

	public void setLstUnidadesDeVenta(List<UnidadesDeVenta> lstUnidadesDeVenta) {
		this.lstUnidadesDeVenta = lstUnidadesDeVenta;
	}

	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public void setLstEmpleados(List<Empleado> lstEmpleados) {
		this.lstEmpleados = lstEmpleados;
	}

	public List<Plato> getLstPlatos() {
		return lstPlatos;
	}

	public void setLstPlatos(List<Plato> lstPlatos) {
		this.lstPlatos = lstPlatos;
	}

	public List<Pedido> getLstPedidos() {
		return lstPedidos;
	}

	public void setLstPedidos(List<Pedido> lstPedidos) {
		this.lstPedidos = lstPedidos;
	}
	
	
		
		
		//Funciones
	//Traer
	/*
	public int traerIdFestival() {
	    int mayor = 0;
	    for (Festival f : lstFestivales) {
	        if (f.getIdFestival() > mayor) {
	            mayor = f.getIdFestival();
	        }
	    }
	    return mayor;
	}
	
	public Festival traerFestival(int idFestival) throws Exception {
		//Festival p = null;
		int i = 0;
		//boolean encontrado = false;
		while (i < lstFestivales.size() ) {
			if (lstFestivales.get(i).getIdFestival() == idFestival) {
				return lstFestivales.get(i);
			}
			i++;
		}
		throw new Exception("Id del festival no econtrado : "+ idFestival);
	}
	
	public Festival traerFestival(String festival)throws Exception {
	
		int i = 0;
		while (i < lstFestivales.size()) {
			if (lstFestivales.get(i).getNombre().equals(festival)) {
				return lstFestivales.get(i);
			}
			i++;
		}
		throw new Exception("Festival no encontrado: " + festival);
	}
	*/
	
	
	
	public int traerIdFestival() {
		int mayor=0;
		if(lstFestivales.size() !=0) {
			mayor = lstFestivales.get(0).getIdFestival();
		}
		
		int i =0;
		while(i<lstFestivales.size()) {
			int actual = lstFestivales.get(i).getIdFestival();
			if(actual>mayor) {
				mayor = actual;
			}
			i++;
		}
		return mayor;
	}
	
	

	public Festival traerFestival(int idFestival) {
		Festival p = null;
		int i = 0;
		boolean encontrado = false;
		while (i < lstFestivales.size() && encontrado == false) {
			if (lstFestivales.get(i).getIdFestival() == idFestival) {
				p = lstFestivales.get(i);
				encontrado = true;
			}
			i++;
		}
		return p;
	}
	
	
	public Festival traerFestival(String festival)throws Exception {
		Festival p = null;
		int i = 0;
		boolean encontrado = false;
		while (i < lstFestivales.size() && encontrado == false) {
			if (lstFestivales.get(i).getNombre().equals(festival)) {
				p = lstFestivales.get(i);
				encontrado = true;
			}else {
				System.out.println("Festival no encontrado");
			}
			i++;
			
		}
		return p;
	}
	/*
	public Festival traerFestival(String festival)throws Exception {
		
		int i = 0;
		while (i < lstFestivales.size()) {
			if (lstFestivales.get(i).getNombre().equals(festival)) {
				return lstFestivales.get(i);
			}
			i++;
		}
		throw new Exception("Festival no encontrado: " + festival);
	}
	*/
	
	//insertar
	
	public boolean agregarFestival(String nombre,String temporada,String tematica,LocalDate fechaInicio,LocalDate fechaFin) throws Exception {
		if (traerFestival(nombre) != null) {
			throw new Exception("El producto ya existe");
		} else {
			lstFestivales.add(new Festival(traerIdFestival()+1, nombre, temporada, tematica, fechaInicio, fechaFin));
			//System.out.println("Se agrego exitosamente");
			return true;
		}
	}
	//modificar
	//baja
	public boolean eliminarFestival(int idFestival) throws Exception {
		Festival festivalEncontrado = traerFestival(idFestival);
		 if (festivalEncontrado == null) {
			 throw new Exception("El festival no existe") ;
			 } else {
				 lstFestivales.remove(festivalEncontrado);
				 return true;
			 }
	}
	
	
	}
		
	

