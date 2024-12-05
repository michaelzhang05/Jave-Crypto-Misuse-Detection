package n6;

import P5.g;
import i6.V0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final C3486F f36239a = new C3486F("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final X5.n f36240b = a.f36243a;

    /* renamed from: c, reason: collision with root package name */
    private static final X5.n f36241c = b.f36244a;

    /* renamed from: d, reason: collision with root package name */
    private static final X5.n f36242d = c.f36245a;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36243a = new a();

        a() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            Integer num;
            int i8;
            if (bVar instanceof V0) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 1;
                }
                if (i8 != 0) {
                    return Integer.valueOf(i8 + 1);
                }
                return bVar;
            }
            return obj;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36244a = new b();

        b() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V0 invoke(V0 v02, g.b bVar) {
            if (v02 != null) {
                return v02;
            }
            if (bVar instanceof V0) {
                return (V0) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36245a = new c();

        c() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke(P p8, g.b bVar) {
            if (bVar instanceof V0) {
                V0 v02 = (V0) bVar;
                p8.a(v02, v02.updateThreadContext(p8.f36252a));
            }
            return p8;
        }
    }

    public static final void a(P5.g gVar, Object obj) {
        if (obj == f36239a) {
            return;
        }
        if (obj instanceof P) {
            ((P) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f36241c);
        AbstractC3159y.g(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((V0) fold).restoreThreadContext(gVar, obj);
    }

    public static final Object b(P5.g gVar) {
        Object fold = gVar.fold(0, f36240b);
        AbstractC3159y.f(fold);
        return fold;
    }

    public static final Object c(P5.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f36239a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new P(gVar, ((Number) obj).intValue()), f36242d);
        }
        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((V0) obj).updateThreadContext(gVar);
    }
}
