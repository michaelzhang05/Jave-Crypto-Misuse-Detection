package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes2.dex */
public final class r0 {
    private final i a;

    /* renamed from: b, reason: collision with root package name */
    private final List<kotlin.reflect.x.internal.l0.l.g1> f21806b;

    /* renamed from: c, reason: collision with root package name */
    private final r0 f21807c;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(i iVar, List<? extends kotlin.reflect.x.internal.l0.l.g1> list, r0 r0Var) {
        kotlin.jvm.internal.l.f(iVar, "classifierDescriptor");
        kotlin.jvm.internal.l.f(list, "arguments");
        this.a = iVar;
        this.f21806b = list;
        this.f21807c = r0Var;
    }

    public final List<kotlin.reflect.x.internal.l0.l.g1> a() {
        return this.f21806b;
    }

    public final i b() {
        return this.a;
    }

    public final r0 c() {
        return this.f21807c;
    }
}
