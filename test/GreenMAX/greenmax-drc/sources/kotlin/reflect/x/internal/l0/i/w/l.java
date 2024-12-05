package kotlin.reflect.x.internal.l0.i.w;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.i.c;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.m;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes2.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f20932b = {b0.g(new v(b0.b(l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: c, reason: collision with root package name */
    private final e f20933c;

    /* renamed from: d, reason: collision with root package name */
    private final i f20934d;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<List<? extends y0>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends y0> invoke() {
            List<? extends y0> l;
            l = t.l(c.f(l.this.f20933c), c.g(l.this.f20933c));
            return l;
        }
    }

    public l(n nVar, e eVar) {
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(eVar, "containingClass");
        this.f20933c = eVar;
        eVar.i();
        f fVar = f.ENUM_CLASS;
        this.f20934d = nVar.d(new a());
    }

    private final List<y0> l() {
        return (List) m.a(this.f20934d, this, f20932b[0]);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public /* bridge */ /* synthetic */ h f(kotlin.reflect.x.internal.l0.f.f fVar, b bVar) {
        return (h) i(fVar, bVar);
    }

    public Void i(kotlin.reflect.x.internal.l0.f.f fVar, b bVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(bVar, "location");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public List<y0> g(d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        kotlin.jvm.internal.l.f(dVar, "kindFilter");
        kotlin.jvm.internal.l.f(function1, "nameFilter");
        return l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.utils.e<y0> a(kotlin.reflect.x.internal.l0.f.f fVar, b bVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(bVar, "location");
        List<y0> l = l();
        kotlin.reflect.jvm.internal.impl.utils.e<y0> eVar = new kotlin.reflect.jvm.internal.impl.utils.e<>();
        for (Object obj : l) {
            if (kotlin.jvm.internal.l.a(((y0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }
}
