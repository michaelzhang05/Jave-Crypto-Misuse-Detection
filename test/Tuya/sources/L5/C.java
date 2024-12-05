package L5;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes5.dex */
public final class C implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6476b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f6477a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ C(long j8) {
        this.f6477a = j8;
    }

    public static final /* synthetic */ C a(long j8) {
        return new C(j8);
    }

    public static boolean c(long j8, Object obj) {
        if (!(obj instanceof C) || j8 != ((C) obj).g()) {
            return false;
        }
        return true;
    }

    public static final boolean d(long j8, long j9) {
        if (j8 == j9) {
            return true;
        }
        return false;
    }

    public static int e(long j8) {
        return androidx.collection.a.a(j8);
    }

    public static String f(long j8) {
        return K.d(j8);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return K.b(g(), ((C) obj).g());
    }

    public boolean equals(Object obj) {
        return c(this.f6477a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f6477a;
    }

    public int hashCode() {
        return e(this.f6477a);
    }

    public String toString() {
        return f(this.f6477a);
    }

    public static long b(long j8) {
        return j8;
    }
}
