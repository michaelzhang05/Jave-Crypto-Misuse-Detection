package j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: ByteString.kt */
/* loaded from: classes2.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: h, reason: collision with root package name */
    private transient int f19370h;

    /* renamed from: i, reason: collision with root package name */
    private transient String f19371i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f19372j;

    /* renamed from: g, reason: collision with root package name */
    public static final a f19369g = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final i f19368f = new i(new byte[0]);

    /* compiled from: ByteString.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ i f(a aVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return aVar.e(bArr, i2, i3);
        }

        public final i a(String str) {
            kotlin.jvm.internal.l.f(str, "$this$decodeBase64");
            byte[] a = j.a.a(str);
            if (a != null) {
                return new i(a);
            }
            return null;
        }

        public final i b(String str) {
            int e2;
            int e3;
            kotlin.jvm.internal.l.f(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    e2 = j.g0.b.e(str.charAt(i3));
                    e3 = j.g0.b.e(str.charAt(i3 + 1));
                    bArr[i2] = (byte) ((e2 << 4) + e3);
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final i c(String str, Charset charset) {
            kotlin.jvm.internal.l.f(str, "$this$encode");
            kotlin.jvm.internal.l.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new i(bytes);
        }

        public final i d(String str) {
            kotlin.jvm.internal.l.f(str, "$this$encodeUtf8");
            i iVar = new i(b.a(str));
            iVar.M(str);
            return iVar;
        }

        public final i e(byte[] bArr, int i2, int i3) {
            byte[] h2;
            kotlin.jvm.internal.l.f(bArr, "$this$toByteString");
            c.b(bArr.length, i2, i3);
            h2 = kotlin.collections.m.h(bArr, i2, i3 + i2);
            return new i(h2);
        }

        public final i g(InputStream inputStream, int i2) throws IOException {
            kotlin.jvm.internal.l.f(inputStream, "$this$readByteString");
            int i3 = 0;
            if (i2 >= 0) {
                byte[] bArr = new byte[i2];
                while (i3 < i2) {
                    int read = inputStream.read(bArr, i3, i2 - i3);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    i3 += read;
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i2).toString());
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public i(byte[] bArr) {
        kotlin.jvm.internal.l.f(bArr, "data");
        this.f19372j = bArr;
    }

    public static final i i(String str) {
        return f19369g.b(str);
    }

    public static final i o(String str) {
        return f19369g.d(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        i g2 = f19369g.g(objectInputStream, objectInputStream.readInt());
        Field declaredField = i.class.getDeclaredField("j");
        kotlin.jvm.internal.l.e(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, g2.f19372j);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f19372j.length);
        objectOutputStream.write(this.f19372j);
    }

    public final byte[] B() {
        return this.f19372j;
    }

    public final int C() {
        return this.f19370h;
    }

    public int D() {
        return B().length;
    }

    public final String E() {
        return this.f19371i;
    }

    public String F() {
        char[] cArr = new char[B().length * 2];
        int i2 = 0;
        for (byte b2 : B()) {
            int i3 = i2 + 1;
            cArr[i2] = j.g0.b.f()[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = j.g0.b.f()[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] G() {
        return B();
    }

    public byte H(int i2) {
        return B()[i2];
    }

    public final i I() {
        return n("MD5");
    }

    public boolean J(int i2, i iVar, int i3, int i4) {
        kotlin.jvm.internal.l.f(iVar, "other");
        return iVar.K(i3, B(), i2, i4);
    }

    public boolean K(int i2, byte[] bArr, int i3, int i4) {
        kotlin.jvm.internal.l.f(bArr, "other");
        return i2 >= 0 && i2 <= B().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && c.a(B(), i2, bArr, i3, i4);
    }

    public final void L(int i2) {
        this.f19370h = i2;
    }

    public final void M(String str) {
        this.f19371i = str;
    }

    public final i N() {
        return n("SHA-1");
    }

    public final i O() {
        return n("SHA-256");
    }

    public final int P() {
        return D();
    }

    public final boolean Q(i iVar) {
        kotlin.jvm.internal.l.f(iVar, "prefix");
        return J(0, iVar, 0, iVar.P());
    }

    public i R() {
        byte b2;
        for (int i2 = 0; i2 < B().length; i2++) {
            byte b3 = B()[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] B = B();
                byte[] copyOf = Arrays.copyOf(B, B.length);
                kotlin.jvm.internal.l.e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b5 = copyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
        return this;
    }

    public String S() {
        String E = E();
        if (E != null) {
            return E;
        }
        String b2 = b.b(G());
        M(b2);
        return b2;
    }

    public void T(f fVar, int i2, int i3) {
        kotlin.jvm.internal.l.f(fVar, "buffer");
        j.g0.b.d(this, fVar, i2, i3);
    }

    public String d() {
        return j.a.c(B(), null, 1, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.P() == B().length && iVar.K(0, B(), 0, B().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(j.i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.l.f(r10, r0)
            int r0 = r9.P()
            int r1 = r10.P()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.r(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.r(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i.compareTo(j.i):int");
    }

    public int hashCode() {
        int C = C();
        if (C != 0) {
            return C;
        }
        int hashCode = Arrays.hashCode(B());
        L(hashCode);
        return hashCode;
    }

    public i n(String str) {
        kotlin.jvm.internal.l.f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f19372j, 0, P());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l.e(digest, "digestBytes");
        return new i(digest);
    }

    public final byte r(int i2) {
        return H(i2);
    }

    public String toString() {
        int c2;
        String w;
        String w2;
        String w3;
        i iVar;
        byte[] h2;
        if (B().length == 0) {
            return "[size=0]";
        }
        c2 = j.g0.b.c(B(), 64);
        if (c2 == -1) {
            if (B().length <= 64) {
                return "[hex=" + F() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(B().length);
            sb.append(" hex=");
            if (64 <= B().length) {
                if (64 == B().length) {
                    iVar = this;
                } else {
                    h2 = kotlin.collections.m.h(B(), 0, 64);
                    iVar = new i(h2);
                }
                sb.append(iVar.F());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + B().length + ')').toString());
        }
        String S = S();
        if (S != null) {
            String substring = S.substring(0, c2);
            kotlin.jvm.internal.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            w = kotlin.text.u.w(substring, "\\", "\\\\", false, 4, null);
            w2 = kotlin.text.u.w(w, "\n", "\\n", false, 4, null);
            w3 = kotlin.text.u.w(w2, "\r", "\\r", false, 4, null);
            if (c2 < S.length()) {
                return "[size=" + B().length + " text=" + w3 + "…]";
            }
            return "[text=" + w3 + ']';
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
