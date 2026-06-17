package citiesapp;


import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

public class Citiesapp {

    // ── Line counter ──────────────────────────────────────────────────────────

    public static int countLines(String filename) {
        int count = 0;
        try (java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.InputStreamReader(new java.io.FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) count++;
            }
        } catch (IOException e) {
            System.out.println("Error counting lines: " + e.getMessage());
        }
        return count;
    }

    // ── Loaders ──────────────────────────────────────────────────────────────

    public static City[] loadCities(String filename, int size) {
        City[] cities = new City[size];
        int i = 0;
        try (java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.InputStreamReader(new java.io.FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] tokens = line.split("#", 6);
                if (tokens.length < 6) continue;
                int id                      = Integer.parseInt(tokens[0].trim());
                String name                 = tokens[1].trim();
                int population              = Integer.parseInt(tokens[2].trim());
                String geographicRegion     = tokens[3].trim();
                String administrativeRegion = tokens[4].trim();
                String description          = tokens[5].trim();
                cities[i++] = new City(id, name, population,
                                       geographicRegion, administrativeRegion, description);
            }
        } catch (IOException e) {
            System.out.println("Sfalma anagnosis arxeiou poleon: " + e.getMessage());
        }
        return cities;
    }

    public static Entity[] loadEntities(String filename, int size) {
        Entity[] entities = new Entity[size];
        int i = 0;
        try (java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.InputStreamReader(new java.io.FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] tokens = line.split("#", 5);
                if (tokens.length < 5) continue;
                int id          = Integer.parseInt(tokens[0].trim());
                String name     = tokens[1].trim();
                String address  = tokens[2].trim();
                String category = tokens[3].trim();
                int cityId      = Integer.parseInt(tokens[4].trim());
                entities[i++] = new Entity(id, name, address, category, cityId);
            }
        } catch (IOException e) {
            System.out.println("Sfalma anagnosis arxeiou ontotiton: " + e.getMessage());
        }
        return entities;
    }

    // ── Helper ───────────────────────────────────────────────────────────────

    public static City findCityByName(City[] cities, String cityName) {
        for (City city : cities) {
            if (city.getName().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        return null;
    }

    // ── Main ─────────────────────────────────────────────────────────────────

    public static void main(String[] args) throws Exception {
        // UTF-8 fix for NetBeans console
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        System.setErr(new PrintStream(System.err, true, "UTF-8"));

        // Count lines then load
        City[]   cities   = loadCities("cities.txt",     countLines("cities.txt"));
        Entity[] entities = loadEntities("entities.txt", countLines("entities.txt"));

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("=== Efarmogi Poleon kai Axiotheaton ===");

        while (true) {
            System.out.print("\nDwste Poli: ");
            String cityInput = scanner.nextLine().trim();

            if (cityInput.equalsIgnoreCase("TELOS")) {
                System.out.println("Termatismos efarmogis. Antio!");
                break;
            }

            City foundCity = findCityByName(cities, cityInput);
            if (foundCity == null) {
                System.out.println("H poli \"" + cityInput + "\" den vrethike.");
                continue;
            }

            System.out.print("Dwste Katigoria: ");
            String categoryInput = scanner.nextLine().trim();

            System.out.println("\n--- Apotelesmata ---");

            if (categoryInput.equalsIgnoreCase("OLES")) {
                // Type 2: full city info + all entities
                System.out.println(foundCity.toString());
                System.out.println("\nOntotites:");

                boolean found = false;
                for (Entity entity : entities) {
                    if (entity.getCityId() == foundCity.getId()) {
                        System.out.println("  Onoma     : " + entity.getName());
                        System.out.println("  Diefthinsi: " + entity.getAddress());
                        System.out.println("  Katigoria : " + entity.getCategory());
                        System.out.println("  ---");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("  Den vrethikan ontotites gia tin poli ayti.");
                }

            } else {
                // Type 1: filter by city + category, show name + address only
                boolean found = false;
                for (Entity entity : entities) {
                    if (entity.getCityId() == foundCity.getId() &&
                        entity.getCategory().equalsIgnoreCase(categoryInput)) {
                        System.out.println("  Onoma     : " + entity.getName());
                        System.out.println("  Diefthinsi: " + entity.getAddress());
                        System.out.println("  ---");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Den vrethikan ontotites gia tin poli \""
                            + foundCity.getName() + "\" kai katigoria \"" + categoryInput + "\".");
                }
            }
        }

        scanner.close();
    }
}