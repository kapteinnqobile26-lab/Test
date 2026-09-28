public class Console {
    public static void main(String[] args) {
        // Single dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Two-dimensional array for sales [city][console]
        // Column 0 = PS5, Column 1 = XBOX, Column 2 = SWITCH
        int[][] sales = {
                {1000, 2000, 3000}, // Cape Town
                {2000, 3000, 4000}, // Port Elizabeth
                {1500, 1100, 1200} // Pretoria
        };

        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Print header
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "", consoles[0], consoles[1], consoles[2]);

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d\n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int[] totalPerCity = new int[cities.length];
        int maxSales = 0;
        String cityWithMostSales = "";

        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += sales[i][j];
            }
            totalPerCity[i] = total;
            System.out.println(cities[i] + " " + total);

            // Find city with most sales
            if (total > maxSales) {
                maxSales = total;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println("\nCITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("--------------------------------------------------");
    }
}
