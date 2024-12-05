package kotlin.reflect.x.internal.l0.l.u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.d;

/* compiled from: ThrowingScope.kt */
/* loaded from: classes2.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String... strArr) {
        super(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        kotlin.jvm.internal.l.f(gVar, "kind");
        kotlin.jvm.internal.l.f(strArr, "formatParams");
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f, kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> b() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f, kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f, kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> e() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f, kotlin.reflect.x.internal.l0.i.w.k
    public h f(f fVar, b bVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f, kotlin.reflect.x.internal.l0.i.w.k
    public Collection<m> g(d dVar, Function1<? super f, Boolean> function1) {
        kotlin.jvm.internal.l.f(dVar, "kindFilter");
        kotlin.jvm.internal.l.f(function1, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f, kotlin.reflect.x.internal.l0.i.w.h
    /* renamed from: h */
    public Set<y0> a(f fVar, b bVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f, kotlin.reflect.x.internal.l0.i.w.h
    /* renamed from: i */
    public Set<t0> c(f fVar, b bVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.u1.f
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
