package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.j.internal.DebugMetadata;
import kotlin.coroutines.j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.u0;

/* compiled from: CoroutineWorker.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\u00020\u00148\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00198\u0016@\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\r\u001a\u0004\b\u001a\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Le/e/c/a/a/a;", "Landroidx/work/ListenableWorker$a;", "startWork", "()Le/e/c/a/a/a;", "a", "(Lkotlin/y/d;)Ljava/lang/Object;", "Landroidx/work/h;", "d", "getForegroundInfoAsync", "Lkotlin/u;", "onStopped", "()V", "Landroidx/work/impl/utils/o/c;", "b", "Landroidx/work/impl/utils/o/c;", "g", "()Landroidx/work/impl/utils/o/c;", "future", "Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/u;", "h", "()Lkotlinx/coroutines/u;", "job", "Lkotlinx/coroutines/c0;", "c", "Lkotlinx/coroutines/c0;", "()Lkotlinx/coroutines/c0;", "getCoroutineContext$annotations", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: a, reason: from kotlin metadata */
    private final kotlinx.coroutines.u job;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.impl.utils.o.c<ListenableWorker.a> future;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0 coroutineContext;

    /* compiled from: CoroutineWorker.kt */
    /* loaded from: classes.dex */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.g().isCancelled()) {
                l1.a.a(CoroutineWorker.this.getJob(), null, 1, null);
            }
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends SuspendLambda implements Function2<h0, Continuation<? super kotlin.u>, Object> {

        /* renamed from: f, reason: collision with root package name */
        Object f1760f;

        /* renamed from: g, reason: collision with root package name */
        int f1761g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ m<h> f1762h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f1763i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m<h> mVar, CoroutineWorker coroutineWorker, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f1762h = mVar;
            this.f1763i = coroutineWorker;
        }

        @Override // kotlin.coroutines.j.internal.BaseContinuationImpl
        public final Continuation<kotlin.u> create(Object obj, Continuation<?> continuation) {
            return new b(this.f1762h, this.f1763i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h0 h0Var, Continuation<? super kotlin.u> continuation) {
            return ((b) create(h0Var, continuation)).invokeSuspend(kotlin.u.a);
        }

        @Override // kotlin.coroutines.j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c2;
            m mVar;
            c2 = kotlin.coroutines.intrinsics.d.c();
            int i2 = this.f1761g;
            if (i2 == 0) {
                kotlin.o.b(obj);
                m<h> mVar2 = this.f1762h;
                CoroutineWorker coroutineWorker = this.f1763i;
                this.f1760f = mVar2;
                this.f1761g = 1;
                Object d2 = coroutineWorker.d(this);
                if (d2 == c2) {
                    return c2;
                }
                mVar = mVar2;
                obj = d2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) this.f1760f;
                kotlin.o.b(obj);
            }
            mVar.b(obj);
            return kotlin.u.a;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends SuspendLambda implements Function2<h0, Continuation<? super kotlin.u>, Object> {

        /* renamed from: f, reason: collision with root package name */
        int f1764f;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.j.internal.BaseContinuationImpl
        public final Continuation<kotlin.u> create(Object obj, Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h0 h0Var, Continuation<? super kotlin.u> continuation) {
            return ((c) create(h0Var, continuation)).invokeSuspend(kotlin.u.a);
        }

        @Override // kotlin.coroutines.j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c2;
            c2 = kotlin.coroutines.intrinsics.d.c();
            int i2 = this.f1764f;
            try {
                if (i2 == 0) {
                    kotlin.o.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f1764f = 1;
                    obj = coroutineWorker.a(this);
                    if (obj == c2) {
                        return c2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.o.b(obj);
                }
                CoroutineWorker.this.g().q((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.g().r(th);
            }
            return kotlin.u.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlinx.coroutines.u b2;
        kotlin.jvm.internal.l.f(context, "appContext");
        kotlin.jvm.internal.l.f(workerParameters, "params");
        b2 = p1.b(null, 1, null);
        this.job = b2;
        androidx.work.impl.utils.o.c<ListenableWorker.a> u = androidx.work.impl.utils.o.c.u();
        kotlin.jvm.internal.l.e(u, "create()");
        this.future = u;
        u.d(new a(), getTaskExecutor().c());
        this.coroutineContext = u0.a();
    }

    static /* synthetic */ Object f(CoroutineWorker coroutineWorker, Continuation continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object a(Continuation<? super ListenableWorker.a> continuation);

    /* renamed from: c, reason: from getter */
    public c0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object d(Continuation<? super h> continuation) {
        return f(this, continuation);
    }

    public final androidx.work.impl.utils.o.c<ListenableWorker.a> g() {
        return this.future;
    }

    @Override // androidx.work.ListenableWorker
    public final e.e.c.a.a.a<h> getForegroundInfoAsync() {
        kotlinx.coroutines.u b2;
        b2 = p1.b(null, 1, null);
        h0 a2 = i0.a(getCoroutineContext().plus(b2));
        m mVar = new m(b2, null, 2, null);
        kotlinx.coroutines.i.b(a2, null, null, new b(mVar, this, null), 3, null);
        return mVar;
    }

    /* renamed from: h, reason: from getter */
    public final kotlinx.coroutines.u getJob() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final e.e.c.a.a.a<ListenableWorker.a> startWork() {
        kotlinx.coroutines.i.b(i0.a(getCoroutineContext().plus(this.job)), null, null, new c(null), 3, null);
        return this.future;
    }
}
