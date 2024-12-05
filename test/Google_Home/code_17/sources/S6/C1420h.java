package S6;

import P5.AbstractC1371l;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1420h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9897d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C1420h f9898e = new C1420h(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9899a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f9900b;

    /* renamed from: c, reason: collision with root package name */
    private transient String f9901c;

    /* renamed from: S6.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1420h a(String str) {
            AbstractC3255y.i(str, "<this>");
            byte[] a8 = AbstractC1413a.a(str);
            if (a8 != null) {
                return new C1420h(a8);
            }
            return null;
        }

        public final C1420h b(String str) {
            AbstractC3255y.i(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 * 2;
                    bArr[i8] = (byte) ((T6.b.b(str.charAt(i9)) << 4) + T6.b.b(str.charAt(i9 + 1)));
                }
                return new C1420h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final C1420h c(String str) {
            AbstractC3255y.i(str, "<this>");
            C1420h c1420h = new C1420h(c0.a(str));
            c1420h.G(str);
            return c1420h;
        }

        public final C1420h d(byte... data) {
            AbstractC3255y.i(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            AbstractC3255y.h(copyOf, "copyOf(this, size)");
            return new C1420h(copyOf);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1420h(byte[] data) {
        AbstractC3255y.i(data, "data");
        this.f9899a = data;
    }

    public static /* synthetic */ int A(C1420h c1420h, C1420h c1420h2, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = AbstractC1414b.c();
            }
            return c1420h.u(c1420h2, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final C1420h C(byte... bArr) {
        return f9897d.d(bArr);
    }

    public static /* synthetic */ C1420h N(C1420h c1420h, int i8, int i9, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = AbstractC1414b.c();
            }
            return c1420h.M(i8, i9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static final C1420h c(String str) {
        return f9897d.a(str);
    }

    public static final C1420h d(String str) {
        return f9897d.b(str);
    }

    public static final C1420h f(String str) {
        return f9897d.c(str);
    }

    public static /* synthetic */ int r(C1420h c1420h, C1420h c1420h2, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            return c1420h.o(c1420h2, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public final C1420h B() {
        return e(SameMD5.TAG);
    }

    public boolean D(int i8, C1420h other, int i9, int i10) {
        AbstractC3255y.i(other, "other");
        return other.E(i9, i(), i8, i10);
    }

    public boolean E(int i8, byte[] other, int i9, int i10) {
        AbstractC3255y.i(other, "other");
        if (i8 >= 0 && i8 <= i().length - i10 && i9 >= 0 && i9 <= other.length - i10 && AbstractC1414b.a(i(), i8, other, i9, i10)) {
            return true;
        }
        return false;
    }

    public final void F(int i8) {
        this.f9900b = i8;
    }

    public final void G(String str) {
        this.f9901c = str;
    }

    public final C1420h I() {
        return e("SHA-256");
    }

    public final int K() {
        return k();
    }

    public final boolean L(C1420h prefix) {
        AbstractC3255y.i(prefix, "prefix");
        return D(0, prefix, 0, prefix.K());
    }

    public C1420h M(int i8, int i9) {
        int d8 = AbstractC1414b.d(this, i9);
        if (i8 >= 0) {
            if (d8 <= i().length) {
                if (d8 - i8 >= 0) {
                    if (i8 == 0 && d8 == i().length) {
                        return this;
                    }
                    return new C1420h(AbstractC1371l.o(i(), i8, d8));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public C1420h O() {
        for (int i8 = 0; i8 < i().length; i8++) {
            byte b8 = i()[i8];
            if (b8 >= 65 && b8 <= 90) {
                byte[] i9 = i();
                byte[] copyOf = Arrays.copyOf(i9, i9.length);
                AbstractC3255y.h(copyOf, "copyOf(this, size)");
                copyOf[i8] = (byte) (b8 + 32);
                for (int i10 = i8 + 1; i10 < copyOf.length; i10++) {
                    byte b9 = copyOf[i10];
                    if (b9 >= 65 && b9 <= 90) {
                        copyOf[i10] = (byte) (b9 + 32);
                    }
                }
                return new C1420h(copyOf);
            }
        }
        return this;
    }

    public byte[] P() {
        byte[] i8 = i();
        byte[] copyOf = Arrays.copyOf(i8, i8.length);
        AbstractC3255y.h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String Q() {
        String m8 = m();
        if (m8 == null) {
            String c8 = c0.c(s());
            G(c8);
            return c8;
        }
        return m8;
    }

    public void R(C1417e buffer, int i8, int i9) {
        AbstractC3255y.i(buffer, "buffer");
        T6.b.d(this, buffer, i8, i9);
    }

    public String a() {
        return AbstractC1413a.c(i(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(S6.C1420h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC3255y.i(r10, r0)
            int r0 = r9.K()
            int r1 = r10.K()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.h(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.h(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = -1
            goto L34
        L2c:
            r3 = 1
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.C1420h.compareTo(S6.h):int");
    }

    public C1420h e(String algorithm) {
        AbstractC3255y.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f9899a, 0, K());
        byte[] digestBytes = messageDigest.digest();
        AbstractC3255y.h(digestBytes, "digestBytes");
        return new C1420h(digestBytes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1420h) {
            C1420h c1420h = (C1420h) obj;
            if (c1420h.K() == i().length && c1420h.E(0, i(), 0, i().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(C1420h suffix) {
        AbstractC3255y.i(suffix, "suffix");
        return D(K() - suffix.K(), suffix, 0, suffix.K());
    }

    public final byte h(int i8) {
        return t(i8);
    }

    public int hashCode() {
        int j8 = j();
        if (j8 == 0) {
            int hashCode = Arrays.hashCode(i());
            F(hashCode);
            return hashCode;
        }
        return j8;
    }

    public final byte[] i() {
        return this.f9899a;
    }

    public final int j() {
        return this.f9900b;
    }

    public int k() {
        return i().length;
    }

    public final String m() {
        return this.f9901c;
    }

    public String n() {
        char[] cArr = new char[i().length * 2];
        int i8 = 0;
        for (byte b8 : i()) {
            int i9 = i8 + 1;
            cArr[i8] = T6.b.f()[(b8 >> 4) & 15];
            i8 += 2;
            cArr[i9] = T6.b.f()[b8 & 15];
        }
        return j6.n.n(cArr);
    }

    public final int o(C1420h other, int i8) {
        AbstractC3255y.i(other, "other");
        return q(other.s(), i8);
    }

    public int q(byte[] other, int i8) {
        AbstractC3255y.i(other, "other");
        int length = i().length - other.length;
        int max = Math.max(i8, 0);
        if (max <= length) {
            while (!AbstractC1414b.a(i(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] s() {
        return i();
    }

    public byte t(int i8) {
        return i()[i8];
    }

    public String toString() {
        C1420h c1420h;
        String str;
        if (i().length == 0) {
            str = "[size=0]";
        } else {
            int a8 = T6.b.a(i(), 64);
            if (a8 == -1) {
                if (i().length <= 64) {
                    str = "[hex=" + n() + ']';
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[size=");
                    sb.append(i().length);
                    sb.append(" hex=");
                    int d8 = AbstractC1414b.d(this, 64);
                    if (d8 <= i().length) {
                        if (d8 >= 0) {
                            if (d8 == i().length) {
                                c1420h = this;
                            } else {
                                c1420h = new C1420h(AbstractC1371l.o(i(), 0, d8));
                            }
                            sb.append(c1420h.n());
                            sb.append("…]");
                            return sb.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
                }
            } else {
                String Q8 = Q();
                String substring = Q8.substring(0, a8);
                AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String A8 = j6.n.A(j6.n.A(j6.n.A(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (a8 < Q8.length()) {
                    return "[size=" + i().length + " text=" + A8 + "…]";
                }
                return "[text=" + A8 + ']';
            }
        }
        return str;
    }

    public final int u(C1420h other, int i8) {
        AbstractC3255y.i(other, "other");
        return v(other.s(), i8);
    }

    public int v(byte[] other, int i8) {
        AbstractC3255y.i(other, "other");
        for (int min = Math.min(AbstractC1414b.d(this, i8), i().length - other.length); -1 < min; min--) {
            if (AbstractC1414b.a(i(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }
}
