package O5;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes5.dex */
public final class C implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8267b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f8268a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ C(long j8) {
        this.f8268a = j8;
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
        return c(this.f8268a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f8268a;
    }

    public int hashCode() {
        return e(this.f8268a);
    }

    public String toString() {
        return f(this.f8268a);
    }

    public static long b(long j8) {
        return j8;
    }
}
