package P6;

import M5.AbstractC1239l;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1282h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8066d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C1282h f8067e = new C1282h(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8068a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f8069b;

    /* renamed from: c, reason: collision with root package name */
    private transient String f8070c;

    /* renamed from: P6.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1282h a(String str) {
            AbstractC3159y.i(str, "<this>");
            byte[] a8 = AbstractC1275a.a(str);
            if (a8 != null) {
                return new C1282h(a8);
            }
            return null;
        }

        public final C1282h b(String str) {
            AbstractC3159y.i(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 * 2;
                    bArr[i8] = (byte) ((Q6.b.b(str.charAt(i9)) << 4) + Q6.b.b(str.charAt(i9 + 1)));
                }
                return new C1282h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final C1282h c(String str) {
            AbstractC3159y.i(str, "<this>");
            C1282h c1282h = new C1282h(c0.a(str));
            c1282h.D(str);
            return c1282h;
        }

        public final C1282h d(byte... data) {
            AbstractC3159y.i(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            AbstractC3159y.h(copyOf, "copyOf(this, size)");
            return new C1282h(copyOf);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1282h(byte[] data) {
        AbstractC3159y.i(data, "data");
        this.f8068a = data;
    }

    public static /* synthetic */ C1282h J(C1282h c1282h, int i8, int i9, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = AbstractC1276b.c();
            }
            return c1282h.I(i8, i9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static final C1282h c(String str) {
        return f8066d.a(str);
    }

    public static final C1282h d(String str) {
        return f8066d.b(str);
    }

    public static final C1282h f(String str) {
        return f8066d.c(str);
    }

    public static /* synthetic */ int q(C1282h c1282h, C1282h c1282h2, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            return c1282h.o(c1282h2, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int w(C1282h c1282h, C1282h c1282h2, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = AbstractC1276b.c();
            }
            return c1282h.u(c1282h2, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final C1282h y(byte... bArr) {
        return f8066d.d(bArr);
    }

    public boolean A(int i8, C1282h other, int i9, int i10) {
        AbstractC3159y.i(other, "other");
        return other.B(i9, j(), i8, i10);
    }

    public boolean B(int i8, byte[] other, int i9, int i10) {
        AbstractC3159y.i(other, "other");
        if (i8 >= 0 && i8 <= j().length - i10 && i9 >= 0 && i9 <= other.length - i10 && AbstractC1276b.a(j(), i8, other, i9, i10)) {
            return true;
        }
        return false;
    }

    public final void C(int i8) {
        this.f8069b = i8;
    }

    public final void D(String str) {
        this.f8070c = str;
    }

    public final C1282h E() {
        return e("SHA-256");
    }

    public final int F() {
        return l();
    }

    public final boolean H(C1282h prefix) {
        AbstractC3159y.i(prefix, "prefix");
        return A(0, prefix, 0, prefix.F());
    }

    public C1282h I(int i8, int i9) {
        int d8 = AbstractC1276b.d(this, i9);
        if (i8 >= 0) {
            if (d8 <= j().length) {
                if (d8 - i8 >= 0) {
                    if (i8 == 0 && d8 == j().length) {
                        return this;
                    }
                    return new C1282h(AbstractC1239l.o(j(), i8, d8));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + j().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public C1282h K() {
        for (int i8 = 0; i8 < j().length; i8++) {
            byte b8 = j()[i8];
            if (b8 >= 65 && b8 <= 90) {
                byte[] j8 = j();
                byte[] copyOf = Arrays.copyOf(j8, j8.length);
                AbstractC3159y.h(copyOf, "copyOf(this, size)");
                copyOf[i8] = (byte) (b8 + 32);
                for (int i9 = i8 + 1; i9 < copyOf.length; i9++) {
                    byte b9 = copyOf[i9];
                    if (b9 >= 65 && b9 <= 90) {
                        copyOf[i9] = (byte) (b9 + 32);
                    }
                }
                return new C1282h(copyOf);
            }
        }
        return this;
    }

    public byte[] L() {
        byte[] j8 = j();
        byte[] copyOf = Arrays.copyOf(j8, j8.length);
        AbstractC3159y.h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String M() {
        String m8 = m();
        if (m8 == null) {
            String c8 = c0.c(r());
            D(c8);
            return c8;
        }
        return m8;
    }

    public void N(C1279e buffer, int i8, int i9) {
        AbstractC3159y.i(buffer, "buffer");
        Q6.b.d(this, buffer, i8, i9);
    }

    public String a() {
        return AbstractC1275a.c(j(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(P6.C1282h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC3159y.i(r10, r0)
            int r0 = r9.F()
            int r1 = r10.F()
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
        throw new UnsupportedOperationException("Method not decompiled: P6.C1282h.compareTo(P6.h):int");
    }

    public C1282h e(String algorithm) {
        AbstractC3159y.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f8068a, 0, F());
        byte[] digestBytes = messageDigest.digest();
        AbstractC3159y.h(digestBytes, "digestBytes");
        return new C1282h(digestBytes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1282h) {
            C1282h c1282h = (C1282h) obj;
            if (c1282h.F() == j().length && c1282h.B(0, j(), 0, j().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(C1282h suffix) {
        AbstractC3159y.i(suffix, "suffix");
        return A(F() - suffix.F(), suffix, 0, suffix.F());
    }

    public final byte h(int i8) {
        return t(i8);
    }

    public int hashCode() {
        int k8 = k();
        if (k8 == 0) {
            int hashCode = Arrays.hashCode(j());
            C(hashCode);
            return hashCode;
        }
        return k8;
    }

    public final byte[] j() {
        return this.f8068a;
    }

    public final int k() {
        return this.f8069b;
    }

    public int l() {
        return j().length;
    }

    public final String m() {
        return this.f8070c;
    }

    public String n() {
        char[] cArr = new char[j().length * 2];
        int i8 = 0;
        for (byte b8 : j()) {
            int i9 = i8 + 1;
            cArr[i8] = Q6.b.f()[(b8 >> 4) & 15];
            i8 += 2;
            cArr[i9] = Q6.b.f()[b8 & 15];
        }
        return g6.n.n(cArr);
    }

    public final int o(C1282h other, int i8) {
        AbstractC3159y.i(other, "other");
        return p(other.r(), i8);
    }

    public int p(byte[] other, int i8) {
        AbstractC3159y.i(other, "other");
        int length = j().length - other.length;
        int max = Math.max(i8, 0);
        if (max <= length) {
            while (!AbstractC1276b.a(j(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] r() {
        return j();
    }

    public byte t(int i8) {
        return j()[i8];
    }

    public String toString() {
        C1282h c1282h;
        String str;
        if (j().length == 0) {
            str = "[size=0]";
        } else {
            int a8 = Q6.b.a(j(), 64);
            if (a8 == -1) {
                if (j().length <= 64) {
                    str = "[hex=" + n() + ']';
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[size=");
                    sb.append(j().length);
                    sb.append(" hex=");
                    int d8 = AbstractC1276b.d(this, 64);
                    if (d8 <= j().length) {
                        if (d8 >= 0) {
                            if (d8 == j().length) {
                                c1282h = this;
                            } else {
                                c1282h = new C1282h(AbstractC1239l.o(j(), 0, d8));
                            }
                            sb.append(c1282h.n());
                            sb.append("…]");
                            return sb.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + j().length + ')').toString());
                }
            } else {
                String M8 = M();
                String substring = M8.substring(0, a8);
                AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String A8 = g6.n.A(g6.n.A(g6.n.A(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (a8 < M8.length()) {
                    return "[size=" + j().length + " text=" + A8 + "…]";
                }
                return "[text=" + A8 + ']';
            }
        }
        return str;
    }

    public final int u(C1282h other, int i8) {
        AbstractC3159y.i(other, "other");
        return v(other.r(), i8);
    }

    public int v(byte[] other, int i8) {
        AbstractC3159y.i(other, "other");
        for (int min = Math.min(AbstractC1276b.d(this, i8), j().length - other.length); -1 < min; min--) {
            if (AbstractC1276b.a(j(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public final C1282h x() {
        return e(SameMD5.TAG);
    }
}
