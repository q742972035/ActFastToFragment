package com.test.acttofrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 13798 on 2016/7/29.
 */
public class NormalFragment extends Fragment implements View.OnClickListener{
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(),R.layout.operation,null);
        initView(view);
        initListener();
        return view;
    }

    private void initView(View view) {
        btn1 = (Button) view.findViewById(R.id.btn1);
        btn2 = (Button) view.findViewById(R.id.btn2);
        btn3 = (Button) view.findViewById(R.id.btn3);
        btn4 = (Button) view.findViewById(R.id.btn4);
        btn5 = (Button) view.findViewById(R.id.btn5);
        btn6 = (Button) view.findViewById(R.id.btn6);
        btn7 = (Button) view.findViewById(R.id.btn7);
        btn8 = (Button) view.findViewById(R.id.btn8);
        btn9 = (Button) view.findViewById(R.id.btn9);
        btn10 = (Button) view.findViewById(R.id.btn10);
    }

    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(getActivity(), "点击第一个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getActivity(), "点击第二个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(getActivity(), "点击第三个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(getActivity(), "点击第四个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(getActivity(), "点击第五个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Toast.makeText(getActivity(), "点击第六个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn7:
                Toast.makeText(getActivity(), "点击第七个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn8:
                Toast.makeText(getActivity(), "点击第八个", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn9:
                Toast.makeText(getActivity(), "点击第九个", Toast.LENGTH_SHORT).show();
            case R.id.btn10:
                Toast.makeText(getActivity(), "点击第十个", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
