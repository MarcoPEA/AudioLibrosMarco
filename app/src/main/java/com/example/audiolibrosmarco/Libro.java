package com.example.audiolibrosmarco;

import java.util.Vector;

public class Libro {
    public String Titulo;
    public String Autor;
    public int Recursoimagen;
    public String Urlaudio;
    public String Genero;
    public boolean Novedad;
    public boolean Leido;

    public final static String G_Todos="Todos los generos";
    public final static String G_EPICO="Poema epico";
    public final static String G_SUSPENSE="suspense";
    public final static String G_S_XIX="Lirteratura del siglo XIX";
    public final static String[] G_Array=new String[]{G_Todos,G_EPICO,G_S_XIX,G_SUSPENSE};
    public Libro(String titulo,String autor,int recursoimagen,String urlaudio,String genero,boolean novedad,boolean leido){
        this.Titulo=titulo;
        this.Autor=autor;
        this.Recursoimagen=recursoimagen;
        this.Urlaudio=urlaudio;
        this.Genero=genero;
        this.Novedad=novedad;
        this.Leido=leido;
    }
   public static Vector<Libro>ejemploLibros(){
        final String SERVIDOR="http://www.dcomg.upv.es/~jtomas/android/audiolibros/";
        Vector<Libro>libros=new Vector<Libro>();
       libros.add(new Libro("Kappa", "Akutagawa",
               R.drawable.kappa, SERVIDOR+"kappa.mp3",
               Libro.G_S_XIX, false, false));
       libros.add(new Libro("Avecilla", "Alas ClarÃ­n, Leopoldo",
               R.drawable.avecilla, SERVIDOR+"avecilla.mp3",
               Libro.G_S_XIX, true, false));
       libros.add(new Libro("Divina Comedia", "Dante",
               R.drawable.divina_comedia, SERVIDOR+"divina_comedia.mp3",
               Libro.G_EPICO, true, false));
       libros.add(new Libro("Viejo Pancho, El", "Alonso y Trelles, JosÃ©",
               R.drawable.viejo_pancho, SERVIDOR+"viejo_pancho.mp3",
               Libro.G_S_XIX, true, true));
       libros.add(new Libro("Cancion de Rolando", "Aninimo",
               R.drawable.cancion_rolando, SERVIDOR+"cancion_rolando.mp3",
               Libro.G_EPICO, false, true));
       libros.add(new Libro("Matrimonio de sabuesos", "Agata Christie",
               R.drawable.matrim_sabuesos,SERVIDOR+"matrim_sabuesos.mp3",
               Libro.G_SUSPENSE, false, true));
       libros.add(new Libro("La Iliada", "Homero",
               R.drawable.la_iliada, SERVIDOR+"la_iliada.mp3",
               Libro.G_EPICO, true, false));
       return libros;
   }
}
