package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.graphics.k;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final l.e f2191a = new l.e(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f2192b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f2193c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final l.g f2194d = new l.g();

    /* loaded from: classes.dex */
    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2195a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f2196b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2197c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2198d;

        a(String str, Context context, androidx.core.provider.e eVar, int i6) {
            this.f2195a = str;
            this.f2196b = context;
            this.f2197c = eVar;
            this.f2198d = i6;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f2195a, this.f2196b, this.f2197c, this.f2198d);
        }
    }

    /* loaded from: classes.dex */
    class b implements androidx.core.util.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f2199a;

        b(androidx.core.provider.a aVar) {
            this.f2199a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2199a.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2200a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f2201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2203d;

        c(String str, Context context, androidx.core.provider.e eVar, int i6) {
            this.f2200a = str;
            this.f2201b = context;
            this.f2202c = eVar;
            this.f2203d = i6;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f2200a, this.f2201b, this.f2202c, this.f2203d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements androidx.core.util.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2204a;

        d(String str) {
            this.f2204a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            synchronized (f.f2193c) {
                l.g gVar = f.f2194d;
                ArrayList arrayList = (ArrayList) gVar.get(this.f2204a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f2204a);
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    ((androidx.core.util.a) arrayList.get(i6)).a(eVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f2205a;

        /* renamed from: b, reason: collision with root package name */
        final int f2206b;

        e(int i6) {
            this.f2205a = null;
            this.f2206b = i6;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a() {
            return this.f2206b == 0;
        }

        e(Typeface typeface) {
            this.f2205a = typeface;
            this.f2206b = 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i6) {
        return eVar.d() + "-" + i6;
    }

    private static int b(g.a aVar) {
        int i6 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b6 = aVar.b();
        if (b6 != null && b6.length != 0) {
            i6 = 0;
            for (g.b bVar : b6) {
                int b7 = bVar.b();
                if (b7 != 0) {
                    if (b7 < 0) {
                        return -3;
                    }
                    return b7;
                }
            }
        }
        return i6;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i6) {
        l.e eVar2 = f2191a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e6 = androidx.core.provider.d.e(context, eVar, null);
            int b6 = b(e6);
            if (b6 != 0) {
                return new e(b6);
            }
            Typeface b7 = k.b(context, null, e6.b(), i6);
            if (b7 == null) {
                return new e(-3);
            }
            eVar2.d(str, b7);
            return new e(b7);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, androidx.core.provider.e eVar, int i6, Executor executor, androidx.core.provider.a aVar) {
        String a6 = a(eVar, i6);
        Typeface typeface = (Typeface) f2191a.c(a6);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f2193c) {
            l.g gVar = f2194d;
            ArrayList arrayList = (ArrayList) gVar.get(a6);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bVar);
            gVar.put(a6, arrayList2);
            c cVar = new c(a6, context, eVar, i6);
            if (executor == null) {
                executor = f2192b;
            }
            h.b(executor, cVar, new d(a6));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i6, int i7) {
        String a6 = a(eVar, i6);
        Typeface typeface = (Typeface) f2191a.c(a6);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i7 == -1) {
            e c6 = c(a6, context, eVar, i6);
            aVar.b(c6);
            return c6.f2205a;
        }
        try {
            e eVar2 = (e) h.c(f2192b, new a(a6, context, eVar, i6), i7);
            aVar.b(eVar2);
            return eVar2.f2205a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
