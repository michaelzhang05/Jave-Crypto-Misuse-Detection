package h3;

import h3.a0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class y extends b {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f6939a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.b f6940b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.a f6941c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f6942d;

    private y(a0 a0Var, v3.b bVar, v3.a aVar, Integer num) {
        this.f6939a = a0Var;
        this.f6940b = bVar;
        this.f6941c = aVar;
        this.f6942d = num;
    }

    public static y a(a0.a aVar, v3.b bVar, Integer num) {
        a0.a aVar2 = a0.a.f6829d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            a0 a6 = a0.a(aVar);
            return new y(a6, bVar, b(a6, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static v3.a b(a0 a0Var, Integer num) {
        if (a0Var.b() == a0.a.f6829d) {
            return v3.a.a(new byte[0]);
        }
        if (a0Var.b() == a0.a.f6828c) {
            return v3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (a0Var.b() == a0.a.f6827b) {
            return v3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + a0Var.b());
    }
}
