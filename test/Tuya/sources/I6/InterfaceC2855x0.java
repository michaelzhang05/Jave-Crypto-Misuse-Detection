package i6;

import P5.g;
import f6.InterfaceC2680g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* renamed from: i6.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2855x0 extends g.b {

    /* renamed from: n0, reason: collision with root package name */
    public static final b f31809n0 = b.f31810a;

    /* renamed from: i6.x0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC2855x0 interfaceC2855x0, CancellationException cancellationException, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    cancellationException = null;
                }
                interfaceC2855x0.cancel(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(InterfaceC2855x0 interfaceC2855x0, Object obj, X5.n nVar) {
            return g.b.a.a(interfaceC2855x0, obj, nVar);
        }

        public static g.b c(InterfaceC2855x0 interfaceC2855x0, g.c cVar) {
            return g.b.a.b(interfaceC2855x0, cVar);
        }

        public static /* synthetic */ InterfaceC2816d0 d(InterfaceC2855x0 interfaceC2855x0, boolean z8, boolean z9, Function1 function1, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    z8 = false;
                }
                if ((i8 & 2) != 0) {
                    z9 = true;
                }
                return interfaceC2855x0.l(z8, z9, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static P5.g e(InterfaceC2855x0 interfaceC2855x0, g.c cVar) {
            return g.b.a.c(interfaceC2855x0, cVar);
        }

        public static P5.g f(InterfaceC2855x0 interfaceC2855x0, P5.g gVar) {
            return g.b.a.d(interfaceC2855x0, gVar);
        }
    }

    /* renamed from: i6.x0$b */
    /* loaded from: classes5.dex */
    public static final class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f31810a = new b();

        private b() {
        }
    }

    boolean b();

    void cancel(CancellationException cancellationException);

    Object e(P5.d dVar);

    InterfaceC2855x0 getParent();

    InterfaceC2680g h();

    boolean isActive();

    InterfaceC2816d0 l(boolean z8, boolean z9, Function1 function1);

    CancellationException m();

    boolean start();

    InterfaceC2848u t(InterfaceC2852w interfaceC2852w);

    InterfaceC2816d0 u(Function1 function1);
}
