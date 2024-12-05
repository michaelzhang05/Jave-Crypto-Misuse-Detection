package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.ranges.f;
import kotlin.u;
import kotlinx.coroutines.l;
import kotlinx.coroutines.p0;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class a extends kotlinx.coroutines.android.b implements p0 {
    private volatile a _immediate;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f22128g;

    /* renamed from: h, reason: collision with root package name */
    private final String f22129h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f22130i;

    /* renamed from: j, reason: collision with root package name */
    private final a f22131j;

    /* compiled from: Runnable.kt */
    /* renamed from: kotlinx.coroutines.android.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class RunnableC0380a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l f22132f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f22133g;

        public RunnableC0380a(l lVar, a aVar) {
            this.f22132f = lVar;
            this.f22133g = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22132f.e(this.f22133g, u.a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<Throwable, u> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Runnable f22135g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f22135g = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ u invoke(Throwable th) {
            invoke2(th);
            return u.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            a.this.f22128g.removeCallbacks(this.f22135g);
        }
    }

    private a(Handler handler, String str, boolean z) {
        super(null);
        this.f22128g = handler;
        this.f22129h = str;
        this.f22130i = z;
        this._immediate = z ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
            u uVar = u.a;
        }
        this.f22131j = aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f22128g == this.f22128g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f22128g);
    }

    @Override // kotlinx.coroutines.p0
    public void o(long j2, l<? super u> lVar) {
        long e2;
        RunnableC0380a runnableC0380a = new RunnableC0380a(lVar, this);
        Handler handler = this.f22128g;
        e2 = f.e(j2, 4611686018427387903L);
        handler.postDelayed(runnableC0380a, e2);
        lVar.d(new b(runnableC0380a));
    }

    @Override // kotlinx.coroutines.c0
    public void s0(CoroutineContext coroutineContext, Runnable runnable) {
        this.f22128g.post(runnable);
    }

    @Override // kotlinx.coroutines.c0
    public boolean t0(CoroutineContext coroutineContext) {
        return (this.f22130i && kotlin.jvm.internal.l.a(Looper.myLooper(), this.f22128g.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.u1, kotlinx.coroutines.c0
    public String toString() {
        String v0 = v0();
        if (v0 != null) {
            return v0;
        }
        String str = this.f22129h;
        if (str == null) {
            str = this.f22128g.toString();
        }
        return this.f22130i ? kotlin.jvm.internal.l.m(str, ".immediate") : str;
    }

    @Override // kotlinx.coroutines.u1
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public a u0() {
        return this.f22131j;
    }

    public /* synthetic */ a(Handler handler, String str, int i2, g gVar) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    public a(Handler handler, String str) {
        this(handler, str, false);
    }
}
