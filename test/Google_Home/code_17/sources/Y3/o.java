package Y3;

import N1.u;
import R1.AbstractC1410a;
import R1.AbstractC1411b;
import R1.AbstractC1412c;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class o extends O1.b {

    /* renamed from: g, reason: collision with root package name */
    private final byte f13568g;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13569a = new a();

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
        AbstractC3255y.i(key, "key");
        this.f13568g = b8;
    }

    @Override // O1.b, N1.l
    public N1.j c(N1.m header, byte[] clearText) {
        byte[] b8;
        R1.f d8;
        AbstractC3255y.i(header, "header");
        AbstractC3255y.i(clearText, "clearText");
        N1.i t8 = header.t();
        if (AbstractC3255y.d(t8, N1.i.f7539l)) {
            N1.d v8 = header.v();
            if (v8.c() == c2.e.b(i().getEncoded())) {
                if (v8.c() == c2.e.b(i().getEncoded())) {
                    byte[] a8 = R1.n.a(header, clearText);
                    byte[] a9 = AbstractC1410a.a(header);
                    if (AbstractC3255y.d(header.v(), N1.d.f7508e)) {
                        b8 = a.f13569a.b(128, this.f13568g);
                        d8 = AbstractC1411b.f(i(), b8, a8, a9, g().d(), g().f());
                        AbstractC3255y.h(d8, "encryptAuthenticated(...)");
                    } else if (AbstractC3255y.d(header.v(), N1.d.f7513j)) {
                        b8 = a.f13569a.b(96, this.f13568g);
                        d8 = AbstractC1412c.d(i(), new c2.f(b8), a8, a9, null);
                        AbstractC3255y.h(d8, "encrypt(...)");
                    } else {
                        throw new N1.f(R1.e.b(header.v(), R1.o.f9604f));
                    }
                    return new N1.j(header, null, c2.c.e(b8), c2.c.e(d8.b()), c2.c.e(d8.a()));
                }
                throw new u("The Content Encryption Key length for " + v8 + " must be " + v8.c() + " bits");
            }
            throw new u(v8.c(), v8);
        }
        throw new N1.f("Invalid algorithm " + t8);
    }
}
