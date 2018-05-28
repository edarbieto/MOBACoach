package ga.mobacoachapp.mobacoachprueba;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent principalIntent = new Intent(InicioActivity.this, PrincipalActivity.class);
                InicioActivity.this.startActivity(principalIntent);
                InicioActivity.this.finish();
            }
        }, 1500);
    }
}
