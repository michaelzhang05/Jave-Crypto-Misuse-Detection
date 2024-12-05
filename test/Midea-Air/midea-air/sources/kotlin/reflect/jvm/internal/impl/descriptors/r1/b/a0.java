package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h;

/* compiled from: ReflectJavaTypeParameter.kt */
/* loaded from: classes2.dex */
public final class a0 extends p implements h, kotlin.reflect.x.internal.l0.d.a.n0.y {
    private final TypeVariable<?> a;

    public a0(TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.l.f(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public e e(kotlin.reflect.x.internal.l0.f.c cVar) {
        return h.a.a(this, cVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<e> getAnnotations() {
        return h.a.b(this);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.y
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<n> getUpperBounds() {
        List<n> i2;
        Type[] bounds = this.a.getBounds();
        kotlin.jvm.internal.l.e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new n(type));
        }
        n nVar = (n) kotlin.collections.r.p0(arrayList);
        if (!kotlin.jvm.internal.l.a(nVar != null ? nVar.R() : null, Object.class)) {
            return arrayList;
        }
        i2 = kotlin.collections.t.i();
        return i2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && kotlin.jvm.internal.l.a(this.a, ((a0) obj).a);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.t
    public kotlin.reflect.x.internal.l0.f.f getName() {
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(this.a.getName());
        kotlin.jvm.internal.l.e(r, "identifier(typeVariable.name)");
        return r;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return h.a.c(this);
    }

    public String toString() {
        return a0.class.getName() + ": " + this.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h
    public AnnotatedElement v() {
        TypeVariable<?> typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }
}
