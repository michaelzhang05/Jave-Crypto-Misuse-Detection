package h6;

import androidx.exifinterface.media.ExifInterface;
import d6.l;
import d6.m;
import g6.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2758a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0756a f31409b = new C0756a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f31410c = h(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f31411d = AbstractC2760c.b(4611686018427387903L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f31412e = AbstractC2760c.b(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name */
    private final long f31413a;

    /* renamed from: h6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0756a {
        private C0756a() {
        }

        public final long a() {
            return C2758a.f31411d;
        }

        public final long b() {
            return C2758a.f31410c;
        }

        public final long c(String value) {
            AbstractC3159y.i(value, "value");
            try {
                return AbstractC2760c.h(value, true);
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e8);
            }
        }

        public /* synthetic */ C0756a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ C2758a(long j8) {
        this.f31413a = j8;
    }

    public static final boolean A(long j8) {
        if (j8 != f31411d && j8 != f31412e) {
            return false;
        }
        return true;
    }

    public static final boolean B(long j8) {
        if (j8 < 0) {
            return true;
        }
        return false;
    }

    public static final boolean C(long j8) {
        if (j8 > 0) {
            return true;
        }
        return false;
    }

    public static final long D(long j8, long j9) {
        return E(j8, K(j9));
    }

    public static final long E(long j8, long j9) {
        if (A(j8)) {
            if (!x(j9) && (j9 ^ j8) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j8;
        }
        if (A(j9)) {
            return j9;
        }
        if ((((int) j8) & 1) == (((int) j9) & 1)) {
            long v8 = v(j8) + v(j9);
            if (z(j8)) {
                return AbstractC2760c.e(v8);
            }
            return AbstractC2760c.c(v8);
        }
        if (y(j8)) {
            return c(j8, v(j8), v(j9));
        }
        return c(j8, v(j9), v(j8));
    }

    public static final long F(long j8, int i8) {
        if (A(j8)) {
            if (i8 != 0) {
                if (i8 > 0) {
                    return j8;
                }
                return K(j8);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i8 == 0) {
            return f31410c;
        }
        long v8 = v(j8);
        long j9 = i8;
        long j10 = v8 * j9;
        if (z(j8)) {
            if (new l(-2147483647L, 2147483647L).l(v8)) {
                return AbstractC2760c.d(j10);
            }
            if (j10 / j9 == v8) {
                return AbstractC2760c.e(j10);
            }
            long g8 = AbstractC2760c.g(v8);
            long j11 = g8 * j9;
            long g9 = AbstractC2760c.g((v8 - AbstractC2760c.f(g8)) * j9) + j11;
            if (j11 / j9 == g8 && (g9 ^ j11) >= 0) {
                return AbstractC2760c.b(m.n(g9, new l(-4611686018427387903L, 4611686018427387903L)));
            }
            if (Z5.a.b(v8) * Z5.a.a(i8) > 0) {
                return f31411d;
            }
            return f31412e;
        }
        if (j10 / j9 == v8) {
            return AbstractC2760c.b(m.n(j10, new l(-4611686018427387903L, 4611686018427387903L)));
        }
        if (Z5.a.b(v8) * Z5.a.a(i8) > 0) {
            return f31411d;
        }
        return f31412e;
    }

    public static final double G(long j8, EnumC2761d unit) {
        AbstractC3159y.i(unit, "unit");
        if (j8 == f31411d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j8 == f31412e) {
            return Double.NEGATIVE_INFINITY;
        }
        return AbstractC2762e.a(v(j8), u(j8), unit);
    }

    public static final String H(long j8) {
        boolean z8;
        boolean z9;
        StringBuilder sb = new StringBuilder();
        if (B(j8)) {
            sb.append('-');
        }
        sb.append("PT");
        long k8 = k(j8);
        long n8 = n(k8);
        int r8 = r(k8);
        int t8 = t(k8);
        int s8 = s(k8);
        if (A(j8)) {
            n8 = 9999999999999L;
        }
        boolean z10 = false;
        if (n8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (t8 == 0 && s8 == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (r8 != 0 || (z9 && z8)) {
            z10 = true;
        }
        if (z8) {
            sb.append(n8);
            sb.append('H');
        }
        if (z10) {
            sb.append(r8);
            sb.append('M');
        }
        if (z9 || (!z8 && !z10)) {
            d(j8, sb, t8, s8, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public static final long I(long j8, EnumC2761d unit) {
        AbstractC3159y.i(unit, "unit");
        if (j8 == f31411d) {
            return Long.MAX_VALUE;
        }
        if (j8 == f31412e) {
            return Long.MIN_VALUE;
        }
        return AbstractC2762e.b(v(j8), u(j8), unit);
    }

    public static String J(long j8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f31411d) {
            return "Infinity";
        }
        if (j8 == f31412e) {
            return "-Infinity";
        }
        boolean B8 = B(j8);
        StringBuilder sb = new StringBuilder();
        if (B8) {
            sb.append('-');
        }
        long k8 = k(j8);
        long m8 = m(k8);
        int l8 = l(k8);
        int r8 = r(k8);
        int t8 = t(k8);
        int s8 = s(k8);
        int i8 = 0;
        if (m8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (l8 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (r8 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (t8 == 0 && s8 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z8) {
            sb.append(m8);
            sb.append('d');
            i8 = 1;
        }
        if (z9 || (z8 && (z10 || z11))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(l8);
            sb.append('h');
            i8 = i9;
        }
        if (z10 || (z11 && (z9 || z8))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(r8);
            sb.append('m');
            i8 = i10;
        }
        if (z11) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (t8 == 0 && !z8 && !z9 && !z10) {
                if (s8 >= 1000000) {
                    d(j8, sb, s8 / 1000000, s8 % 1000000, 6, "ms", false);
                } else if (s8 >= 1000) {
                    d(j8, sb, s8 / 1000, s8 % 1000, 3, "us", false);
                } else {
                    sb.append(s8);
                    sb.append("ns");
                }
            } else {
                d(j8, sb, t8, s8, 9, "s", false);
            }
            i8 = i11;
        }
        if (B8 && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public static final long K(long j8) {
        return AbstractC2760c.a(-v(j8), ((int) j8) & 1);
    }

    private static final long c(long j8, long j9, long j10) {
        long g8 = AbstractC2760c.g(j10);
        long j11 = j9 + g8;
        if (new l(-4611686018426L, 4611686018426L).l(j11)) {
            return AbstractC2760c.d(AbstractC2760c.f(j11) + (j10 - AbstractC2760c.f(g8)));
        }
        return AbstractC2760c.b(m.m(j11, -4611686018427387903L, 4611686018427387903L));
    }

    private static final void d(long j8, StringBuilder sb, int i8, int i9, int i10, String str, boolean z8) {
        sb.append(i8);
        if (i9 != 0) {
            sb.append('.');
            String e02 = n.e0(String.valueOf(i9), i10, '0');
            int i11 = -1;
            int length = e02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (e02.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (!z8 && i13 < 3) {
                sb.append((CharSequence) e02, 0, i13);
                AbstractC3159y.h(sb, "append(...)");
            } else {
                sb.append((CharSequence) e02, 0, ((i11 + 3) / 3) * 3);
                AbstractC3159y.h(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ C2758a e(long j8) {
        return new C2758a(j8);
    }

    public static int g(long j8, long j9) {
        long j10 = j8 ^ j9;
        if (j10 >= 0 && (((int) j10) & 1) != 0) {
            int i8 = (((int) j8) & 1) - (((int) j9) & 1);
            if (B(j8)) {
                return -i8;
            }
            return i8;
        }
        return AbstractC3159y.l(j8, j9);
    }

    public static long h(long j8) {
        if (AbstractC2759b.a()) {
            if (z(j8)) {
                if (!new l(-4611686018426999999L, 4611686018426999999L).l(v(j8))) {
                    throw new AssertionError(v(j8) + " ns is out of nanoseconds range");
                }
            } else if (new l(-4611686018427387903L, 4611686018427387903L).l(v(j8))) {
                if (new l(-4611686018426L, 4611686018426L).l(v(j8))) {
                    throw new AssertionError(v(j8) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(v(j8) + " ms is out of milliseconds range");
            }
        }
        return j8;
    }

    public static boolean i(long j8, Object obj) {
        if (!(obj instanceof C2758a) || j8 != ((C2758a) obj).L()) {
            return false;
        }
        return true;
    }

    public static final boolean j(long j8, long j9) {
        if (j8 == j9) {
            return true;
        }
        return false;
    }

    public static final long k(long j8) {
        if (B(j8)) {
            return K(j8);
        }
        return j8;
    }

    public static final int l(long j8) {
        if (A(j8)) {
            return 0;
        }
        return (int) (n(j8) % 24);
    }

    public static final long m(long j8) {
        return I(j8, EnumC2761d.f31422h);
    }

    public static final long n(long j8) {
        return I(j8, EnumC2761d.f31421g);
    }

    public static final long o(long j8) {
        if (y(j8) && x(j8)) {
            return v(j8);
        }
        return I(j8, EnumC2761d.f31418d);
    }

    public static final long p(long j8) {
        return I(j8, EnumC2761d.f31420f);
    }

    public static final long q(long j8) {
        return I(j8, EnumC2761d.f31419e);
    }

    public static final int r(long j8) {
        if (A(j8)) {
            return 0;
        }
        return (int) (p(j8) % 60);
    }

    public static final int s(long j8) {
        long v8;
        if (A(j8)) {
            return 0;
        }
        if (y(j8)) {
            v8 = AbstractC2760c.f(v(j8) % 1000);
        } else {
            v8 = v(j8) % 1000000000;
        }
        return (int) v8;
    }

    public static final int t(long j8) {
        if (A(j8)) {
            return 0;
        }
        return (int) (q(j8) % 60);
    }

    private static final EnumC2761d u(long j8) {
        if (z(j8)) {
            return EnumC2761d.f31416b;
        }
        return EnumC2761d.f31418d;
    }

    private static final long v(long j8) {
        return j8 >> 1;
    }

    public static int w(long j8) {
        return androidx.collection.a.a(j8);
    }

    public static final boolean x(long j8) {
        return !A(j8);
    }

    private static final boolean y(long j8) {
        if ((((int) j8) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean z(long j8) {
        if ((((int) j8) & 1) == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ long L() {
        return this.f31413a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((C2758a) obj).L());
    }

    public boolean equals(Object obj) {
        return i(this.f31413a, obj);
    }

    public int f(long j8) {
        return g(this.f31413a, j8);
    }

    public int hashCode() {
        return w(this.f31413a);
    }

    public String toString() {
        return J(this.f31413a);
    }
}
