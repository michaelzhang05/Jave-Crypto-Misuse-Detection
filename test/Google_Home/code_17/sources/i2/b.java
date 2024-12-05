package I2;

import S5.d;
import S5.g;
import a6.InterfaceC1668n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3393z;
import l6.InterfaceC3351d0;
import l6.InterfaceC3383u;
import l6.InterfaceC3387w;
import l6.InterfaceC3389x;
import l6.InterfaceC3390x0;
import l6.U;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* loaded from: classes4.dex */
public abstract class b {

    /* loaded from: classes4.dex */
    public static final class a implements U {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC3389x f3984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f3985b;

        a(InterfaceC3389x interfaceC3389x, InterfaceC3706f interfaceC3706f) {
            this.f3985b = interfaceC3706f;
            this.f3984a = interfaceC3389x;
        }

        @Override // l6.InterfaceC3390x0
        public InterfaceC3383u A(InterfaceC3387w child) {
            AbstractC3255y.i(child, "child");
            return this.f3984a.A(child);
        }

        @Override // l6.U
        public Object D(d dVar) {
            return AbstractC3708h.w(AbstractC3708h.v(this.f3985b), dVar);
        }

        @Override // l6.InterfaceC3390x0
        public boolean b() {
            return this.f3984a.b();
        }

        @Override // l6.InterfaceC3390x0
        public void cancel(CancellationException cancellationException) {
            this.f3984a.cancel(cancellationException);
        }

        @Override // l6.U
        public Object f() {
            return this.f3984a.f();
        }

        @Override // S5.g.b, S5.g
        public Object fold(Object obj, InterfaceC1668n operation) {
            AbstractC3255y.i(operation, "operation");
            return this.f3984a.fold(obj, operation);
        }

        @Override // S5.g.b, S5.g
        public g.b get(g.c key) {
            AbstractC3255y.i(key, "key");
            return this.f3984a.get(key);
        }

        @Override // S5.g.b
        public g.c getKey() {
            return this.f3984a.getKey();
        }

        @Override // l6.InterfaceC3390x0
        public InterfaceC3390x0 getParent() {
            return this.f3984a.getParent();
        }

        @Override // l6.InterfaceC3390x0
        public boolean isActive() {
            return this.f3984a.isActive();
        }

        @Override // l6.InterfaceC3390x0
        public boolean isCancelled() {
            return this.f3984a.isCancelled();
        }

        @Override // S5.g.b, S5.g
        public g minusKey(g.c key) {
            AbstractC3255y.i(key, "key");
            return this.f3984a.minusKey(key);
        }

        @Override // l6.InterfaceC3390x0
        public InterfaceC3351d0 n(boolean z8, boolean z9, Function1 handler) {
            AbstractC3255y.i(handler, "handler");
            return this.f3984a.n(z8, z9, handler);
        }

        @Override // l6.InterfaceC3390x0
        public CancellationException o() {
            return this.f3984a.o();
        }

        @Override // S5.g
        public g plus(g context) {
            AbstractC3255y.i(context, "context");
            return this.f3984a.plus(context);
        }

        @Override // l6.InterfaceC3390x0
        public InterfaceC3351d0 s(Function1 handler) {
            AbstractC3255y.i(handler, "handler");
            return this.f3984a.s(handler);
        }

        @Override // l6.InterfaceC3390x0
        public boolean start() {
            return this.f3984a.start();
        }

        @Override // l6.InterfaceC3390x0
        public Object y(d dVar) {
            return this.f3984a.y(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U b(InterfaceC3706f interfaceC3706f) {
        return new a(AbstractC3393z.b(null, 1, null), interfaceC3706f);
    }
}
