package com.starkyy.firebaseapp;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class IUData {
    private DatabaseReference databaseReference;
    public IUData()
    {
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        databaseReference=db.getReference(Data.class.getSimpleName());
    }
    public Task<Void> add(Data d)
    {
        return databaseReference.push().setValue(d);
    }

}
