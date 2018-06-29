package example.com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     @param view
     */
    // myClick为xml中指定的方法名，参数是View类型

    public void register(View view) {
        Toast.makeText(this,"这是xml方式指定的Button响应",Toast.LENGTH_LONG).show();
    }
}



