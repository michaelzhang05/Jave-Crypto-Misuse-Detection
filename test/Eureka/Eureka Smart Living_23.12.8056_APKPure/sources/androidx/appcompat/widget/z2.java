package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class z2 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1290c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f1291d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1292a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1293b;

    private z2(Context context) {
        super(context);
        if (!o3.c()) {
            this.f1292a = new b3(this, context.getResources());
            this.f1293b = null;
            return;
        }
        o3 o3Var = new o3(this, context.getResources());
        this.f1292a = o3Var;
        Resources.Theme newTheme = o3Var.newTheme();
        this.f1293b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof z2) || (context.getResources() instanceof b3) || (context.getResources() instanceof o3) || !o3.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1290c) {
            ArrayList arrayList = f1291d;
            if (arrayList == null) {
                f1291d = new ArrayList();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1291d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1291d.remove(size);
                    }
                }
                for (int size2 = f1291d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1291d.get(size2);
                    z2 z2Var = weakReference2 != null ? (z2) weakReference2.get() : null;
                    if (z2Var != null && z2Var.getBaseContext() == context) {
                        return z2Var;
                    }
                }
            }
            z2 z2Var2 = new z2(context);
            f1291d.add(new WeakReference(z2Var2));
            return z2Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1292a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1292a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1293b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        Resources.Theme theme = this.f1293b;
        if (theme == null) {
            super.setTheme(i6);
        } else {
            theme.applyStyle(i6, true);
        }
    }
}
