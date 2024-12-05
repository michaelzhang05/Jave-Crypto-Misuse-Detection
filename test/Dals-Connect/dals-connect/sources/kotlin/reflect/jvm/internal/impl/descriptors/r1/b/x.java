package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.util.Collection;
import java.util.List;

/* compiled from: ReflectJavaPrimitiveType.kt */
/* loaded from: classes2.dex */
public final class x extends z implements kotlin.reflect.x.internal.l0.d.a.n0.v {

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f21857b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<kotlin.reflect.x.internal.l0.d.a.n0.a> f21858c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21859d;

    public x(Class<?> cls) {
        List i2;
        kotlin.jvm.internal.l.f(cls, "reflectType");
        this.f21857b = cls;
        i2 = kotlin.collections.t.i();
        this.f21858c = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public Class<?> R() {
        return this.f21857b;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.a> getAnnotations() {
        return this.f21858c;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.v
    public kotlin.reflect.x.internal.l0.b.i getType() {
        if (kotlin.jvm.internal.l.a(R(), Void.TYPE)) {
            return null;
        }
        return kotlin.reflect.x.internal.l0.i.u.e.f(R().getName()).r();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return this.f21859d;
    }
}
