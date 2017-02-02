package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Camera;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.Model.Jelo;

//import rs.aleph.android.example12.R;

// Each activity extends Activity class
public class SecondActivity extends Activity {

   private int position = 0;

    private Jelo[] jela = new Jelo[] {
            new Jelo("pasulj.jpg", "Pasulj", "Mnogo dobro, fino jelo", "Domaca jela", "Pasulj i kobasice", "Mnogo kalorija", 500)
    };


    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "Activity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();


// Prikaz

        // Ucitava URL u WebView
        //  final int position = getIntent().getIntExtra("position", 0);


        // Naziv
        TextView tvNaziv = (TextView) findViewById(R.id.tv_naziv);
        tvNaziv.setText(jela[position].getNaziv());

        //Opis
        TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
        tvOpis.setText(jela[position].getOpis());

        //Ocena-Zvezdice
        RatingBar rbZvezdice = (RatingBar) findViewById(R.id.rb_zvezdice);
        rbZvezdice.setRating(jela[position].getOcena());

        //slika
        ImageView slika = (ImageView)findViewById(R.id.iv_slika);
        InputStream is = null;


        try {
            is=getAssets().open(jela[position].getImage());
            Drawable drawable =Drawable.createFromStream(is,null);
            slika.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Dugme kupi

        Button btnKupi = (Button) findViewById(R.id.btn_kupi);
        btnKupi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Kupili ste " + jela[position].getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    // onStart method is a lifecycle method called after onCreate (or after onRestart when the
    // activity had been stopped, but is now again being displayed to the user)
    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onRestart method is a lifecycle method called after onStop when the current activity is
    // being re-displayed to the user
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onResume method is a lifecycle method called after onRestoreInstanceState, onRestart, or
    // onPause, for your activity to start interacting with the user
    @Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onPause method is a lifecycle method called when an activity is going into the background,
    // but has not (yet) been killed
    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStop method is a lifecycle method called when the activity are no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }


    public void btnOpenCameraClicked (View view) {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }

}
