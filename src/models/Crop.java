package models;

public class Crop {

	private String departament;
	private String idDane;
	private String municipality;
	private String nameCrop;
	private String date;
	private String sowing;
	private String harvest;
	private String productionStatus;
	private String cycleCrop;

	public Crop(String departament,String idDane,String municipality,String nameCrop,String date,String sowing,String harvest,String productionStatus, String cycleCrop) {
		this.departament = departament;
		this.idDane = idDane;
		this.municipality = municipality;
		this.nameCrop = nameCrop;
		this.date = date;
		this.sowing = sowing;
		this.harvest = harvest;
		this.productionStatus = productionStatus;
		this.cycleCrop = cycleCrop;
	}

	public String toString() {
		return "Departamento: " + departament + "\n" + 
				"Codigo dane: " + idDane  + "\n" +
				"Municipio : " + municipality  + "\n" +
				"Cultivo: " + nameCrop  + "\n" +
				"Fecha: " + date  + "\n" +
				"Siembra: " + sowing  + "\n" +
				"Cosecha: " + harvest  + "\n" +
				"Estado de produccion: " + productionStatus  + "\n"+
				"Ciclo del cultivo: " + cycleCrop  + "\n";
	}
}
