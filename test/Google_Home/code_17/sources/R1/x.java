package R1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class x extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f9613d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f9614e = l.f9600a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(N1.i.f7531d);
        linkedHashSet.add(N1.i.f7532e);
        linkedHashSet.add(N1.i.f7533f);
        linkedHashSet.add(N1.i.f7534g);
        linkedHashSet.add(N1.i.f7535h);
        f9613d = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x() {
        super(f9613d, l.f9600a);
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
}
