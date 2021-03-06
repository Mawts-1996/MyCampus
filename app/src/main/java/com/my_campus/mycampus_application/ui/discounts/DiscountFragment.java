package com.my_campus.mycampus_application.ui.discounts;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.my_campus.mycampus_application.R;

import java.util.ArrayList;

public class DiscountFragment extends Fragment {

    private DiscountViewModel discountViewModel;
private static final String TAG ="DiscountFragment";

    private ArrayList<String> mDiscountImage = new ArrayList<>();
    private ArrayList<String> mDiscountName = new ArrayList<>();

    private RecyclerView discountrecyclerView;
    private RecyclerView.Adapter mDiscountAdapter;
    private RecyclerView.LayoutManager discountLayoutManager;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        discountViewModel =
                ViewModelProviders.of(this).get(DiscountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_discount, container, false);


        Log.d(TAG,"OnCreate Started");


        initImageBitmaps();

        discountrecyclerView = root.findViewById(R.id.discount_recycler);
        discountLayoutManager = new LinearLayoutManager(this.getActivity());
        discountrecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mDiscountAdapter = new DiscountAdapter(mDiscountImage, mDiscountName, this.getContext());
        discountrecyclerView.setAdapter(mDiscountAdapter);

        return root;
    }

    //loads image and words onto Recyclerview
    private void initImageBitmaps()
    {

        mDiscountImage.add("https://calvin.edu/contentAsset/raw-data/e554071f-d535-4339-aa57-17c07812ca43/uploadableImage");
        mDiscountName.add("MCard Discounts");
    }
}