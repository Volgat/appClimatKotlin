import java.util.Scanner;

class Mois {
    private int TmMax;
    private int TmMin;
    private int TmMoy;
    private int PmTot;

    public Mois(int TmMax, int TmMin, int PmTot) {
        this.TmMax = TmMax;
        this.TmMin = TmMin;
        this.TmMoy = (TmMax + TmMin) / 2;
        this.PmTot = PmTot;
    }

    public int getTmMax() {
        return TmMax;
    }

    public int getTmMin() {
        return TmMin;
    }

    public int getTmMoy() {
        return TmMoy;
    }

    public int getPmTot() {
        return PmTot;
    }
}

public class AnneeClimatique {
    private static Mois[] anneeClimatique = new Mois[12];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int precipitationTotale = 0;
        int temperatureMax = -31;
        int temperatureMin = 31;
        int temperatureMoyenne = 0;

        for (int i = 0; i < 12; i++) {
            int TmMax;
            int TmMin;
            int PmTot;

            System.out.println("Veuillez entrer les informations pour le mois " + (i + 1) + " :");

            do {
                System.out.print("Température mensuelle maximale (TmMax) : ");
                TmMax = sc.nextInt();
            } while (TmMax > 30 || TmMax < -30);

            do {
                System.out.print("Température mensuelle minimale (TmMin) : ");
                TmMin = sc.nextInt();
            } while (TmMin > 30 || TmMin < -30);

            do {
                System.out.print("Précipitation mensuelle totale (PmTot) : ");
                PmTot = sc.nextInt();
            } while (PmTot < 0 || PmTot > 200);

            anneeClimatique[i] = new Mois(TmMax, TmMin, PmTot);
            precipitationTotale += PmTot;
            temperatureMoyenne += (TmMax + TmMin) / 2;

            if (TmMax > temperatureMax) {
                temperatureMax = TmMax;
            }

            if (TmMin < temperatureMin) {
                temperatureMin = TmMin;
            }
        }

        temperatureMoyenne /= 12;

        System.out.println("Précipitation totale annuelle : " + precipitationTotale + " mm");
        System.out.println("Moyenne de précip
