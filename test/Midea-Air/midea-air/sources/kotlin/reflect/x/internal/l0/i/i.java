package kotlin.reflect.x.internal.l0.i;

import java.util.Collection;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes2.dex */
public abstract class i {
    public abstract void a(b bVar);

    public abstract void b(b bVar, b bVar2);

    public abstract void c(b bVar, b bVar2);

    public void d(b bVar, Collection<? extends b> collection) {
        l.f(bVar, "member");
        l.f(collection, "overridden");
        bVar.x0(collection);
    }
}
