package com.nba.nbtodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NBTodo02AddTaskActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_nbtodo_main);
        setContentView(R.layout.addition_task_layout);
        Button button1 = (Button) findViewById(R.id.add);
        button1.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        	Intent intent = new Intent(NBTodo02AddTaskActivity.this, NBTodoMainActivity.class); 
        	startActivity(intent);
        	}
        	});
    }	
}
