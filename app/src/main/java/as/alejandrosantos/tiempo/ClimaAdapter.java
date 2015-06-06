package as.alejandrosantos.tiempo;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandro Santos on 02/06/2015.
 */
public abstract class ClimaAdapter extends BaseAdapter {
    private ArrayList<Clima> climas;
    private int R_layout_IdView;
    private Context contexto;

    public ClimaAdapter(Context contexto, int R_layout_IdView, ArrayList<Clima> climas) {
        super();
        this.contexto = contexto;
        this.climas = climas;
        this.R_layout_IdView = R_layout_IdView;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup pariente) {
        if (view == null) {
            LayoutInflater vi = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(R_layout_IdView, null);
        }
        onEntrada (climas.get(posicion), view);
        return view;
    }

    @Override
    public int getCount() {
        return climas.size();
    }

    @Override
    public Object getItem(int posicion) {
        return climas.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {
        return posicion;
    }


    public abstract void onEntrada (Object climas, View view);

}