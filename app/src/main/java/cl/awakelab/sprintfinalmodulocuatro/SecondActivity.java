package cl.awakelab.sprintfinalmodulocuatro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import cl.awakelab.sprintfinalmodulocuatro.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding;
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnWhatsApp.setOnClickListener(v -> {
            Intent llamadaWhatsApp = new Intent();
            llamadaWhatsApp.setData(Uri.parse("tel:+56977777777"));
            startActivity(llamadaWhatsApp);
        });

        binding.btnLinkedIn.setOnClickListener(v -> {
            Intent llamadaLinkedIn = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/leo-cofre-developer/"));
            startActivity(llamadaLinkedIn);

        });


        binding.btnContactMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msj = binding.edtxtMessage.getText().toString();
                String[] to= {"correo@gmail.com"};
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_CC, "");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del mensaje");
                intent.putExtra(Intent.EXTRA_TEXT, msj);
                startActivity(Intent.createChooser(intent, "Enviar correo electrónico a través de: "));
            }
        });




    }

}
