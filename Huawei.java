
public class Huawei {
	
	private String empresa;
	private String modelo;
	private int botones;
	private double bocinaFrontal;	   //UNIDAD EN dB
	private double bocinaAltavoz;     //UNIDAD EN dB
	private String pantalla;
	private int camaraFrontal;       //UNIDADES mp
	private int camaraTrasera1;
	private int camaraTrasera2;
	private double puertoDeCargaUSB;
	private boolean sensorDeAprocimidad;
	private boolean sensorGiroSensor;
	private double alto;             //UNIDAD EN mm
	private double ancho;			 //UNIDAD EN mm
	private double profundidad;		 //UNIDAD EN mm
	private double peso;			 //UNIDAD EN gm

	
	Huawei(String nuevoModelo){
		
		empresa = "Huawei";
		modelo = nuevoModelo;
		botones = 4;
		bocinaFrontal = 100; 
		bocinaAltavoz = 500;
		pantalla = "LCD";
		camaraFrontal = 12;
		camaraTrasera1 = 30;
		camaraTrasera2 = 40;
		puertoDeCargaUSB = 3.1;
		sensorDeAprocimidad = true;
		sensorGiroSensor = true;
		alto = 158.3;
		peso = 165;
		profundidad = 7.6;
		ancho = 75.3;

		/*SECCION DE GET*/
		
		
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getEmpresa() {
		return empresa;
	}


	public int getBotones() {
		return botones;
	}


	public void setBotones(int botones) {
		this.botones = botones;
	}


	public double getBocinaFrontal() {
		return bocinaFrontal;
	}


	public void setBocinaFrontal(double bocinaFrontal) {
		this.bocinaFrontal = bocinaFrontal;
	}


	public double getBocinaAltavoz() {
		return bocinaAltavoz;
	}


	public void setBocinaAltavoz(double bocinaAltavoz) {
		this.bocinaAltavoz = bocinaAltavoz;
	}


	public String getPantalla() {
		return pantalla;
	}


	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}


	public int getCamaraFrontal() {
		return camaraFrontal;
	}


	public void setCamaraFrontal(int camaraFrontal) {
		this.camaraFrontal = camaraFrontal;
	}


	public int getCamaraTrasera1() {
		return camaraTrasera1;
	}


	public void setCamaraTrasera1(int camaraTrasera1) {
		this.camaraTrasera1 = camaraTrasera1;
	}


	public int getCamaraTrasera2() {
		return camaraTrasera2;
	}


	public void setCamaraTrasera2(int camaraTrasera2) {
		this.camaraTrasera2 = camaraTrasera2;
	}


	public double getPuertoDeCargaUSB() {
		return puertoDeCargaUSB;
	}


	public void setPuertoDeCargaUSB(double puertoDeCargaUSB) {
		this.puertoDeCargaUSB = puertoDeCargaUSB;
	}


	public boolean getSensorDeAprocimidad() {
		return sensorDeAprocimidad;
	}


	public void setSensorDeAprocimidad(boolean sensorDeAprocimidad) {
		this.sensorDeAprocimidad = sensorDeAprocimidad;
	}


	public boolean getSensorGiroSensor() {
		return sensorGiroSensor;
	}


	public void setSensorGiroSensor(boolean sensorGiroSensor) {
		this.sensorGiroSensor = sensorGiroSensor;
	}


	public double getAlto() {
		return alto;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public double getProfundidad() {
		return profundidad;
	}


	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
}

