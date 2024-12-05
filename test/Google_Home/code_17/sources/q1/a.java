package Q1;

import N1.q;
import N1.s;
import O1.c;
import O1.d;
import O1.f;
import R1.r;
import R1.v;
import R1.z;
import T1.b;
import j$.util.DesugarCollections;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class a implements T1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f9130b;

    /* renamed from: a, reason: collision with root package name */
    private final b f9131a = new b();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(v.f9611d);
        linkedHashSet.addAll(z.f9615c);
        linkedHashSet.addAll(r.f9606c);
        f9130b = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    @Override // T1.a
    public b d() {
        return this.f9131a;
    }

    public s g(q qVar, Key key) {
        s cVar;
        if (v.f9611d.contains(qVar.t())) {
            if (key instanceof SecretKey) {
                cVar = new d((SecretKey) key);
            } else {
                throw new N1.v(SecretKey.class);
            }
        } else if (z.f9615c.contains(qVar.t())) {
            if (key instanceof RSAPublicKey) {
                cVar = new f((RSAPublicKey) key);
            } else {
                throw new N1.v(RSAPublicKey.class);
            }
        } else if (r.f9606c.contains(qVar.t())) {
            if (key instanceof ECPublicKey) {
                cVar = new c((ECPublicKey) key);
            } else {
                throw new N1.v(ECPublicKey.class);
            }
        } else {
            throw new N1.f("Unsupported JWS algorithm: " + qVar.t());
        }
        cVar.d().c(this.f9131a.a());
        return cVar;
    }
}
