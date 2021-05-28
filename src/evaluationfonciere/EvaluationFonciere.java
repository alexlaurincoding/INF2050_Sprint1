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

            fichierSortie.accumulate("valeur_fonciere_totale", calculValeurFonciereTotale(fichierEntrer));
            fichierSortie.accumulate("taxe_scolaire", calculTaxeScolaire(fichierEntrer));
            fichierSortie.accumulate("taxe_municipale", calculTaxeMunicipale(fichierEntrer));
            fichierSortie.accumulate("lotissement", calculLotissement(fichierEntrer));

            FileWriter.saveStringIntoFile(args[1], fichierSortie.toString());
        } catch (IOException e) {
            System.out.println("Une erreur est survenue");
        }

    }

    public static String calculValeurFonciereTotale(JSONObject fichierEntrer) {

        return "";
    }

    public static String calculTaxeScolaire(JSONObject fichierEntrer) {

        return "";
    }

    public static String calculTaxeMunicipale(JSONObject fichierEntrer) {

        return "";
    }

    public static JSONArray calculLotissement(JSONObject fichierEntrer) {

        return null;
    }

}
