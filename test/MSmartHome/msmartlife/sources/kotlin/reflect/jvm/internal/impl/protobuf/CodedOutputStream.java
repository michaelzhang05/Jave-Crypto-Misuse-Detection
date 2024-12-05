package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public final class CodedOutputStream {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21881b;

    /* renamed from: e, reason: collision with root package name */
    private final OutputStream f21884e;

    /* renamed from: d, reason: collision with root package name */
    private int f21883d = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f21882c = 0;

    /* loaded from: classes2.dex */
    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f21884e = outputStream;
        this.a = bArr;
        this.f21881b = bArr.length;
    }

    public static int A(int i2, long j2) {
        return D(i2) + B(j2);
    }

    public static int B(long j2) {
        return w(H(j2));
    }

    public static int C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public static int D(int i2) {
        return v(w.c(i2, 0));
    }

    public static int E(int i2) {
        return v(i2);
    }

    public static int F(long j2) {
        return w(j2);
    }

    public static int G(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long H(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static CodedOutputStream J(OutputStream outputStream, int i2) {
        return new CodedOutputStream(outputStream, new byte[i2]);
    }

    private void K() throws IOException {
        OutputStream outputStream = this.f21884e;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.f21882c);
            this.f21882c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    public static int a(int i2, boolean z) {
        return D(i2) + b(z);
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return v(bArr.length) + bArr.length;
    }

    public static int d(int i2, d dVar) {
        return D(i2) + e(dVar);
    }

    public static int e(d dVar) {
        return v(dVar.size()) + dVar.size();
    }

    public static int f(int i2, double d2) {
        return D(i2) + g(d2);
    }

    public static int g(double d2) {
        return 8;
    }

    public static int h(int i2, int i3) {
        return D(i2) + i(i3);
    }

    public static int i(int i2) {
        return p(i2);
    }

    public static int j(int i2) {
        return 4;
    }

    public static int k(long j2) {
        return 8;
    }

    public static int l(int i2, float f2) {
        return D(i2) + m(f2);
    }

    public static int m(float f2) {
        return 4;
    }

    public static int n(o oVar) {
        return oVar.e();
    }

    public static int o(int i2, int i3) {
        return D(i2) + p(i3);
    }

    public static int p(int i2) {
        if (i2 >= 0) {
            return v(i2);
        }
        return 10;
    }

    public static int q(long j2) {
        return w(j2);
    }

    public static int r(k kVar) {
        int b2 = kVar.b();
        return v(b2) + b2;
    }

    public static int s(int i2, o oVar) {
        return D(i2) + t(oVar);
    }

    public static int t(o oVar) {
        int e2 = oVar.e();
        return v(e2) + e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i2) {
        return i2 > 4096 ? RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT : i2;
    }

    public static int v(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int x(int i2) {
        return 4;
    }

    public static int y(long j2) {
        return 8;
    }

    public static int z(int i2) {
        return v(G(i2));
    }

    public void I() throws IOException {
        if (this.f21884e != null) {
            K();
        }
    }

    public void L(int i2, boolean z) throws IOException {
        w0(i2, 0);
        M(z);
    }

    public void M(boolean z) throws IOException {
        h0(z ? 1 : 0);
    }

    public void N(byte[] bArr) throws IOException {
        o0(bArr.length);
        k0(bArr);
    }

    public void O(int i2, d dVar) throws IOException {
        w0(i2, 2);
        P(dVar);
    }

    public void P(d dVar) throws IOException {
        o0(dVar.size());
        i0(dVar);
    }

    public void Q(int i2, double d2) throws IOException {
        w0(i2, 1);
        R(d2);
    }

    public void R(double d2) throws IOException {
        n0(Double.doubleToRawLongBits(d2));
    }

    public void S(int i2, int i3) throws IOException {
        w0(i2, 0);
        T(i3);
    }

    public void T(int i2) throws IOException {
        b0(i2);
    }

    public void U(int i2) throws IOException {
        m0(i2);
    }

    public void V(long j2) throws IOException {
        n0(j2);
    }

    public void W(int i2, float f2) throws IOException {
        w0(i2, 5);
        X(f2);
    }

    public void X(float f2) throws IOException {
        m0(Float.floatToRawIntBits(f2));
    }

    public void Y(int i2, o oVar) throws IOException {
        w0(i2, 3);
        Z(oVar);
        w0(i2, 4);
    }

    public void Z(o oVar) throws IOException {
        oVar.d(this);
    }

    public void a0(int i2, int i3) throws IOException {
        w0(i2, 0);
        b0(i3);
    }

    public void b0(int i2) throws IOException {
        if (i2 >= 0) {
            o0(i2);
        } else {
            p0(i2);
        }
    }

    public void c0(long j2) throws IOException {
        p0(j2);
    }

    public void d0(int i2, o oVar) throws IOException {
        w0(i2, 2);
        e0(oVar);
    }

    public void e0(o oVar) throws IOException {
        o0(oVar.e());
        oVar.d(this);
    }

    public void f0(int i2, o oVar) throws IOException {
        w0(1, 3);
        x0(2, i2);
        d0(3, oVar);
        w0(1, 4);
    }

    public void g0(byte b2) throws IOException {
        if (this.f21882c == this.f21881b) {
            K();
        }
        byte[] bArr = this.a;
        int i2 = this.f21882c;
        this.f21882c = i2 + 1;
        bArr[i2] = b2;
        this.f21883d++;
    }

    public void h0(int i2) throws IOException {
        g0((byte) i2);
    }

    public void i0(d dVar) throws IOException {
        j0(dVar, 0, dVar.size());
    }

    public void j0(d dVar, int i2, int i3) throws IOException {
        int i4 = this.f21881b;
        int i5 = this.f21882c;
        if (i4 - i5 >= i3) {
            dVar.z(this.a, i2, i5, i3);
            this.f21882c += i3;
            this.f21883d += i3;
            return;
        }
        int i6 = i4 - i5;
        dVar.z(this.a, i2, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f21882c = this.f21881b;
        this.f21883d += i6;
        K();
        if (i8 <= this.f21881b) {
            dVar.z(this.a, i7, 0, i8);
            this.f21882c = i8;
        } else {
            dVar.V(this.f21884e, i7, i8);
        }
        this.f21883d += i8;
    }

    public void k0(byte[] bArr) throws IOException {
        l0(bArr, 0, bArr.length);
    }

    public void l0(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f21881b;
        int i5 = this.f21882c;
        if (i4 - i5 >= i3) {
            System.arraycopy(bArr, i2, this.a, i5, i3);
            this.f21882c += i3;
            this.f21883d += i3;
            return;
        }
        int i6 = i4 - i5;
        System.arraycopy(bArr, i2, this.a, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f21882c = this.f21881b;
        this.f21883d += i6;
        K();
        if (i8 <= this.f21881b) {
            System.arraycopy(bArr, i7, this.a, 0, i8);
            this.f21882c = i8;
        } else {
            this.f21884e.write(bArr, i7, i8);
        }
        this.f21883d += i8;
    }

    public void m0(int i2) throws IOException {
        h0(i2 & 255);
        h0((i2 >> 8) & 255);
        h0((i2 >> 16) & 255);
        h0((i2 >> 24) & 255);
    }

    public void n0(long j2) throws IOException {
        h0(((int) j2) & 255);
        h0(((int) (j2 >> 8)) & 255);
        h0(((int) (j2 >> 16)) & 255);
        h0(((int) (j2 >> 24)) & 255);
        h0(((int) (j2 >> 32)) & 255);
        h0(((int) (j2 >> 40)) & 255);
        h0(((int) (j2 >> 48)) & 255);
        h0(((int) (j2 >> 56)) & 255);
    }

    public void o0(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            h0((i2 & 127) | 128);
            i2 >>>= 7;
        }
        h0(i2);
    }

    public void p0(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            h0((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        h0((int) j2);
    }

    public void q0(int i2) throws IOException {
        m0(i2);
    }

    public void r0(long j2) throws IOException {
        n0(j2);
    }

    public void s0(int i2) throws IOException {
        o0(G(i2));
    }

    public void t0(int i2, long j2) throws IOException {
        w0(i2, 0);
        u0(j2);
    }

    public void u0(long j2) throws IOException {
        p0(H(j2));
    }

    public void v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        o0(bytes.length);
        k0(bytes);
    }

    public void w0(int i2, int i3) throws IOException {
        o0(w.c(i2, i3));
    }

    public void x0(int i2, int i3) throws IOException {
        w0(i2, 0);
        y0(i3);
    }

    public void y0(int i2) throws IOException {
        o0(i2);
    }

    public void z0(long j2) throws IOException {
        p0(j2);
    }
}
