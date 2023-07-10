package sim.transportation;

import sim.transportation.Impl.SubwayStation;
import sim.transportation.Impl.SubwayStationCollector;
import sim.SimConfig;

import java.lang.reflect.Field;
import java.util.*;

public class SubwayNetwork {

    // U3 Stationen
    SubwayStation ottakringU3 = new SubwayStation("Ottakring", null, null, SubwayLine.U3);
    SubwayStation kendlerstrasseU3 = new SubwayStation("Kendlerstrasse", null, ottakringU3, SubwayLine.U3);
    SubwayStation huetteldorferstrasseU3 = new SubwayStation("Huetteldorferstrasse", null, kendlerstrasseU3, SubwayLine.U3);
    SubwayStation johnstrasseU3 = new SubwayStation("Johnstrasse", null, huetteldorferstrasseU3, SubwayLine.U3);
    SubwayStation schweglerstrasseU3 = new SubwayStation("Schweglerstrasse", null, johnstrasseU3, SubwayLine.U3);
    SubwayStation westbahnhofU3 = new SubwayStation("Westbahnhof", null, schweglerstrasseU3, SubwayLine.U3);
    SubwayStation zieglergasseU3 = new SubwayStation("Zieglergasse", null, westbahnhofU3, SubwayLine.U3);
    SubwayStation neubaugasseU3 = new SubwayStation("Neubaugasse", null, zieglergasseU3, SubwayLine.U3);
    SubwayStation volkstheaterU3 = new SubwayStation("Volkstheater", null, neubaugasseU3, SubwayLine.U3);
    SubwayStation herrengasseU3 = new SubwayStation("Herrengasse", null, volkstheaterU3, SubwayLine.U3);
    SubwayStation stephansplatzU3 = new SubwayStation("Stephansplatz", null, herrengasseU3, SubwayLine.U3);
    SubwayStation stubentorU3 = new SubwayStation("Stubentor", null, stephansplatzU3, SubwayLine.U3);
    SubwayStation landstrasseU3 = new SubwayStation("Landstrasse", null, stubentorU3, SubwayLine.U3);
    SubwayStation rochusgasseU3 = new SubwayStation("Rochusgasse", null, landstrasseU3, SubwayLine.U3);
    SubwayStation kardinalnaglplatzU3 = new SubwayStation("Kardinalnaglplatz", null, rochusgasseU3, SubwayLine.U3);
    SubwayStation schlachthausgasseU3 = new SubwayStation("Schlachthausgasse", null, kardinalnaglplatzU3, SubwayLine.U3);
    SubwayStation erdbergU3 = new SubwayStation("Erdberg", null, schlachthausgasseU3, SubwayLine.U3);
    SubwayStation gasometerU3 = new SubwayStation("Gasometer", null, erdbergU3, SubwayLine.U3);
    SubwayStation zippererstrasseU3 = new SubwayStation("Zippererstrasse", null, gasometerU3, SubwayLine.U3);
    SubwayStation enkplatzU3 = new SubwayStation("Enkplatz", null, zippererstrasseU3, SubwayLine.U3);
    SubwayStation simmeringU3 = new SubwayStation("Simmering", null, enkplatzU3, SubwayLine.U3);

    // U4 Stationen

    SubwayStation huetteldorfU4 = new SubwayStation("Huetteldorf", null, null, SubwayLine.U4);
    SubwayStation oberstveitU4 = new SubwayStation("Oberstveit", null, huetteldorfU4, SubwayLine.U4);
    SubwayStation unterstveitU4 = new SubwayStation("Unterstveit", null, oberstveitU4, SubwayLine.U4);
    SubwayStation braunschweiggasseU4 = new SubwayStation("Braunschweiggasse", null, unterstveitU4, SubwayLine.U4);
    SubwayStation hietzingU4 = new SubwayStation("Hietzing", null, braunschweiggasseU4, SubwayLine.U4);
    SubwayStation schonbrunnU4 = new SubwayStation("Schoenbrunn", null, hietzingU4, SubwayLine.U4);
    SubwayStation meidlingHauptstrasseU4 = new SubwayStation("Meidling Hauptstrasse", null, schonbrunnU4, SubwayLine.U4);
    SubwayStation laengenfeldgasseU4 = new SubwayStation("Laengenfeldgasse", null, meidlingHauptstrasseU4, SubwayLine.U4);
    SubwayStation margaretenguertelU4 = new SubwayStation("Margaretenguertel", null, laengenfeldgasseU4, SubwayLine.U4);
    SubwayStation pilgramgasseU4 = new SubwayStation("Pilgramgasse", null, margaretenguertelU4, SubwayLine.U4);
    SubwayStation kettenbrueckengasseU4 = new SubwayStation("Kettenbrueckengasse", null, pilgramgasseU4, SubwayLine.U4);
    SubwayStation karlsplatzU4 = new SubwayStation("Karlsplatz", null, kettenbrueckengasseU4, SubwayLine.U4);
    SubwayStation stadtparkU4 = new SubwayStation("Stadtpark", null, karlsplatzU4, SubwayLine.U4);
    SubwayStation landstrasseU4 = new SubwayStation("Landstrasse", null, stadtparkU4, SubwayLine.U4);
    SubwayStation schwedenplatzU4 = new SubwayStation("Schwedenplatz", null, landstrasseU4, SubwayLine.U4);
    SubwayStation schottenringU4 = new SubwayStation("Schottenring", null, schwedenplatzU4, SubwayLine.U4);
    SubwayStation rossauerlaendeU4 = new SubwayStation("Rossauerlaende", null, schottenringU4, SubwayLine.U4);
    SubwayStation friedensbrueckeU4 = new SubwayStation("Friedensbruecke", null, rossauerlaendeU4, SubwayLine.U4);
    SubwayStation spittelauU4 = new SubwayStation("Spittelau", null, friedensbrueckeU4, SubwayLine.U4);
    SubwayStation heiligenstadtU4 = new SubwayStation("Heiligenstadt", null, spittelauU4, SubwayLine.U4);

