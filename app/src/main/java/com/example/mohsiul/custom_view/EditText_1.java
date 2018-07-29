package com.example.mohsiul.custom_view;



import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class EditText_1 extends RelativeLayout {

    private TextView textView;
    private ToggleButton toggle;
    private EditText editText;
    private String label;
    private String hint;

    public EditText_1(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.edit_text_1, this);
    }

    public EditText_1(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews(context, attrs);
    }

    public EditText_1(Context context, AttributeSet attrs, int defStyle) {
        this(context, attrs);
        initViews(context, attrs);
    }

    private void initViews(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ToggleEditText, 0, 0);

        try {
            // get the text and colors specified using the names in attrs.xml
            label = a.getString(R.styleable.ToggleEditText_label);
            hint = a.getString(R.styleable.ToggleEditText_hint);

        } finally {
            a.recycle();
        }

        LayoutInflater.from(context).inflate(R.layout.edit_text_1, this);

        //text view


        //edit text
        editText = (EditText) this.findViewById(R.id.edit_text);
        editText.setHint(hint);

        //toggle button
        toggle = (ToggleButton) this.findViewById(R.id.toggle);
        toggle.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                editText.setVisibility(isChecked? View.VISIBLE : View.GONE);
            }
        });


    }

    public boolean isChecked() {
        return toggle.isChecked();
    }

    public String getText() {
        return editText.getText().toString();
    }
}