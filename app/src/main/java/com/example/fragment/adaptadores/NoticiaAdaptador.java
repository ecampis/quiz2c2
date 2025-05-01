package com.example.fragment.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.R;
import com.example.fragment.clases.Noticia;

import java.util.List;

public class NoticiaAdaptador extends RecyclerView.Adapter<NoticiaAdaptador.ViewHolder> {
    private List<Noticia> noticias;

    public NoticiaAdaptador(List<Noticia> noticias) {
        this.noticias = noticias;

    }



    @NonNull
    @Override
    public NoticiaAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_noticia, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticiaAdaptador.ViewHolder holder, int position) {
        Noticia noticia = noticias.get(position);
        holder.bind(noticia);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_titulo, txt_descripcion;
        ImageView imagen_noticia;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_titulo = itemView.findViewById(R.id.txt_titulo);
            txt_descripcion = itemView.findViewById(R.id.txt_descripcion);
            imagen_noticia = itemView.findViewById(R.id.imagen_noticia);
        }

        public void bind(Noticia noticia) {
            txt_titulo.setText(noticia.getTitulo());
            txt_descripcion.setText(noticia.getDescripcion());
            // imagen
        }
    }




}
