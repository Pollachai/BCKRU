package pollachai.ac.th.kru.bckru;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {

    private String[] titleStrings = new String[]{"ประวัติ", "เศรษฐกิจ", "สินค้าดีเด่น", "การท่องเที่ยว", "ติตด่อเรา"};
    private int index;

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
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Create Toolbar
        Toolbar toolbar = getView().findViewById(R.id.toolbarListView);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);


        index = getArguments().getInt("Cat", 0);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(titleStrings[index]);

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

//        Create RecyclreView




            }
// Main Method
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_view, container, false);
    }

}
