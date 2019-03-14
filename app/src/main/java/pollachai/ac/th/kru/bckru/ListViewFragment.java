package pollachai.ac.th.kru.bckru;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {


    public ListViewFragment() {
        // Required empty public constructor
    }

    public static ListViewFragment listViewInstance(int index) {
        ListViewFragment listViewFragment = new ListViewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("Cat",index);
        listViewFragment.setArguments(bundle);
        return listViewFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_view, container, false);
    }

}
