package test1.gunnyga.datpro.maytinhtable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    Float thamso1=0.0f, thamso2=0.0f;
    String pheptinh,xuatso;
    EditText GiaTri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GiaTri = (EditText)findViewById(R.id.KetQua);
        int[] idButton = {R.id.btnNumber0, R.id.btnNumber1, R.id.btnNumber2, R.id.btnNumber3, R.id.btnNumber4, R.id.btnNumber5, R.id.btnNumber6, R.id.btnNumber7,
                R.id.btnNumber8, R.id.btnNumber9, R.id.btnCong, R.id.btnTru, R.id.btnNhan, R.id.btnChia, R.id.btnDot, R.id.btnDelete,R.id.btnBang};
        for(int id:idButton){
            View v =(View) findViewById(id);
            v.setOnClickListener((this));
        }
    }
    private void toantu(){
        thamso1 = Float.parseFloat(GiaTri.getText().toString());
        xuatso = "0";
        GiaTri.setText("");
    }
    private void sosanh() {
        if (thamso1 == 0 && thamso2 == 0) {
            xuatso = "";
            GiaTri.setText(xuatso);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCong:
                pheptinh="+";
                toantu();
                break;
            case R.id.btnTru:
                pheptinh="-";
                toantu();
                break;
            case R.id.btnNhan:
                pheptinh="*";
                toantu();
                break;
            case R.id.btnChia:
                pheptinh="/";
                toantu();
                break;
            case R.id.btnBang:
                Float KQ= null;
                thamso2 = Float.parseFloat(GiaTri.getText().toString());
                if (pheptinh=="+"){
                    KQ=thamso1+thamso2;
                }
                if (pheptinh=="-"){
                    KQ=thamso1-thamso2;
                }
                if (pheptinh=="*"){
                    KQ=thamso1*thamso2;
                }
                if (pheptinh=="/"){
                    KQ=thamso1/thamso2;
                }
                GiaTri.setText(String.valueOf(KQ));
                thamso1 = 0.0f;
                thamso2 = 0.0f;
                xuatso = "0";
                break;
            case R.id.btnNumber0:
                sosanh();
                GiaTri.append("0");
            break;
            case R.id.btnNumber1:
                sosanh();
                GiaTri.append("1");
                break;
            case R.id.btnNumber2:
                sosanh();
                GiaTri.append("2");
                break;
            case R.id.btnNumber3:
                sosanh();
                GiaTri.append("3");
                break;
            case R.id.btnNumber4:
                sosanh();
                GiaTri.append("4");
                break;
            case R.id.btnNumber5:
                sosanh();
                GiaTri.append("5");
                break;
            case R.id.btnNumber6:
                sosanh();
                GiaTri.append("6");
                break;
            case R.id.btnNumber7:
                sosanh();
                GiaTri.append("7");
                break;
            case R.id.btnNumber8:
                sosanh();
                GiaTri.append("8");
                break;
            case R.id.btnNumber9:
                sosanh();
                GiaTri.append("9");
                break;
            }
        }

    }

