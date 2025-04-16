import java.util.HashMap;
import java.util.Map;

public class ServerDNS {
    public static void main(String[] args) {
        // Création de la table DNS
        Map<String, String> dnsTable = new HashMap<>();

        // Ajout d'entrées à la table
        dnsTable.put("google.com", "142.250.183.206");
        dnsTable.put("facebook.com", "157.240.229.35");
        dnsTable.put("yahoo.com", "98.137.11.163");

        // Affichage de test
        System.out.println("Contenu de la table DNS :");
        for (Map.Entry<String, String> entry : dnsTable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
