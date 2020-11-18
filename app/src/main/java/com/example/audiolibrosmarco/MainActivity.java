package com.example.audiolibrosmarco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.nio.channels.SelectableChannel;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView.LayoutManager layaoutm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragmentoselector selectorFragment = new Fragmentoselector();
        if ( findViewById(R.id.contenedorpeque) != null
                && getSupportFragmentManager().findFragmentById(R.id.contenedorpeque)==null){
            getSupportFragmentManager().beginTransaction().add(R.id.contenedorpeque, selectorFragment).commit();
        }
    }
    public void mostrardetalle(int index){
        FragmentManager fragmentManager=getSupportFragmentManager();
        if(fragmentManager.findFragmentById(R.id.detalle_fragment)!=null){
            Detallefragment fragment=(Detallefragment)fragmentManager.findFragmentById(R.id.detalle_fragment);
            fragment.ponIn(index);
        }else{
           Detallefragment detallefragment=new Detallefragment();
           Bundle bundle=new Bundle();
           bundle.putInt(Detallefragment.ARG_ID_LIBRO,index);
           detallefragment.setArguments(bundle);
           fragmentManager.beginTransaction().replace(R.id.contenedorpeque,detallefragment).addToBackStack(null).commit();
        }
    }
}