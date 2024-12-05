package kotlin.reflect.x.internal.l0.d.a.j0;

import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.m;
import kotlin.s;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f19929g = {b0.g(new v(b0.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: h, reason: collision with root package name */
    private final i f19930h;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<Map<f, ? extends kotlin.reflect.x.internal.l0.i.r.v>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f19931f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<f, kotlin.reflect.x.internal.l0.i.r.v> invoke() {
            Map<f, kotlin.reflect.x.internal.l0.i.r.v> f2;
            f2 = n0.f(s.a(c.a.b(), new kotlin.reflect.x.internal.l0.i.r.v("Deprecated in Java")));
            return f2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.reflect.x.internal.l0.d.a.n0.a aVar, g gVar) {
        super(gVar, aVar, k.a.y);
        l.f(gVar, "c");
        this.f19930h = gVar.e().d(a.f19931f);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.j0.b, kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public Map<f, kotlin.reflect.x.internal.l0.i.r.g<?>> a() {
        return (Map) m.a(this.f19930h, this, f19929g[0]);
    }
}
