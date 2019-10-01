package br.com.digitalhouse.dh_animaisapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.dh_animaisapp.adapter.AnimaisAdapter;
import br.com.digitalhouse.dh_animaisapp.model.Animais;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AnimaisAdapter adapter;
    private List<Animais> listaAnimais = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewAnimais);

        adapter = new AnimaisAdapter(retornaListaAnimais());

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
}
