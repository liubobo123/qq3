package jiyun_qq1.com.myapplication2.ListActivity;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import jiyun_qq1.com.myapplication2.R;

public class ExpandableListActivityTest extends ExpandableListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_expandable_list_test);
        BaseExpandableListAdapter adapter = new BaseExpandableListAdapter() {
            int[] logos = new int[]{
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
            };
            private String[] armTypes = new String[]{
                    "A", "B", "C", "D"
            };
            private String[][] arms = new String[][]{
                    {"a1", "b1", "c1", "d1"},
                    {"a2", "b2", "c2", "d2"},
                    {"a3", "b3", "c3", "d3"},
                    {"a4", "b4", "c4", "d4"},
            };

            @Override
            public int getGroupCount() {
                return armTypes.length;
            }

            @Override
            public int getChildrenCount(int groupPosition) {
                return arms[groupPosition].length;
            }
            //获取指定组位置处的组数据
            @Override
            public Object getGroup(int groupPosition) {
                return armTypes[groupPosition];
            }

            //获取指定组位置，指定子列表项处的子列表项的数据
            @Override
            public Object getChild(int groupPosition, int childPosition) {
                return arms[groupPosition][childPosition];
            }

            @Override
            public long getGroupId(int groupPosition) {
                return groupPosition;
            }

            @Override
            public long getChildId(int groupPosition, int childPosition) {
                return childPosition;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }
            private TextView getTextView() {
                AbsListView.LayoutParams Ip = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 64);
                TextView textView = new TextView(ExpandableListActivityTest.this);
                textView.setLayoutParams(Ip);
                textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
                textView.setPadding(36, 0, 0, 0);
                textView.setTextSize(20);
                return textView;
            };
            //该方法决定每个组选项的外观
            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
                LinearLayout II = new LinearLayout(ExpandableListActivityTest.this);
                II.setOrientation(LinearLayout.HORIZONTAL);
                ImageView loge = new ImageView(ExpandableListActivityTest.this);
                loge.setImageResource(logos[groupPosition]);
                II.addView(loge);
                TextView textView = getTextView();
                textView.setText(getGroup(groupPosition).toString());
                II.addView(textView);
                return II;
            }




            // 该方法决定每个子选项的外观
            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
                TextView textView = getTextView();
                textView.setText(getChild(groupPosition,childPosition).toString());

                return textView;
            }

            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition) {
                return true;
            }
        };
        //最后设置该窗口显示的列表
        setListAdapter(adapter);
    }
}
