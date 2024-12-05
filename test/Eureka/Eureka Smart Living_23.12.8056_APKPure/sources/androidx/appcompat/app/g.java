package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    static z.a f300a = new z.a(new z.b());

    /* renamed from: b, reason: collision with root package name */
    private static int f301b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static androidx.core.os.i f302c = null;

    /* renamed from: d, reason: collision with root package name */
    private static androidx.core.os.i f303d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f304e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f305f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final l.b f306g = new l.b();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f307h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f308i = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static LocaleList a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static LocaleList a(Object obj) {
            LocaleList applicationLocales;
            applicationLocales = h.a(obj).getApplicationLocales();
            return applicationLocales;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void b(Object obj, LocaleList localeList) {
            h.a(obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(g gVar) {
        synchronized (f307h) {
            F(gVar);
        }
    }

    private static void F(g gVar) {
        synchronized (f307h) {
            Iterator it = f306g.iterator();
            while (it.hasNext()) {
                g gVar2 = (g) ((WeakReference) it.next()).get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(final Context context) {
        if (u(context)) {
            if (androidx.core.os.b.c()) {
                if (f305f) {
                    return;
                }
                f300a.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.v(context);
                    }
                });
                return;
            }
            synchronized (f308i) {
                androidx.core.os.i iVar = f302c;
                if (iVar == null) {
                    if (f303d == null) {
                        f303d = androidx.core.os.i.c(z.b(context));
                    }
                    if (f303d.f()) {
                    } else {
                        f302c = f303d;
                    }
                } else if (!iVar.equals(f303d)) {
                    androidx.core.os.i iVar2 = f302c;
                    f303d = iVar2;
                    z.a(context, iVar2.h());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(g gVar) {
        synchronized (f307h) {
            F(gVar);
            f306g.add(new WeakReference(gVar));
        }
    }

    public static g h(Activity activity, d dVar) {
        return new k(activity, dVar);
    }

    public static g i(Dialog dialog, d dVar) {
        return new k(dialog, dVar);
    }

    public static androidx.core.os.i k() {
        if (androidx.core.os.b.c()) {
            Object o6 = o();
            if (o6 != null) {
                return androidx.core.os.i.i(b.a(o6));
            }
        } else {
            androidx.core.os.i iVar = f302c;
            if (iVar != null) {
                return iVar;
            }
        }
        return androidx.core.os.i.e();
    }

    public static int m() {
        return f301b;
    }

    static Object o() {
        Context l6;
        Iterator it = f306g.iterator();
        while (it.hasNext()) {
            g gVar = (g) ((WeakReference) it.next()).get();
            if (gVar != null && (l6 = gVar.l()) != null) {
                return l6.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.os.i q() {
        return f302c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(Context context) {
        if (f304e == null) {
            try {
                Bundle bundle = x.a(context).metaData;
                if (bundle != null) {
                    f304e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f304e = Boolean.FALSE;
            }
        }
        return f304e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Context context) {
        z.c(context);
        f305f = true;
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i6);

    public abstract void H(int i6);

    public abstract void I(View view);

    public abstract void J(View view, ViewGroup.LayoutParams layoutParams);

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void L(int i6);

    public abstract void M(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i6);

    public abstract Context l();

    public abstract int n();

    public abstract MenuInflater p();

    public abstract androidx.appcompat.app.a r();

    public abstract void s();

    public abstract void t();

    public abstract void w(Configuration configuration);

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}
