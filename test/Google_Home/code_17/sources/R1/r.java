package R1;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class r extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f9606c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(N1.p.f7609j);
        linkedHashSet.add(N1.p.f7610k);
        linkedHashSet.add(N1.p.f7611l);
        linkedHashSet.add(N1.p.f7612m);
        f9606c = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r(N1.p pVar) {
        super(new HashSet(Collections.singletonList(pVar)));
        if (f9606c.contains(pVar)) {
            return;
        }
        throw new N1.f("Unsupported EC DSA algorithm: " + pVar);
    }

    public N1.p h() {
        return (N1.p) g().iterator().next();
    }
}