    // U2 Stationen

    SubwayStation karlsplatzU2 = new SubwayStation("Karlsplatz", null, null, SubwayLine.U2);
    SubwayStation museumsquartierU2 = new SubwayStation("Museumsquartier", null, karlsplatzU2, SubwayLine.U2);
    SubwayStation volkstheaterU2 = new SubwayStation("Volkstheater", null, museumsquartierU2, SubwayLine.U2);
    SubwayStation rathausU2 = new SubwayStation("Rathaus", null, volkstheaterU2, SubwayLine.U2);
    SubwayStation schottentorU2 = new SubwayStation("Schottentor", null, rathausU2, SubwayLine.U2);
    SubwayStation schottenringU2 = new SubwayStation("Schottenring", null, schottentorU2, SubwayLine.U2);
    SubwayStation taborstrasseU2 = new SubwayStation("Taborstrasse", null, schottenringU2, SubwayLine.U2);
    SubwayStation pratersternU2 = new SubwayStation("Praterstern", null, taborstrasseU2, SubwayLine.U2);
    SubwayStation messepraterU2 = new SubwayStation("Messe Prater", null, pratersternU2, SubwayLine.U2);
    SubwayStation krieauU2 = new SubwayStation("Krieau", null, messepraterU2, SubwayLine.U2);
    SubwayStation stadionU2 = new SubwayStation("Stadion", null, krieauU2, SubwayLine.U2);
    SubwayStation donaumarinaU2 = new SubwayStation("Donaumarina", null, stadionU2, SubwayLine.U2);
    SubwayStation donaustadtbrueckeU2 = new SubwayStation("Donaustadtbruecke", null, donaumarinaU2, SubwayLine.U2);
    SubwayStation stadlauU2 = new SubwayStation("Stadlau", null, donaustadtbrueckeU2, SubwayLine.U2);
    SubwayStation hardeggasseU2 = new SubwayStation("Hardeggasse", null, stadlauU2, SubwayLine.U2);
    SubwayStation donauspitalU2 = new SubwayStation("Donauspital", null, hardeggasseU2, SubwayLine.U2);
    SubwayStation aspernstrasseU2 = new SubwayStation("Aspernstrasse", null, donauspitalU2, SubwayLine.U2);
    SubwayStation hausfeldstrasseU2 = new SubwayStation("Hausfeldstrasse", null, aspernstrasseU2, SubwayLine.U2);
    SubwayStation aspernNordU2 = new SubwayStation("Aspern Nord", null, hausfeldstrasseU2, SubwayLine.U2);
    SubwayStation seestadtU2 = new SubwayStation("Seestadt", null, aspernNordU2, SubwayLine.U2);

    // U1 Stationen

    SubwayStation leopoldauU1 = new SubwayStation("Leopoldau", null, null, SubwayLine.U1);
    SubwayStation grossfeldsiedlungU1 = new SubwayStation("Grossfeldsiedlung", null, leopoldauU1, SubwayLine.U1);
    SubwayStation aderklaaerstrasseU1 = new SubwayStation("Aderklaaer Strasse", null, grossfeldsiedlungU1, SubwayLine.U1);
    SubwayStation rennbahnwegU1 = new SubwayStation("Rennbahnweg", null, aderklaaerstrasseU1, SubwayLine.U1);
    SubwayStation kagranerplatzU1 = new SubwayStation("Kagraner Platz", null, rennbahnwegU1, SubwayLine.U1);
    SubwayStation kagranU1 = new SubwayStation("Kagran", null, kagranerplatzU1, SubwayLine.U1);
    SubwayStation alteDonauU1 = new SubwayStation("Alte Donau", null, kagranU1, SubwayLine.U1);
    SubwayStation kaisermuehlenvicU1 = new SubwayStation("Kaisermuehlen VIC", null, alteDonauU1, SubwayLine.U1);
    SubwayStation donauinselU1 = new SubwayStation("Donauinsel", null, kaisermuehlenvicU1, SubwayLine.U1);
    SubwayStation vorgartenstrasseU1 = new SubwayStation("Vorgartenstrasse", null, donauinselU1, SubwayLine.U1);
    SubwayStation pratersternU1 = new SubwayStation("Praterstern", null, vorgartenstrasseU1, SubwayLine.U1);
    SubwayStation nestroyplatzU1 = new SubwayStation("Nestroyplatz", null, pratersternU1, SubwayLine.U1);
    SubwayStation schwedenplatzU1 = new SubwayStation("Schwedenplatz", null, nestroyplatzU1, SubwayLine.U1);
    SubwayStation stephansplatzU1 = new SubwayStation("Stephansplatz", null, schwedenplatzU1, SubwayLine.U1);
    SubwayStation karlsplatzU1 = new SubwayStation("Karlsplatz", null, stephansplatzU1, SubwayLine.U1);
    SubwayStation taubstummengasseU1 = new SubwayStation("Taubstummengasse", null, karlsplatzU1, SubwayLine.U1);
    SubwayStation sudtirolerplatzU1 = new SubwayStation("Suedtiroler Platz", null, taubstummengasseU1, SubwayLine.U1);
    SubwayStation keplerplatzU1 = new SubwayStation("Keplerplatz", null, sudtirolerplatzU1, SubwayLine.U1);
    SubwayStation reumannplatzU1 = new SubwayStation("Reumannplatz", null, keplerplatzU1, SubwayLine.U1);
    SubwayStation troststrasseU1 = new SubwayStation("Troststrasse", null, reumannplatzU1, SubwayLine.U1);
    SubwayStation alteslandgutU1 = new SubwayStation("Altes Landgut", null, troststrasseU1, SubwayLine.U1);
    SubwayStation alaudagasseU1 = new SubwayStation("Alaudagasse", null, alteslandgutU1, SubwayLine.U1);
    SubwayStation neulaaU1 = new SubwayStation("Neulaa", null, alaudagasseU1, SubwayLine.U1);
    SubwayStation oberlaaU1 = new SubwayStation("Oberlaa", null, neulaaU1, SubwayLine.U1);

