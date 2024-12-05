package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import okhttp3.HttpUrl;

/* compiled from: CodedInputStream.java */
/* loaded from: classes2.dex */
public final class e {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21901b;

    /* renamed from: c, reason: collision with root package name */
    private int f21902c;

    /* renamed from: d, reason: collision with root package name */
    private int f21903d;

    /* renamed from: e, reason: collision with root package name */
    private int f21904e;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f21905f;

    /* renamed from: g, reason: collision with root package name */
    private int f21906g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21907h;

    /* renamed from: i, reason: collision with root package name */
    private int f21908i;

    /* renamed from: j, reason: collision with root package name */
    private int f21909j;

    /* renamed from: k, reason: collision with root package name */
    private int f21910k;
    private int l;
    private int m;
    private a n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    private e(InputStream inputStream) {
        this.f21907h = false;
        this.f21909j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = new byte[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f21902c = 0;
        this.f21904e = 0;
        this.f21908i = 0;
        this.f21905f = inputStream;
        this.f21901b = false;
    }

    public static int B(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.k();
            }
            i3 |= (read & 127) << i4;
            if ((read & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            if ((read2 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    private void N() {
        int i2 = this.f21902c + this.f21903d;
        this.f21902c = i2;
        int i3 = this.f21908i + i2;
        int i4 = this.f21909j;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f21903d = i5;
            this.f21902c = i2 - i5;
            return;
        }
        this.f21903d = 0;
    }

    private void O(int i2) throws IOException {
        if (!T(i2)) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void S(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f21908i;
            int i4 = this.f21904e;
            int i5 = i3 + i4 + i2;
            int i6 = this.f21909j;
            if (i5 <= i6) {
                int i7 = this.f21902c;
                int i8 = i7 - i4;
                this.f21904e = i7;
                O(1);
                while (true) {
                    int i9 = i2 - i8;
                    int i10 = this.f21902c;
                    if (i9 > i10) {
                        i8 += i10;
                        this.f21904e = i10;
                        O(1);
                    } else {
                        this.f21904e = i9;
                        return;
                    }
                }
            } else {
                R((i6 - i3) - i4);
                throw InvalidProtocolBufferException.k();
            }
        } else {
            throw InvalidProtocolBufferException.g();
        }
    }

    private boolean T(int i2) throws IOException {
        int i3 = this.f21904e;
        if (i3 + i2 > this.f21902c) {
            if (this.f21908i + i3 + i2 > this.f21909j) {
                return false;
            }
            a aVar = this.n;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f21905f != null) {
                int i4 = this.f21904e;
                if (i4 > 0) {
                    int i5 = this.f21902c;
                    if (i5 > i4) {
                        byte[] bArr = this.a;
                        System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                    }
                    this.f21908i += i4;
                    this.f21902c -= i4;
                    this.f21904e = 0;
                }
                InputStream inputStream = this.f21905f;
                byte[] bArr2 = this.a;
                int i6 = this.f21902c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.a.length) {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (read > 0) {
                    this.f21902c += read;
                    if ((this.f21908i + i2) - this.m <= 0) {
                        N();
                        if (this.f21902c >= i2) {
                            return true;
                        }
                        return T(i2);
                    }
                    throw InvalidProtocolBufferException.j();
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i2);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    private void d(int i2) throws IOException {
        if (this.f21902c - this.f21904e < i2) {
            O(i2);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e h(n nVar) {
        e eVar = new e(nVar);
        try {
            eVar.j(nVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private byte[] x(int i2) throws IOException {
        if (i2 <= 0) {
            if (i2 == 0) {
                return i.a;
            }
            throw InvalidProtocolBufferException.g();
        }
        int i3 = this.f21908i;
        int i4 = this.f21904e;
        int i5 = i3 + i4 + i2;
        int i6 = this.f21909j;
        if (i5 > i6) {
            R((i6 - i3) - i4);
            throw InvalidProtocolBufferException.k();
        }
        if (i2 < 4096) {
            byte[] bArr = new byte[i2];
            int i7 = this.f21902c - i4;
            System.arraycopy(this.a, i4, bArr, 0, i7);
            this.f21904e = this.f21902c;
            int i8 = i2 - i7;
            d(i8);
            System.arraycopy(this.a, 0, bArr, i7, i8);
            this.f21904e = i8;
            return bArr;
        }
        int i9 = this.f21902c;
        this.f21908i = i3 + i9;
        this.f21904e = 0;
        this.f21902c = 0;
        int i10 = i9 - i4;
        int i11 = i2 - i10;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i11 > 0) {
            int min = Math.min(i11, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr2 = new byte[min];
            int i12 = 0;
            while (i12 < min) {
                InputStream inputStream = this.f21905f;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i12, min - i12);
                if (read == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f21908i += read;
                i12 += read;
            }
            i11 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(this.a, i4, bArr3, 0, i10);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
            i10 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r2[r3] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f21904e
            int r1 = r9.f21902c
            if (r1 != r0) goto L8
            goto L7b
        L8:
            byte[] r2 = r9.a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f21904e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7b
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r3 = r3 ^ r5
            int r0 = (int) r3
            goto L81
        L2c:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3e
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3c:
            r1 = r3
            goto L81
        L3e:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4e
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L81
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L81
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L81
        L7b:
            long r0 = r9.D()
            int r1 = (int) r0
            return r1
        L81:
            r9.f21904e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r0] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long C() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.C():long");
    }

    long D() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((w() & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public int E() throws IOException {
        return y();
    }

    public long F() throws IOException {
        return z();
    }

    public int G() throws IOException {
        return b(A());
    }

    public long H() throws IOException {
        return c(C());
    }

    public String I() throws IOException {
        int A = A();
        if (A > this.f21902c - this.f21904e || A <= 0) {
            return A == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : new String(x(A), "UTF-8");
        }
        String str = new String(this.a, this.f21904e, A, "UTF-8");
        this.f21904e += A;
        return str;
    }

    public String J() throws IOException {
        byte[] x;
        int A = A();
        int i2 = this.f21904e;
        if (A <= this.f21902c - i2 && A > 0) {
            x = this.a;
            this.f21904e = i2 + A;
        } else {
            if (A == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            x = x(A);
            i2 = 0;
        }
        if (v.f(x, i2, i2 + A)) {
            return new String(x, i2, A, "UTF-8");
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() throws IOException {
        if (f()) {
            this.f21906g = 0;
            return 0;
        }
        int A = A();
        this.f21906g = A;
        if (w.a(A) != 0) {
            return this.f21906g;
        }
        throw InvalidProtocolBufferException.c();
    }

    public int L() throws IOException {
        return A();
    }

    public long M() throws IOException {
        return C();
    }

    public boolean P(int i2, CodedOutputStream codedOutputStream) throws IOException {
        int b2 = w.b(i2);
        if (b2 == 0) {
            long t = t();
            codedOutputStream.o0(i2);
            codedOutputStream.z0(t);
            return true;
        }
        if (b2 == 1) {
            long z = z();
            codedOutputStream.o0(i2);
            codedOutputStream.V(z);
            return true;
        }
        if (b2 == 2) {
            d l = l();
            codedOutputStream.o0(i2);
            codedOutputStream.P(l);
            return true;
        }
        if (b2 == 3) {
            codedOutputStream.o0(i2);
            Q(codedOutputStream);
            int c2 = w.c(w.a(i2), 4);
            a(c2);
            codedOutputStream.o0(c2);
            return true;
        }
        if (b2 == 4) {
            return false;
        }
        if (b2 == 5) {
            int y = y();
            codedOutputStream.o0(i2);
            codedOutputStream.U(y);
            return true;
        }
        throw InvalidProtocolBufferException.e();
    }

    public void Q(CodedOutputStream codedOutputStream) throws IOException {
        int K;
        do {
            K = K();
            if (K == 0) {
                return;
            }
        } while (P(K, codedOutputStream));
    }

    public void R(int i2) throws IOException {
        int i3 = this.f21902c;
        int i4 = this.f21904e;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.f21904e = i4 + i2;
        } else {
            S(i2);
        }
    }

    public void a(int i2) throws InvalidProtocolBufferException {
        if (this.f21906g != i2) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int e() {
        int i2 = this.f21909j;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.f21908i + this.f21904e);
    }

    public boolean f() throws IOException {
        return this.f21904e == this.f21902c && !T(1);
    }

    public void i(int i2) {
        this.f21909j = i2;
        N();
    }

    public int j(int i2) throws InvalidProtocolBufferException {
        if (i2 >= 0) {
            int i3 = i2 + this.f21908i + this.f21904e;
            int i4 = this.f21909j;
            if (i3 <= i4) {
                this.f21909j = i3;
                N();
                return i4;
            }
            throw InvalidProtocolBufferException.k();
        }
        throw InvalidProtocolBufferException.g();
    }

    public boolean k() throws IOException {
        return C() != 0;
    }

    public d l() throws IOException {
        int A = A();
        int i2 = this.f21902c;
        int i3 = this.f21904e;
        if (A > i2 - i3 || A <= 0) {
            if (A == 0) {
                return d.f21894f;
            }
            return new n(x(A));
        }
        d cVar = (this.f21901b && this.f21907h) ? new c(this.a, this.f21904e, A) : d.w(this.a, i3, A);
        this.f21904e += A;
        return cVar;
    }

    public double m() throws IOException {
        return Double.longBitsToDouble(z());
    }

    public int n() throws IOException {
        return A();
    }

    public int o() throws IOException {
        return y();
    }

    public long p() throws IOException {
        return z();
    }

    public float q() throws IOException {
        return Float.intBitsToFloat(y());
    }

    public void r(int i2, o.a aVar, f fVar) throws IOException {
        int i3 = this.f21910k;
        if (i3 < this.l) {
            this.f21910k = i3 + 1;
            aVar.w(this, fVar);
            a(w.c(i2, 4));
            this.f21910k--;
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    public int s() throws IOException {
        return A();
    }

    public long t() throws IOException {
        return C();
    }

    public <T extends o> T u(q<T> qVar, f fVar) throws IOException {
        int A = A();
        if (this.f21910k < this.l) {
            int j2 = j(A);
            this.f21910k++;
            T b2 = qVar.b(this, fVar);
            a(0);
            this.f21910k--;
            i(j2);
            return b2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public void v(o.a aVar, f fVar) throws IOException {
        int A = A();
        if (this.f21910k < this.l) {
            int j2 = j(A);
            this.f21910k++;
            aVar.w(this, fVar);
            a(0);
            this.f21910k--;
            i(j2);
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    public byte w() throws IOException {
        if (this.f21904e == this.f21902c) {
            O(1);
        }
        byte[] bArr = this.a;
        int i2 = this.f21904e;
        this.f21904e = i2 + 1;
        return bArr[i2];
    }

    public int y() throws IOException {
        int i2 = this.f21904e;
        if (this.f21902c - i2 < 4) {
            O(4);
            i2 = this.f21904e;
        }
        byte[] bArr = this.a;
        this.f21904e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public long z() throws IOException {
        int i2 = this.f21904e;
        if (this.f21902c - i2 < 8) {
            O(8);
            i2 = this.f21904e;
        }
        byte[] bArr = this.a;
        this.f21904e = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    private e(n nVar) {
        this.f21907h = false;
        this.f21909j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = nVar.f21943g;
        int Z = nVar.Z();
        this.f21904e = Z;
        this.f21902c = Z + nVar.size();
        this.f21908i = -this.f21904e;
        this.f21905f = null;
        this.f21901b = true;
    }
}
