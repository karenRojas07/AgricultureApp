package models;

import java.util.ArrayList;

public class CropManager {

	public static ArrayList<CropTransitory> listCropTr = new ArrayList<CropTransitory>();

	public CropManager() {
		listCropTr = new ArrayList<CropTransitory>();
	}

	public static void createCropTr(String crop, String harvestedArea, String plantedArea, String tons, String stateProd, String priceProd, String costs) {
		listCropTr.add(new CropTransitory(crop, harvestedArea, plantedArea, tons, stateProd, priceProd, costs));
	}

	public static ArrayList<CropTransitory> getListCropTr() {
		return listCropTr;
	}

	public static void setListCropTr(ArrayList<CropTransitory> listCropTr) {
		CropManager.listCropTr = listCropTr;
	}

	//	private void calculateFiveHigherPrices() {
	//		int 
	//	for (int i = 0; i < listCropTr.size(); i++) {
	//		if (listCropTr.get(i).getPriceProd().equalsIgnoreCase("")) {
	//			
	//		}
	//	}
}
