package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.x.internal.l0.l.w1.k;

/* compiled from: InlineClassRepresentation.kt */
/* loaded from: classes2.dex */
public final class z<Type extends kotlin.reflect.x.internal.l0.l.w1.k> extends g1<Type> {
    private final kotlin.reflect.x.internal.l0.f.f a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f21880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.reflect.x.internal.l0.f.f fVar, Type type) {
        super(null);
        kotlin.jvm.internal.l.f(fVar, "underlyingPropertyName");
        kotlin.jvm.internal.l.f(type, "underlyingType");
        this.a = fVar;
        this.f21880b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
    public List<Pair<kotlin.reflect.x.internal.l0.f.f, Type>> a() {
        List<Pair<kotlin.reflect.x.internal.l0.f.f, Type>> e2;
        e2 = kotlin.collections.s.e(kotlin.s.a(this.a, this.f21880b));
        return e2;
    }

    public final kotlin.reflect.x.internal.l0.f.f c() {
        return this.a;
    }

    public final Type d() {
        return this.f21880b;
    }
}
