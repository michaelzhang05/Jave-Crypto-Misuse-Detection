package R6;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: R6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1350q {

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f8845a;

    public C1350q(OutputStream outputStream) {
        this.f8845a = outputStream;
    }

    public static C1350q a(OutputStream outputStream) {
        return new C1350q(outputStream);
    }

    public static C1350q b(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            return new C1334c0(outputStream);
        }
        if (str.equals("DL")) {
            return new q0(outputStream);
        }
        return new C1350q(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1334c0 d() {
        return new C1334c0(this.f8845a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1350q e() {
        return new q0(this.f8845a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i8) {
        this.f8845a.write(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i8, int i9) {
        this.f8845a.write(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            u(((InterfaceC1335d) enumeration.nextElement()).d(), true);
        }
    }

    final void i(InterfaceC1335d[] interfaceC1335dArr) {
        for (InterfaceC1335d interfaceC1335d : interfaceC1335dArr) {
            u(interfaceC1335d.d(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z8, int i8, byte b8) {
        if (z8) {
            f(i8);
        }
        r(1);
        f(b8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z8, int i8, byte b8, byte[] bArr) {
        if (z8) {
            f(i8);
        }
        r(bArr.length + 1);
        f(b8);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z8, int i8, byte b8, byte[] bArr, int i9, int i10, byte b9) {
        if (z8) {
            f(i8);
        }
        r(i10 + 2);
        f(b8);
        g(bArr, i9, i10);
        f(b9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z8, int i8, int i9, byte[] bArr) {
        v(z8, i8, i9);
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z8, int i8, byte[] bArr) {
        if (z8) {
            f(i8);
        }
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z8, int i8, int i9, byte[] bArr) {
        v(z8, i8, i9);
        f(128);
        g(bArr, 0, bArr.length);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z8, int i8, Enumeration enumeration) {
        if (z8) {
            f(i8);
        }
        f(128);
        h(enumeration);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z8, int i8, InterfaceC1335d[] interfaceC1335dArr) {
        if (z8) {
            f(i8);
        }
        f(128);
        i(interfaceC1335dArr);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(int i8) {
        if (i8 > 127) {
            int i9 = i8;
            int i10 = 1;
            while (true) {
                i9 >>>= 8;
                if (i9 == 0) {
                    break;
                } else {
                    i10++;
                }
            }
            f((byte) (i10 | 128));
            for (int i11 = (i10 - 1) * 8; i11 >= 0; i11 -= 8) {
                f((byte) (i8 >> i11));
            }
            return;
        }
        f((byte) i8);
    }

    public void s(InterfaceC1335d interfaceC1335d) {
        if (interfaceC1335d != null) {
            u(interfaceC1335d.d(), true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    public void t(AbstractC1351s abstractC1351s) {
        if (abstractC1351s != null) {
            u(abstractC1351s, true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(AbstractC1351s abstractC1351s, boolean z8) {
        abstractC1351s.p(this, z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z8, int i8, int i9) {
        if (!z8) {
            return;
        }
        if (i9 < 31) {
            f(i8 | i9);
            return;
        }
        f(31 | i8);
        if (i9 < 128) {
            f(i9);
            return;
        }
        byte[] bArr = new byte[5];
        int i10 = 4;
        bArr[4] = (byte) (i9 & 127);
        do {
            i9 >>= 7;
            i10--;
            bArr[i10] = (byte) ((i9 & 127) | 128);
        } while (i9 > 127);
        g(bArr, i10, 5 - i10);
    }

    void c() {
    }
}
