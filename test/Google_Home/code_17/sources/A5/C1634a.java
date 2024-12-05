package a5;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1634a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0267a f14087f = new C0267a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f14088a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14089b;

    /* renamed from: c, reason: collision with root package name */
    private int f14090c;

    /* renamed from: d, reason: collision with root package name */
    private int f14091d;

    /* renamed from: e, reason: collision with root package name */
    private b f14092e;

    /* renamed from: a5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0267a {
        private C0267a() {
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

        public /* synthetic */ C0267a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: a5.a$b */
    /* loaded from: classes5.dex */
    public enum b {
        DOWNLOADED,
        INSTALLED
    }

    public C1634a(String packageName, long j8) {
        AbstractC3255y.i(packageName, "packageName");
        this.f14088a = packageName;
        this.f14089b = j8;
        this.f14090c = -1;
        this.f14091d = -1;
        this.f14092e = b.DOWNLOADED;
    }

    public final int a() {
        return this.f14091d;
    }

    public final int b() {
        return this.f14090c;
    }

    public final String c() {
        return this.f14088a;
    }

    public final b d() {
        return this.f14092e;
    }

    public final long e() {
        return this.f14089b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1634a)) {
            return false;
        }
        C1634a c1634a = (C1634a) obj;
        if (AbstractC3255y.d(this.f14088a, c1634a.f14088a) && this.f14089b == c1634a.f14089b) {
            return true;
        }
        return false;
    }

    public final C1634a f(Context context) {
        C1634a P8;
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        int i8 = this.f14091d;
        if (i8 != -1) {
            P8 = a8.O(i8);
        } else {
            int i9 = this.f14090c;
            if (i9 != -1) {
                P8 = a8.Q(i9);
            } else {
                P8 = a8.P(this.f14088a, this.f14089b);
            }
        }
        a8.l();
        return P8;
    }

    public final void g(Context context) {
        C1634a P8;
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        int i8 = this.f14091d;
        if (i8 != -1) {
            P8 = a8.O(i8);
        } else {
            int i9 = this.f14090c;
            if (i9 != -1) {
                P8 = a8.Q(i9);
            } else {
                P8 = a8.P(this.f14088a, this.f14089b);
            }
        }
        if (P8 != null) {
            a8.l1(this);
        } else {
            a8.A0(this);
        }
        a8.l();
    }

    public final void h(int i8) {
        this.f14091d = i8;
    }

    public int hashCode() {
        return (this.f14088a.hashCode() * 31) + androidx.collection.a.a(this.f14089b);
    }

    public final void i(int i8) {
        this.f14090c = i8;
    }

    public final void j(b bVar) {
        AbstractC3255y.i(bVar, "<set-?>");
        this.f14092e = bVar;
    }

    public String toString() {
        return "ActiveNotification(packageName=" + this.f14088a + ", versionCode=" + this.f14089b + ')';
    }
}
