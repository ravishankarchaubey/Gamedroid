package gamedroid.android.com.gamedroid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,p,sc;
    String v1,v2;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.btn3);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.btn4);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.btn5);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.btn6);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.btn7);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.btn8);
        b8.setOnClickListener(this);
        p=(Button)findViewById(R.id.play);
        p.setOnClickListener(this);
        sc=(Button)findViewById(R.id.sc);
        sc.setOnClickListener(this);
    }
   /* public void onColor(View v)
    {
        if(v.equals(p))
        {
            b1.setText("-");
            b2.setText("-");
            b3.setText("-");
            b4.setText("-");
            b5.setText("-");
            b6.setText("-");
            b7.setText("-");
            b8.setText("-");
        }
    }
*/
    @Override
    public void onClick(View v)
    {
        if(v.equals(p))
        {
            b1.setText(" ");
            b2.setText(" ");
            b3.setText(" ");
            b4.setText(" ");
            b5.setText(" ");
            b6.setText(" ");
            b7.setText(" ");
            b8.setText(" ");
        }
        if(v.equals(b1))
        {
            b1.setText("Red");
            v1="Red";
        }
        if(v.equals(b2))
        {
            b2.setText("Green");
            v1="Green";
        }
        if(v.equals(b3))
        {
            b3.setText("Blue");
            v1="Blue";

        }
        if(v.equals(b4))
        {
            b4.setText("Gray");
            v1="Gray";
        }
        if(v.equals(b5))
        {
            b5.setText("Red");
            if(v1.equals("Red"))
            {
                score++;

                sc.setText(Integer.toString(score));
            }
            else {
                score--;
                sc.setText(Integer.toString(score));
            }
        }
        if(v.equals(b6))
        {
            b6.setText("Green");
            if(v1.equals("Green"))
            {
                score++;
                sc.setText(Integer.toString(score));
            }
            else {
                score--;
                sc.setText(Integer.toString(score));
            }
        }
        if(v.equals(b7))
        {
            b7.setText("Blue");
            if(v1.equals("Blue"))
            {
                score++;
                sc.setText(Integer.toString(score));
            }
            else
            {
                score--;
                sc.setText(Integer.toString(score));
            }
        }
        if(v.equals(b8))
        {
            b8.setText("Gray");
            if(v1.equals("Gray"))
            {
                score++;
                sc.setText(Integer.toString(score));
            }
            else
            {
                score--;
                sc.setText(Integer.toString(score));
            }
        }
    }
}
