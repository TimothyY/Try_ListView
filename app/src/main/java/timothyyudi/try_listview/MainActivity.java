package timothyyudi.try_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    ListView lvBuku;
    ArrayList<Buku> daftarBukuSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListBuku2();

        lvBuku = (ListView) findViewById(R.id.lvBuku);
        BookAdapter mBookAdapter = new BookAdapter(this, daftarBukuSource);
        lvBuku.setAdapter(mBookAdapter);
        lvBuku.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,
                daftarBukuSource.get(i).judul+ daftarBukuSource.get(i).author+ daftarBukuSource.get(i).ISBN,
                Toast.LENGTH_SHORT).show();
    }

    void initListBuku2(){
        daftarBukuSource = new ArrayList<>();
        daftarBukuSource.add(new Buku("HarryPotter","JKRowling",123));
        daftarBukuSource.add(new Buku("Hunger Games","Suzan Colins",345));
        daftarBukuSource.add(new Buku("C how to program","Deitel",456));
    }
}
