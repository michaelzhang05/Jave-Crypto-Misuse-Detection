package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f352f = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q0 u = q0.u(context, attributeSet, f352f);
        setBackgroundDrawable(u.g(0));
        u.w();
    }
}
