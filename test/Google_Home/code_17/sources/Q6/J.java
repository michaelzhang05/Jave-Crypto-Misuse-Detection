package q6;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.V0;

/* loaded from: classes5.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final C3865F f38367a = new C3865F("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1668n f38368b = a.f38371a;

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1668n f38369c = b.f38372a;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1668n f38370d = c.f38373a;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38371a = new a();

        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
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
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38372a = new b();

        b() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
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
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f38373a = new c();

        c() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke(P p8, g.b bVar) {
            if (bVar instanceof V0) {
                V0 v02 = (V0) bVar;
                p8.a(v02, v02.updateThreadContext(p8.f38380a));
            }
            return p8;
        }
    }

    public static final void a(S5.g gVar, Object obj) {
        if (obj == f38367a) {
            return;
        }
        if (obj instanceof P) {
            ((P) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f38369c);
        AbstractC3255y.g(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((V0) fold).restoreThreadContext(gVar, obj);
    }

    public static final Object b(S5.g gVar) {
        Object fold = gVar.fold(0, f38368b);
        AbstractC3255y.f(fold);
        return fold;
    }

    public static final Object c(S5.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f38367a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new P(gVar, ((Number) obj).intValue()), f38370d);
        }
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((V0) obj).updateThreadContext(gVar);
    }
}
