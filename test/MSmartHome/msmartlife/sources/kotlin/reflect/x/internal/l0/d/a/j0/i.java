package kotlin.reflect.x.internal.l0.d.a.j0;

import java.util.List;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.d.a.n0.b;
import kotlin.reflect.x.internal.l0.d.a.n0.e;
import kotlin.reflect.x.internal.l0.d.a.n0.m;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.r.g;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class i extends b {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f19935g = {b0.g(new v(b0.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f19936h;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<Map<f, ? extends g<? extends Object>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<f, g<Object>> invoke() {
            g<?> gVar;
            List<? extends b> e2;
            Map<f, g<Object>> i2;
            b b2 = i.this.b();
            if (b2 instanceof e) {
                gVar = d.a.c(((e) i.this.b()).e());
            } else if (b2 instanceof m) {
                d dVar = d.a;
                e2 = s.e(i.this.b());
                gVar = dVar.c(e2);
            } else {
                gVar = null;
            }
            Map<f, g<Object>> f2 = gVar != null ? n0.f(kotlin.s.a(c.a.d(), gVar)) : null;
            if (f2 != null) {
                return f2;
            }
            i2 = o0.i();
            return i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.reflect.x.internal.l0.d.a.n0.a aVar, kotlin.reflect.x.internal.l0.d.a.l0.g gVar) {
        super(gVar, aVar, k.a.H);
        l.f(aVar, "annotation");
        l.f(gVar, "c");
        this.f19936h = gVar.e().d(new a());
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.j0.b, kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public Map<f, g<Object>> a() {
        return (Map) kotlin.reflect.x.internal.l0.k.m.a(this.f19936h, this, f19935g[0]);
    }
}
