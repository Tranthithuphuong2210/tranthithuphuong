package com.letronghieu.customdialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_OpenDiaglog_Feedback = findViewById(R.id.btn_open_diaglog_feedback);
        btn_OpenDiaglog_Feedback.setOnClickListener(view -> {
            // center
            //openFeedbackDialog(Gravity.CENTER);
            // bottom
            openFeedbackDialog();
        });
    }

    private void openFeedbackDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog_feedback);

        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        WindowManager.LayoutParams windowAttributes = window.getAttributes();
        windowAttributes.gravity = Gravity.BOTTOM;
        window.setAttributes(windowAttributes);

        dialog.setCancelable(true);

//        if (Gravity.BOTTOM == gravity) {
//            dialog.setCancelable(true);
//        }else {
//            dialog.setCancelable(false);
//        }
        EditText editText =dialog.findViewById(R.id.ET_feedback);
        Button btnNo = dialog.findViewById(R.id.btn_no);
        Button btnSend = dialog.findViewById(R.id.btn_send);
        btnNo.setOnClickListener(view -> dialog.dismiss());
        btnSend.setOnClickListener(view -> {
            if (editText != null) {
                Toast.makeText(MainActivity.this,"Send feedback!",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
            
        });
    dialog.show();
    }
}