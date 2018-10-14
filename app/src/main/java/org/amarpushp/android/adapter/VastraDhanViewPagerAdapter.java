package org.amarpushp.android.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;



public class VastraDhanViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images={R.drawable.amarpushp_vastradaan, R.drawable.amarpushp_vastradaan_1,R.drawable.amarpushp_vastradaan_2,R.drawable.amarpushp_vastradaan_3,R.drawable.amarpushp_vastradaan_4,R.drawable.amarpushp_vastradaan_5,R.drawable.amarpushp_vastradaan_6};



    public VastraDhanViewPagerAdapter(Context context){
        this.context=context;

    }
    @Override
    public int getCount() {
        return images.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object){
        return view==object;

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.vastradhan_viewpageritem,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imagevastradhanviewpageritem);
        imageView.setImageResource(images[position]);
        ViewPager viewPager=(ViewPager)container;
        viewPager.addView(view,0);
        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager=(ViewPager)container;
        View view=(View)object;
        viewPager.removeView(view);
    }



}
