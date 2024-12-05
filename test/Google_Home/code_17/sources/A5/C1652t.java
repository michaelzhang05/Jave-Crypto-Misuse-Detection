package a5;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* renamed from: a5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1652t {

    /* renamed from: e, reason: collision with root package name */
    public static final a f14332e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f14333a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f14334b;

    /* renamed from: c, reason: collision with root package name */
    private String f14335c;

    /* renamed from: d, reason: collision with root package name */
    private int f14336d;

    /* renamed from: a5.t$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3255y.i(context, "context");
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            Iterator it = a8.g0().iterator();
            while (it.hasNext()) {
                C1652t c1652t = (C1652t) it.next();
                if (c1652t.i()) {
                    a8.G(c1652t.c());
                }
            }
            a8.l();
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final int a() {
        return this.f14336d;
    }

    public final String b() {
        return this.f14335c;
    }

    public final int c() {
        return this.f14333a;
    }

    public final String d() {
        return this.f14334b;
    }

    public final void e(int i8) {
        this.f14336d = i8;
    }

    public final void f(String str) {
        this.f14335c = str;
    }

    public final void g(int i8) {
        this.f14333a = i8;
    }

    public final void h(String str) {
        this.f14334b = str;
    }

    public final boolean i() {
        boolean z8;
        if (this.f14334b == null || this.f14335c == null) {
            return true;
        }
        if (this.f14336d >= 3) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.f14334b;
        AbstractC3255y.f(str);
        if (currentTimeMillis - Long.parseLong(str) > 5184000000L) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = this.f14335c;
        AbstractC3255y.f(str2);
        boolean exists = new File(str2).exists();
        if (z8 && !exists) {
            return true;
        }
        return false;
    }
}
