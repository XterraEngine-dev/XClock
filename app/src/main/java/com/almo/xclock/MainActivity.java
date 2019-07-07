package com.almo.xclock;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.almo.xclock.databinding.ActivityMainBinding;
import com.almo.xclock.utilidades.Decodificador;
import com.almo.xclock.utilidades.Renderizador;

import java.util.Random;

/**
 * create by: Luis Cifuentes 7/7/2019
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG_DEBUG = "XCLOCK_SEE";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = 500;
                int max = 100000;

                Random r = new Random();
                int entrada = r.nextInt(max - min + 1) + min;

                String hora_c = new Decodificador().controladorHora(new Renderizador().horas(entrada));
                String min_c = new Decodificador().controladorMinuto(new Renderizador().minutos(entrada));
                String seg_c = new Decodificador().controladoSegundos(new Renderizador().segundos(entrada));


                binding.lottieFirstHour.setAnimation(new Renderizador().renderDefOne(hora_c) + ".json");
                binding.lottieFirstHour.setSpeed(0.8f);
                binding.lottieFirstHour.playAnimation();

                binding.lottieSecondHour.setAnimation(new Renderizador().renderDefTwo(hora_c) + ".json");
                binding.lottieSecondHour.setSpeed(0.7f);
                binding.lottieSecondHour.playAnimation();

                binding.lottieFirstMin.setAnimation(new Renderizador().renderDefOne(min_c) + ".json");
                binding.lottieFirstMin.setSpeed(0.6f);
                binding.lottieFirstMin.playAnimation();

                binding.lottieSecondMin.setAnimation(new Renderizador().renderDefTwo(min_c) + ".json");
                binding.lottieSecondMin.setSpeed(0.5f);
                binding.lottieSecondMin.playAnimation();

                binding.lottieFirstSec.setAnimation(new Renderizador().renderDefOne(seg_c) + ".json");
                binding.lottieFirstSec.setSpeed(0.7f);
                binding.lottieFirstSec.playAnimation();

                binding.lottieSecondSec.setAnimation(new Renderizador().renderDefTwo(seg_c) + ".json");
                binding.lottieSecondSec.setSpeed(0.8f);
                binding.lottieSecondSec.playAnimation();

            }
        });

    }


}
