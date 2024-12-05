package O1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class x extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f7757d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f7758e = l.f7744a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(K1.i.f5752d);
        linkedHashSet.add(K1.i.f5753e);
        linkedHashSet.add(K1.i.f5754f);
        linkedHashSet.add(K1.i.f5755g);
        linkedHashSet.add(K1.i.f5756h);
        f7757d = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x() {
        super(f7757d, l.f7744a);
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
}
