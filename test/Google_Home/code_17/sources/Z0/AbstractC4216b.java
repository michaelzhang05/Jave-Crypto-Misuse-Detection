package z0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import w0.AbstractC4121d;
import w0.h;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4216b extends AbstractC4217c {

    /* renamed from: z0.b$a */
    /* loaded from: classes3.dex */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future f41065a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC4215a f41066b;

        a(Future future, InterfaceC4215a interfaceC4215a) {
            this.f41065a = future;
            this.f41066b = interfaceC4215a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41066b.a(AbstractC4216b.b(this.f41065a));
            } catch (Error e8) {
                e = e8;
                this.f41066b.b(e);
            } catch (RuntimeException e9) {
                e = e9;
                this.f41066b.b(e);
            } catch (ExecutionException e10) {
                this.f41066b.b(e10.getCause());
            }
        }

        public String toString() {
            return AbstractC4121d.a(this).c(this.f41066b).toString();
        }
    }

    public static void a(InterfaceFutureC4218d interfaceFutureC4218d, InterfaceC4215a interfaceC4215a, Executor executor) {
        h.i(interfaceC4215a);
        interfaceFutureC4218d.addListener(new a(interfaceFutureC4218d, interfaceC4215a), executor);
    }

    public static Object b(Future future) {
        h.p(future.isDone(), "Future was expected to be done: %s", future);
        return AbstractC4219e.a(future);
    }
}
