package franhida.pruebat2pablohidalgomartinez;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MySplash extends Activity implements Animation.AnimationListener {
    private CircleImageView iVSplashScreen;
    private TextView tvSplashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);
        loadComponentViews();
        Typeface loadFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        tvSplashScreen.setTypeface(loadFont);
        Animation loadTextAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_text_animation);
        tvSplashScreen.startAnimation(loadTextAnimation);
        Animation loadImageAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_icon_animation);
        iVSplashScreen.startAnimation(loadImageAnimation);
        loadImageAnimation.setAnimationListener(this);
    }

    private void loadComponentViews() {
        iVSplashScreen = findViewById(R.id.iVSplashScreen);
        tvSplashScreen = findViewById(R.id.tvSplashScreen);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        goToLogin();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    private void goToLogin() {
        Intent goToLogin = new Intent(MySplash.this, MyLogin.class);
        startActivity(goToLogin);
        finish();
    }
}
