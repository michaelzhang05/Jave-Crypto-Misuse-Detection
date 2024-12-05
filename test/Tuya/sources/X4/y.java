package X4;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f12733g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f12734a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f12735b;

    /* renamed from: c, reason: collision with root package name */
    private String f12736c;

    /* renamed from: d, reason: collision with root package name */
    private String f12737d;

    /* renamed from: e, reason: collision with root package name */
    private String f12738e;

    /* renamed from: f, reason: collision with root package name */
    private String f12739f;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final y a(Context context) {
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            y h02 = a8.h0();
            a8.g();
            return h02;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final String a() {
        return this.f12738e;
    }

    public final String b() {
        return this.f12739f;
    }

    public final int c() {
        return this.f12734a;
    }

    public final String d() {
        return this.f12737d;
    }

    public final String e() {
        return this.f12735b;
    }

    public final String f() {
        return this.f12736c;
    }

    public final void g(Cursor c8) {
        AbstractC3159y.i(c8, "c");
        this.f12734a = c8.getInt(0);
        this.f12735b = c8.getString(1);
        this.f12736c = c8.getString(2);
        this.f12737d = c8.getString(3);
        this.f12738e = c8.getString(4);
        this.f12739f = c8.getString(5);
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        a8.J0(this);
        if (a8.h() > 100) {
            a8.J(100);
        }
        a8.g();
    }

    public final void i(String str) {
        this.f12738e = str;
    }

    public final void j(String str) {
        this.f12739f = str;
    }

    public final void k(String str) {
        this.f12737d = str;
    }

    public final void l(String str) {
        this.f12735b = str;
    }

    public final void m(String str) {
        this.f12736c = str;
    }

    public String toString() {
        return "NotificationRegistry(\nid=" + this.f12734a + ",\ntimestamp=" + this.f12735b + ", \ntitle=" + this.f12736c + ", \nmsg=" + this.f12737d + ", \nactions=" + this.f12738e + ", \nextraInfo=" + this.f12739f + "\n)";
    }
}
