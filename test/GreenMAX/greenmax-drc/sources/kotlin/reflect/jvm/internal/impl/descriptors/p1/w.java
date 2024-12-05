package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.List;
import java.util.Set;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes2.dex */
public final class w implements v {
    private final List<x> a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<x> f21792b;

    /* renamed from: c, reason: collision with root package name */
    private final List<x> f21793c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<x> f21794d;

    public w(List<x> list, Set<x> set, List<x> list2, Set<x> set2) {
        kotlin.jvm.internal.l.f(list, "allDependencies");
        kotlin.jvm.internal.l.f(set, "modulesWhoseInternalsAreVisible");
        kotlin.jvm.internal.l.f(list2, "directExpectedByDependencies");
        kotlin.jvm.internal.l.f(set2, "allExpectedByDependencies");
        this.a = list;
        this.f21792b = set;
        this.f21793c = list2;
        this.f21794d = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.v
    public List<x> a() {
        return this.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.v
    public Set<x> b() {
        return this.f21792b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.v
    public List<x> c() {
        return this.f21793c;
    }
}
