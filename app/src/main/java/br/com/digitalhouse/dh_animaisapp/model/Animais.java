package br.com.digitalhouse.dh_animaisapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Animais implements Parcelable {
    private String nome;
    private int imagem;
    private String detalhe;

    public Animais () {

    }

    public Animais(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    protected Animais(Parcel in){
        imagem = in.readInt();
        nome = in.readString();
    }

    public static final Creator<Animais> CREATOR = new Creator<Animais>() {
        @Override
        public Animais createFromParcel(Parcel in) {
            return new Animais(in);
        }

        @Override
        public Animais[] newArray(int size) {
            return new Animais[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagem);
        dest.writeString(nome);

    }
}
