package ru.mirea.zavarzin.mireaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class OwnerView extends AppCompatActivity {
    private EditText petField,nameField,ageField;
    private AppDatebase appDatebase;
    private OwnerDao ownerDao;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.owner_view);
        appDatebase = App.getInstance().getDatabase();
        ownerDao = appDatebase.ownerDao();

        nameField = findViewById(R.id.name_owner);
        ageField = findViewById(R.id.age_owner);
        petField = findViewById(R.id.owner_pet);
    }

    public void onSave(View view) {
        Owner owner =new Owner();
        owner.name = nameField.getText().toString();
        owner.age = ageField.getText().toString();
        owner.pet = petField.getText().toString();
        ownerDao.insert(owner);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
