package androidx.compose.ui;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import l6.B0;
import l6.InterfaceC3390x0;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {66, 68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SessionMutex$withSessionCancellingPrevious$2 extends l implements InterfaceC1668n {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ InterfaceC1668n $session;
    final /* synthetic */ Function1 $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(Function1 function1, AtomicReference<SessionMutex.Session<T>> atomicReference, InterfaceC1668n interfaceC1668n, d dVar) {
        super(2, dVar);
        this.$sessionInitializer = function1;
        this.$arg0 = atomicReference;
        this.$session = interfaceC1668n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, dVar);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SessionMutex.Session session;
        InterfaceC3390x0 job;
        SessionMutex.Session session2;
        Object e8 = T5.b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        session2 = (SessionMutex.Session) this.L$0;
                        try {
                            t.b(obj);
                            androidx.compose.animation.core.d.a(this.$arg0, session2, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            androidx.compose.animation.core.d.a(this.$arg0, session2, null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                session = (SessionMutex.Session) this.L$0;
                t.b(obj);
            } else {
                t.b(obj);
                M m8 = (M) this.L$0;
                session = new SessionMutex.Session(B0.l(m8.getCoroutineContext()), this.$sessionInitializer.invoke(m8));
                SessionMutex.Session session3 = (SessionMutex.Session) this.$arg0.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (B0.g(job, this) == e8) {
                        return e8;
                    }
                }
            }
            InterfaceC1668n interfaceC1668n = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = interfaceC1668n.invoke(value, this);
            if (obj == e8) {
                return e8;
            }
            session2 = session;
            androidx.compose.animation.core.d.a(this.$arg0, session2, null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            androidx.compose.animation.core.d.a(this.$arg0, session2, null);
            throw th;
        }
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
