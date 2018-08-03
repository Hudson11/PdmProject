package com.example.aluno.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText texto1;
    EditText texto2;
    Button login;
    TextView texto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.editText1);
        texto2 = findViewById(R.id.editText2);
        texto3 = findViewById(R.id.textView2);
        login = findViewById(R.id.button);

        //texto1.setText("Hudson");
        //texto3.setText("Bom dia Usuário");

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String usuario = texto1.getText().toString();
                String senha = texto2.getText().toString();
                int duracao = Toast.LENGTH_SHORT;
                Context contexto = getApplicationContext();

                if(usuario.equals("hudson") && senha.equals("123")){
                    texto3.setText("USUARIO LOGADO");
                    Toast.makeText(contexto, "Bem vindo "+usuario, duracao).show();
                }else{
                    texto3.setText("ERRO AO LOGAR");
                    Toast.makeText(contexto, "Erro ao Logar", duracao).show();
                }
            }
        });
    }
}
