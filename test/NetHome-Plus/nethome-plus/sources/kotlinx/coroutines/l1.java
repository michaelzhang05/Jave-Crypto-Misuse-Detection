package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public interface l1 extends CoroutineContext.b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f22259e = b.f22260f;

    /* compiled from: Job.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(l1 l1Var, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            l1Var.i0(cancellationException);
        }

        public static <R> R b(l1 l1Var, R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
            return (R) CoroutineContext.b.a.a(l1Var, r, function2);
        }

        public static <E extends CoroutineContext.b> E c(l1 l1Var, CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(l1Var, cVar);
        }

        public static /* synthetic */ v0 d(l1 l1Var, boolean z, boolean z2, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i2 & 1) != 0) {
                z = false;
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return l1Var.z(z, z2, function1);
        }

        public static CoroutineContext e(l1 l1Var, CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(l1Var, cVar);
        }

        public static CoroutineContext f(l1 l1Var, CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(l1Var, coroutineContext);
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: classes2.dex */
    public static final class b implements CoroutineContext.c<l1> {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ b f22260f = new b();

        private b() {
        }
    }

    CancellationException D();

    v0 Y(Function1<? super Throwable, kotlin.u> function1);

    boolean b();

    void i0(CancellationException cancellationException);

    q q0(s sVar);

    boolean start();

    v0 z(boolean z, boolean z2, Function1<? super Throwable, kotlin.u> function1);
}
