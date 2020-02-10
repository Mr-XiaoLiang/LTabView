package liang.lollipop.ltabviewdemo;

import android.graphics.Color;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import liang.lollipop.ltabview.LTabHelper;
import liang.lollipop.ltabview.LTabView;
import liang.lollipop.ltabview.builder.ExpandBuilder;
import liang.lollipop.ltabview.item.ExpandItem;

/**
 * @author lollipop
 * @date 2020-02-10 11:04
 */
public class JavaDemo {

    public void onCreate(final LTabView tabView) {
        ExpandBuilder helper = LTabHelper.INSTANCE.withExpandItem(tabView)
                .addItem(new Function1<ExpandItem, Unit>() {
            @Override
            public Unit invoke(ExpandItem expandItem) {
                int color = ContextCompat.getColor(expandItem.getRootView().getContext(), R.color.purple);
                expandItem.setExpandColor(color & 0x60FFFFFF);
                expandItem.setIcon(R.drawable.ic_home_black_24dp);
                expandItem.setSelectedIconColor(color);
                expandItem.setUnselectedIconColor(Color.BLACK);
                expandItem.setText("Home");
                expandItem.setTextColor(color);
                return null;
            }
        }).addItem(new Function1<ExpandItem, Unit>() {
            @Override
            public Unit invoke(ExpandItem expandItem) {
                int color = ContextCompat.getColor(expandItem.getRootView().getContext(), R.color.pink);
                expandItem.setExpandColor(color & 0x60FFFFFF);
                expandItem.setIcon(R.drawable.ic_favorite_border_black_24dp);
                expandItem.setSelectedIconColor(color);
                expandItem.setUnselectedIconColor(Color.BLACK);
                expandItem.setText("Home");
                expandItem.setTextColor(color);
                return null;
            }
        });
        helper.setLayoutStyle(LTabView.Style.Center);
        helper.addOnSelectedListener(new LTabView.OnSelectedListener() {
            @Override
            public void onTabSelected(int index) {
                Toast.makeText(tabView.getContext(), "selected:" + index,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
