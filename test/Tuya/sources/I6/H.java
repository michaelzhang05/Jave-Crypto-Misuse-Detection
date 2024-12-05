package i6;

import P5.g;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public abstract class H {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31707a = new a();

        a() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P5.g invoke(P5.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f31708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31709b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.T t8, boolean z8) {
            super(2);
            this.f31708a = t8;
            this.f31709b = z8;
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P5.g invoke(P5.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f31710a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z8, g.b bVar) {
            return Boolean.valueOf(z8);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final P5.g a(P5.g gVar, P5.g gVar2, boolean z8) {
        boolean c8 = c(gVar);
        boolean c9 = c(gVar2);
        if (!c8 && !c9) {
            return gVar.plus(gVar2);
        }
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        t8.f33761a = gVar2;
        P5.h hVar = P5.h.f7994a;
        P5.g gVar3 = (P5.g) gVar.fold(hVar, new b(t8, z8));
        if (c9) {
            t8.f33761a = ((P5.g) t8.f33761a).fold(hVar, a.f31707a);
        }
        return gVar3.plus((P5.g) t8.f33761a);
    }

    public static final String b(P5.g gVar) {
        return null;
    }

    private static final boolean c(P5.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f31710a)).booleanValue();
    }

    public static final P5.g d(P5.g gVar, P5.g gVar2) {
        if (!c(gVar2)) {
            return gVar.plus(gVar2);
        }
        return a(gVar, gVar2, false);
    }

    public static final P5.g e(M m8, P5.g gVar) {
        P5.g a8 = a(m8.getCoroutineContext(), gVar, true);
        if (a8 != C2812b0.a() && a8.get(P5.e.f7991a0) == null) {
            return a8.plus(C2812b0.a());
        }
        return a8;
    }

    public static final c1 f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof Y) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof c1) {
                return (c1) eVar;
            }
        }
        return null;
    }

    public static final c1 g(P5.d dVar, P5.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.get(d1.f31755a) == null) {
            return null;
        }
        c1 f8 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f8 != null) {
            f8.P0(gVar, obj);
        }
        return f8;
    }
}
