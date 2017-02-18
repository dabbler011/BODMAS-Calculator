package com.example.akshat.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean check = true,leq=false;
    int op=0,brcnt=0;
    String s,s1,s2,s3;
    double exp1, exp2, exp3;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bpls, bmins, bmul, bdiv, beq, bdel, bdot,bpw,bbrstrt,bbrend,bpi,bsqrt,bdlp;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button39);
        b2 = (Button) findViewById(R.id.button40);
        b3 = (Button) findViewById(R.id.button41);
        b4 = (Button) findViewById(R.id.button35);
        b5 = (Button) findViewById(R.id.button36);
        b6 = (Button) findViewById(R.id.button37);
        b7 = (Button) findViewById(R.id.button30);
        b8 = (Button) findViewById(R.id.button31);
        b9 = (Button) findViewById(R.id.button32);
        b0 = (Button) findViewById(R.id.button45);
        bpls = (Button) findViewById(R.id.button43);
        bmins = (Button) findViewById(R.id.button42);
        bmul = (Button) findViewById(R.id.button38);
        bdiv = (Button) findViewById(R.id.button33);
        beq = (Button) findViewById(R.id.button46);
        bdel = (Button) findViewById(R.id.button47);
        bdot = (Button) findViewById(R.id.button44);
        bpw = (Button) findViewById(R.id.button);
        bbrstrt = (Button) findViewById(R.id.button3);
        bbrend = (Button) findViewById(R.id.button4);
        bpi = (Button) findViewById(R.id.button2);
        bsqrt = (Button) findViewById(R.id.button5);
        e1 = (EditText) findViewById(R.id.editText2);
        bdlp=(Button)findViewById(R.id.button6);

        bdlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"LONG PRESS FOR DEVELOPER OPTIONS", Toast.LENGTH_SHORT).show();
            }
        });
        bdlp.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent y=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(y);
                return false;
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "1");
                check = true;
                leq=false;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "2");
                check = true;
                leq=false;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "3");
                check = true;
                leq=false;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "4");
                check = true;
                leq=false;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "5");
                check = true;
                leq=false;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "6");
                check = true;
                leq=false;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "7");
                check = true;
                leq=false;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "8");
                check = true;
                leq=false;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "9");
                check = true;
                leq=false;
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "0");
                leq=false;
                check = true;
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "π");
                leq=false;
                check = true;
            }
        });
        bpls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                if(s.length()>0) {
                    if ((s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')||s.charAt(s.length()-1)=='π')
                        e1.setText(s + "+");
                    else{
                        if(s.length()>1){
                            if((s.charAt(s.length()-2)>='0'&&s.charAt(s.length()-2)<='9')||s.charAt(s.length()-2)=='.'){
                                s=s.substring(0,s.length()-1);
                                e1.setText(s+"+");
                            }
                        }
                        else {
                            s = s.substring(0, s.length() - 1) + "+";
                            e1.setText(s);
                        }
                    }
                }
                check = true;
                leq=false;
            }
        });
        bmins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                if(s.length()==0)
                e1.setText(s + "-");
                else if(s.length()==1&&((s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')||s.charAt(s.length()-1)=='π'))
                    e1.setText(s + "-");
                else if(s.length()>1){
                    if((s.charAt(s.length()-1)>='0'&&s.charAt(s.length()-1)<='9')||s.charAt(s.length()-1)=='π'){
                        e1.setText(s+"-");
                    }
                    else if(s.charAt(s.length()-1)=='.'&&(s.charAt(s.length()-2)>='0'&&s.charAt(s.length()-2)<='9'))
                        e1.setText(s+"-");
                    else if((s.charAt(s.length()-1)<'0'||s.charAt(s.length()-1)>'9')&&s.charAt(s.length()-1)!='.'){
                        if(s.charAt(s.length()-2)>='0'&&s.charAt(s.length()-2)<='9')
                            e1.setText(s+"-");
                    }
                }
                check = true;
                leq=false;
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                //Toast.makeText(getBaseContext(),s,Toast.LENGTH_SHORT).show();
                if(s.length()>0) {
                    if ((s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')||s.charAt(s.length()-1)=='π')
                        e1.setText(s + "*");
                    else{
                        //Toast.makeText(getBaseContext(),"2",Toast.LENGTH_SHORT).show();
                        if(s.length()>1){
                            if((s.charAt(s.length()-2)>='0'&&s.charAt(s.length()-2)<='9')||s.charAt(s.length()-2)=='.'){
                                s=s.substring(0,s.length()-1);
                                //Toast.makeText(getBaseContext(),"3",Toast.LENGTH_SHORT).show();
                                e1.setText(s+"*");
                            }
                        }
                        else {
                            s = s.substring(0, s.length() - 1) + "*";
                            e1.setText(s);
                        }
                    }
                }
                check = true;
                leq=false;
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                if(s.length()>0) {
                    if ((s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')||s.charAt(s.length()-1)=='π')
                        e1.setText(s + "/");
                    else{
                        if(s.length()>1){
                            if((s.charAt(s.length()-2)>='0'&&s.charAt(s.length()-2)<='9')||s.charAt(s.length()-2)=='.'){
                                s=s.substring(0,s.length()-1);
                                e1.setText(s+"/");
                            }
                        }
                        else {
                            s = s.substring(0, s.length() - 1) + "/";
                            e1.setText(s);
                        }
                    }
                }
                check = true;
                leq=false;
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + ".");
                check = true;
                leq=false;
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if(leq)
                    s="";
                e1.setText(s + "√");
                check = true;
                leq=false;
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chstr;
                s = e1.getText().toString();
                chstr=s;
                //Toast.makeText(getBaseContext(),s+" "+brcnt,Toast.LENGTH_SHORT).show();
                if(s.length()>0) {
                    if (brcnt == 0 && ((s.charAt(s.length() - 1) >= '0') && s.charAt(s.length() - 1) <= '9') || s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == ')' || s.charAt(s.length() - 1) == 'π') {
                        //Toast.makeText(getBaseContext(),"here",Toast.LENGTH_SHORT).show();
                        s = calculation(s);
                        e1.setText(s);
                    } else {
                        brcnt = 0;
                        e1.setText("");
                        Toast.makeText(getBaseContext(), "Syntax Error", Toast.LENGTH_SHORT).show();
                    }
                }
                check = false;
                leq=true;
                if(s.length()>0)
                if(s.equals(chstr)) {
                    check = true;
                    leq = false;
                }
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                if (check && s.length() != 0) {
                    if(s.charAt(s.length()-1)==')')
                        brcnt++;
                    else if(s.charAt(s.length()-1)=='(')
                        brcnt--;
                    s = s.substring(0, s.length() - 1);
                    e1.setText(s);
                } else {
                    e1.setText("");
                    brcnt=0;
                }
                leq=false;
            }
        });
        bpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                if(s.length()>0) {
                    if ((s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')||s.charAt(s.length()-1)=='π')
                        e1.setText(s + "^");
                    else{
                        if(s.length()>1){
                            if((s.charAt(s.length()-2)>='0'&&s.charAt(s.length()-2)<='9')||s.charAt(s.length()-2)=='.'||s.charAt(s.length()-2)=='π'){
                                s=s.substring(0,s.length()-1);
                                e1.setText(s+"^");
                            }
                        }
                        else {
                            s = s.substring(0, s.length() - 1) + "^";
                            e1.setText(s);
                        }
                    }
                }
                check=true;
                leq=false;
            }
        });
        bbrstrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                e1.setText(s+"(");
                brcnt++;
                check=true;
                leq=false;
            }
        });
        bbrend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                e1.setText(s+")");
                brcnt--;
                if(brcnt<0){
                    Toast.makeText(getBaseContext(),"Syntax Error2",Toast.LENGTH_SHORT).show();
                    brcnt++;
                    e1.setText(s);
                }
                check=true;
                leq=false;
            }
        });
    }

    private String calculation(String str) {
        if(str.length()==0)
            return str;
        int i = 0,j=0,ie,fe,k,br=0,brcn=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='π'){
                if(i>0){
                    if((str.charAt(i-1)>='0'&&str.charAt(i-1)<='9')||str.charAt(i-1)=='.'||str.charAt(i-1)==')'||str.charAt(i-1)=='π') {
                        str = str.replace(str.substring(i - 1, i + 1), str.charAt(i - 1) + "*π");
                    }
                    else if(i<str.length()-1){
                        //Toast.makeText(getApplicationContext(),i+" "+str.length(),Toast.LENGTH_SHORT).show();

                        if((str.charAt(i+1)>='0'&&str.charAt(i+1)<='9'||str.charAt(i+1)=='.'||str.charAt(i+1)=='π')){
                            str=str.replace(str.substring(i,i+2),"π*"+str.charAt(i+1));
                        }}
                }
                if(i==0){
                     if(i<str.length()-1){
                        //Toast.makeText(getApplicationContext(),i+" "+str.length(),Toast.LENGTH_SHORT).show();

                        if((str.charAt(i+1)>='0'&&str.charAt(i+1)<='9'||str.charAt(i+1)=='.'||str.charAt(i+1)=='π'||str.charAt(i+1)=='√')){
                            str=str.replace(str.substring(i,i+2),"π*"+str.charAt(i+1));
                        }}
                }

            }
            else if(str.charAt(i)=='('&&i>0){
                if(str.charAt(i-1)>='0'&&str.charAt(i-1)<='9')
                    str=str.replace(str.substring(i-1,i+1),str.charAt(i-1)+"*(");
            }
            else if(str.charAt(i)==')'&&i<str.length()-1){
                if(str.charAt(i+1)>='0'&&str.charAt(i+1)<='9')
                    str=str.replace(str.substring(i,i+2),")*"+str.charAt(i+1));
            }
            else if(str.charAt(i)=='√'&&i>0){
                //Toast.makeText(getApplicationContext(),str+" "+str.charAt(i-1),Toast.LENGTH_SHORT).show();
                if(str.charAt(i-1)!='+'&&str.charAt(i-1)!='-'&&str.charAt(i-1)!='/'&&str.charAt(i-1)!='^'&&str.charAt(i-1)!='*') {
                    //Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                    str = str.replace(str.substring(i - 1, i + 1), str.charAt(i - 1) + "*√");
                }
            }
            //Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
        }
        str=str.replace("π","3.1415926536");
        while (true) {
            op=0;
            j=str.length();
            for (i = 0; i < str.length() - 1; i++) {
             //   Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
                if ((str.charAt(i)<'0'&&str.charAt(i)!='.')||str.charAt(i)>'9'){
                    if(str.charAt(i)=='('){
                        brcn=0;
                        for(br=i+1;;br++){
                            if(brcn==0&&str.charAt(br)==')'){
                                String tempstr=str.substring(i+1,br);
                                str=str.replace(str.substring(i,br+1),calculation(tempstr));
                                i=-1;
                                op=0;
                                j=str.length();
                                break;
                            }
                            else if(str.charAt(br)=='('){
                                brcn++;
                            }
                            else if(str.charAt(br)==')')
                                brcn--;
                        }
                        //Toast.makeText(getApplicationContext(),str+" "+i+" "+op+" "+j,Toast.LENGTH_SHORT).show();
                        continue;
                    }
                    else if(str.charAt(i)=='√'){
                        if(op<=6){
                            j=i;
                            op=6;
                        }
                    }
                    else if(str.charAt(i)=='^'){
                        if(op<=5){
                            j=i;
                            op=5;
                        }
                    }
                    else if(str.charAt(i)=='/'){
                        if(op<4){
                            j=i;
                            op=4;
                        }
                    }
                    else if(str.charAt(i)=='*'){
                        if(op<3){
                            j=i;
                            op=3;
                        }
                    }
                    else if(str.charAt(i)=='-'){
                        if(i==0)
                            continue;
                        else if(str.charAt(i-1)>'9'||(str.charAt(i-1)<'0'&&str.charAt(i-1)!='.'))
                            continue;
                        if(op<2){
                            j=i;
                            op=2;
                        }
                    }
                    else if(str.charAt(i)=='+'){
                        if(op<1){
                            j=i;
                            //Toast.makeText(getApplicationContext(),j+"",Toast.LENGTH_SHORT).show();
                            op=1;
                        }
                    }
                }
            }

            if(op==0)
                break;
            k=j-1;
            ie=0;
            fe=str.length();
            while(k>=0&&op!=6){
                if((str.charAt(k)<'0'&&str.charAt(k)!='.')||str.charAt(k)>'9'){
                    ie=k+1;
                    if(k==0)
                        ie=k;
                    else if(str.charAt(k-1)>'9'||(str.charAt(k-1)<'0'&&str.charAt(k-1)!='.'))
                        ie=k;
                    break;
                }
                k--;
            }
            k=j+1;
            if(str.charAt(k)=='-')
                k++;
            while(k<str.length()) {
                if (((str.charAt(k) < '0' && str.charAt(k) != '.') || str.charAt(k) > '9')) {
                    fe = k;
                    break;
                }
                k++;
            }

        //Toast.makeText(getBaseContext(),ie+" "+fe,Toast.LENGTH_SHORT).show();
            s1=str.substring(ie,j);
            s2=str.substring(j+1,fe);
            if(op!=6)
            exp1=Double.parseDouble(s1);
            exp2=Double.parseDouble(s2);
            if(op==6){
                exp3=Math.sqrt(exp2);
            }
            else if(op==5){
                exp3=Math.pow(exp1,exp2);
            }
            else if(op==4){
                exp3=exp1/exp2;
            }
            else if(op==3){
                exp3=exp1*exp2;
            }
            else if(op==2){
                exp3=exp1-exp2;
            }
            else if(op==1){
                exp3=exp1+exp2;
            }
            s3=String.valueOf(exp3);
            if(op!=6)
            str=str.replace(str.substring(ie,fe),s3);
            else
                str=str.replace(str.substring(j,fe),s3);
            //Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
        }
        boolean tempdot=false;
        int strcnt=0,indexstr=str.length()-1;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                tempdot=true;
            }
            if(tempdot&&str.charAt(i)=='0'){
                strcnt++;
            }
            else if(tempdot){
                strcnt=0;
                indexstr=i;
            }
            if(strcnt==10) {
                for(int index=str.length()-1;index>=str.length()-5;index--){
                    if(str.charAt(index)=='E'){
                        String tem,tem2;
                        tem=str.substring(index,str.length());
                        tem2=str.substring(indexstr+2,str.length());
                        indexstr+=str.length()-index+1;
                        str=str.replace(tem2,tem);
                        break;
                    }
                }
                str = str.substring(0, indexstr + 1);
                break;
            }
        }
        if(str.length()>=2)
        if(str.charAt(str.length()-2)=='.'&&str.charAt(str.length()-1)=='0')
            str=str.substring(0,str.length()-2);
        if(str.length()>0)
        if(str.charAt(str.length()-1)=='.')
            str=str.substring(0,str.length()-1);
        return  str;
    }
}