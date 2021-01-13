package com.usebastian.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

	LinearLayout expandableView;
	ImageView arrowBtn;
	CardView cardView;

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		expandableView = findViewById(R.id.expandableView);
		arrowBtn = findViewById(R.id.arrowBtn);
		cardView = findViewById(R.id.cardView);

		arrowBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (expandableView.getVisibility()==View.GONE){
					TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
					expandableView.setVisibility(View.VISIBLE);
					arrowBtn.setBackgroundResource(R.drawable.ic_arrow_up);
				} else {
					TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
					expandableView.setVisibility(View.GONE);
					arrowBtn.setBackgroundResource(R.drawable.ic_arrow_down);
				}
			}
		});
	}
}