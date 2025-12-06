package com.example.tienditaapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usuarioEditText, contraseñaEditText;
    private Button botonIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_login);  // Cambia al layout de login

        // Inicialización de vistas
        usuarioEditText = findViewById(R.id.usuario);
        contraseñaEditText = findViewById(R.id.contraseña);
        botonIngresar = findViewById(R.id.botonIngresar);

        // Acción del botón Ingresar
        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = usuarioEditText.getText().toString();
                String contraseña = contraseñaEditText.getText().toString();

                // Verificación de las credenciales y redirección
                if (usuario.equals("genesis") && contraseña.equals("password")) {
                    // Si las credenciales son correctas, ir al Dashboard
                    Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(intent);
                } else {
                    // Aquí puedes añadir un mensaje de error si las credenciales son incorrectas
                }
            }
        });
    }
}
