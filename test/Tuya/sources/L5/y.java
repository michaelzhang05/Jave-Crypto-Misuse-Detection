package L5;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6525b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte f6526a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ y(byte b8) {
        this.f6526a = b8;
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
        return AbstractC3159y.k(f() & 255, ((y) obj).f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f6526a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f6526a;
    }

    public int hashCode() {
        return d(this.f6526a);
    }

    public String toString() {
        return e(this.f6526a);
    }

    public static byte b(byte b8) {
        return b8;
    }

    public static int d(byte b8) {
        return b8;
    }
}
