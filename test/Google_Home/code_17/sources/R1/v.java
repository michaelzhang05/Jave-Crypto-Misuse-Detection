package R1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class v extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f9611d;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9612c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(N1.p.f7603d);
        linkedHashSet.add(N1.p.f7604e);
        linkedHashSet.add(N1.p.f7605f);
        f9611d = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v(byte[] bArr, Set set) {
        super(set);
        if (bArr.length >= 32) {
            this.f9612c = bArr;
            return;
        }
        throw new N1.u("The secret length must be at least 256 bits");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String h(N1.p pVar) {
        if (pVar.equals(N1.p.f7603d)) {
            return "HMACSHA256";
        }
        if (pVar.equals(N1.p.f7604e)) {
            return "HMACSHA384";
        }
        if (pVar.equals(N1.p.f7605f)) {
            return "HMACSHA512";
        }
        throw new N1.f(e.d(pVar, f9611d));
    }

    public byte[] i() {
        return this.f9612c;
    }
}
