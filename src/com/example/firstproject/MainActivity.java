package com.example.firstproject;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	public float Num1 = 0;
	public int Action = 100;
	
	public EditText eTWindow;
	public EditText editText1;
	
	public Button button1;
	public Button button2;
	public Button button3;
	public Button button4;
	public Button button5;
	public Button button6;
	public Button button7;
	public Button button8;
	public Button button9;
	public Button button0;
	public Button buttonDot;
	public Button buttonDelete;
	public Button buttonPlus;
	public Button buttonMinus;
	public Button buttonNum;
	public Button buttonEqual;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
        // Obtain handles to UI objects
        eTWindow = (EditText) findViewById(R.id.eT_window);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonNum = (Button) findViewById(R.id.buttonNum);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        
//        button1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//            	onClickButton(v,button2);
//            }
//        });

    }
    
    public void onClickButtonNum(View v1) {
    	
    	eTWindow.setText(eTWindow.getText().toString() + v1.getTag().toString());
    }
    
    
    public void onClickButtonAction(View v){
    	
    	Action = Integer.parseInt(v.getTag().toString());
    	Num1 = Float.parseFloat(eTWindow.getText().toString());
    	eTWindow.setText("");
    }
    

    public void onClickButtonEqual(View v){
    	float Num2;
    	
    	if(eTWindow.getText().toString() == ""){
    		Num2 = 0;
    	} else {
    		Num2 = Float.valueOf(eTWindow.getText().toString());
    	}
    	
    	if(Action == 100){
    		Num1 = Num1 * Num2;
    	} else if(Action == 101){
    		Num1 = Num1 - Num2;
    	} else if(Action == 102){
    		Num1 = Num1 + Num2;
    	}
    	else if(Action == 103){
    		if(Num2 == 0){
    		// На ноль делить нельзя
    		} else {
    			Num1 = Num1 / Num2;
    		}
    		
    	}
    	
    	eTWindow.setText(String.valueOf(Num1));
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

       // @Override
        //public View onCreateView(LayoutInflater inflater, ViewGroup container,
        //        Bundle savedInstanceState) {
            //View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            //return rootView;
        //}
        
//        public void button_info(){
//        
//        }
    }
}

