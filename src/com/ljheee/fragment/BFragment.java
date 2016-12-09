package com.ljheee.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class BFragment extends Fragment{
	
	Spinner spinner;
	String[] addresses = {"湖南" , "湖北" , "广东"};
	ArrayAdapter<String> adapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		
		//加载该Fragment对应的布局，返回一个View
		View view = inflater.inflate(R.layout.fragment_b, container ,false);
		
		//从View中获取布局中的控件
		spinner = (Spinner) view.findViewById(R.id.spinner1);
		adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, addresses);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinner.setAdapter(adapter);//spinner设置数据
        
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Toast.makeText(getActivity() , addresses[arg2] , Toast.LENGTH_SHORT).show();
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
		return view;
	}
	
	

}
