package kotlin.reflect.x.internal.l0.d.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.j.b.g;

/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes2.dex */
public final class h implements kotlin.reflect.x.internal.l0.j.b.h {
    private final o a;

    /* renamed from: b, reason: collision with root package name */
    private final g f20303b;

    public h(o oVar, g gVar) {
        l.f(oVar, "kotlinClassFinder");
        l.f(gVar, "deserializedDescriptorResolver");
        this.a = oVar;
        this.f20303b = gVar;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.h
    public g a(b bVar) {
        l.f(bVar, "classId");
        q b2 = p.b(this.a, bVar);
        if (b2 == null) {
            return null;
        }
        l.a(b2.c(), bVar);
        return this.f20303b.i(b2);
    }
}
