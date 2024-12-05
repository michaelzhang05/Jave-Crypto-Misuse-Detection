package V3;

import K1.u;
import O1.AbstractC1272a;
import O1.AbstractC1273b;
import O1.AbstractC1274c;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class o extends L1.b {

    /* renamed from: g, reason: collision with root package name */
    private final byte f11930g;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11931a = new a();

        private a() {
        }

        private final byte[] a(int i8, byte b8, byte b9) {
            int i9 = i8 / 8;
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, b8);
            bArr[i9 - 1] = b9;
            return bArr;
        }

        public final byte[] b(int i8, byte b8) {
            return a(i8, (byte) 0, b8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(byte[] key, byte b8) {
        super(new SecretKeySpec(key, "AES"));
        AbstractC3159y.i(key, "key");
        this.f11930g = b8;
    }

    @Override // L1.b, K1.l
    public K1.j b(K1.m header, byte[] clearText) {
        byte[] b8;
        O1.f d8;
        AbstractC3159y.i(header, "header");
        AbstractC3159y.i(clearText, "clearText");
        K1.i t8 = header.t();
        if (AbstractC3159y.d(t8, K1.i.f5760l)) {
            K1.d v8 = header.v();
            if (v8.c() == Z1.e.b(i().getEncoded())) {
                if (v8.c() == Z1.e.b(i().getEncoded())) {
                    byte[] a8 = O1.n.a(header, clearText);
                    byte[] a9 = AbstractC1272a.a(header);
                    if (AbstractC3159y.d(header.v(), K1.d.f5729e)) {
                        b8 = a.f11931a.b(128, this.f11930g);
                        d8 = AbstractC1273b.f(i(), b8, a8, a9, g().d(), g().f());
                        AbstractC3159y.h(d8, "encryptAuthenticated(...)");
                    } else if (AbstractC3159y.d(header.v(), K1.d.f5734j)) {
                        b8 = a.f11931a.b(96, this.f11930g);
                        d8 = AbstractC1274c.d(i(), new Z1.f(b8), a8, a9, null);
                        AbstractC3159y.h(d8, "encrypt(...)");
                    } else {
                        throw new K1.f(O1.e.b(header.v(), O1.o.f7748f));
                    }
                    return new K1.j(header, null, Z1.c.e(b8), Z1.c.e(d8.b()), Z1.c.e(d8.a()));
                }
                throw new u("The Content Encryption Key length for " + v8 + " must be " + v8.c() + " bits");
            }
            throw new u(v8.c(), v8);
        }
        throw new K1.f("Invalid algorithm " + t8);
    }
}
