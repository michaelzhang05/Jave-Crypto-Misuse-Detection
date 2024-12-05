package X4;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* renamed from: X4.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1509t {

    /* renamed from: e, reason: collision with root package name */
    public static final a f12711e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f12712a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f12713b;

    /* renamed from: c, reason: collision with root package name */
    private String f12714c;

    /* renamed from: d, reason: collision with root package name */
    private int f12715d;

    /* renamed from: X4.t$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            Iterator it = a8.g0().iterator();
            while (it.hasNext()) {
                C1509t c1509t = (C1509t) it.next();
                if (c1509t.i()) {
                    a8.G(c1509t.c());
                }
            }
            a8.g();
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final int a() {
        return this.f12715d;
    }

    public final String b() {
        return this.f12714c;
    }

    public final int c() {
        return this.f12712a;
    }

    public final String d() {
        return this.f12713b;
    }

    public final void e(int i8) {
        this.f12715d = i8;
    }

    public final void f(String str) {
        this.f12714c = str;
    }

    public final void g(int i8) {
        this.f12712a = i8;
    }

    public final void h(String str) {
        this.f12713b = str;
    }

    public final boolean i() {
        boolean z8;
        if (this.f12713b == null || this.f12714c == null) {
            return true;
        }
        if (this.f12715d >= 3) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.f12713b;
        AbstractC3159y.f(str);
        if (currentTimeMillis - Long.parseLong(str) > 5184000000L) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = this.f12714c;
        AbstractC3159y.f(str2);
        boolean exists = new File(str2).exists();
        if (z8 && !exists) {
            return true;
        }
        return false;
    }
}
