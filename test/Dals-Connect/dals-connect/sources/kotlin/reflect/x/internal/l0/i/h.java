package kotlin.reflect.x.internal.l0.i;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes2.dex */
public abstract class h extends i {
    @Override // kotlin.reflect.x.internal.l0.i.i
    public void b(b bVar, b bVar2) {
        l.f(bVar, "first");
        l.f(bVar2, "second");
        e(bVar, bVar2);
    }

    @Override // kotlin.reflect.x.internal.l0.i.i
    public void c(b bVar, b bVar2) {
        l.f(bVar, "fromSuper");
        l.f(bVar2, "fromCurrent");
        e(bVar, bVar2);
    }

    protected abstract void e(b bVar, b bVar2);
}
