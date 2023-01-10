package com.jvaleto.barmatic;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

public class InstructionDialog  extends Dialog {

    private int instructionPoints = 0;

    public InstructionDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrutions_dialog_layout);

        final AppCompatButton continueBtn = findViewById(R.id.continueBtn);
        final TextView instructionsTv = findViewById(R.id.instructionsTV);


        setInstructionPoint(instructionsTv,
                "1. El Quiz tiene un tiempo establecido para completar el cuestionario. \n" +
                "2. Obtendrás 1 punto en cada respuesta correcta. \n" +
                "3. Recuerda compartir con tus compañeros el resultado obtenido.\n\n" +
                "Buena suerte, \n\n" +
                "BarMaTic\n"+
                "Equipo");


        //        setInstructionPoint(instructionsTv, "2. Obtendrás 1 punto en cada respuesta correcta.");
//        setInstructionPoint(instructionsTv, "3. Recuerda compartir con tus compañeros el resultado obtenido.");

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }

    private void setInstructionPoint(TextView instructionsTv, String instructionPoint){
        if(instructionPoints == 0){
            instructionsTv.setText(instructionPoint);
        }
        else{
            instructionsTv.setText(instructionsTv.getText()+"\n\n"+instructionPoint);
        }
    }

}
