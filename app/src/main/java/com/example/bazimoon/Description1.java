package com.example.bazimoon;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Description1 extends Fragment {


	public Description1() {
		// Required empty public constructor
	}

	Button next;
	@Override
	public View onCreateView(LayoutInflater inflater, final ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_description1, container, false);
		next = view.findViewById(R.id.descrip_next);
		next.setText("شروع کن :)");

		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(getActivity(),SignUp.class));

			}
		});
		return view;
	}

}
