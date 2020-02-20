package com.example.mycampus_application.ui.myPosts;

import android.widget.Button;

import com.example.mycampus_application.R;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyPostsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyPostsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("My Postings");

    }

    public LiveData<String> getText() {
        return mText;
    }
}