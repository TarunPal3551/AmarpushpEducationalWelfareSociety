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



public class WomenEmpowermentViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images={R.drawable.women_empowerment, R.drawable.women_empowerment_noida_dehli_ncr_gurgaon_allahabad_1,R.drawable.women_empowerment_noida_dehli_ncr_gurgaon_allahabad_2,R.drawable.women_empowerment_noida_dehli_ncr_gurgaon_allahabad_3,R.drawable.women_empowerment_noida_dehli_ncr_gurgaon_allahabad_4};



    public WomenEmpowermentViewPagerAdapter(Context context){
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
        View view=layoutInflater.inflate(R.layout.women_empowerment_viewpageritem,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imagewomen_empowermentviewpageritem);
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
