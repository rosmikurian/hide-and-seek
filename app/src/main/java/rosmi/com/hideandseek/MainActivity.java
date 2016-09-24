package rosmi.com.hideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button hidebtn;
    private ImageView hideImg;
    boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       hidebtn= (Button) findViewById(R.id.button);
        hideImg = (ImageView) findViewById(R.id.imageView);
        hidebtn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(status)
                {
                    hideImg.setVisibility(View.INVISIBLE);
                    hidebtn.setText("Show");
                    status=false;
                }
                else if(!status)
                {
                    hideImg.setVisibility(View.VISIBLE);
                    hidebtn.setText("Hide");
                    status=true;

                }

            }
        });

    }
}
