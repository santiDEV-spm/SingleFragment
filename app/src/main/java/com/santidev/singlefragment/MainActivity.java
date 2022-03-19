package com.santidev.singlefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conseguir el fragment manager para gestionar fragmentos
        FragmentManager manager = getFragmentManager();
        //creamos un nuevo fragmento usando el manager
        //El identificador que usmaos es el que anadimos en el container donde se mostrara el fragmento
        Fragment fragment = manager.findFragmentById(R.id.fragment_holder);
        //solo inflaremos el fragmento si no se ha inicializado antes
        if(fragment == null){
            fragment = new SingleFragment();
            manager.beginTransaction()
                    .add(R.id.fragment_holder, fragment)
                    .commit();
        }


    }
}