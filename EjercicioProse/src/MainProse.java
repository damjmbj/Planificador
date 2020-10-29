import java.util.ArrayList;

public class MainProse {

	public static void main(String[] args) {


		microProcesador();
		PlanificadorFCFS.sirve();
		System.out.println("Mod");
	}

	private static void microProcesador() {

		ArrayList<ProcesoImpresion> procesos = new ArrayList<ProcesoImpresion>();
		for (int i = 1; i <= 5 ; i++) {
			
			
			//creamos un p_ y con el math.rando le damos el valor de duracion;
			ProcesoImpresion pi = new ProcesoImpresion("P_" + i, ((int ) Math.floor(Math.random()*4+1)) * 1000);
			procesos.add(pi);
			
							
		}
		
		for (ProcesoImpresion procesoImpresion : procesos) {
			PlanificadorFCFS.put(procesoImpresion);
		}
	}

}













