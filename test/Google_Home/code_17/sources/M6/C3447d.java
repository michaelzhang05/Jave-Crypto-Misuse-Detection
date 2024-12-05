package m6;

import O5.I;
import S5.g;
import android.os.Handler;
import android.os.Looper;
import g6.m;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.B0;
import l6.C3347b0;
import l6.InterfaceC3351d0;
import l6.InterfaceC3372o;
import l6.M0;
import l6.W;

/* renamed from: m6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3447d extends AbstractC3448e implements W {
    private volatile C3447d _immediate;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35260a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35261b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35262c;

    /* renamed from: d, reason: collision with root package name */
    private final C3447d f35263d;

    /* renamed from: m6.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3372o f35264a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3447d f35265b;

        public a(InterfaceC3372o interfaceC3372o, C3447d c3447d) {
            this.f35264a = interfaceC3372o;
            this.f35265b = c3447d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35264a.h(this.f35265b, I.f8278a);
        }
    }

    /* renamed from: m6.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f35267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f35267b = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8278a;
        }

        public final void invoke(Throwable th) {
            C3447d.this.f35260a.removeCallbacks(this.f35267b);
        }
    }

    private C3447d(Handler handler, String str, boolean z8) {
        super(null);
        this.f35260a = handler;
        this.f35261b = str;
        this.f35262c = z8;
        this._immediate = z8 ? this : null;
        C3447d c3447d = this._immediate;
        if (c3447d == null) {
            c3447d = new C3447d(handler, str, true);
            this._immediate = c3447d;
        }
        this.f35263d = c3447d;
    }

    private final void J(g gVar, Runnable runnable) {
        B0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C3347b0.b().dispatch(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(C3447d c3447d, Runnable runnable) {
        c3447d.f35260a.removeCallbacks(runnable);
    }

    @Override // m6.AbstractC3448e
    /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C3447d G() {
        return this.f35263d;
    }

    @Override // l6.I
    public void dispatch(g gVar, Runnable runnable) {
        if (!this.f35260a.post(runnable)) {
            J(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3447d) && ((C3447d) obj).f35260a == this.f35260a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f35260a);
    }

    @Override // l6.I
    public boolean isDispatchNeeded(g gVar) {
        if (this.f35262c && AbstractC3255y.d(Looper.myLooper(), this.f35260a.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // l6.W
    public InterfaceC3351d0 l(long j8, final Runnable runnable, g gVar) {
        if (this.f35260a.postDelayed(runnable, m.h(j8, 4611686018427387903L))) {
            return new InterfaceC3351d0() { // from class: m6.c
                @Override // l6.InterfaceC3351d0
                public final void dispose() {
                    C3447d.L(C3447d.this, runnable);
                }
            };
        }
        J(gVar, runnable);
        return M0.f34570a;
    }

    @Override // l6.I
    public String toString() {
        String F8 = F();
        if (F8 == null) {
            String str = this.f35261b;
            if (str == null) {
                str = this.f35260a.toString();
            }
            if (this.f35262c) {
                return str + ".immediate";
            }
            return str;
        }
        return F8;
    }

    @Override // l6.W
    public void v(long j8, InterfaceC3372o interfaceC3372o) {
        a aVar = new a(interfaceC3372o, this);
        if (this.f35260a.postDelayed(aVar, m.h(j8, 4611686018427387903L))) {
            interfaceC3372o.i(new b(aVar));
        } else {
            J(interfaceC3372o.getContext(), aVar);
        }
    }

    public /* synthetic */ C3447d(Handler handler, String str, int i8, AbstractC3247p abstractC3247p) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    public C3447d(Handler handler, String str) {
        this(handler, str, false);
    }
}
