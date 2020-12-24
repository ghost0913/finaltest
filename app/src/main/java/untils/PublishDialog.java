package untils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

import com.example.jiyi.MainActivity;
import com.example.jiyi.NewStickerActivity;
import com.example.jiyi.R;

public class PublishDialog extends Dialog  {
    Button dialog_btn;
    public PublishDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_publish); //设置对话框显示布局
        dialog_btn = findViewById(R.id.dialog_btn);
        dialog_btn.setOnClickListener((View.OnClickListener) this);
    }

    public void ensure(View view){
        Intent intent = new Intent();

    }

}
