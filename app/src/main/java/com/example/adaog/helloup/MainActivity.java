package com.example.adaog.helloup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private TextView tLogin;
    private TextView tSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**inicializando **/
        //Relacionando o botão no java com o botão na tela
        Button btLogin = findViewById(R.id.btLogar);
        btLogin.setOnClickListener(onClickLogin());

        tLogin = findViewById(R.id.tLogin);
        tSenha = findViewById(R.id.tSenha);
    }

    //Criando a ação para o botão LOGAR
    private View.OnClickListener onClickLogin() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //alert(R.string.msg_login_ok);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if("admin".equals(login) && "123".equals(senha)){
                   // alert(R.string.msg_login_ok);
                    String nome = "Administrador";
                    Intent intent = new Intent(getContext(), HomeActivity.class);
                    intent.putExtra("nome",nome);
                    startActivity(intent);



                }else{
                    alert(R.string.msg_Erro_Log);
                }
            }
        };
    }


}
