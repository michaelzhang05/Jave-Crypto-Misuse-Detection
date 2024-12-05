package f3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6590a = {R.attr.theme, m2.a.N};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6591b = {m2.a.f7570x};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6590a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i6, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6591b, i6, i7);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i6, int i7) {
        int b6 = b(context, attributeSet, i6, i7);
        boolean z5 = (context instanceof d) && ((d) context).c() == b6;
        if (b6 == 0 || z5) {
            return context;
        }
        d dVar = new d(context, b6);
        int a6 = a(context, attributeSet);
        if (a6 != 0) {
            dVar.getTheme().applyStyle(a6, true);
        }
        return dVar;
    }
}
