package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class c0 extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22139f = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractCoroutineContextKey<ContinuationInterceptor, c0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: kotlinx.coroutines.c0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0381a extends Lambda implements Function1<CoroutineContext.b, c0> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0381a f22140f = new C0381a();

            C0381a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c0 invoke(CoroutineContext.b bVar) {
                if (bVar instanceof c0) {
                    return (c0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(ContinuationInterceptor.f22100b, C0381a.f22140f);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public c0() {
        super(ContinuationInterceptor.f22100b);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public void a(Continuation<?> continuation) {
        ((kotlinx.coroutines.internal.e) continuation).n();
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> f(Continuation<? super T> continuation) {
        return new kotlinx.coroutines.internal.e(this, continuation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        return (E) ContinuationInterceptor.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        return ContinuationInterceptor.a.b(this, cVar);
    }

    public abstract void s0(CoroutineContext coroutineContext, Runnable runnable);

    public boolean t0(CoroutineContext coroutineContext) {
        return true;
    }

    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }
}
