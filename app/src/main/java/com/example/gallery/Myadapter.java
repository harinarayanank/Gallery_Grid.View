package com.example.gallery;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;

public class Myadapter extends BaseAdapter {

    Context context;
    int images[];
    LayoutInflater layoutInflater;

    public Myadapter(Context context , int images[]) {
        this.context = context;
        this.images = images;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.gridview,null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);
        imageView.setImageResource(images[position]);
        return imageView;
    }
}
