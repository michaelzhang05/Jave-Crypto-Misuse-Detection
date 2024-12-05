package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.i;

/* compiled from: AnnotationsTypeAttribute.kt */
/* loaded from: classes2.dex */
public final class j extends y0<j> {
    private final g a;

    public j(g gVar) {
        l.f(gVar, "annotations");
        this.a = gVar;
    }

    @Override // kotlin.reflect.x.internal.l0.l.y0
    public KClass<? extends j> b() {
        return b0.b(j.class);
    }

    @Override // kotlin.reflect.x.internal.l0.l.y0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j a(j jVar) {
        return jVar == null ? this : new j(i.a(this.a, jVar.a));
    }

    public final g e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return l.a(((j) obj).a, this.a);
        }
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.l.y0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public j c(j jVar) {
        if (l.a(jVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
