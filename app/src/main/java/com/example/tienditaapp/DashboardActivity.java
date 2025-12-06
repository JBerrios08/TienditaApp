package com.example.tienditaapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DashboardActivity extends AppCompatActivity {

    private RecyclerView listaProductosRecientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_dashboard);  // Cambia al layout del dashboard

        // Inicialización de la vista de lista de productos
        listaProductosRecientes = findViewById(R.id.listaProductosRecientes);
        listaProductosRecientes.setLayoutManager(new LinearLayoutManager(this));

        // Aquí agregarás el código para cargar los productos recientes de la API o base de datos
        // Puedes usar un Adapter para mostrar la lista de productos recientes
    }
}

