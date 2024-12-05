package l6;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public abstract class H {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34559a = new a();

        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S5.g invoke(S5.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f34560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34561b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.T t8, boolean z8) {
            super(2);
            this.f34560a = t8;
            this.f34561b = z8;
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S5.g invoke(S5.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f34562a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z8, g.b bVar) {
            return Boolean.valueOf(z8);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final S5.g a(S5.g gVar, S5.g gVar2, boolean z8) {
        boolean c8 = c(gVar);
        boolean c9 = c(gVar2);
        if (!c8 && !c9) {
            return gVar.plus(gVar2);
        }
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        t8.f34162a = gVar2;
        S5.h hVar = S5.h.f9825a;
        S5.g gVar3 = (S5.g) gVar.fold(hVar, new b(t8, z8));
        if (c9) {
            t8.f34162a = ((S5.g) t8.f34162a).fold(hVar, a.f34559a);
        }
        return gVar3.plus((S5.g) t8.f34162a);
    }

    public static final String b(S5.g gVar) {
        return null;
    }

    private static final boolean c(S5.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f34562a)).booleanValue();
    }

    public static final S5.g d(S5.g gVar, S5.g gVar2) {
        if (!c(gVar2)) {
            return gVar.plus(gVar2);
        }
        return a(gVar, gVar2, false);
    }

    public static final S5.g e(M m8, S5.g gVar) {
        S5.g a8 = a(m8.getCoroutineContext(), gVar, true);
        if (a8 != C3347b0.a() && a8.get(S5.e.f9822a0) == null) {
            return a8.plus(C3347b0.a());
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

    public static final c1 g(S5.d dVar, S5.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.get(d1.f34607a) == null) {
            return null;
        }
        c1 f8 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f8 != null) {
            f8.O0(gVar, obj);
        }
        return f8;
    }
}
