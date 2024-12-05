package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f2138a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // androidx.core.graphics.t0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.t0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    private static Object e(Object[] objArr, int i6, b bVar) {
        return f(objArr, (i6 & 1) == 0 ? 400 : 700, (i6 & 2) != 0, bVar);
    }

    private static Object f(Object[] objArr, int i6, boolean z5, b bVar) {
        Object obj = null;
        int i7 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i6) * 2) + (bVar.b(obj2) == z5 ? 0 : 1);
            if (obj == null || i7 > abs) {
                obj = obj2;
                i7 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i6);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i6);

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface c(Context context, InputStream inputStream) {
        File e6 = u0.e(context);
        if (e6 == null) {
            return null;
        }
        try {
            if (u0.d(e6, inputStream)) {
                return Typeface.createFromFile(e6.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e6.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        File e6 = u0.e(context);
        if (e6 == null) {
            return null;
        }
        try {
            if (u0.c(e6, resources, i6)) {
                return Typeface.createFromFile(e6.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e6.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g.b g(g.b[] bVarArr, int i6) {
        return (g.b) e(bVarArr, i6, new a());
    }
}
