package com.example.additiontesting;

import com.example.addition.R;
import com.example.addition.SumActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumActivityTest extends ActivityInstrumentationTestCase2<SumActivity> {

	private SumActivity mContext;
	private Button btnAdd;
	private EditText etNo2;
	private EditText etNo1;
	private int no1;
	private int no2;
	private int sum;
	private TextView tvSum;

	public SumActivityTest(){
		this("SumActivity");
	}

	public SumActivityTest(String name) {
		super(SumActivity.class);
		setName("SumActivity");
	}


	protected void setUp() throws Exception {
		super.setUp();
		mContext = getActivity();

		etNo1 = (EditText)mContext.findViewById(com.example.addition.R.id.etNo1);
		etNo2 = (EditText)mContext.findViewById(com.example.addition.R.id.etNo2);
		btnAdd = (Button)mContext.findViewById(com.example.addition.R.id.btnAdd);
		tvSum = (TextView)mContext.findViewById(R.id.tvSum);

	}

	public void testSumActivity(){

		assertNotNull(mContext);

		//		no1 = Integer.parseInt(etNo1.getText().toString());
		//		no2 = Integer.parseInt(etNo2.getText().toString());


		//		
		//		sum = no1 + no2;
		//
		//		assertEquals(sum,Integer.parseInt(tvSum.getText().toString()));

	}

	public void testHasInputs(){
		assertNotNull(etNo1);
		assertNotNull(etNo2);
	}

	public void testFieldsStartWithEmpty(){
		assertEquals("", etNo1.getText().toString());
		assertEquals("", etNo2.getText().toString());

	}

	@UiThreadTest
	public void testAddition(){
		etNo1.setText(5+"");
		etNo2.setText(6+"");

		no1 = Integer.parseInt(etNo1.getText().toString());
		no2 = Integer.parseInt(etNo2.getText().toString());	
		sum = no1 + no2;
		tvSum.setText(sum+"");
		assertEquals(sum,Integer.parseInt(tvSum.getText().toString()));

	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