    // U6 Stationen

    SubwayStation floridsdorfU6 = new SubwayStation("Floridsdorf", null, null, SubwayLine.U6);
    SubwayStation neueDonauU6 = new SubwayStation("Neue Donau", null, floridsdorfU6, SubwayLine.U6);
    SubwayStation handelskaiU6 = new SubwayStation("Handelskai", null, neueDonauU6, SubwayLine.U6);
    SubwayStation dresdnerstrasseU6 = new SubwayStation("Dresdner Strasse", null, handelskaiU6, SubwayLine.U6);
    SubwayStation jagerstrasseU6 = new SubwayStation("Jaegerstrasse", null, dresdnerstrasseU6, SubwayLine.U6);
    SubwayStation spittelauU6 = new SubwayStation("Spittelau", null, jagerstrasseU6, SubwayLine.U6);
    SubwayStation nussdorferstrasseU6 = new SubwayStation("Nußdorfer Straße", null, spittelauU6, SubwayLine.U6);
    SubwayStation waehringerstrasseU6 = new SubwayStation("Waehringer Strasse", null, nussdorferstrasseU6, SubwayLine.U6);
    SubwayStation michelbeuernU6 = new SubwayStation("Michelbeuern", null, waehringerstrasseU6, SubwayLine.U6);
    SubwayStation alserstrasseU6 = new SubwayStation("Alser Strasse", null, michelbeuernU6, SubwayLine.U6);
    SubwayStation josefstadterstrasseU6 = new SubwayStation("Josefstädter Strasse", null, alserstrasseU6, SubwayLine.U6);
    SubwayStation thaliastrasseU6 = new SubwayStation("Thaliastrasse", null, josefstadterstrasseU6, SubwayLine.U6);
    SubwayStation burggasseU6 = new SubwayStation("Burggasse", null, thaliastrasseU6, SubwayLine.U6);
    SubwayStation westbahnhofU6 = new SubwayStation("Westbahnhof", null, burggasseU6, SubwayLine.U6);
    SubwayStation gumpendorferstrasseU6 = new SubwayStation("Gumpendorfer Strasse", null, westbahnhofU6, SubwayLine.U6);
    SubwayStation laengenfeldgasseU6 = new SubwayStation("Laengenfeldgasse", null, gumpendorferstrasseU6, SubwayLine.U6);
    SubwayStation niederhofstrasseU6 = new SubwayStation("Niederhofstrasse", null, laengenfeldgasseU6, SubwayLine.U6);
    SubwayStation bahnhofmeidlingU6 = new SubwayStation("Bahnhof Meidling", null, niederhofstrasseU6, SubwayLine.U6);
    SubwayStation tscherttegasseU6 = new SubwayStation("Tscherttegasse", null, bahnhofmeidlingU6, SubwayLine.U6);
    SubwayStation amschopfwerkU6 = new SubwayStation("Am Schöpfwerk", null, tscherttegasseU6, SubwayLine.U6);
    SubwayStation alterlaaU6 = new SubwayStation("Alterlaa", null, amschopfwerkU6, SubwayLine.U6);
    SubwayStation erlaaerstrasseU6 = new SubwayStation("Erlaaer Strasse", null, alterlaaU6, SubwayLine.U6);
    SubwayStation perfektastrasseU6 = new SubwayStation("Perfektastrasse", null, erlaaerstrasseU6, SubwayLine.U6);
    SubwayStation siebenhirtenU6 = new SubwayStation("Siebenhirten", null, perfektastrasseU6, SubwayLine.U6);

    // Subway Collectors

    public SubwayStationCollector oberlaa = new SubwayStationCollector(new LinkedList<>(List.of(oberlaaU1)));
    public SubwayStationCollector neulaa = new SubwayStationCollector(new LinkedList<>(List.of(neulaaU1)));
    public SubwayStationCollector alaudagasse = new SubwayStationCollector(new LinkedList<>(List.of(alaudagasseU1)));
    public SubwayStationCollector altesLandgut = new SubwayStationCollector(new LinkedList<>(List.of(alteslandgutU1)));
    public SubwayStationCollector troststrasse = new SubwayStationCollector(new LinkedList<>(List.of(troststrasseU1)));
    public SubwayStationCollector reumannplatz = new SubwayStationCollector(new LinkedList<>(List.of(reumannplatzU1)));
    public SubwayStationCollector keplerplatz = new SubwayStationCollector(new LinkedList<>(List.of(keplerplatzU1)));
    public SubwayStationCollector suedtirolerplatz = new SubwayStationCollector(new LinkedList<>(List.of(sudtirolerplatzU1)));
    public SubwayStationCollector taubstummengasse = new SubwayStationCollector(new LinkedList<>(List.of(taubstummengasseU1)));
    public SubwayStationCollector karlsplatz = new SubwayStationCollector(new LinkedList<>(Arrays.asList(karlsplatzU1, karlsplatzU2, karlsplatzU4)));
    public SubwayStationCollector stephansplatz = new SubwayStationCollector(new LinkedList<>(Arrays.asList(stephansplatzU1, stephansplatzU3)));
    public SubwayStationCollector schwedenplatz = new SubwayStationCollector(new LinkedList<>(Arrays.asList(schwedenplatzU1, schwedenplatzU4)));
    public SubwayStationCollector nestroyplatz = new SubwayStationCollector(new LinkedList<>(List.of(nestroyplatzU1)));
    public SubwayStationCollector praterstern = new SubwayStationCollector(new LinkedList<>(Arrays.asList(pratersternU1, pratersternU2)));
    public SubwayStationCollector vorgartenstrasse = new SubwayStationCollector(new LinkedList<>(List.of(vorgartenstrasseU1)));
    public SubwayStationCollector donauinsel = new SubwayStationCollector(new LinkedList<>(List.of(donauinselU1)));
    public SubwayStationCollector kaisermuehlenVIC = new SubwayStationCollector(new LinkedList<>(List.of(kaisermuehlenvicU1)));
    public SubwayStationCollector alteDonau = new SubwayStationCollector(new LinkedList<>(List.of(alteDonauU1)));
    public SubwayStationCollector kagran = new SubwayStationCollector(new LinkedList<>(List.of(kagranU1)));
    public SubwayStationCollector kagranerPlatz = new SubwayStationCollector(new LinkedList<>(List.of(kagranerplatzU1)));
    public SubwayStationCollector rennbahnweg = new SubwayStationCollector(new LinkedList<>(List.of(rennbahnwegU1)));
    public SubwayStationCollector aderklaaerStrasse = new SubwayStationCollector(new LinkedList<>(List.of(aderklaaerstrasseU1)));
    public SubwayStationCollector grossfeldsiedlung = new SubwayStationCollector(new LinkedList<>(List.of(grossfeldsiedlungU1)));
    public SubwayStationCollector leopoldau = new SubwayStationCollector(new LinkedList<>(List.of(leopoldauU1)));

