package com.example.bazimoon;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Description extends Fragment {


	public Description() {
		// Required empty public constructor
	}

Button next;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_description, container, false);
		next = view.findViewById(R.id.descrip_next);

		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				loadFragment();
			}
		});

		return view ;
	}

	private void loadFragment() {
		//switching fragment

		Fragment decription1 = new Description1();
		assert getFragmentManager() != null;
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
			transaction.addToBackStack(null)
					.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out,android.R.anim.fade_in,
							android.R.anim.fade_out)
					.replace(R.id.frameLayout,decription1)
					.commit();
	}

}
