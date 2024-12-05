package t1;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.l;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import t1.a;
import u1.j;
import u1.v;
import v1.d;
import v1.n;
import z1.i;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9282a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9283b;

    /* renamed from: c, reason: collision with root package name */
    private final t1.a f9284c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f9285d;

    /* renamed from: e, reason: collision with root package name */
    private final u1.b f9286e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f9287f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9288g;

    /* renamed from: h, reason: collision with root package name */
    private final e f9289h;

    /* renamed from: i, reason: collision with root package name */
    private final j f9290i;

    /* renamed from: j, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.b f9291j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f9292c = new C0139a().a();

        /* renamed from: a, reason: collision with root package name */
        public final j f9293a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f9294b;

        /* renamed from: t1.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0139a {

            /* renamed from: a, reason: collision with root package name */
            private j f9295a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f9296b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f9295a == null) {
                    this.f9295a = new u1.a();
                }
                if (this.f9296b == null) {
                    this.f9296b = Looper.getMainLooper();
                }
                return new a(this.f9295a, this.f9296b);
            }
        }

        private a(j jVar, Account account, Looper looper) {
            this.f9293a = jVar;
            this.f9294b = looper;
        }
    }

    private d(Context context, Activity activity, t1.a aVar, a.d dVar, a aVar2) {
        n.i(context, "Null context is not permitted.");
        n.i(aVar, "Api must not be null.");
        n.i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f9282a = context.getApplicationContext();
        String str = null;
        if (i.j()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f9283b = str;
        this.f9284c = aVar;
        this.f9285d = dVar;
        this.f9287f = aVar2.f9294b;
        u1.b a6 = u1.b.a(aVar, dVar, str);
        this.f9286e = a6;
        this.f9289h = new u1.n(this);
        com.google.android.gms.common.api.internal.b x5 = com.google.android.gms.common.api.internal.b.x(this.f9282a);
        this.f9291j = x5;
        this.f9288g = x5.m();
        this.f9290i = aVar2.f9293a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.f.u(activity, x5, a6);
        }
        x5.b(this);
    }

    private final l2.i i(int i6, com.google.android.gms.common.api.internal.c cVar) {
        l2.j jVar = new l2.j();
        this.f9291j.D(this, i6, cVar, jVar, this.f9290i);
        return jVar.a();
    }

    protected d.a b() {
        d.a aVar = new d.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.f9282a.getClass().getName());
        aVar.b(this.f9282a.getPackageName());
        return aVar;
    }

    public l2.i c(com.google.android.gms.common.api.internal.c cVar) {
        return i(2, cVar);
    }

    public final u1.b d() {
        return this.f9286e;
    }

    protected String e() {
        return this.f9283b;
    }

    public final int f() {
        return this.f9288g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f g(Looper looper, l lVar) {
        a.f a6 = ((a.AbstractC0138a) n.h(this.f9284c.a())).a(this.f9282a, looper, b().a(), this.f9285d, lVar, lVar);
        String e6 = e();
        if (e6 != null && (a6 instanceof v1.c)) {
            ((v1.c) a6).O(e6);
        }
        if (e6 == null || !(a6 instanceof u1.g)) {
            return a6;
        }
        throw null;
    }

    public final v h(Context context, Handler handler) {
        return new v(context, handler, b().a());
    }

    public d(Context context, t1.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
