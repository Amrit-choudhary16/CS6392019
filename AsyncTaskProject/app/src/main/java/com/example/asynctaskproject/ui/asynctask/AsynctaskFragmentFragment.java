package com.example.asynctaskproject.ui.asynctask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asynctaskproject.R;

import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class AsynctaskFragmentFragment extends Fragment {

    private ImageView image;

    public static AsynctaskFragmentFragment newInstance() {
        return new AsynctaskFragmentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String url = "https://raw.githubusercontent.com/Amrit-choudhary16/CS6392019/master/AsyncTaskProject/vidhana_soudha.png";

        View view = inflater.inflate(R.layout.asynctask_fragment, container, false);
        image = view.findViewById(R.id.imageView);
        new GetAsyncImage().execute(url);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText("BANGALORE, INDIA");
        return view;
    }

    private class GetAsyncImage extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Bitmap doInBackground(String... parms) {

            Bitmap bitmap = null;
            try {
                URL url = new URL(parms[0]);
                HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
                if(con.getResponseCode() != 200){
                    throw new Exception("Failed to Connect");
                }
                InputStream is = con.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);
            }catch(Exception e){
                Log.e("Image", "Failed to load Image", e);
                Log.e("error", e.getMessage());
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            image.setImageBitmap(bitmap);

        }
    }
}
