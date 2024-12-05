package O1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class o extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final Set f7747e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f7748f = l.f7744a;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKey f7749d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(K1.i.f5760l);
        f7747e = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(SecretKey secretKey) {
        super(f7747e, h(Z1.e.b(secretKey.getEncoded())));
        this.f7749d = secretKey;
    }

    private static Set h(int i8) {
        Set set = (Set) l.f7745b.get(Integer.valueOf(i8));
        if (set != null) {
            return set;
        }
        throw new K1.u("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    @Override // O1.g, K1.o
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // O1.g, K1.o
    public /* bridge */ /* synthetic */ Set f() {
        return super.f();
    }

    @Override // O1.g
    public /* bridge */ /* synthetic */ Q1.c g() {
        return super.g();
    }

    public SecretKey i() {
        return this.f7749d;
    }
}
