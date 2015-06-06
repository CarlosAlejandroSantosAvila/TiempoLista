package as.alejandrosantos.tiempo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ListView listaClimas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);


        ArrayList<Clima> datos = new ArrayList<Clima>();

        datos.add(new Clima("Lunes", "Nublado.","23°c/30°c", R.drawable.nublado));
        datos.add(new Clima( "Martes", "soleado.","24°c/35°c",R.drawable.soleado));
        datos.add(new Clima( "Miercoles", "Lluvioso.","20°c/29°c",R.drawable.lluvia));
        datos.add(new Clima("Jueves", "Nuboso.","19°c/25°c",R.drawable.nublado ));
        datos.add(new Clima("Viernes", "Lluvia.","20°c/36°c",R.drawable.lluvia ));
        datos.add(new Clima( "Sabado", "Ventoso.","19°c/26°c",R.drawable.nublado));
        datos.add(new Clima( "Domingo", "Soleado","5°c/15°c",R.drawable.soleado));


        listaClimas = (ListView) findViewById(R.id.list_item);
        listaClimas.setAdapter(new ClimaAdapter(this, R.layout.item_clima, datos){
            @Override
            public void onEntrada(Object climas, View view) {

            }
        });

        



    }

}