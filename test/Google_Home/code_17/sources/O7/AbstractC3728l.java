package o7;

/* renamed from: o7.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3728l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(C3721e c3721e, byte[] bArr, int i8, byte[] bArr2) {
        boolean z8;
        b7.e a8 = AbstractC3718b.a(c3721e.b());
        byte[] b8 = C3717a.f().d(bArr).i(i8).h(-32640).g(0, 22).b();
        a8.b(b8, 0, b8.length);
        b7.e a9 = AbstractC3718b.a(c3721e.b());
        byte[] b9 = C3717a.f().d(bArr).i(i8).g(0, a9.f() + 23).b();
        C3730n c3730n = new C3730n(bArr, bArr2, AbstractC3718b.a(c3721e.b()));
        c3730n.d(i8);
        c3730n.c(0);
        int d8 = c3721e.d();
        int c8 = c3721e.c();
        int g8 = (1 << c3721e.g()) - 1;
        for (int i9 = 0; i9 < d8; i9++) {
            if (i9 < d8 - 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            c3730n.a(b9, z8, 23);
            H7.f.m((short) i9, b9, 20);
            for (int i10 = 0; i10 < g8; i10++) {
                b9[22] = (byte) i10;
                a9.b(b9, 0, b9.length);
                a9.a(b9, 23);
            }
            a8.b(b9, 23, c8);
        }
        byte[] bArr3 = new byte[a8.f()];
        a8.a(bArr3, 0);
        return bArr3;
    }
}
