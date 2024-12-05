package O1;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class r extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f7750c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(K1.p.f5830j);
        linkedHashSet.add(K1.p.f5831k);
        linkedHashSet.add(K1.p.f5832l);
        linkedHashSet.add(K1.p.f5833m);
        f7750c = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r(K1.p pVar) {
        super(new HashSet(Collections.singletonList(pVar)));
        if (f7750c.contains(pVar)) {
            return;
        }
        throw new K1.f("Unsupported EC DSA algorithm: " + pVar);
    }

    public K1.p h() {
        return (K1.p) g().iterator().next();
    }
}
