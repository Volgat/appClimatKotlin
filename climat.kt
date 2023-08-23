class Mois (var TmMax: Int, var TmMin: Int, var PmTot: Int){
    // Propriétés pour stocker les informations relatives au climat d'un mois
    var TmMoy = (TmMax + TmMin)/2  // Calcul de la température moyenne
    
    // Fonction pour afficher les informations relatives à un mois
    fun afficherMois(){
        println("Mois: Température maximale: $TmMax, Température minimale: $TmMin, Température moyenne: $TmMoy, Précipitation totale: $PmTot")
    }
}

class AnneeClimatique{
    // Tableau pour stocker les informations relatives à chaque mois
    private var annee = arrayOfNulls<Mois>(12)
    private var totalPrecipitation = 0 // Variables pour stocker les informations relatives à l'année
    private var nombreMois = 0
    private var TmMaxAnnee = Int.MIN_VALUE
    private var TmMinAnnee = Int.MAX_VALUE
    private var moisTmMax = mutableListOf<Int>()
    private var moisTmMin = mutableListOf<Int>()
    
    // Fonction pour ajouter les informations relatives à un mois à l'année climatique
    fun ajouterMois(mois: Mois){
        if (nombreMois < 12){
            annee[nombreMois] = mois
            totalPrecipitation += mois.PmTot
            nombreMois++
            if (mois.TmMax > TmMaxAnnee){
                TmMaxAnnee = mois.TmMax
                moisTmMax.clear()
                moisTmMax.add(nombreMois)
            }
            else if (mois.TmMax == TmMaxAnnee){
                moisTmMax.add(nombreMois)
            }
            if (mois.TmMin < TmMinAnnee){
                TmMinAnnee = mois.TmMin
                moisTmMin.clear()
                moisTmMin.add(nombreMois)
            }
            else if (mois.TmMin == TmMinAnnee){
                moisTmMin.add(nombreMois)
            }
        }
        else{
            println("L'année climatique est déjà complète.")
        }
    }
    
    // Fonction pour afficher les informations relatives à l'année climatique
    fun afficherAnneeClimatique(){
        println("Année climatique: ")
        for (i in 0 until nombreMois){
            annee[i]?.afficherMois()
        }
        println("Précipitation annuelle totale: $totalPrecipitation")
        println("Moyenne de précipitation annuelle: ${totalPrecipitation/nombreMois
