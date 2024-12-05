package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources.java */
/* loaded from: classes.dex */
public class v0 extends Resources {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f630b;

    public v0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f630b = new WeakReference<>(context);
    }

    public static boolean a() {
        return a;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable c(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Context context = this.f630b.get();
        if (context != null) {
            return g0.h().t(context, this, i2);
        }
        return super.getDrawable(i2);
    }
}
