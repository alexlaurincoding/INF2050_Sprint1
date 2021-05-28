/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluationfonciere;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author Alex
 */
public class EvaluationFonciere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            String jsonString = FileReader.loadFileIntoString(args[0], "UTF-8");
            JSONObject fichierEntrer = JSONObject.fromObject(jsonString);
            JSONObject fichierSortie = new JSONObject();

            fichierSortie.accumulate("type_terrain", fichierEntrer.getString("type_terrain"));
            fichierSortie.accumulate("prix_m2_min", fichierEntrer.getString("prix_m2_min"));
            fichierSortie.accumulate("prix_m2_max", fichierEntrer.getString("prix_m2_max"));
            
            FileWriter.saveStringIntoFile(args[1], fichierSortie.toString());
        } catch (IOException e) {
            System.out.println("Fichier json d'entree introuvable");
        }

        
    }

}
