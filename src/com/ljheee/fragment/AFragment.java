package com.ljheee.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AFragment extends Fragment{
	
	EditText user;
	EditText pass;
	
	Button btnOk;
	Button btnCancle;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		
		//加载该Fragment对应的布局，返回一个View
		View view = inflater.inflate(R.layout.fragment_a, container ,false);
		
		user = (EditText) view.findViewById(R.id.user);
		pass = (EditText) view.findViewById(R.id.password);
		
		btnOk = (Button) view.findViewById(R.id.ok);
		btnCancle = (Button) view.findViewById(R.id.cancle);
		
		
		btnOk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String uuser = user.getText().toString();
				String ppass = pass.getText().toString();
				Toast.makeText(getActivity(), "用户："+uuser +"\n密码："+ppass, Toast.LENGTH_SHORT).show();
			}
		});
		
		btnCancle.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				user.setText("");
				pass.setText("");
			}
		});
		
		return view;
	}

}
