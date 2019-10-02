package br.com.digitalhouse.dh_animaisapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.dh_animaisapp.R;
import br.com.digitalhouse.dh_animaisapp.adapter.AnimaisAdapter;
import br.com.digitalhouse.dh_animaisapp.interfaces.RecyclerViewOnClick;
import br.com.digitalhouse.dh_animaisapp.model.Animais;

public class MainActivity extends AppCompatActivity implements RecyclerViewOnClick {

    private RecyclerView recyclerView;
    private AnimaisAdapter adapter;
    private List<Animais> listaAnimais = new ArrayList<>();
    public static final String ANIMAL_KEY = "animal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewAnimais);

        adapter = new AnimaisAdapter(retornaListaAnimais(), this);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public List<Animais> retornaListaAnimais(){
        listaAnimais.add(new Animais("Cachorro", R.drawable.cachorro));
        listaAnimais.add(new Animais("Gato", R.drawable.gato));
        listaAnimais.add(new Animais("Leão", R.drawable.leao));
        listaAnimais.add(new Animais("Coelho", R.drawable.coelho));
        listaAnimais.add(new Animais("Abelha", R.drawable.abelha));
        listaAnimais.add(new Animais("Tartaruga", R.drawable.tartaruga));
        listaAnimais.add(new Animais("Golfinho", R.drawable.golfinho));

        return listaAnimais;
    }

    @Override
    public void onClick(Animais animal) {
        Intent intent = new Intent (MainActivity.this, DetalheAnimalActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ANIMAL_KEY, animal);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
