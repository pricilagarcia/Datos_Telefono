
public class TelfonoUsuario {

	public static void main(String[] args) {
		//PROGRAMA PARA LA CREACIÓN DE UN TELEFONO
		//MOVIL DE CUALQUIER MARC AHOY EN DÍA 
		
		Huawei Huawei = new Huawei("RM_90");
		
		
		//MODELO HUAWEI RM_90 Q1,500.00
		//ME QUEDO CON EL PREDETERMINADO = MQP
		
		System.out.println(Huawei.getEmpresa() + " " + Huawei.getModelo());
		System.out.println("------------------");
		Huawei.setCamaraFrontal(16);
		Huawei.setCamaraTrasera1(25);
		Huawei.getBotones();//MQP
		Huawei.getPantalla();//MQP
		Huawei.setAlto(158);
		Huawei.setAncho(75);
		Huawei.setProfundidad(7);
		Huawei.setBocinaFrontal(75);
		Huawei.setBocinaAltavoz(600);
		Huawei.getSensorDeAprocimidad();
		Huawei.getSensorGiroSensor();
		Huawei.setPeso(166);
		
		System.out.println("Camara frontal" + " " + Huawei.getCamaraFrontal()+  "\n" + "Camara trasera"  + " " + Huawei.getCamaraTrasera1() +
				 " " + "\n" + "Botones" +  " " + Huawei.getBotones() + "\n" +"pantalla"+ " " + Huawei.getPantalla() + "\n" +  "Altura" + " " +  Huawei.getAlto() +"\n" + "Ancho" + " " +  Huawei.getAncho() +
				 " " + "\n" + "Profundidad"+ " " + Huawei.getProfundidad() + " " + "\n" +"BocinaFrontal " + " " + Huawei.getBocinaFrontal() +
				 " " + "\n" + "Bocina Alta"  + " " + Huawei.getBocinaAltavoz() + " " + "\n" + "Sensor de Aproximidad" + " " + Huawei.getSensorDeAprocimidad() +
				 " " + "\n" + "Sensor Girosensor" + " " +Huawei.getSensorGiroSensor()+ " " + "\n" + "Peso" + " " + Huawei.getPeso());
	
		//NUEVO TELEFONO SAMSUNG P20
		System.out.println("_____________________________________________");
		
		Samsung Samsung = new Samsung("P20");
		
		System.out.println(Samsung.getEmpresa() + " " + Samsung.getModelo());
		System.out.println("------------------------------------");
		Samsung.setBotones(4);
		Samsung.setBocinaFrontal(250);
		Samsung.setBocinaAltavoz(400);
		Samsung.getPantalla(); //MQP
		Samsung.setCamaraFrontal(24);
		Samsung.setCamaraTrasera1(20);
		Samsung.getPuertoDeCargaUSB();
		Samsung.getSensordehuella();
		Samsung.getSensorGiroSensor();
		Samsung.getSensorDeAprocimidad();
		Samsung.setAlto(165);
		Samsung.getAncho();
		Samsung.setProfundidad(5.3);
		Samsung.setPrecio(1200);
		
		System.out.println("Botones" + " " + Samsung.getBotones());
		System.out.println("Bocina Frontal" + "" + Samsung.getBocinaFrontal());
		System.out.println("Bocina Altavoz" + "" + Samsung.getBocinaAltavoz());
		System.out.println("Pantalla" + "" + Samsung.getPantalla());
		System.out.println("Cámara Frontal"+ "" + Samsung.getCamaraFrontal());
		System.out.println("Cámara Trasera" + "" + Samsung.getCamaraTrasera1());
		System.out.println("Puerto de Carga USB"+ "" + Samsung.getPuertoDeCargaUSB());
		System.out.println("Lector de huella dactilar" + "" + Samsung.getSensordehuella());
		System.out.println("Sensor GiroSensor"+ "" + Samsung.getSensorGiroSensor());
		System.out.println("Sensor de Aproximidad" + " " + Samsung.getSensorDeAprocimidad());
		System.out.println("Altuta" + "" + Samsung.getAlto());
		System.out.println("Ancho"+ " " + Samsung.getAncho());
		System.out.println("Profundidad"+ " " + Samsung.getProfundidad());
		System.out.println("Precio" + " " + Samsung.getPrecio());
	}

}
