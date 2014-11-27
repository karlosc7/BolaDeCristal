package com.practica1.boladecristal;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BolaDeCristalActivityActivity extends ActionBarActivity {

	private TextView textView;
	private Button button;
	private RelativeLayout relativeLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bola_de_cristal_activity);

		// instanciar los miembros de la clase
		textView = (TextView) findViewById(R.id.textView1);
		button = (Button) findViewById(R.id.button1);
		relativeLayout = (RelativeLayout) findViewById(R.id.background);

		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				String[] aleatoria = getResources().getStringArray(
						R.array.aleatorio_array);
				int i = (int) (Math.random() * aleatoria.length);
				int color1 = (int) (Math.random() * aleatoria.length);
				if (i< 11)
					color1 = Color.GREEN;
				else if (i < 16) {
					color1 = Color.YELLOW;
				} else
					color1 = Color.RED;

				textView.setText(aleatoria[i]);
				relativeLayout.setBackgroundColor(color1);
			}
		});
	}
}
