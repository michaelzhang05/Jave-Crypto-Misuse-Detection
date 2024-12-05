package a5;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f14354g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f14355a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f14356b;

    /* renamed from: c, reason: collision with root package name */
    private String f14357c;

    /* renamed from: d, reason: collision with root package name */
    private String f14358d;

    /* renamed from: e, reason: collision with root package name */
    private String f14359e;

    /* renamed from: f, reason: collision with root package name */
    private String f14360f;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final y a(Context context) {
            AbstractC3255y.i(context, "context");
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            y h02 = a8.h0();
            a8.l();
            return h02;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final String a() {
        return this.f14359e;
    }

    public final String b() {
        return this.f14360f;
    }

    public final int c() {
        return this.f14355a;
    }

    public final String d() {
        return this.f14358d;
    }

    public final String e() {
        return this.f14356b;
    }

    public final String f() {
        return this.f14357c;
    }

    public final void g(Cursor c8) {
        AbstractC3255y.i(c8, "c");
        this.f14355a = c8.getInt(0);
        this.f14356b = c8.getString(1);
        this.f14357c = c8.getString(2);
        this.f14358d = c8.getString(3);
        this.f14359e = c8.getString(4);
        this.f14360f = c8.getString(5);
    }

    public final void h(Context context) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        a8.J0(this);
        if (a8.m() > 100) {
            a8.J(100);
        }
        a8.l();
    }

    public final void i(String str) {
        this.f14359e = str;
    }

    public final void j(String str) {
        this.f14360f = str;
    }

    public final void k(String str) {
        this.f14358d = str;
    }

    public final void l(String str) {
        this.f14356b = str;
    }

    public final void m(String str) {
        this.f14357c = str;
    }

    public String toString() {
        return "NotificationRegistry(\nid=" + this.f14355a + ",\ntimestamp=" + this.f14356b + ", \ntitle=" + this.f14357c + ", \nmsg=" + this.f14358d + ", \nactions=" + this.f14359e + ", \nextraInfo=" + this.f14360f + "\n)";
    }
}
