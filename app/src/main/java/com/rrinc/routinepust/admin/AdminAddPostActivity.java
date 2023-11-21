package com.rrinc.routinepust.admin;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.Post;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class AdminAddPostActivity extends AppCompatActivity {

    Button ChooseButton, UploadButton;
    EditText ImageName ;
    EditText dis;
    ImageView SelectImage;
    TextView tim;


    DatabaseReference reference;

    StorageReference storageReference;
    private static final int IMAGE_REQUEST = 1;
    private Uri imageUri;
    private StorageTask uploadTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_addpost);

        final String Dep = getIntent().getStringExtra("dep");
        final String Sem = getIntent().getStringExtra("sem");



        storageReference = FirebaseStorage.getInstance().getReference("uploads");


        reference= FirebaseDatabase.getInstance().getReference("Post").child(Dep).child(Sem);
        // ICE


        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yy h:mm a");
        String dateTime = dateFormat.format(calendar.getTime());

        ChooseButton = findViewById(R.id.ButtonChooseImage);
        UploadButton = findViewById(R.id.ButtonUploadImage);
        tim = findViewById(R.id.textview);
        ImageName = findViewById(R.id.ImageNameEditText);
        dis = findViewById(R.id.disEditText);

        SelectImage = findViewById(R.id.ShowImageView);

        tim.setText(dateTime);



        ChooseButton.setOnClickListener(view -> openImage());

        UploadButton.setOnClickListener(view -> {
            if (uploadTask !=null && uploadTask.isInProgress()){
                Toast.makeText(getApplicationContext(),"Uploading....",Toast.LENGTH_SHORT).show();
            }else {
                uploadImage();
            }
        });
    }

    private void openImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,IMAGE_REQUEST);
    }


    private String getFileExtension(Uri uri){
        ContentResolver contentResolver = this.getContentResolver();
        MimeTypeMap mimeTypeMap =MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    private void uploadImage(){
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Uploading");
        pd.show();

        if (imageUri !=null){
            final StorageReference fileRefernce = storageReference.child(System.currentTimeMillis()
                    +"."+getFileExtension(imageUri));

            uploadTask = fileRefernce.putFile(imageUri);
            uploadTask.continueWithTask((Continuation<UploadTask.TaskSnapshot, Task<Uri>>) task -> {

                if (!task.isSuccessful()){
                    throw Objects.requireNonNull(task.getException());
                }

                return fileRefernce.getDownloadUrl();
            }).addOnCompleteListener((OnCompleteListener<Uri>) task -> {
                if (task.isSuccessful()){
                    Uri downloadUri = task.getResult();
                    assert downloadUri != null;
                    String mUri= downloadUri.toString();

                    String ImageUploadId = reference.push().getKey();
                    String TempImageName = ImageName.getText().toString().trim();
                    String time = tim.getText().toString().trim();
                    String disc = dis.getText().toString().trim();
                    Toast.makeText(getApplicationContext(), "Image Uploaded Successfully ", Toast.LENGTH_LONG).show();

                    Post imageUploadInfo = new Post(ImageUploadId,TempImageName, mUri,disc,time);

                    assert ImageUploadId != null;
                    reference.child(ImageUploadId).setValue(imageUploadInfo);
                    openImagesActivity();
                }else {
                    Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
                }
                pd.dismiss();

            }).addOnFailureListener(e -> {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                pd.dismiss();
            });
        }else {
            String ImageUploadId = reference.push().getKey();
            String TempImageName = ImageName.getText().toString().trim();
            String time = tim.getText().toString().trim();
            String disc = dis.getText().toString().trim();
            Toast.makeText(getApplicationContext(), "Image Uploaded Successfully ", Toast.LENGTH_LONG).show();

            Post imageUploadInfo = new Post(ImageUploadId,TempImageName, "default",disc,time);

            assert ImageUploadId != null;
            reference.child(ImageUploadId).setValue(imageUploadInfo);
            openImagesActivity();
            pd.dismiss();
            Toast.makeText(getApplicationContext(),"No image Selected",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == IMAGE_REQUEST && resultCode == RESULT_OK
                && data !=null && data.getData() !=null){
            imageUri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                SelectImage.setImageBitmap(bitmap);
                ChooseButton.setText("Image Selected");

            }
            catch (IOException e) {

                e.printStackTrace();
            }


        }
    }

    private void openImagesActivity(){
        Intent intent = new Intent(this, AdminDashBoard.class);
        startActivity(intent);
        finish();
    }
}
