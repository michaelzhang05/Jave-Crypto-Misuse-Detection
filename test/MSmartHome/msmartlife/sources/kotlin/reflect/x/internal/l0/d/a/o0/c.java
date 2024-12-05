package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: typeEnhancement.kt */
/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.c f20118f;

    public c(kotlin.reflect.x.internal.l0.f.c cVar) {
        l.f(cVar, "fqNameToMatch");
        this.f20118f = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean A(kotlin.reflect.x.internal.l0.f.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b e(kotlin.reflect.x.internal.l0.f.c cVar) {
        l.f(cVar, "fqName");
        if (l.a(cVar, this.f20118f)) {
            return b.a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> iterator() {
        List i2;
        i2 = t.i();
        return i2.iterator();
    }
}
