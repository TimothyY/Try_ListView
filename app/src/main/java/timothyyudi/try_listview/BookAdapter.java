package timothyyudi.try_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 10/20/2016.
 */

public class BookAdapter extends BaseAdapter {

    ArrayList<Buku> books;
    Context mCtx; //mengenali adapter dipanggil di Activity

    public BookAdapter(Context ctx, ArrayList<Buku> books) {
        mCtx = ctx;
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Buku getItem(int i) {
        return books.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mCtx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_row_buku, viewGroup, false);
        TextView tvJudul = (TextView) rowView.findViewById(R.id.tvJudul);
        tvJudul.setText(getItem(i).judul);
        TextView tvAuthor = (TextView) rowView.findViewById(R.id.tvAuthor);
        tvAuthor.setText(getItem(i).author);
        TextView tvISBN = (TextView) rowView.findViewById(R.id.tvISBN);
        tvISBN.setText(""+getItem(i).ISBN);
        return rowView;
    }
}
