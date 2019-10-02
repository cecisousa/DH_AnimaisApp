package br.com.digitalhouse.dh_animaisapp.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.dh_animaisapp.R;
import br.com.digitalhouse.dh_animaisapp.interfaces.RecyclerViewOnClick;
import br.com.digitalhouse.dh_animaisapp.model.Animais;

public class AnimaisAdapter extends RecyclerView.Adapter<AnimaisAdapter.ViewHolder> {

    private List<Animais> listaAnimais;

    private RecyclerViewOnClick listener;

    public AnimaisAdapter (List<Animais> listaAnimais, RecyclerViewOnClick listener){
        this.listaAnimais = listaAnimais;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recyclerview, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int posicao) {
        final Animais animal = listaAnimais.get(posicao);
        holder.onBind(animal);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(animal);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaAnimais.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgAnimal;
        private TextView txtAnimal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgAnimal = itemView.findViewById(R.id.imageView);
            txtAnimal = itemView.findViewById(R.id.textViewNome);
        }

        public void onBind(Animais animal){
            Drawable drawable = itemView.getResources().getDrawable(animal.getImagem());
            imgAnimal.setImageDrawable(drawable);
            txtAnimal.setText(animal.getNome());
        }
    }
}
