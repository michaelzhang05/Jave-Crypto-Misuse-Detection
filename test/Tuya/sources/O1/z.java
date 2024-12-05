package O1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class z extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f7759c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(K1.p.f5827g);
        linkedHashSet.add(K1.p.f5828h);
        linkedHashSet.add(K1.p.f5829i);
        linkedHashSet.add(K1.p.f5834n);
        linkedHashSet.add(K1.p.f5835o);
        linkedHashSet.add(K1.p.f5836p);
        f7759c = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z() {
        super(f7759c);
    }
}