    public SubwayStationCollector seestadt = new SubwayStationCollector(new LinkedList<>(List.of(seestadtU2)));
    public SubwayStationCollector aspernNord = new SubwayStationCollector(new LinkedList<>(List.of(aspernNordU2)));
    public SubwayStationCollector hausfeldstrasse = new SubwayStationCollector(new LinkedList<>(List.of(hausfeldstrasseU2)));
    public SubwayStationCollector aspernstrasse = new SubwayStationCollector(new LinkedList<>(List.of(aspernstrasseU2)));
    public SubwayStationCollector donauspital = new SubwayStationCollector(new LinkedList<>(List.of(donauspitalU2)));
    public SubwayStationCollector hardeggasse = new SubwayStationCollector(new LinkedList<>(List.of(hardeggasseU2)));
    public SubwayStationCollector stadlau = new SubwayStationCollector(new LinkedList<>(List.of(stadlauU2)));
    public SubwayStationCollector donaustadtbruecke = new SubwayStationCollector(new LinkedList<>(List.of(donaustadtbrueckeU2)));
    public SubwayStationCollector donaumarina = new SubwayStationCollector(new LinkedList<>(List.of(donaumarinaU2)));
    public SubwayStationCollector stadion = new SubwayStationCollector(new LinkedList<>(List.of(stadionU2)));
    public SubwayStationCollector krieau = new SubwayStationCollector(new LinkedList<>(List.of(krieauU2)));
    public SubwayStationCollector messeprater = new SubwayStationCollector(new LinkedList<>(List.of(messepraterU2)));
    public SubwayStationCollector taborstrasse = new SubwayStationCollector(new LinkedList<>(List.of(taborstrasseU2)));
    public SubwayStationCollector schottenring = new SubwayStationCollector(new LinkedList<>(Arrays.asList(schottenringU2, schottenringU4)));
    public SubwayStationCollector schottentorUniversitaet = new SubwayStationCollector(new LinkedList<>(List.of(schottentorU2)));
    public SubwayStationCollector rathaus = new SubwayStationCollector(new LinkedList<>(List.of(rathausU2)));
    public SubwayStationCollector volkstheater = new SubwayStationCollector(new LinkedList<>(Arrays.asList(volkstheaterU2, volkstheaterU3)));
    public SubwayStationCollector museumsquartier = new SubwayStationCollector(new LinkedList<>(List.of(museumsquartierU2)));

    public SubwayStationCollector ottakring = new SubwayStationCollector(new LinkedList<>(List.of(ottakringU3)));
    public SubwayStationCollector kendlerstrasse = new SubwayStationCollector(new LinkedList<>(List.of(kendlerstrasseU3)));
    public SubwayStationCollector huetteldorferstrasse = new SubwayStationCollector(new LinkedList<>(List.of(huetteldorferstrasseU3)));
    public SubwayStationCollector johnstrasse = new SubwayStationCollector(new LinkedList<>(List.of(johnstrasseU3)));
    public SubwayStationCollector schweglerstrasse = new SubwayStationCollector(new LinkedList<>(List.of(schweglerstrasseU3)));
    public SubwayStationCollector westbahnhof = new SubwayStationCollector(new LinkedList<>(List.of(westbahnhofU3)));
    public SubwayStationCollector zieglergasse = new SubwayStationCollector(new LinkedList<>(List.of(zieglergasseU3)));
    public SubwayStationCollector neubaugasse = new SubwayStationCollector(new LinkedList<>(List.of(neubaugasseU3)));
    public SubwayStationCollector herrengasse = new SubwayStationCollector(new LinkedList<>(List.of(herrengasseU3)));
    public SubwayStationCollector stubentor = new SubwayStationCollector(new LinkedList<>(List.of(stubentorU3)));
    public SubwayStationCollector landstrasse = new SubwayStationCollector(new LinkedList<>(Arrays.asList(landstrasseU3, landstrasseU4)));
    public SubwayStationCollector rochusgasse = new SubwayStationCollector(new LinkedList<>(List.of(rochusgasseU3)));
    public SubwayStationCollector kardinalnaglplatz = new SubwayStationCollector(new LinkedList<>(List.of(kardinalnaglplatzU3)));
    public SubwayStationCollector schlachthausgasse = new SubwayStationCollector(new LinkedList<>(List.of(schlachthausgasseU3)));
    public SubwayStationCollector erdberg = new SubwayStationCollector(new LinkedList<>(List.of(erdbergU3)));
    public SubwayStationCollector gasometer = new SubwayStationCollector(new LinkedList<>(List.of(gasometerU3)));
    public SubwayStationCollector zippererstrasse = new SubwayStationCollector(new LinkedList<>(List.of(zippererstrasseU3)));
    public SubwayStationCollector enkplatz = new SubwayStationCollector(new LinkedList<>(List.of(enkplatzU3)));
    public SubwayStationCollector simmering = new SubwayStationCollector(new LinkedList<>(List.of(simmeringU3)));

