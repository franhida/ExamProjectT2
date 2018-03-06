package franhida.pruebat2pablohidalgomartinez;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MyMain extends Activity {
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);
        loadComponentViews();
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Snackbar.make(swipeRefreshLayout, getResources().getString(R.string.snackBarText), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void loadComponentViews() {
        swipeRefreshLayout = findViewById(R.id.sRLayout);

    }
}
