package kotlin.reflect.jvm.internal.impl.descriptors.r1.a;

import java.util.List;
import kotlin.reflect.x.internal.l0.j.b.r;

/* compiled from: RuntimeErrorReporter.kt */
/* loaded from: classes2.dex */
public final class j implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final j f21814b = new j();

    private j() {
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.r
    public void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.jvm.internal.l.f(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.r
    public void b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, List<String> list) {
        kotlin.jvm.internal.l.f(eVar, "descriptor");
        kotlin.jvm.internal.l.f(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
