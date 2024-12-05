package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.y0;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes2.dex */
public final class f {
    private static final v a = new v("UNDEFINED");

    /* renamed from: b */
    public static final v f22214b = new v("REUSABLE_CLAIMED");

    public static final /* synthetic */ v a() {
        return a;
    }

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(Continuation<? super T> continuation, Object obj, Function1<? super Throwable, kotlin.u> function1) {
        boolean z;
        if (continuation instanceof e) {
            e eVar = (e) continuation;
            Object b2 = kotlinx.coroutines.z.b(obj, function1);
            if (eVar.f22212j.t0(eVar.getContext())) {
                eVar.l = b2;
                eVar.f22277h = 1;
                eVar.f22212j.s0(eVar.getContext(), eVar);
                return;
            }
            l0.a();
            y0 a2 = b2.a.a();
            if (a2.A0()) {
                eVar.l = b2;
                eVar.f22277h = 1;
                a2.w0(eVar);
                return;
            }
            a2.y0(true);
            try {
                l1 l1Var = (l1) eVar.getContext().get(l1.f22259e);
                if (l1Var == null || l1Var.b()) {
                    z = false;
                } else {
                    CancellationException D = l1Var.D();
                    eVar.a(b2, D);
                    Result.a aVar = Result.f21603f;
                    eVar.resumeWith(Result.a(kotlin.o.a(D)));
                    z = true;
                }
                if (!z) {
                    Continuation<T> continuation2 = eVar.f22213k;
                    Object obj2 = eVar.m;
                    CoroutineContext context = continuation2.getContext();
                    Object c2 = z.c(context, obj2);
                    d2<?> e2 = c2 != z.a ? kotlinx.coroutines.b0.e(continuation2, context, c2) : null;
                    try {
                        eVar.f22213k.resumeWith(obj);
                        kotlin.u uVar = kotlin.u.a;
                        if (e2 == null || e2.t0()) {
                            z.a(context, c2);
                        }
                    } catch (Throwable th) {
                        if (e2 == null || e2.t0()) {
                            z.a(context, c2);
                        }
                        throw th;
                    }
                }
                do {
                } while (a2.C0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    public static /* synthetic */ void c(Continuation continuation, Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        b(continuation, obj, function1);
    }
}
