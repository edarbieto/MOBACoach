package ga.mobacoachapp.mobacoachprueba;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class PrincipalActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    AHBottomNavigation bottomNavigation;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        frameLayout = findViewById(R.id.frameLayout);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        titulo = findViewById(R.id.principal_tv_titulo);
        AHBottomNavigationItem item1 = new AHBottomNavigationItem("Perfil", R.drawable.perfil);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("Buscar", R.drawable.buscar);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("Notificaciones", R.drawable.notificacion);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem("Comunidades", R.drawable.comunidad);
        AHBottomNavigationItem item5 = new AHBottomNavigationItem("Torneos", R.drawable.torneo);
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.addItem(item4);
        bottomNavigation.addItem(item5);
        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.colorPrimary));
        bottomNavigation.setAccentColor(Color.WHITE);
        bottomNavigation.setInactiveColor(Color.WHITE);
        bottomNavigation.setCurrentItem(0);
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);
        bottomNavigation.setAccentColor(R.color.colorPrimaryDark);
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                switch (position) {
                    case 0:
                        frameLayout.setVisibility(View.VISIBLE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new PerfilFragment()).commit();
                        titulo.setText("Tu Perfil");
                        break;
                    case 1:
                        frameLayout.setVisibility(View.GONE);
                        titulo.setText("Buscar");
                        break;
                    case 2:
                        frameLayout.setVisibility(View.GONE);
                        titulo.setText("Notificaciones");
                        break;
                    case 3:
                        frameLayout.setVisibility(View.GONE);
                        titulo.setText("Comunidades");
                        break;
                    case 4:
                        frameLayout.setVisibility(View.GONE);
                        titulo.setText("Torneos");
                        break;
                }
                return true;
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new PerfilFragment()).commit();
    }
}
