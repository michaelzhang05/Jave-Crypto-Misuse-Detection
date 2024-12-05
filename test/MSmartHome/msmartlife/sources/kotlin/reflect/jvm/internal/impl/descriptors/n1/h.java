package kotlin.reflect.jvm.internal.impl.descriptors.n1;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;

/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: f, reason: collision with root package name */
    private final List<c> f21676f;

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends c> list) {
        kotlin.jvm.internal.l.f(list, "annotations");
        this.f21676f = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean A(kotlin.reflect.x.internal.l0.f.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public c e(kotlin.reflect.x.internal.l0.f.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean isEmpty() {
        return this.f21676f.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return this.f21676f.iterator();
    }

    public String toString() {
        return this.f21676f.toString();
    }
}
