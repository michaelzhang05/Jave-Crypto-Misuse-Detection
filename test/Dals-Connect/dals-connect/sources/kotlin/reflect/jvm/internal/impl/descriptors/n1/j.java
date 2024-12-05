package kotlin.reflect.jvm.internal.impl.descriptors.n1;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes2.dex */
public final class j implements c {
    private final kotlin.reflect.x.internal.l0.b.h a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.c f21677b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<kotlin.reflect.x.internal.l0.f.f, kotlin.reflect.x.internal.l0.i.r.g<?>> f21678c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f21679d;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<m0> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            return j.this.a.o(j.this.d()).s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(kotlin.reflect.x.internal.l0.b.h hVar, kotlin.reflect.x.internal.l0.f.c cVar, Map<kotlin.reflect.x.internal.l0.f.f, ? extends kotlin.reflect.x.internal.l0.i.r.g<?>> map) {
        Lazy a2;
        kotlin.jvm.internal.l.f(hVar, "builtIns");
        kotlin.jvm.internal.l.f(cVar, "fqName");
        kotlin.jvm.internal.l.f(map, "allValueArguments");
        this.a = hVar;
        this.f21677b = cVar;
        this.f21678c = map;
        a2 = kotlin.i.a(LazyThreadSafetyMode.PUBLICATION, new a());
        this.f21679d = a2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public Map<kotlin.reflect.x.internal.l0.f.f, kotlin.reflect.x.internal.l0.i.r.g<?>> a() {
        return this.f21678c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public kotlin.reflect.x.internal.l0.f.c d() {
        return this.f21677b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public e0 getType() {
        Object value = this.f21679d.getValue();
        kotlin.jvm.internal.l.e(value, "<get-type>(...)");
        return (e0) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public z0 t() {
        z0 z0Var = z0.a;
        kotlin.jvm.internal.l.e(z0Var, "NO_SOURCE");
        return z0Var;
    }
}
