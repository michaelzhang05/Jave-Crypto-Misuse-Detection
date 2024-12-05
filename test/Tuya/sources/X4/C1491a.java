package X4;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* renamed from: X4.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1491a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0240a f12466f = new C0240a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f12467a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12468b;

    /* renamed from: c, reason: collision with root package name */
    private int f12469c;

    /* renamed from: d, reason: collision with root package name */
    private int f12470d;

    /* renamed from: e, reason: collision with root package name */
    private b f12471e;

    /* renamed from: X4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0240a {
        private C0240a() {
        }

        public final b a(int i8) {
            b bVar = b.DOWNLOADED;
            if (i8 != bVar.ordinal()) {
                bVar = b.INSTALLED;
                if (i8 != bVar.ordinal()) {
                    throw new IllegalArgumentException();
                }
            }
            return bVar;
        }

        public /* synthetic */ C0240a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: X4.a$b */
    /* loaded from: classes5.dex */
    public enum b {
        DOWNLOADED,
        INSTALLED
    }

    public C1491a(String packageName, long j8) {
        AbstractC3159y.i(packageName, "packageName");
        this.f12467a = packageName;
        this.f12468b = j8;
        this.f12469c = -1;
        this.f12470d = -1;
        this.f12471e = b.DOWNLOADED;
    }

    public final int a() {
        return this.f12470d;
    }

    public final int b() {
        return this.f12469c;
    }

    public final String c() {
        return this.f12467a;
    }

    public final b d() {
        return this.f12471e;
    }

    public final long e() {
        return this.f12468b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1491a)) {
            return false;
        }
        C1491a c1491a = (C1491a) obj;
        if (AbstractC3159y.d(this.f12467a, c1491a.f12467a) && this.f12468b == c1491a.f12468b) {
            return true;
        }
        return false;
    }

    public final C1491a f(Context context) {
        C1491a P8;
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        int i8 = this.f12470d;
        if (i8 != -1) {
            P8 = a8.O(i8);
        } else {
            int i9 = this.f12469c;
            if (i9 != -1) {
                P8 = a8.Q(i9);
            } else {
                P8 = a8.P(this.f12467a, this.f12468b);
            }
        }
        a8.g();
        return P8;
    }

    public final void g(Context context) {
        C1491a P8;
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        int i8 = this.f12470d;
        if (i8 != -1) {
            P8 = a8.O(i8);
        } else {
            int i9 = this.f12469c;
            if (i9 != -1) {
                P8 = a8.Q(i9);
            } else {
                P8 = a8.P(this.f12467a, this.f12468b);
            }
        }
        if (P8 != null) {
            a8.l1(this);
        } else {
            a8.A0(this);
        }
        a8.g();
    }

    public final void h(int i8) {
        this.f12470d = i8;
    }

    public int hashCode() {
        return (this.f12467a.hashCode() * 31) + androidx.collection.a.a(this.f12468b);
    }

    public final void i(int i8) {
        this.f12469c = i8;
    }

    public final void j(b bVar) {
        AbstractC3159y.i(bVar, "<set-?>");
        this.f12471e = bVar;
    }

    public String toString() {
        return "ActiveNotification(packageName=" + this.f12467a + ", versionCode=" + this.f12468b + ')';
    }
}
