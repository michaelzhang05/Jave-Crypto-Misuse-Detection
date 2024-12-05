package l6;

import S5.g;
import a6.InterfaceC1668n;
import i6.InterfaceC2998g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* renamed from: l6.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3390x0 extends g.b {

    /* renamed from: n0, reason: collision with root package name */
    public static final b f34661n0 = b.f34662a;

    /* renamed from: l6.x0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC3390x0 interfaceC3390x0, CancellationException cancellationException, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    cancellationException = null;
                }
                interfaceC3390x0.cancel(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(InterfaceC3390x0 interfaceC3390x0, Object obj, InterfaceC1668n interfaceC1668n) {
            return g.b.a.a(interfaceC3390x0, obj, interfaceC1668n);
        }

        public static g.b c(InterfaceC3390x0 interfaceC3390x0, g.c cVar) {
            return g.b.a.b(interfaceC3390x0, cVar);
        }

        public static /* synthetic */ InterfaceC3351d0 d(InterfaceC3390x0 interfaceC3390x0, boolean z8, boolean z9, Function1 function1, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    z8 = false;
                }
                if ((i8 & 2) != 0) {
                    z9 = true;
                }
                return interfaceC3390x0.n(z8, z9, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static S5.g e(InterfaceC3390x0 interfaceC3390x0, g.c cVar) {
            return g.b.a.c(interfaceC3390x0, cVar);
        }

        public static S5.g f(InterfaceC3390x0 interfaceC3390x0, S5.g gVar) {
            return g.b.a.d(interfaceC3390x0, gVar);
        }
    }

    /* renamed from: l6.x0$b */
    /* loaded from: classes5.dex */
    public static final class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f34662a = new b();

        private b() {
        }
    }

    InterfaceC3383u A(InterfaceC3387w interfaceC3387w);

    boolean b();

    void cancel(CancellationException cancellationException);

    InterfaceC2998g g();

    InterfaceC3390x0 getParent();

    boolean isActive();

    boolean isCancelled();

    InterfaceC3351d0 n(boolean z8, boolean z9, Function1 function1);

    CancellationException o();

    InterfaceC3351d0 s(Function1 function1);

    boolean start();

    Object y(S5.d dVar);
}
