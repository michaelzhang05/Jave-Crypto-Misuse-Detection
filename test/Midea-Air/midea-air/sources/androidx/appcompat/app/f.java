package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import c.a.o.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: f, reason: collision with root package name */
    private static int f129f = -100;

    /* renamed from: g, reason: collision with root package name */
    private static final c.e.b<WeakReference<f>> f130g = new c.e.b<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f131h = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(f fVar) {
        synchronized (f131h) {
            B(fVar);
        }
    }

    private static void B(f fVar) {
        synchronized (f131h) {
            Iterator<WeakReference<f>> it = f130g.iterator();
            while (it.hasNext()) {
                f fVar2 = it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void G(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f129f != i2) {
            f129f = i2;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(f fVar) {
        synchronized (f131h) {
            B(fVar);
            f130g.add(new WeakReference<>(fVar));
        }
    }

    private static void f() {
        synchronized (f131h) {
            Iterator<WeakReference<f>> it = f130g.iterator();
            while (it.hasNext()) {
                f fVar = it.next().get();
                if (fVar != null) {
                    fVar.e();
                }
            }
        }
    }

    public static f i(Activity activity, e eVar) {
        return new g(activity, eVar);
    }

    public static f j(Dialog dialog, e eVar) {
        return new g(dialog, eVar);
    }

    public static int l() {
        return f129f;
    }

    public abstract boolean C(int i2);

    public abstract void D(int i2);

    public abstract void E(View view);

    public abstract void F(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void H(Toolbar toolbar);

    public void I(int i2) {
    }

    public abstract void J(CharSequence charSequence);

    public abstract c.a.o.b K(b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    public Context h(Context context) {
        g(context);
        return context;
    }

    public abstract <T extends View> T k(int i2);

    public abstract b m();

    public int n() {
        return -100;
    }

    public abstract MenuInflater o();

    public abstract a p();

    public abstract void q();

    public abstract void r();

    public abstract void s(Configuration configuration);

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();
}
