package br.com.digitalhouse.dh_animaisapp.view;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.digitalhouse.dh_animaisapp.R;
import br.com.digitalhouse.dh_animaisapp.model.Animais;

import static br.com.digitalhouse.dh_animaisapp.view.MainActivity.ANIMAL_KEY;

public class DetalheAnimalActivity extends AppCompatActivity {
    private ImageView imagemAnimal;
    private TextView tipoAnimal;
    private TextView sobreAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_animal);

        initViews();

        if (getIntent() != null && getIntent().getExtras() != null){
            Animais animal = getIntent().getExtras().getParcelable(ANIMAL_KEY);

            Drawable drawable = getResources().getDrawable(animal.getImagem());
            imagemAnimal.setImageDrawable((drawable));
            tipoAnimal.setText(animal.getNome());
            sobreAnimal.setText("Este animal é um " + animal.getNome());
        }


    }

    public void initViews(){
        imagemAnimal = findViewById(R.id.imagemAnimal);
        tipoAnimal = findViewById(R.id.tipoAnimal);
        sobreAnimal = findViewById(R.id.sobreAnimal);
    }
}
