package F2;

import P5.d;
import P5.g;
import X5.n;
import i6.AbstractC2858z;
import i6.InterfaceC2816d0;
import i6.InterfaceC2848u;
import i6.InterfaceC2852w;
import i6.InterfaceC2854x;
import i6.InterfaceC2855x0;
import i6.U;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

/* loaded from: classes4.dex */
public abstract class b {

    /* loaded from: classes4.dex */
    public static final class a implements U {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC2854x f2444a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f2445b;

        a(InterfaceC2854x interfaceC2854x, InterfaceC3358f interfaceC3358f) {
            this.f2445b = interfaceC3358f;
            this.f2444a = interfaceC2854x;
        }

        @Override // i6.InterfaceC2855x0
        public boolean b() {
            return this.f2444a.b();
        }

        @Override // i6.InterfaceC2855x0
        public void cancel(CancellationException cancellationException) {
            this.f2444a.cancel(cancellationException);
        }

        @Override // i6.InterfaceC2855x0
        public Object e(d dVar) {
            return this.f2444a.e(dVar);
        }

        @Override // i6.U
        public Object f() {
            return this.f2444a.f();
        }

        @Override // P5.g.b, P5.g
        public Object fold(Object obj, n operation) {
            AbstractC3159y.i(operation, "operation");
            return this.f2444a.fold(obj, operation);
        }

        @Override // i6.U
        public Object g(d dVar) {
            return AbstractC3360h.u(AbstractC3360h.t(this.f2445b), dVar);
        }

        @Override // P5.g.b, P5.g
        public g.b get(g.c key) {
            AbstractC3159y.i(key, "key");
            return this.f2444a.get(key);
        }

        @Override // P5.g.b
        public g.c getKey() {
            return this.f2444a.getKey();
        }

        @Override // i6.InterfaceC2855x0
        public InterfaceC2855x0 getParent() {
            return this.f2444a.getParent();
        }

        @Override // i6.InterfaceC2855x0
        public boolean isActive() {
            return this.f2444a.isActive();
        }

        @Override // i6.InterfaceC2855x0
        public InterfaceC2816d0 l(boolean z8, boolean z9, Function1 handler) {
            AbstractC3159y.i(handler, "handler");
            return this.f2444a.l(z8, z9, handler);
        }

        @Override // i6.InterfaceC2855x0
        public CancellationException m() {
            return this.f2444a.m();
        }

        @Override // P5.g.b, P5.g
        public g minusKey(g.c key) {
            AbstractC3159y.i(key, "key");
            return this.f2444a.minusKey(key);
        }

        @Override // P5.g
        public g plus(g context) {
            AbstractC3159y.i(context, "context");
            return this.f2444a.plus(context);
        }

        @Override // i6.InterfaceC2855x0
        public boolean start() {
            return this.f2444a.start();
        }

        @Override // i6.InterfaceC2855x0
        public InterfaceC2848u t(InterfaceC2852w child) {
            AbstractC3159y.i(child, "child");
            return this.f2444a.t(child);
        }

        @Override // i6.InterfaceC2855x0
        public InterfaceC2816d0 u(Function1 handler) {
            AbstractC3159y.i(handler, "handler");
            return this.f2444a.u(handler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U b(InterfaceC3358f interfaceC3358f) {
        return new a(AbstractC2858z.b(null, 1, null), interfaceC3358f);
    }
}