    public SubwayStationCollector huetteldorf = new SubwayStationCollector(new LinkedList<>(List.of(huetteldorfU4)));
    public SubwayStationCollector oberstveit = new SubwayStationCollector(new LinkedList<>(List.of(oberstveitU4)));
    public SubwayStationCollector unterstveit = new SubwayStationCollector(new LinkedList<>(List.of(unterstveitU4)));
    public SubwayStationCollector braunschweiggasse = new SubwayStationCollector(new LinkedList<>(List.of(braunschweiggasseU4)));
    public SubwayStationCollector hietzing = new SubwayStationCollector(new LinkedList<>(List.of(hietzingU4)));
    public SubwayStationCollector schoenbrunn = new SubwayStationCollector(new LinkedList<>(List.of(schonbrunnU4)));
    public SubwayStationCollector meidlingHauptstrasse = new SubwayStationCollector(new LinkedList<>(List.of(meidlingHauptstrasseU4)));
    public SubwayStationCollector laengenfeldgasse = new SubwayStationCollector(new LinkedList<>(Arrays.asList(laengenfeldgasseU4, laengenfeldgasseU6)));
    public SubwayStationCollector margaretenguertel = new SubwayStationCollector(new LinkedList<>(List.of(margaretenguertelU4)));
    public SubwayStationCollector pilgramgasse = new SubwayStationCollector(new LinkedList<>(List.of(pilgramgasseU4)));
    public SubwayStationCollector kettenbrueckengasse = new SubwayStationCollector(new LinkedList<>(List.of(kettenbrueckengasseU4)));
    public SubwayStationCollector stadtpark = new SubwayStationCollector(new LinkedList<>(List.of(stadtparkU4)));
    public SubwayStationCollector rossauerlaende = new SubwayStationCollector(new LinkedList<>(List.of(rossauerlaendeU4)));
    public SubwayStationCollector friedensbruecke = new SubwayStationCollector(new LinkedList<>(List.of(friedensbrueckeU4)));
    public SubwayStationCollector spittelau = new SubwayStationCollector(new LinkedList<>(Arrays.asList(spittelauU4, spittelauU6)));
    public SubwayStationCollector heiligenstadt = new SubwayStationCollector(new LinkedList<>(List.of(heiligenstadtU4)));

    public SubwayStationCollector floridsdorf = new SubwayStationCollector(new LinkedList<>(List.of(floridsdorfU6)));
    public SubwayStationCollector neueDonau = new SubwayStationCollector(new LinkedList<>(List.of(neueDonauU6)));
    public SubwayStationCollector handelskai = new SubwayStationCollector(new LinkedList<>(List.of(handelskaiU6)));
    public SubwayStationCollector dresdnerstrasse = new SubwayStationCollector(new LinkedList<>(List.of(dresdnerstrasseU6)));
    public SubwayStationCollector jaegerstrasse = new SubwayStationCollector(new LinkedList<>(List.of(jagerstrasseU6)));
    public SubwayStationCollector nussdorferstrasse = new SubwayStationCollector(new LinkedList<>(List.of(nussdorferstrasseU6)));
    public SubwayStationCollector waehringerstrasse = new SubwayStationCollector(new LinkedList<>(List.of(waehringerstrasseU6)));
    public SubwayStationCollector michelbeuernAKH = new SubwayStationCollector(new LinkedList<>(List.of(michelbeuernU6)));
    public SubwayStationCollector alserstrasse = new SubwayStationCollector(new LinkedList<>(List.of(alserstrasseU6)));
    public SubwayStationCollector josefstaedterstrasse = new SubwayStationCollector(new LinkedList<>(List.of(josefstadterstrasseU6)));
    public SubwayStationCollector thaliastrasse = new SubwayStationCollector(new LinkedList<>(List.of(thaliastrasseU6)));
    public SubwayStationCollector burggasse = new SubwayStationCollector(new LinkedList<>(List.of(burggasseU6)));
    public SubwayStationCollector gumppendorferstrasse = new SubwayStationCollector(new LinkedList<>(List.of(gumpendorferstrasseU6)));
    public SubwayStationCollector niederhofstrasse = new SubwayStationCollector(new LinkedList<>(List.of(niederhofstrasseU6)));
    public SubwayStationCollector bahnhofMeidling = new SubwayStationCollector(new LinkedList<>(List.of(bahnhofmeidlingU6)));
    public SubwayStationCollector tscherttegasse = new SubwayStationCollector(new LinkedList<>(List.of(tscherttegasseU6)));
    public SubwayStationCollector amSchoepfwerk = new SubwayStationCollector(new LinkedList<>(List.of(amschopfwerkU6)));
    public SubwayStationCollector alterlaa = new SubwayStationCollector(new LinkedList<>(List.of(alterlaaU6)));
    public SubwayStationCollector erlaaerstrasse = new SubwayStationCollector(new LinkedList<>(List.of(erlaaerstrasseU6)));
    public SubwayStationCollector perfektastrasse = new SubwayStationCollector(new LinkedList<>(List.of(perfektastrasseU6)));
    public SubwayStationCollector siebenhirten = new SubwayStationCollector(new LinkedList<>(List.of(siebenhirtenU6)));


