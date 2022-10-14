//1
public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	//2
	public Cuenta(String titular) {
		this(titular, 0);
	}
	
	public Cuenta(String titular, double catidad) {
		this.titular = titular;
		
		if(cantidad < 0) {
			this.cantidad = 0;
		}else {
			this.cantidad = cantidad;
		}
	}
	
	//3
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular = " + titular + ", cantidad = " + cantidad + "]";
	}
	
	//4
	 public void d(double cantidad) {
		 if(cantidad > 0) {
			 this.cantidad += cantidad;
		 }
	 }
	 
	 public void r(double cantidad) {
		 if(this.cantidad - cantidad < 0) {
			 this.cantidad = 0;
		 }else {
			 this.cantidad -= cantidad;
		 }
	 }
}
