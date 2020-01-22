package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

public class Manager {

	private ArrayList<Crop> cropList;

	public Manager() throws DeserializationException, IOException {
		cropList = new ArrayList<Crop>();
		readCrop();
		System.out.println(cropList);
	}

	public static InputStream getHttpURLConnection(boolean isProxy, String filePath) {
		HttpURLConnection httpURLConnection;
		URL url = null;
		InputStream inputStream = null;
		try {
			url = new URL( filePath );
			if ( !isProxy ) {
				System.out.println("Sin proxy");
				httpURLConnection = (HttpURLConnection) url.openConnection();	
				inputStream = httpURLConnection.getInputStream();
			}else {
				System.out.println("Con proxy");
				Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.16.0.73", 8080));
				httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
				inputStream = httpURLConnection.getInputStream();
				if(inputStream == null )
					System.out.println( "Este input no quiere funcionar" );
			}
		}catch(ConnectException connectException) {
			isProxy = true;
			return getHttpURLConnection( isProxy, filePath );
		} catch (UnknownHostException e) {
			isProxy = true;
			System.out.println( "Catch: " + e.getMessage()  );
			return getHttpURLConnection( isProxy, filePath );
		} catch (MalformedURLException e1) {
			System.out.println(  e1.getMessage()  );
		}catch (IOException e) {
			System.out.println(  e.getMessage()  );
		}
		return inputStream;
	}

	private void addCrop(Crop crop) {
		cropList.add(crop);
	}

	private void readCrop() throws DeserializationException, IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(getHttpURLConnection(true, "https://www.datos.gov.co/resource/qi54-achv.json")));
		JsonObject jsonObjectToArray = new JsonObject();
		JsonArray jsonObjectCrop = (JsonArray) Jsoner.deserialize(buffer);
		for (Object list : jsonObjectCrop) {
			jsonObjectToArray = (JsonObject) list;
			addCrop(new Crop(jsonObjectToArray.getString("departamento"), jsonObjectToArray.getString("codigo_dane"),jsonObjectToArray.getString("municipio"),jsonObjectToArray.getString("cultivo"), jsonObjectToArray.getString("a_o"),
					jsonObjectToArray.getString("rea_sembrada_ha"),jsonObjectToArray.getString("rea_cosechada_ha"), jsonObjectToArray.getString("estado_fisico_produccion"),jsonObjectToArray.getString("ciclo_de_cultivo")));
		}
	}
	
	public static void main(String[] args) throws DeserializationException, IOException {
		new Manager();
	}
}