    public SubwayNetwork() {

        // U3 inverse direction
        ottakringU3.setNextStation(kendlerstrasseU3);
        kendlerstrasseU3.setNextStation(huetteldorferstrasseU3);
        huetteldorferstrasseU3.setNextStation(johnstrasseU3);
        johnstrasseU3.setNextStation(schweglerstrasseU3);
        schweglerstrasseU3.setNextStation(westbahnhofU3);
        westbahnhofU3.setNextStation(zieglergasseU3);
        zieglergasseU3.setNextStation(neubaugasseU3);
        neubaugasseU3.setNextStation(volkstheaterU3);
        volkstheaterU3.setNextStation(herrengasseU3);
        herrengasseU3.setNextStation(stephansplatzU3);
        stephansplatzU3.setNextStation(stubentorU3);
        stubentorU3.setNextStation(landstrasseU3);
        landstrasseU3.setNextStation(rochusgasseU3);
        rochusgasseU3.setNextStation(kardinalnaglplatzU3);
        kardinalnaglplatzU3.setNextStation(schlachthausgasseU3);
        schlachthausgasseU3.setNextStation(erdbergU3);
        erdbergU3.setNextStation(gasometerU3);
        gasometerU3.setNextStation(zippererstrasseU3);
        zippererstrasseU3.setNextStation(enkplatzU3);
        enkplatzU3.setNextStation(simmeringU3);

        // U4 inverse direction
        huetteldorfU4.setNextStation(oberstveitU4);
        oberstveitU4.setNextStation(unterstveitU4);
        unterstveitU4.setNextStation(braunschweiggasseU4);
        braunschweiggasseU4.setNextStation(hietzingU4);
        hietzingU4.setNextStation(schonbrunnU4);
        schonbrunnU4.setNextStation(meidlingHauptstrasseU4);
        meidlingHauptstrasseU4.setNextStation(laengenfeldgasseU4);
        laengenfeldgasseU4.setNextStation(margaretenguertelU4);
        margaretenguertelU4.setNextStation(pilgramgasseU4);
        pilgramgasseU4.setNextStation(kettenbrueckengasseU4);
        kettenbrueckengasseU4.setNextStation(karlsplatzU4);
        karlsplatzU4.setNextStation(stadtparkU4);
        stadtparkU4.setNextStation(landstrasseU4);
        landstrasseU4.setNextStation(schwedenplatzU4);
        schwedenplatzU4.setNextStation(schottenringU4);
        schottenringU4.setNextStation(rossauerlaendeU4);
        rossauerlaendeU4.setNextStation(friedensbrueckeU4);
        friedensbrueckeU4.setNextStation(spittelauU4);
        spittelauU4.setNextStation(heiligenstadtU4);

        // U2 inverse direction
        karlsplatzU2.setNextStation(museumsquartierU2);
        museumsquartierU2.setNextStation(volkstheaterU2);
        volkstheaterU2.setNextStation(rathausU2);
        rathausU2.setNextStation(schottentorU2);
        schottentorU2.setNextStation(schottenringU2);
        schottenringU2.setNextStation(taborstrasseU2);
        taborstrasseU2.setNextStation(pratersternU2);
        pratersternU2.setNextStation(messepraterU2);
        messepraterU2.setNextStation(krieauU2);
        krieauU2.setNextStation(stadionU2);
        stadionU2.setNextStation(donaumarinaU2);
        donaumarinaU2.setNextStation(stadlauU2);
        stadlauU2.setNextStation(hardeggasseU2);
        hardeggasseU2.setNextStation(donauspitalU2);
        donauspitalU2.setNextStation(aspernstrasseU2);
        aspernstrasseU2.setNextStation(hausfeldstrasseU2);
        hausfeldstrasseU2.setNextStation(aspernNordU2);
        aspernNordU2.setNextStation(seestadtU2);

        // U1 inverse direction
        leopoldauU1.setNextStation(grossfeldsiedlungU1);
        grossfeldsiedlungU1.setNextStation(aderklaaerstrasseU1);
        aderklaaerstrasseU1.setNextStation(rennbahnwegU1);
        rennbahnwegU1.setNextStation(kagranerplatzU1);
        kagranerplatzU1.setNextStation(kagranU1);
        kagranU1.setNextStation(alteDonauU1);
        alteDonauU1.setNextStation(kaisermuehlenvicU1);
        kaisermuehlenvicU1.setNextStation(donauinselU1);
        donauinselU1.setNextStation(vorgartenstrasseU1);
        vorgartenstrasseU1.setNextStation(pratersternU1);
        pratersternU1.setNextStation(nestroyplatzU1);
        nestroyplatzU1.setNextStation(schwedenplatzU1);
        schwedenplatzU1.setNextStation(stephansplatzU1);
        stephansplatzU1.setNextStation(karlsplatzU1);
        karlsplatzU1.setNextStation(taubstummengasseU1);
        taubstummengasseU1.setNextStation(sudtirolerplatzU1);
        sudtirolerplatzU1.setNextStation(keplerplatzU1);
        keplerplatzU1.setNextStation(reumannplatzU1);
        reumannplatzU1.setNextStation(troststrasseU1);
        troststrasseU1.setNextStation(alteslandgutU1);
        alteslandgutU1.setNextStation(alaudagasseU1);
        alaudagasseU1.setNextStation(neulaaU1);
        neulaaU1.setNextStation(oberlaaU1);

        // U6 inverse direction
        floridsdorfU6.setNextStation(neueDonauU6);
        neueDonauU6.setNextStation(handelskaiU6);
        handelskaiU6.setNextStation(dresdnerstrasseU6);
        jagerstrasseU6.setNextStation(spittelauU6);
        spittelauU6.setNextStation(nussdorferstrasseU6);
        nussdorferstrasseU6.setNextStation(waehringerstrasseU6);
        waehringerstrasseU6.setNextStation(michelbeuernU6);
        michelbeuernU6.setNextStation(alserstrasseU6);
        alserstrasseU6.setNextStation(josefstadterstrasseU6);
        josefstadterstrasseU6.setNextStation(thaliastrasseU6);
        thaliastrasseU6.setNextStation(burggasseU6);
        burggasseU6.setNextStation(westbahnhofU6);
        westbahnhofU6.setNextStation(gumpendorferstrasseU6);
        gumpendorferstrasseU6.setNextStation(laengenfeldgasseU6);
        laengenfeldgasseU6.setNextStation(niederhofstrasseU6);
        niederhofstrasseU6.setNextStation(bahnhofmeidlingU6);
        bahnhofmeidlingU6.setNextStation(tscherttegasseU6);
        tscherttegasseU6.setNextStation(amschopfwerkU6);
        amschopfwerkU6.setNextStation(alterlaaU6);
        alterlaaU6.setNextStation(erlaaerstrasseU6);
        erlaaerstrasseU6.setNextStation(perfektastrasseU6);
        perfektastrasseU6.setNextStation(siebenhirtenU6);

        // Collectors U6
        siebenhirtenU6.setCollector(siebenhirten);
        perfektastrasseU6.setCollector(perfektastrasse);
        erlaaerstrasseU6.setCollector(erlaaerstrasse);
        alterlaaU6.setCollector(alterlaa);
        amschopfwerkU6.setCollector(amSchoepfwerk);
        tscherttegasseU6.setCollector(tscherttegasse);
        bahnhofmeidlingU6.setCollector(bahnhofMeidling);
        niederhofstrasseU6.setCollector(niederhofstrasse);
        laengenfeldgasseU6.setCollector(laengenfeldgasse);
        gumpendorferstrasseU6.setCollector(gumppendorferstrasse);
        westbahnhofU6.setCollector(westbahnhof);
        burggasseU6.setCollector(burggasse);
        thaliastrasseU6.setCollector(thaliastrasse);
        josefstadterstrasseU6.setCollector(josefstaedterstrasse);
        alserstrasseU6.setCollector(alserstrasse);
        michelbeuernU6.setCollector(michelbeuernAKH);
        waehringerstrasseU6.setCollector(waehringerstrasse);
        nussdorferstrasseU6.setCollector(nussdorferstrasse);
        spittelauU6.setCollector(spittelau);
        jagerstrasseU6.setCollector(jaegerstrasse);
        dresdnerstrasseU6.setCollector(dresdnerstrasse);
        handelskaiU6.setCollector(handelskai);
        neueDonauU6.setCollector(neueDonau);
        floridsdorfU6.setCollector(floridsdorf);

        // Collectors U1
        leopoldauU1.setCollector(leopoldau);
        grossfeldsiedlungU1.setCollector(grossfeldsiedlung);
        aderklaaerstrasseU1.setCollector(aderklaaerStrasse);
        rennbahnwegU1.setCollector(rennbahnweg);
        kagranerplatzU1.setCollector(kagranerPlatz);
        kagranU1.setCollector(kagran);
        alteDonauU1.setCollector(alteDonau);
        kaisermuehlenvicU1.setCollector(kaisermuehlenVIC);
        donauinselU1.setCollector(donauinsel);
        vorgartenstrasseU1.setCollector(vorgartenstrasse);
        pratersternU1.setCollector(praterstern);
        nestroyplatzU1.setCollector(nestroyplatz);
        schwedenplatzU1.setCollector(schwedenplatz);
        stephansplatzU1.setCollector(stephansplatz);
        karlsplatzU1.setCollector(karlsplatz);
        taubstummengasseU1.setCollector(taubstummengasse);
        sudtirolerplatzU1.setCollector(suedtirolerplatz);
        keplerplatzU1.setCollector(keplerplatz);
        reumannplatzU1.setCollector(reumannplatz);
        troststrasseU1.setCollector(troststrasse);
        alteslandgutU1.setCollector(altesLandgut);
        alaudagasseU1.setCollector(alaudagasse);
        neulaaU1.setCollector(neulaa);
        oberlaaU1.setCollector(oberlaa);

        // Collectors U2
        karlsplatzU2.setCollector(karlsplatz);
        museumsquartierU2.setCollector(museumsquartier);
        volkstheaterU2.setCollector(volkstheater);
        rathausU2.setCollector(rathaus);
        schottentorU2.setCollector(schottentorUniversitaet);
        schottenringU2.setCollector(schottenring);
        taborstrasseU2.setCollector(taborstrasse);
        pratersternU2.setCollector(praterstern);
        messepraterU2.setCollector(messeprater);
        krieauU2.setCollector(krieau);
        stadionU2.setCollector(stadion);
        donaumarinaU2.setCollector(donaumarina);
        donaustadtbrueckeU2.setCollector(donaustadtbruecke);
        stadlauU2.setCollector(stadlau);
        hardeggasseU2.setCollector(hardeggasse);
        donauspitalU2.setCollector(donauspital);
        aspernstrasseU2.setCollector(aspernstrasse);
        hausfeldstrasseU2.setCollector(hausfeldstrasse);
        aspernNordU2.setCollector(aspernNord);
        seestadtU2.setCollector(seestadt);

        // Collectors U3
        ottakringU3.setCollector(ottakring);
        kendlerstrasseU3.setCollector(kendlerstrasse);
        huetteldorferstrasseU3.setCollector(huetteldorferstrasse);
        johnstrasseU3.setCollector(johnstrasse);
        schweglerstrasseU3.setCollector(schweglerstrasse);
        westbahnhofU3.setCollector(westbahnhof);
        zieglergasseU3.setCollector(zieglergasse);
        neubaugasseU3.setCollector(neubaugasse);
        volkstheaterU3.setCollector(volkstheater);
        herrengasseU3.setCollector(herrengasse);
        stephansplatzU3.setCollector(stephansplatz);
        stubentorU3.setCollector(stubentor);
        landstrasseU3.setCollector(landstrasse);
        rochusgasseU3.setCollector(rochusgasse);
        kardinalnaglplatzU3.setCollector(kardinalnaglplatz);
        schlachthausgasseU3.setCollector(schlachthausgasse);
        erdbergU3.setCollector(erdberg);
        gasometerU3.setCollector(gasometer);
        zippererstrasseU3.setCollector(zippererstrasse);
        enkplatzU3.setCollector(enkplatz);
        simmeringU3.setCollector(simmering);

        // Collectors U4
        heiligenstadtU4.setCollector(heiligenstadt);
        spittelauU4.setCollector(spittelau);
        friedensbrueckeU4.setCollector(friedensbruecke);
        rossauerlaendeU4.setCollector(rossauerlaende);
        schottenringU4.setCollector(schottenring);
        schwedenplatzU4.setCollector(schwedenplatz);
        landstrasseU4.setCollector(landstrasse);
        stadtparkU4.setCollector(stadtpark);
        karlsplatzU4.setCollector(karlsplatz);
        kettenbrueckengasseU4.setCollector(kettenbrueckengasse);
        pilgramgasseU4.setCollector(pilgramgasse);
        margaretenguertelU4.setCollector(margaretenguertel);
        laengenfeldgasseU4.setCollector(laengenfeldgasse);
        meidlingHauptstrasseU4.setCollector(meidlingHauptstrasse);
        schonbrunnU4.setCollector(schoenbrunn);
        hietzingU4.setCollector(hietzing);
        braunschweiggasseU4.setCollector(braunschweiggasse);
        unterstveitU4.setCollector(unterstveit);
        oberstveitU4.setCollector(oberstveit);
        huetteldorfU4.setCollector(huetteldorf);
    }

