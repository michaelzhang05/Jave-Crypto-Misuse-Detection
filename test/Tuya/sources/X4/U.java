package X4;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;
import l5.C3330r;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12455h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12456a;

    /* renamed from: b, reason: collision with root package name */
    private long f12457b;

    /* renamed from: c, reason: collision with root package name */
    private String f12458c;

    /* renamed from: d, reason: collision with root package name */
    private String f12459d;

    /* renamed from: e, reason: collision with root package name */
    private String f12460e;

    /* renamed from: f, reason: collision with root package name */
    private int f12461f;

    /* renamed from: g, reason: collision with root package name */
    private String f12462g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final U a(Cursor c8) {
            AbstractC3159y.i(c8, "c");
            U u8 = new U();
            u8.n(c8.getLong(0));
            u8.j(c8.getLong(1));
            u8.o(c8.getString(2));
            u8.m(c8.getString(3));
            u8.p(c8.getString(4));
            u8.k(c8.getInt(5));
            return u8;
        }

        public final U b(Cursor c8) {
            AbstractC3159y.i(c8, "c");
            U u8 = new U();
            u8.n(c8.getLong(0));
            u8.j(c8.getLong(1));
            u8.o(c8.getString(2));
            u8.m(c8.getString(3));
            u8.p(c8.getString(4));
            return u8;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public U(long j8, String name, String str, String str2, boolean z8) {
        AbstractC3159y.i(name, "name");
        this.f12456a = -1L;
        this.f12457b = j8;
        this.f12458c = name;
        this.f12459d = str;
        this.f12460e = str2;
        this.f12461f = z8 ? 1 : 0;
    }

    public final long a() {
        return this.f12457b;
    }

    public final int b() {
        return this.f12461f;
    }

    public final String c() {
        return this.f12462g;
    }

    public final String d() {
        return this.f12459d;
    }

    public final String e() {
        return this.f12458c;
    }

    public final String f() {
        return this.f12460e;
    }

    public final void g(Cursor c8) {
        AbstractC3159y.i(c8, "c");
        this.f12456a = c8.getLong(0);
        this.f12457b = c8.getLong(1);
        this.f12458c = c8.getString(2);
        this.f12459d = c8.getString(3);
        this.f12460e = c8.getString(4);
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        if (a8.x0(this.f12457b) == null) {
            a8.P0(this);
            Bundle bundle = new Bundle();
            bundle.putString("type", "added");
            new C3330r(context).b("wishlist", bundle);
        }
        a8.g();
    }

    public final void i(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        a8.d1(this.f12457b);
        Bundle bundle = new Bundle();
        bundle.putString("type", "removed");
        new C3330r(context).b("wishlist", bundle);
        a8.g();
    }

    public final void j(long j8) {
        this.f12457b = j8;
    }

    public final void k(int i8) {
        this.f12461f = i8;
    }

    public final void l(String str) {
        this.f12462g = str;
    }

    public final void m(String str) {
        this.f12459d = str;
    }

    public final void n(long j8) {
        this.f12456a = j8;
    }

    public final void o(String str) {
        this.f12458c = str;
    }

    public final void p(String str) {
        this.f12460e = str;
    }

    public final void q(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        this.f12461f = i8;
        a8.w1(this.f12457b, i8);
        a8.g();
    }

    public String toString() {
        return "Wishlist(id=" + this.f12456a + ", programId=" + this.f12457b + ", name=" + this.f12458c + ", icon=" + this.f12459d + ", packagename=" + this.f12460e + ')';
    }

    public U() {
        this.f12456a = -1L;
        this.f12461f = 1;
    }
}
