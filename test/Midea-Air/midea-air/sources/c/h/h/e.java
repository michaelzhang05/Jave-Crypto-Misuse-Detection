package c.h.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import c.h.h.f;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class e {
    static final c.e.e<String, Typeface> a = new c.e.e<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f2684b = g.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f2685c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final c.e.g<String, ArrayList<c.h.j.a<C0057e>>> f2686d = new c.e.g<>();

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    class a implements Callable<C0057e> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f2687f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f2688g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c.h.h.d f2689h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f2690i;

        a(String str, Context context, c.h.h.d dVar, int i2) {
            this.f2687f = str;
            this.f2688g = context;
            this.f2689h = dVar;
            this.f2690i = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0057e call() {
            return e.c(this.f2687f, this.f2688g, this.f2689h, this.f2690i);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    class b implements c.h.j.a<C0057e> {
        final /* synthetic */ c.h.h.a a;

        b(c.h.h.a aVar) {
            this.a = aVar;
        }

        @Override // c.h.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C0057e c0057e) {
            this.a.b(c0057e);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    class c implements Callable<C0057e> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f2691f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f2692g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c.h.h.d f2693h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f2694i;

        c(String str, Context context, c.h.h.d dVar, int i2) {
            this.f2691f = str;
            this.f2692g = context;
            this.f2693h = dVar;
            this.f2694i = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0057e call() {
            return e.c(this.f2691f, this.f2692g, this.f2693h, this.f2694i);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    class d implements c.h.j.a<C0057e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // c.h.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C0057e c0057e) {
            synchronized (e.f2685c) {
                c.e.g<String, ArrayList<c.h.j.a<C0057e>>> gVar = e.f2686d;
                ArrayList<c.h.j.a<C0057e>> arrayList = gVar.get(this.a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).a(c0057e);
                }
            }
        }
    }

    private static String a(c.h.h.d dVar, int i2) {
        return dVar.d() + "-" + i2;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(f.a aVar) {
        int i2 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] b2 = aVar.b();
        if (b2 != null && b2.length != 0) {
            i2 = 0;
            for (f.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i2;
    }

    static C0057e c(String str, Context context, c.h.h.d dVar, int i2) {
        c.e.e<String, Typeface> eVar = a;
        Typeface c2 = eVar.c(str);
        if (c2 != null) {
            return new C0057e(c2);
        }
        try {
            f.a d2 = c.h.h.c.d(context, dVar, null);
            int b2 = b(d2);
            if (b2 != 0) {
                return new C0057e(b2);
            }
            Typeface b3 = c.h.e.d.b(context, null, d2.b(), i2);
            if (b3 != null) {
                eVar.d(str, b3);
                return new C0057e(b3);
            }
            return new C0057e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0057e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, c.h.h.d dVar, int i2, Executor executor, c.h.h.a aVar) {
        String a2 = a(dVar, i2);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            aVar.b(new C0057e(c2));
            return c2;
        }
        b bVar = new b(aVar);
        synchronized (f2685c) {
            c.e.g<String, ArrayList<c.h.j.a<C0057e>>> gVar = f2686d;
            ArrayList<c.h.j.a<C0057e>> arrayList = gVar.get(a2);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<c.h.j.a<C0057e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a2, arrayList2);
            c cVar = new c(a2, context, dVar, i2);
            if (executor == null) {
                executor = f2684b;
            }
            g.b(executor, cVar, new d(a2));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, c.h.h.d dVar, c.h.h.a aVar, int i2, int i3) {
        String a2 = a(dVar, i2);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            aVar.b(new C0057e(c2));
            return c2;
        }
        if (i3 == -1) {
            C0057e c3 = c(a2, context, dVar, i2);
            aVar.b(c3);
            return c3.a;
        }
        try {
            C0057e c0057e = (C0057e) g.c(f2684b, new a(a2, context, dVar, i2), i3);
            aVar.b(c0057e);
            return c0057e.a;
        } catch (InterruptedException unused) {
            aVar.b(new C0057e(-3));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: c.h.h.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0057e {
        final Typeface a;

        /* renamed from: b, reason: collision with root package name */
        final int f2695b;

        C0057e(int i2) {
            this.a = null;
            this.f2695b = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f2695b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C0057e(Typeface typeface) {
            this.a = typeface;
            this.f2695b = 0;
        }
    }
}
