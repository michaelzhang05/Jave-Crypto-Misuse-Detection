package R1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class o extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final Set f9603e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f9604f = l.f9600a;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKey f9605d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(N1.i.f7539l);
        f9603e = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(SecretKey secretKey) {
        super(f9603e, h(c2.e.b(secretKey.getEncoded())));
        this.f9605d = secretKey;
    }

    private static Set h(int i8) {
        Set set = (Set) l.f9601b.get(Integer.valueOf(i8));
        if (set != null) {
            return set;
        }
        throw new N1.u("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    @Override // R1.g, N1.o
    public /* bridge */ /* synthetic */ Set a() {
        return super.a();
    }

    @Override // R1.g, N1.o
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    @Override // R1.g
    public /* bridge */ /* synthetic */ T1.c g() {
        return super.g();
    }

    public SecretKey i() {
        return this.f9605d;
    }
}
