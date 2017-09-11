package org.youtwo.coordinated_effort;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
/**
 * Created by Bill on 2017/9/11.
 */

public class QuickerReturnActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_quicker);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    RecyclerView list = (RecyclerView) findViewById(R.id.list);
    SimpleAdapter adapter = new SimpleAdapter(list);
    list.setAdapter(adapter);
    list.setLayoutManager(new LinearLayoutManager(this));
  }
}
