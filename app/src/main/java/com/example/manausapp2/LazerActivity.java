package com.example.manausapp2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.manausapp2.adapter.TourAdapter;
import com.example.manausapp2.databinding.TourMainBinding;
import com.example.manausapp2.model.Tour;

import java.util.ArrayList;

public class LazerActivity extends AppCompatActivity {

    private TourMainBinding binding;
    private TourAdapter tourAdapter;
    private ArrayList<Tour> tourList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = TourMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewTour = binding.RecyclerViewTour;
        recyclerViewTour.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTour.setHasFixedSize(true);
        tourAdapter = new TourAdapter(tourList, this);
        recyclerViewTour.setAdapter(tourAdapter);
        getTour();
    }

    private void getTour(){

        Tour tour1 = new Tour(
                R.drawable.ima01,
                "Mirage Park",
                "Desde 2006, o Mirage Park é uma referência em entretenimento no segmento de parque de diversões na cidade da região norte. Os brinquedos de tecnologia nacional e internacional distribuem alegria, adrenalina, felicidades e momentos que são eternizados em lembranças."
        );
        tourList.add(tour1);

        Tour tour2 = new Tour(
                R.drawable.ima02,
                "Amazonas Shopping",
                "O Amazonas Shopping foi o primeiro grande shopping center da cidade de Manaus. conta com eventos como o Amazonas Beer Festival, Amazonas Food Festival e um dos arraiais mais tradicionais da cidade. Temos mais de 230 lojas e grandes marcas fazem parte desse mix como a Granado, The Coffee, Calvin Klein, Adcos, Bemol, Sestini e muito mais."
        );
        tourList.add(tour2);

        Tour tour3 = new Tour(
                R.drawable.ima03,
                "Praça do Carangueijo",
                "É uma praça cheia de botecos e ao redor passa em telões, jogos de futebol as quartas, ganhou esse nome devido a vários bares sempre servindo caranguejo toc toc ou casquinha de caranguejo."
        );
        tourList.add(tour3);

        Tour tour4 = new Tour(
                R.drawable.ima04,
                "Parque Estadual Sumauma",
                "O Parque Estadual Sumauma foi criado para preservar os ecossistemas naturais existentes, possibilitando a realização de pesquisa científica e o desenvolvimento de atividades de educação e interpretação ambiental, de recreação em contato com a natureza e do turismo ecológico."
        );
        tourList.add(tour4);

        Tour tour5 = new Tour(
                R.drawable.ima05,
                "All Night Pub",
                "O All Night Pub é a melhor balada de Manaus com shows ao vivo, é o lugar ideal para divertir-se e curtir os ritmos que embalam os finais de semana. Possui ambiente climatizado, som de qualidade, chopp geladíssimo, pratos saborosos, estacionamento amplo e 100% asfaltado com capacidade para até 100 carros. E toda semana tem músicas variadas desde Rock ao Sertanejo e Pop Internacional."
        );
        tourList.add(tour5);

        Tour tour6 = new Tour(
                R.drawable.ima06,
                "Iberostar Grand AMAZON",
                "No Iberostar você tem a possibilidade de navegar pelo Amazonas, em um hotel flutuante de 5 estrelas repleto de luxo, aproveitando a aventura e a natureza no pulmão do planeta, viva uma experiência original desbravando o Amazonas mais selvagem, com atividades programadas diariamente."
        );
        tourList.add(tour6);
    }
}
