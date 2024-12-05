package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class b3 extends t2 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f919b;

    public b3(Context context, Resources resources) {
        super(resources);
        this.f919b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i6) {
        Drawable a6 = a(i6);
        Context context = (Context) this.f919b.get();
        if (a6 != null && context != null) {
            s2.h().x(context, i6, a6);
        }
        return a6;
    }
}
