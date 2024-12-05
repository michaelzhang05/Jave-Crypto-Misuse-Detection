package androidx.work.impl.m.f;

import android.content.Context;

/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public class g {
    private static g a;

    /* renamed from: b, reason: collision with root package name */
    private a f2000b;

    /* renamed from: c, reason: collision with root package name */
    private b f2001c;

    /* renamed from: d, reason: collision with root package name */
    private e f2002d;

    /* renamed from: e, reason: collision with root package name */
    private f f2003e;

    private g(Context context, androidx.work.impl.utils.p.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2000b = new a(applicationContext, aVar);
        this.f2001c = new b(applicationContext, aVar);
        this.f2002d = new e(applicationContext, aVar);
        this.f2003e = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, androidx.work.impl.utils.p.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (a == null) {
                a = new g(context, aVar);
            }
            gVar = a;
        }
        return gVar;
    }

    public a a() {
        return this.f2000b;
    }

    public b b() {
        return this.f2001c;
    }

    public e d() {
        return this.f2002d;
    }

    public f e() {
        return this.f2003e;
    }
}
