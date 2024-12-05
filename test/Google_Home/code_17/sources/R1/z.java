package R1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class z extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f9615c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(N1.p.f7606g);
        linkedHashSet.add(N1.p.f7607h);
        linkedHashSet.add(N1.p.f7608i);
        linkedHashSet.add(N1.p.f7613n);
        linkedHashSet.add(N1.p.f7614o);
        linkedHashSet.add(N1.p.f7615p);
        f9615c = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z() {
        super(f9615c);
    }
}
