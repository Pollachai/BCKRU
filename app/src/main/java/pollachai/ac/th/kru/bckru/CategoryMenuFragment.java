package pollachai.ac.th.kru.bckru;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryMenuFragment extends Fragment implements View.OnClickListener {

    private ImageView menu1Button, menu2Button, menu3Button, menu4Button, menu5Button;


    public CategoryMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        menu1Button = getView().findViewById(R.id.imvMenu1);
        menu2Button = getView().findViewById(R.id.imvMenu2);
        menu3Button = getView().findViewById(R.id.imvMenu3);
        menu4Button = getView().findViewById(R.id.imvMenu4);
        menu5Button = getView().findViewById(R.id.imvMenu5);

        menu1Button.setOnClickListener(this);
        menu2Button.setOnClickListener(this);
        menu3Button.setOnClickListener(this);
        menu4Button.setOnClickListener(this);
        menu5Button.setOnClickListener(this);


        // Main Method


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_menu, container, false);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imvMenu1:
                showListView(0);
                break;
            case R.id.imvMenu2:
                showListView(1);
                break;
            case R.id.imvMenu3:
                showListView(2);
                break;
            case R.id.imvMenu4:
                showListView(3);
                break;
            case R.id.imvMenu5:
                showListView(4);
                break;
        }


    }

    private void showListView(int i) {

        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.LayoutMainFragment, ListViewFragment.listViewInstance(i))
                .addToBackStack(null)
                .commit();

    } // showListView
}
