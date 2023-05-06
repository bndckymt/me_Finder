package com.example.me_finder;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.example.me_finder.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    //for layout
    Spinner Islands, Regions, Provinces, Municipality, Hospital, Coordinates, Coordinates2;

    //for data.add
    List<String> island = new ArrayList<>();
    List<String> region = new ArrayList<>();
    List<String> provinces = new ArrayList<>();
    List<String> municipality = new ArrayList<>();
    List<String> hospital = new ArrayList<>();

    List<String> Long_t = new ArrayList<>();
    List<String> La_t = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);





//for converting id's
        Islands = findViewById(R.id.ISLANDS);
        Regions = findViewById(R.id.REGION);
        Provinces = findViewById(R.id.PROVINCE);
        Municipality = findViewById(R.id.MUNICIPALITY);
        Hospital = findViewById(R.id.HOSPITAL);

        Coordinates = findViewById(R.id.COORDINATES);
        Coordinates2 = findViewById(R.id.COORDINATES2);

//for ISLANDS
        //ISLANDS
        island.add("Luzon");
        island.add("Visayas");
        island.add("Mindanao");
        //for access in islands
        ArrayAdapter<String> adapter_1 = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, island);
        adapter_1.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        Islands.setAdapter(adapter_1);

//for the menus of islands
        Islands.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                if (adapterView.getItemAtPosition(i).equals("Luzon")) {
                    region.clear();
                    region.add("National Capital Region(NCR)");
                    region.add("Cordillera Administrative Region (CAR)");
                    region.add("Ilocos Region (Region I)");
                    region.add("Cagayan Valley (Region II)");
                    region.add("Central Luzon (Region III)");
                    region.add("Calabarzon (Region IV-A))");
                    region.add("Southwestern Tagalog Region (Mimaropa)");
                    region.add("Bicol Region(Region V)");
                    i_lands();
                } else if (adapterView.getItemAtPosition(i).equals("Visayas")) {
                    region.clear();
                    region.add("Western Visayas (Region VI)");
                    region.add("Central Visayas (Region VII)");
                    region.add("Eastern Visayas (Region VIII)");
                    i_lands();
                } else if (adapterView.getItemAtPosition(i).equals("Mindanao")) {
                    region.clear();
                    region.add("Zamboanga Peninsula (Region IX)");
                    region.add("Northern Mindanao (Region X)");
                    region.add("Davao Region (Region XI)");
                    region.add("Soccsksargen (Region XII)");
                    region.add("Caraga (Region XIII)");
                    region.add("Bangsamoro (BARMM)");
                    i_lands();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void i_lands() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, region);
        adapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        Regions.setAdapter(adapter);

        Regions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                if (adapterView.getItemAtPosition(i).equals("National Capital Region(NCR)")) {
                    provinces.clear();
                    provinces.add("Caloocan City");
                    provinces.add("Las Pinas City");
                    provinces.add("Makati City");
                    provinces.add("Malabon City");
                    provinces.add("Mandaluyong City");
                    provinces.add("Marikina City");
                    provinces.add("Muntinlupa City");
                    provinces.add("Paranaque City");
                    provinces.add("Pasay City");
                    provinces.add("Pasig City");
                    provinces.add("Quezon City");
                    provinces.add("Taguig City");
                    provinces.add("Valenzuela City");
                    provinces.add("Navotas");
                    provinces.add("Pateros");
                    provinces.add("San Juan");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Cordillera Administrative Region (CAR)")) {
                    provinces.clear();
                    provinces.add("Abra");
                    provinces.add("Apayao");
                    provinces.add("Benguet");
                    provinces.add("Ifugao");
                    provinces.add("Kalinga");
                    provinces.add("Mountain Province");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Ilocos Region (Region I)")) {
                    provinces.clear();
                    provinces.add("Ilocos Norte");
                    provinces.add("Ilocos Sur");
                    provinces.add("La Union");
                    provinces.add("Pangasinan");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Cagayan Valley (Region II)")) {
                    provinces.clear();
                    provinces.add("Batanes");
                    provinces.add("Cagayan");
                    provinces.add("Isabela");
                    provinces.add("Nueva Vizcaya");
                    provinces.add("Quirino");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Central Luzon (Region III)")) {
                    provinces.clear();
                    provinces.add("Angeles");
                    provinces.add("Aurora");
                    provinces.add("Bataan");
                    provinces.add("Bulacan");
                    provinces.add("ANueva Ecija");
                    provinces.add("Olongapo");
                    provinces.add("Pampanga");
                    provinces.add("Tarlac");
                    provinces.add("Zambales");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Calabarzon (Region IV-A))")) {
                    provinces.clear();
                    provinces.add("Batangas");
                    provinces.add("Cavite");
                    provinces.add("Laguna");
                    provinces.add("Quezon");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Southwestern Tagalog Region (Mimaropa)")) {
                    provinces.clear();
                    provinces.add("Marinduque");
                    provinces.add("Occidental Mindoro");
                    provinces.add("Oriental Mindoro");
                    provinces.add("Palawan");
                    provinces.add("Romblon");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Bicol Region(Region V)")) {
                    provinces.clear();
                    provinces.add("Albay");
                    provinces.add("Camarines Norte");
                    provinces.add("Camarines Sur");
                    provinces.add("Catanduanes");
                    provinces.add("Masbate");
                    provinces.add("Sorsogon");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Western Visayas (Region VI)")) {
                    provinces.clear();
                    provinces.add("Aklan");
                    provinces.add("Antique");
                    provinces.add("Bacolod");
                    provinces.add("Capiz");
                    provinces.add("Guimaras");
                    provinces.add("Iloilo");
                    provinces.add("Iloilo City");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Central Visayas (Region VII)")) {
                    provinces.clear();
                    provinces.add("Bohol");
                    provinces.add("Cebu");
                    provinces.add("Cebu City");
                    provinces.add("Lapu-Lapu");
                    provinces.add("Mandaue");
                    provinces.add("Negros Oriental");
                    provinces.add("Siquijor");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Eastern Visayas (Region VIII)")) {
                    provinces.clear();
                    provinces.add("Biliran");
                    provinces.add("Eastern Samar");
                    provinces.add("Leyte");
                    provinces.add("Northern Samar");
                    provinces.add("Samar");
                    provinces.add("Southern Leyte");
                    provinces.add("Tacloban");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Zamboanga Peninsula (Region IX)")) {
                    provinces.clear();
                    provinces.add("Isabela City");
                    provinces.add("Zamboanga City");
                    provinces.add("Zamboanga del Norte");
                    provinces.add("Zamboanga del Sur");
                    provinces.add("Zamboanga Sibugay");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Northern Mindanao (Region X)")) {
                    provinces.clear();
                    provinces.add("Bukidnon");
                    provinces.add("Cagayan de Oro");
                    provinces.add("Camiguin");
                    provinces.add("Iligan");
                    provinces.add("Lanao del Norte");
                    provinces.add("Lanao del Norte)");
                    provinces.add("Misamis Oriental");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Davao Region (Region XI)")) {
                    provinces.clear();
                    provinces.add("Davao de Oro");
                    provinces.add("Davao City");
                    provinces.add("Davao del Norte");
                    provinces.add("Davao del Sur");
                    provinces.add("DDavao Occidental");
                    provinces.add("Davao Oriental");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Soccsksargen (Region XII)")) {
                    provinces.clear();
                    provinces.add("Cotabato");
                    provinces.add("Cotabato City");
                    provinces.add("General Santos");
                    provinces.add("Sarangani");
                    provinces.add("South Cotabato");
                    provinces.add("Sultan Kudarat");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Caraga (Region XIII)")) {
                    provinces.clear();
                    provinces.add("Agusan del Norte");
                    provinces.add("Agusan del Sur");
                    provinces.add("Butuan");
                    provinces.add("Dinagat Islands");
                    provinces.add("Surigao del Norte");
                    provinces.add("Surigao del Sur");
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Bangsamoro (BARMM)")) {
                    provinces.clear();
                    provinces.add("Basilan");
                    provinces.add("Lanao del Sur");
                    provinces.add("Maguindanao");
                    provinces.add("Sulu");
                    provinces.add("Tawi-Tawi");
                    regions();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void regions() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, provinces);
        adapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        Provinces.setAdapter(adapter);

        Provinces.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                if (adapterView.getItemAtPosition(i).equals("Caloocan City")) {
                    municipality.clear();
                    regions();
                } else if (adapterView.getItemAtPosition(i).equals("Las Pinas City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Makati City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Malabon City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Mandaluyong City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Marikina City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Muntinlupa City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Paranaque City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Pasay City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Pasig City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Quezon City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Taguig City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Valenzuela City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Navotas")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Pateros")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("San Juan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Abra")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Apayao")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Benguet")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Ifugao")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Kalinga")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Mountain Province")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Ilocos Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Ilocos Sur")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("La Union")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Pangasinan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Batanes")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Cagayan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Isabela")) {
                    municipality.clear();
                    municipality.add("Echague");
                    municipality.add("Santiago");
                    municipality.add("Alicia");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Nueva Vizcaya")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Quirino")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Angeles")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Aurora")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Bataan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Bulacan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Nueva Ecija")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Olongapo")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Pampanga")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Tarlac")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Zambales")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Batangas")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Cavite")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Laguna")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Quezon")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Marinduque")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Occidental Mindoro")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Oriental Mindoro")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Palawan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Romblon")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Albay")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Camarines Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Camarines Sur")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Catanduanes")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Masbate")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Sorsogon")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Aklan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Antique")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Bacolod")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Capiz")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Guimaras")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Iloilo")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Iloilo City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Bohol")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Cebu")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Cebu City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Lapu-Lapu")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Mandaue")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Negros Oriental")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Siquijor")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Biliran")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Eastern Samar")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Leyte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Northern Samar")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Samar")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Southern Leyte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Tacloban")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Isabela City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Zamboanga City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Zamboanga del Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Zamboanga del Sur")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Zamboanga Sibugay")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Bukidnon")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Cagayan de Oro")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Camiguin")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Iligan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Lanao del Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Lanao del Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Misamis Oriental")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Davao de Oro")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Davao City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Davao del Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Davao del Sur")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Davao Occidental")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Davao Oriental")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Cotabato")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Cotabato City")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("General Santos")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Sarangani")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("South Cotabato")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Sultan Kudarat")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Agusan del Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Agusan del Sur")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Butuan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Dinagat Islands")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Surigao del Norte")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Surigao del Sur")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Basilan")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Lanao del Sur")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Maguindanao")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Sulu")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                } else if (adapterView.getItemAtPosition(i).equals("Tawi-Tawi")) {
                    municipality.clear();
                    municipality.add("ABC1");
                    p_rovince();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void p_rovince() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, municipality);
        adapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        Municipality.setAdapter(adapter);

        Municipality.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                if (adapterView.getItemAtPosition(i).equals("Echague")) {
                    hospital.clear();
                    hospital.add("Emergency");
                    hospital.add("Isabela Hospital");
                    h_ospital();
                } else if (adapterView.getItemAtPosition(i).equals("Santiago")) {
                    hospital.clear();
                    hospital.add("ythdhfdhdh2");
                    h_ospital();

                } else if (adapterView.getItemAtPosition(i).equals("Alicia")) {
                    hospital.clear();
                    hospital.add("ythdhfdhdh3");
                    h_ospital();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void h_ospital() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, hospital);
        adapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        Hospital.setAdapter(adapter);

        Hospital.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                if (adapterView.getItemAtPosition(i).equals("Emergency")) {
                    Long_t.clear();
                    La_t.clear();
                    Long_t.add("000000000000");
                    La_t.add("111111111111");
                    c_ordinates();
                } else if (adapterView.getItemAtPosition(i).equals("Isabela Hospital")) {
                    Long_t.clear();
                    La_t.clear();
                    Long_t.add("222222222222");
                    La_t.add("33333333333");
                    c_ordinates();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void c_ordinates() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, Long_t);
        adapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, La_t);
        adapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);

        Coordinates.setAdapter(adapter);
        Coordinates2.setAdapter(adapter1);
    }

    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        /* Add a marker in Sydney and move the camera */

        Spinner Coordinates = findViewById(R.id.COORDINATES);
        Spinner Coordinates2 = findViewById(R.id.COORDINATES2);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Long_t);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, La_t);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Coordinates.setAdapter(adapter);
        Coordinates2.setAdapter(adapter1);

        String latitude_str = Coordinates.getSelectedItem().toString();
        String longitude_str = Coordinates2.getSelectedItem().toString();

        double latitude = Double.parseDouble(latitude_str);
        double longitude = Double.parseDouble(longitude_str);

        LatLng location = new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(location).title("Map here"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location));
    }
}