package franhida.pruebat2pablohidalgomartinez;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyLogin extends Activity {
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);
        loadComponentViews();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain();
            }
        });
    }
    private void loadComponentViews() {
        btnLogin = findViewById(R.id.btnLogin);
    }
    private void goToMain() {
        Intent goToMain = new Intent(MyLogin.this, MyMain.class);
        startActivity(goToMain);
    }
}
