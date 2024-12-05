package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final t0 f2119a;

    /* renamed from: b, reason: collision with root package name */
    private static final l.e f2120b;

    /* loaded from: classes.dex */
    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        private h.e f2121a;

        public a(h.e eVar) {
            this.f2121a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i6) {
            h.e eVar = this.f2121a;
            if (eVar != null) {
                eVar.f(i6);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f2121a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        f2119a = i6 >= 29 ? new s0() : i6 >= 28 ? new u() : i6 >= 26 ? new t() : (i6 < 24 || !m.j()) ? new l() : new m();
        f2120b = new l.e(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i6) {
        if (context != null) {
            return Typeface.create(typeface, i6);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i6) {
        return f2119a.b(context, cancellationSignal, bVarArr, i6);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i6, String str, int i7, int i8, h.e eVar, Handler handler, boolean z5) {
        Typeface a6;
        if (bVar instanceof e.C0026e) {
            e.C0026e c0026e = (e.C0026e) bVar;
            Typeface g6 = g(c0026e.c());
            if (g6 != null) {
                if (eVar != null) {
                    eVar.d(g6, handler);
                }
                return g6;
            }
            a6 = androidx.core.provider.g.c(context, c0026e.b(), i8, !z5 ? eVar != null : c0026e.a() != 0, z5 ? c0026e.d() : -1, h.e.e(handler), new a(eVar));
        } else {
            a6 = f2119a.a(context, (e.c) bVar, resources, i8);
            if (eVar != null) {
                if (a6 != null) {
                    eVar.d(a6, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a6 != null) {
            f2120b.d(e(resources, i6, str, i7, i8), a6);
        }
        return a6;
    }

    public static Typeface d(Context context, Resources resources, int i6, String str, int i7, int i8) {
        Typeface d6 = f2119a.d(context, resources, i6, str, i8);
        if (d6 != null) {
            f2120b.d(e(resources, i6, str, i7, i8), d6);
        }
        return d6;
    }

    private static String e(Resources resources, int i6, String str, int i7, int i8) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i7 + '-' + i6 + '-' + i8;
    }

    public static Typeface f(Resources resources, int i6, String str, int i7, int i8) {
        return (Typeface) f2120b.c(e(resources, i6, str, i7, i8));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
