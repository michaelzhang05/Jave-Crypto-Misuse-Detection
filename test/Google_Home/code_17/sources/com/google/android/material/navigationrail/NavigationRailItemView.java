package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
final class NavigationRailItemView extends NavigationBarItemView {
    public NavigationRailItemView(@NonNull Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @DimenRes
    protected int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @LayoutRes
    protected int getItemLayoutResId() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (View.MeasureSpec.getMode(i9) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i9)));
        }
    }
}
