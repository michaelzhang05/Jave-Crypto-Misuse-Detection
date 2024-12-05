package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.c.a;

/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    private final int f642f;

    /* renamed from: g, reason: collision with root package name */
    private final int f643g;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f642f = getResources().getDimensionPixelOffset(a.f2348b);
        this.f643g = getResources().getDimensionPixelOffset(a.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f642f * 2), this.f643g), 1073741824), i3);
    }
}
