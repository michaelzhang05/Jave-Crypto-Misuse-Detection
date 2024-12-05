package h3;

import h3.i0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class g0 extends b {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f6856a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.b f6857b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.a f6858c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f6859d;

    private g0(i0 i0Var, v3.b bVar, v3.a aVar, Integer num) {
        this.f6856a = i0Var;
        this.f6857b = bVar;
        this.f6858c = aVar;
        this.f6859d = num;
    }

    public static g0 a(i0.a aVar, v3.b bVar, Integer num) {
        i0.a aVar2 = i0.a.f6877d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            i0 a6 = i0.a(aVar);
            return new g0(a6, bVar, b(a6, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static v3.a b(i0 i0Var, Integer num) {
        if (i0Var.b() == i0.a.f6877d) {
            return v3.a.a(new byte[0]);
        }
        if (i0Var.b() == i0.a.f6876c) {
            return v3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i0Var.b() == i0.a.f6875b) {
            return v3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i0Var.b());
    }
}
