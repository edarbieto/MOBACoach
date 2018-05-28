package ga.mobacoachapp.mobacoachprueba;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class PrincipalActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        frameLayout = findViewById(R.id.frameLayout);
        bottomNavigation = findViewById(R.id.bottom_navigation);
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
        bottomNavigation.setTranslucentNavigationEnabled(true);
        bottomNavigation.setBehaviorTranslationEnabled(true);
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                // TODO AÑADIR SELECCION DE FRAGMENT
                return true;
            }
        });
        // TODO AÑADIR FRAGMENT QUE INICIA
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new PerfilFragment()).commit();
    }
}
