package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.x.internal.l0.l.w1.k;

/* compiled from: MultiFieldValueClassRepresentation.kt */
/* loaded from: classes2.dex */
public final class h0<Type extends kotlin.reflect.x.internal.l0.l.w1.k> extends g1<Type> {
    private final List<Pair<kotlin.reflect.x.internal.l0.f.f, Type>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<kotlin.reflect.x.internal.l0.f.f, Type> f21639b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(List<? extends Pair<kotlin.reflect.x.internal.l0.f.f, ? extends Type>> list) {
        super(null);
        Map<kotlin.reflect.x.internal.l0.f.f, Type> q;
        kotlin.jvm.internal.l.f(list, "underlyingPropertyNamesToTypes");
        this.a = list;
        q = kotlin.collections.o0.q(a());
        if (q.size() == a().size()) {
            this.f21639b = q;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
    public List<Pair<kotlin.reflect.x.internal.l0.f.f, Type>> a() {
        return this.a;
    }
}
