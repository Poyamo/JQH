/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.Editable
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.HorizontalScrollView
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  android.widget.TextView
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Random
 */
package com.jqh.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.jqh.android.FileUtil;
import com.jqh.android.LearnActivity;
import com.jqh.android.OuputActivity;
import com.jqh.android.SketchwareUtil;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity
extends Activity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Intent dj = new Intent();
    private EditText edittext1;
    private EditText edittext2;
    private EditText edittext3;
    private EditText edittext4;
    private Intent ghb = new Intent();
    private HorizontalScrollView hscroll1;
    private SharedPreferences hyny;
    private Intent lie = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear7;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;

    private void initialize(Bundle bundle) {
        this.hscroll1 = (HorizontalScrollView)this.findViewById(2130903050);
        this.linear3 = (LinearLayout)this.findViewById(2130903054);
        this.textview4 = (TextView)this.findViewById(2130903061);
        this.edittext1 = (EditText)this.findViewById(2130903046);
        this.linear7 = (LinearLayout)this.findViewById(2130903057);
        this.linear4 = (LinearLayout)this.findViewById(2130903055);
        this.linear1 = (LinearLayout)this.findViewById(2130903052);
        this.button1 = (Button)this.findViewById(2130903040);
        this.button2 = (Button)this.findViewById(2130903041);
        this.button3 = (Button)this.findViewById(2130903042);
        this.button5 = (Button)this.findViewById(2130903044);
        this.button4 = (Button)this.findViewById(2130903043);
        this.textview1 = (TextView)this.findViewById(2130903058);
        this.edittext2 = (EditText)this.findViewById(2130903047);
        this.textview3 = (TextView)this.findViewById(2130903060);
        this.textview2 = (TextView)this.findViewById(2130903059);
        this.edittext3 = (EditText)this.findViewById(2130903048);
        this.edittext4 = (EditText)this.findViewById(2130903049);
        this.button6 = (Button)this.findViewById(2130903045);
        this.hyny = this.getSharedPreferences("yvyb", 0);
        this.button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                FileUtil.writeFile("/storage/emulated/0/JQH/output/".concat(MainActivity.this.edittext2.getText().toString().concat(".js")), MainActivity.this.edittext1.getText().toString());
                FileUtil.writeFile("/storage/emulated/0/JQH/output/".concat(MainActivity.this.edittext2.getText().toString().concat(".html")), "<html>\n<head>\n<script src=\"".concat(MainActivity.this.edittext2.getText().toString().concat(".js\">".concat("</script>")).concat("<script src=\"jqh-1.0.js\"></script>").concat("</head>\n<body>\n<script>".concat("function write(a){\n  document.write(a);\n}\nfunction save(a,b){\n  localStorage.setItem(a,b);\n}\nfunction load(a,b){\n  var Saved_file = \"saved\";\n  if(a==Saved_file){\n  localStorage.getItem(a);\n  }\n}\nfunction style_write(a,b){\n  document.write(a).style.color= b;\n}\n".concat("</script>\n<script>")).concat(MainActivity.this.edittext1.getText().toString().concat("</script>".concat("</body>\n</html>"))))));
                FileUtil.writeFile("/storage/emulated/0/JQH/output/jqh-1.0.js", "function write(a){\n  document.write(a);\n}\nfunction save(a,b){\n  localStorage.setItem(a,b);\n}\nfunction load(a,b){\n  var Saved_file = \"saved\";\n  if(a==Saved_file){\n  localStorage.getItem(a);\n  }\n}\nfunction style_write(a,b){\n  document.write(a).style.color= b;\n}\n\nfunction make(a,b,c,d){\n  if(a==\"txt_element\"){\n    var para=document.createElement(b);\nvar node=document.createTextNode(c);\npara.appendChild(node);\n\nvar element=document.getElementById(d);\nelement.appendChild(para);\n  }\n  if(a==\"anthor_element\"){\n    const newDiv = document.createElement(\"div\");\n    const parent = document.querySelector(\"body\");\nparent.appendChild(newDiv);\n  }\n}\nfunction styleingbyId(a,b){\n  if(a==\"height\"){\n    document.getElementById(a).style.height = b;\n  }\n  if(a==\"width\"){\n    document.getElementById(a).style.width = b;\n  }\n  if(a==\"color\"){\n    document.getElementById(a).style.color = b;\n  }\n  if(a==\"bg_color\"){\n    document.getElementById(a).style.backgroundColor = b;\n  }\n}\nfunction createE(b,a,c){\nif(b==\"create by var\"){\n  var c = document.createElement(a);\n}else{\n  document.createElement(a);\n}\n}\nfunction queryS(a,b,c){\n  if(a==\"create by var\"){\n    var c = document.querySelector(b);\n  }else{\n    document.querySelector(b);\n  }\n}\ndocument.write(\"JQH VERSION 1.5 B.E.T.A ==>\");\nfunction fi(a,b,c){\n  if(a){\n    b;\n  }else{\n    c;\n  }\n}");
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "automatic Saved JQH file at JQH-File folder.");
                FileUtil.writeFile("/storage/emulated/0/JQH-file/".concat(MainActivity.this.edittext2.getText().toString()), MainActivity.this.edittext1.getText().toString());
                MainActivity.this.hyny.edit().putString("local", MainActivity.this.edittext2.getText().toString()).commit();
                MainActivity.this.hyny.edit().putString("html", "<html>\n<head>\n<script src=\"".concat(MainActivity.this.edittext2.getText().toString().concat(".js\">".concat("</script>")).concat("<script src=\"jqh-1.0.js\"></script>").concat("</head>\n<body>\n<style>\nbody{\ncolor: #ffffff;\nbackground-color: black;\n}\n</style>\n<div id=\"div1\"></div>\n<script>".concat("function write(a){\n  document.write(a);\n}\nfunction save(a,b){\n  localStorage.setItem(a,b);\n}\nfunction load(a,b){\n  var Saved_file = \"saved\";\n  if(a==Saved_file){\n  localStorage.getItem(a);\n  }\n}\nfunction style_write(a,b){\n  document.write(a).style.color= b;\n}\n".concat("</script>\n<script>")).concat(MainActivity.this.edittext1.getText().toString().concat("</script>".concat("</body>\n</html>")))))).commit();
                MainActivity.this.lie.setClass(MainActivity.this.getApplicationContext(), OuputActivity.class);
                MainActivity.this.startActivity(MainActivity.this.lie);
            }
        });
        this.button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                FileUtil.writeFile("/storage/emulated/0/JQH-file/".concat(MainActivity.this.edittext2.getText().toString()), MainActivity.this.edittext1.getText().toString());
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), MainActivity.this.edittext2.getText().toString().concat(" is done saved."));
            }
        });
        this.button3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity.this.ghb.setClass(MainActivity.this.getApplicationContext(), LearnActivity.class);
                MainActivity.this.startActivity(MainActivity.this.ghb);
            }
        });
        this.button5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity.this.edittext1.setVisibility(8);
                MainActivity.this.hscroll1.setVisibility(8);
                MainActivity.this.linear3.setVisibility(8);
                MainActivity.this.linear7.setVisibility(0);
            }
        });
        this.button4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
            }
        });
        this.textview3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity.this.linear7.setVisibility(8);
                MainActivity.this.linear3.setVisibility(0);
                MainActivity.this.hscroll1.setVisibility(0);
                MainActivity.this.edittext3.setVisibility(0);
                MainActivity.this.edittext1.setVisibility(0);
            }
        });
        this.button6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity.this.hyny.edit().putString("local", MainActivity.this.edittext3.getText().toString()).commit();
                MainActivity.this.hyny.edit().putString("soft", FileUtil.readFile("/storage/emulated/0/".concat(MainActivity.this.edittext4.getText().toString()))).commit();
                FileUtil.moveFile("/storage/emulated/0/".concat(MainActivity.this.edittext4.getText().toString()), "/storage/emulated/0/JQH-file/".concat(MainActivity.this.edittext3.getText().toString()));
                FileUtil.writeFile("/storage/emulated/0/JQH-file/".concat(MainActivity.this.edittext3.getText().toString()), MainActivity.this.hyny.getString("soft", ""));
                if (FileUtil.isDirectory("/storage/emulated/0/JQH")) {
                    MainActivity.this.edittext2.setText((CharSequence)MainActivity.this.hyny.getString("local", ""));
                    MainActivity.this.edittext1.setText((CharSequence)FileUtil.readFile("/storage/emulated/0/JQH-file/".concat(MainActivity.this.hyny.getString("local", ""))));
                }
                MainActivity.this.linear7.setVisibility(8);
                MainActivity.this.linear3.setVisibility(0);
                MainActivity.this.hscroll1.setVisibility(0);
                MainActivity.this.edittext3.setVisibility(0);
                MainActivity.this.edittext1.setVisibility(0);
            }
        });
    }

    private void initializeLogic() {
        this.setTitle((CharSequence)this.hyny.getString("local", ""));
        this.linear7.setVisibility(8);
        if (FileUtil.isDirectory("/storage/emulated/0/JQH")) {
            this.edittext2.setText((CharSequence)this.hyny.getString("local", ""));
            this.edittext1.setText((CharSequence)FileUtil.readFile("/storage/emulated/0/JQH-file/".concat(this.hyny.getString("local", ""))));
        }
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray sparseBooleanArray = listView.getCheckedItemPositions();
        int n = 0;
        while (n < sparseBooleanArray.size()) {
            if (sparseBooleanArray.valueAt(n)) {
                arrayList.add((Object)sparseBooleanArray.keyAt(n));
            }
            ++n;
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int n) {
        return TypedValue.applyDimension((int)1, (float)n, (DisplayMetrics)this.getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return this.getResources().getDisplayMetrics().heightPixels;
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return this.getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[1];
    }

    @Deprecated
    public int getRandom(int n, int n2) {
        return n + new Random().nextInt(1 + (n2 - n));
    }

    public void onBackPressed() {
        FileUtil.deleteFile("/storage/emulated/0/JQH/output/");
        SketchwareUtil.showMessage(this.getApplicationContext(), "automatic Saved JQH file.");
        FileUtil.writeFile("/storage/emulated/0/JQH-file/".concat(this.edittext2.getText().toString()), this.edittext1.getText().toString());
        this.hyny.edit().putString("local", this.edittext2.getText().toString()).commit();
        this.finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968579);
        this.initialize(bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1 || this.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
                this.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1000);
                return;
            }
            this.initializeLogic();
            return;
        }
        this.initializeLogic();
    }

    public void onRequestPermissionsResult(int n, String[] arrstring, int[] arrn) {
        super.onRequestPermissionsResult(n, arrstring, arrn);
        if (n == 1000) {
            this.initializeLogic();
        }
    }

    public void onStop() {
        super.onStop();
        FileUtil.deleteFile("/storage/emulated/0/JQH/output/");
    }

    @Deprecated
    public void showMessage(String string2) {
        Toast.makeText((Context)this.getApplicationContext(), (CharSequence)string2, (int)0).show();
    }

}

