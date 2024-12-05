package O5;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8316b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte f8317a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ y(byte b8) {
        this.f8317a = b8;
    }

    public static final /* synthetic */ y a(byte b8) {
        return new y(b8);
    }

    public static boolean c(byte b8, Object obj) {
        if (!(obj instanceof y) || b8 != ((y) obj).f()) {
            return false;
        }
        return true;
    }

    public static String e(byte b8) {
        return String.valueOf(b8 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC3255y.k(f() & 255, ((y) obj).f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f8317a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f8317a;
    }

    public int hashCode() {
        return d(this.f8317a);
    }

    public String toString() {
        return e(this.f8317a);
    }

    public static byte b(byte b8) {
        return b8;
    }

    public static int d(byte b8) {
        return b8;
    }
}
