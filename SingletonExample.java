package implementation;

public class SingletonExample {

	private static SingletonExample instance;
	
	private String nombre = "Juan Perez";
	private int dni = 33444343;
	private double saldo = 100.99;
    
    private SingletonExample() {        
    }
    
    public static SingletonExample getInstance() {
        if(instance == null) {
        	instance = new SingletonExample();
        }
        
        return instance;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
    
}