    public List<SubwayStationCollector> getPathBetween(SubwayStationCollector from, SubwayStationCollector to){

        if (from.equals(to)) return new ArrayList<>(List.of(from));

        List<SubwayStationCollector> toReturn;

        if (!SimConfig.isPerformanceModeSubwayPath){
            DijkstraResponseClass responseFromTo = this.getShortestPathDijkstra(from, to);
            DijkstraResponseClass responseToFrom = this.getShortestPathDijkstra(to, from);

            if (responseFromTo.distance < responseToFrom.distance){
                toReturn = responseFromTo.path;
                Collections.reverse(toReturn);
            } else {
                toReturn = responseToFrom.path;
            }
        } else {
            toReturn = this.getShortestPathDijkstra(from, to).path;
            Collections.reverse(toReturn);
        }

        return toReturn;
    }

    public List<SubwayStationCollector> getAllStations() {
        Field[] fields = this.getClass().getFields();
        List<SubwayStationCollector> toReturn = new ArrayList<>();

        for (Field field: fields){
            try {
                if (field.getType().equals(SubwayStationCollector.class)) {
                    toReturn.add((SubwayStationCollector) field.get(this));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return toReturn;
    }

    private DijkstraResponseClass getShortestPathDijkstra(SubwayStationCollector from, SubwayStationCollector to) {
        List<SubwayStationCollector> Q = new ArrayList<>();
        HashMap<SubwayStationCollector, Integer> dist = new HashMap<>();
        HashMap<SubwayStationCollector, SubwayStationCollector> prev = new HashMap<>();
        SubwayLine currentLine = null;

        for (SubwayStationCollector station: this.getAllStations()){
            Q.add(station);
            dist.put(station, Integer.MAX_VALUE);
            prev.put(station, null);
        }

        dist.put(from, 0);

        while (Q.size() > 0){
            SubwayStationCollector u = this.getMinStationDist(Q, dist);
            Q.remove(u);

            // Get current active line for the given node
            if (prev.get(u) != null){
                List<SubwayStation> previousStations = prev.get(u).getStations();
                List<SubwayStation> currentStations = u.getStations();

                List<SubwayLine> previousStationLines = new ArrayList<>();

                for (SubwayStation station: previousStations){
                    previousStationLines.add(station.getLine());
                }

                for (SubwayStation station: currentStations){
                    if (previousStationLines.contains(station.getLine())){
                        currentLine = station.getLine();
                    }
                }
            }

            List<SubwayStationCollector> neighbours = new ArrayList<>();

            for (SubwayStation lineStation: u.getStations()){
                if (lineStation.getNextStation() != null && !neighbours.contains(lineStation.getNextStation().getCollector())) {
                    neighbours.add(lineStation.getNextStation().getCollector());
                }
                if (lineStation.getPreviousStation() != null && !neighbours.contains(lineStation.getPreviousStation().getCollector())) {
                    neighbours.add(lineStation.getPreviousStation().getCollector());
                }
            }

            for (SubwayStationCollector v: neighbours){
                int alt = dist.get(u);

                if (currentLine != null){
                    List<SubwayLine> linesForNeighbour = new ArrayList<>();
                    for (SubwayStation station: v.getStations()){
                        linesForNeighbour.add(station.getLine());
                    }

                    if (linesForNeighbour.contains(currentLine)){
                        alt += 1;
                    } else {
                        alt += SimConfig.increasedFactorForSubwayLineChange;
                    }
                } else {
                    alt += 1;
                }

                if (alt < dist.get(v)) {
                    dist.put(v, alt);
                    prev.put(v, u);
                }
            }
        }
        return new DijkstraResponseClass(this.getPathFromPrevHash(from, to, prev), dist.get(to));
    }

    private List<SubwayStationCollector> getPathFromPrevHash(SubwayStationCollector from,
                                                             SubwayStationCollector to,
                                                             HashMap<SubwayStationCollector, SubwayStationCollector> prev){

        List<SubwayStationCollector> S = new ArrayList<>();
        SubwayStationCollector u = to;

        if (prev.get(u) != null || u.equals(to)){
            while (u != null){
                S.add(u);
                u = prev.get(u);
            }
        }

        return S;
    }

    private SubwayStationCollector getMinStationDist(List<SubwayStationCollector> Q, HashMap<SubwayStationCollector, Integer> dist){
        int minValue = Integer.MAX_VALUE;
        SubwayStationCollector toReturn = null;

        for (SubwayStationCollector station: Q){
            if (dist.get(station) < minValue){
                minValue = dist.get(station);
                toReturn = station;
            }
        }

        return toReturn;
    }
}

class DijkstraResponseClass {
    public List<SubwayStationCollector> path;
    public int distance;

    public DijkstraResponseClass(List<SubwayStationCollector> path, int distance){
        this.path = path;
        this.distance = distance;
    }
}