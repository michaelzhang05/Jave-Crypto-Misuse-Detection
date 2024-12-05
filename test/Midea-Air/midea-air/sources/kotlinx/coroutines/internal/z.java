package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.a2;

/* compiled from: ThreadContext.kt */
/* loaded from: classes2.dex */
public final class z {
    public static final v a = new v("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final Function2<Object, CoroutineContext.b, Object> f22242b = a.f22245f;

    /* renamed from: c, reason: collision with root package name */
    private static final Function2<a2<?>, CoroutineContext.b, a2<?>> f22243c = b.f22246f;

    /* renamed from: d, reason: collision with root package name */
    private static final Function2<c0, CoroutineContext.b, c0> f22244d = c.f22247f;

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function2<Object, CoroutineContext.b, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f22245f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, CoroutineContext.b bVar) {
            if (!(bVar instanceof a2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function2<a2<?>, CoroutineContext.b, a2<?>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f22246f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a2<?> invoke(a2<?> a2Var, CoroutineContext.b bVar) {
            if (a2Var != null) {
                return a2Var;
            }
            if (bVar instanceof a2) {
                return (a2) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function2<c0, CoroutineContext.b, c0> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f22247f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c0 invoke(c0 c0Var, CoroutineContext.b bVar) {
            if (bVar instanceof a2) {
                a2<?> a2Var = (a2) bVar;
                c0Var.a(a2Var, a2Var.k0(c0Var.a));
            }
            return c0Var;
        }
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof c0) {
            ((c0) obj).b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f22243c);
        if (fold != null) {
            ((a2) fold).c0(coroutineContext, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f22242b);
        kotlin.jvm.internal.l.c(fold);
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new c0(coroutineContext, ((Number) obj).intValue()), f22244d);
        }
        return ((a2) obj).k0(coroutineContext);
    }
}
