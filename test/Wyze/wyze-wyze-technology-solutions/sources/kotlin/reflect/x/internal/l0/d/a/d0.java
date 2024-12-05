package kotlin.reflect.x.internal.l0.d.a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.e;
import kotlin.reflect.x.internal.l0.k.f;
import kotlin.reflect.x.internal.l0.k.h;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes2.dex */
public final class d0<T> implements c0<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Map<c, T> f19867b;

    /* renamed from: c, reason: collision with root package name */
    private final f f19868c;

    /* renamed from: d, reason: collision with root package name */
    private final h<c, T> f19869d;

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<c, T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0<T> f19870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0<T> d0Var) {
            super(1);
            this.f19870f = d0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke(c cVar) {
            l.e(cVar, "it");
            return (T) e.a(cVar, this.f19870f.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Map<c, ? extends T> map) {
        l.f(map, "states");
        this.f19867b = map;
        f fVar = new f("Java nullability annotation states");
        this.f19868c = fVar;
        h<c, T> i2 = fVar.i(new a(this));
        l.e(i2, "storageManager.createMem…cificFqname(states)\n    }");
        this.f19869d = i2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.c0
    public T a(c cVar) {
        l.f(cVar, "fqName");
        return this.f19869d.invoke(cVar);
    }

    public final Map<c, T> b() {
        return this.f19867b;
    }
}
