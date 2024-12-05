package a5;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;
import o5.C3678r;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    public static final a f14076h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f14077a;

    /* renamed from: b, reason: collision with root package name */
    private long f14078b;

    /* renamed from: c, reason: collision with root package name */
    private String f14079c;

    /* renamed from: d, reason: collision with root package name */
    private String f14080d;

    /* renamed from: e, reason: collision with root package name */
    private String f14081e;

    /* renamed from: f, reason: collision with root package name */
    private int f14082f;

    /* renamed from: g, reason: collision with root package name */
    private String f14083g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final U a(Cursor c8) {
            AbstractC3255y.i(c8, "c");
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
            AbstractC3255y.i(c8, "c");
            U u8 = new U();
            u8.n(c8.getLong(0));
            u8.j(c8.getLong(1));
            u8.o(c8.getString(2));
            u8.m(c8.getString(3));
            u8.p(c8.getString(4));
            return u8;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public U(long j8, String name, String str, String str2, boolean z8) {
        AbstractC3255y.i(name, "name");
        this.f14077a = -1L;
        this.f14078b = j8;
        this.f14079c = name;
        this.f14080d = str;
        this.f14081e = str2;
        this.f14082f = z8 ? 1 : 0;
    }

    public final long a() {
        return this.f14078b;
    }

    public final int b() {
        return this.f14082f;
    }

    public final String c() {
        return this.f14083g;
    }

    public final String d() {
        return this.f14080d;
    }

    public final String e() {
        return this.f14079c;
    }

    public final String f() {
        return this.f14081e;
    }

    public final void g(Cursor c8) {
        AbstractC3255y.i(c8, "c");
        this.f14077a = c8.getLong(0);
        this.f14078b = c8.getLong(1);
        this.f14079c = c8.getString(2);
        this.f14080d = c8.getString(3);
        this.f14081e = c8.getString(4);
    }

    public final void h(Context context) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        if (a8.x0(this.f14078b) == null) {
            a8.P0(this);
            Bundle bundle = new Bundle();
            bundle.putString("type", "added");
            new C3678r(context).b("wishlist", bundle);
        }
        a8.l();
    }

    public final void i(Context context) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        a8.d1(this.f14078b);
        Bundle bundle = new Bundle();
        bundle.putString("type", "removed");
        new C3678r(context).b("wishlist", bundle);
        a8.l();
    }

    public final void j(long j8) {
        this.f14078b = j8;
    }

    public final void k(int i8) {
        this.f14082f = i8;
    }

    public final void l(String str) {
        this.f14083g = str;
    }

    public final void m(String str) {
        this.f14080d = str;
    }

    public final void n(long j8) {
        this.f14077a = j8;
    }

    public final void o(String str) {
        this.f14079c = str;
    }

    public final void p(String str) {
        this.f14081e = str;
    }

    public final void q(Context context, int i8) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        this.f14082f = i8;
        a8.w1(this.f14078b, i8);
        a8.l();
    }

    public String toString() {
        return "Wishlist(id=" + this.f14077a + ", programId=" + this.f14078b + ", name=" + this.f14079c + ", icon=" + this.f14080d + ", packagename=" + this.f14081e + ')';
    }

    public U() {
        this.f14077a = -1L;
        this.f14082f = 1;
    }
}
