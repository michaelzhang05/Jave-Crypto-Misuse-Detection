package kotlin.reflect.x.internal.l0.d.b;

import java.util.Collection;
import kotlin.collections.b0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.d.b.y;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes2.dex */
public final class z implements y<l> {
    public static final z a = new z();

    private z() {
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.y
    public String b(e eVar) {
        return y.a.a(this, eVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.y
    public e0 c(Collection<? extends e0> collection) {
        String b0;
        l.f(collection, "types");
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no intersection type in existing descriptors, but found: ");
        b0 = b0.b0(collection, null, null, null, 0, null, null, 63, null);
        sb.append(b0);
        throw new AssertionError(sb.toString());
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.y
    public String d(e eVar) {
        l.f(eVar, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.y
    public e0 e(e0 e0Var) {
        return y.a.b(this, e0Var);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.y
    public void f(e0 e0Var, e eVar) {
        l.f(e0Var, "kotlinType");
        l.f(eVar, "descriptor");
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.y
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l a(e eVar) {
        l.f(eVar, "classDescriptor");
        return null;
    }
}
