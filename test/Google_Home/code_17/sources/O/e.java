package O;

import O.a;
import P.C1356a;
import P.C1357b;
import P.q;
import P.y;
import Q.AbstractC1387c;
import Q.AbstractC1400p;
import Q.C1388d;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC2062b;
import com.google.android.gms.common.api.internal.AbstractC2064d;
import com.google.android.gms.common.api.internal.C2063c;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import q0.C3826j;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7798a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7799b;

    /* renamed from: c, reason: collision with root package name */
    private final O.a f7800c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f7801d;

    /* renamed from: e, reason: collision with root package name */
    private final C1357b f7802e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f7803f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7804g;

    /* renamed from: h, reason: collision with root package name */
    private final f f7805h;

    /* renamed from: i, reason: collision with root package name */
    private final P.k f7806i;

    /* renamed from: j, reason: collision with root package name */
    protected final C2063c f7807j;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f7808c = new C0145a().a();

        /* renamed from: a, reason: collision with root package name */
        public final P.k f7809a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f7810b;

        /* renamed from: O.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0145a {

            /* renamed from: a, reason: collision with root package name */
            private P.k f7811a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f7812b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f7811a == null) {
                    this.f7811a = new C1356a();
                }
                if (this.f7812b == null) {
                    this.f7812b = Looper.getMainLooper();
                }
                return new a(this.f7811a, this.f7812b);
            }

            public C0145a b(P.k kVar) {
                AbstractC1400p.m(kVar, "StatusExceptionMapper must not be null.");
                this.f7811a = kVar;
                return this;
            }
        }

        private a(P.k kVar, Account account, Looper looper) {
            this.f7809a = kVar;
            this.f7810b = looper;
        }
    }

    private e(Context context, Activity activity, O.a aVar, a.d dVar, a aVar2) {
        String h8;
        AbstractC1400p.m(context, "Null context is not permitted.");
        AbstractC1400p.m(aVar, "Api must not be null.");
        AbstractC1400p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC1400p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f7798a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            h8 = context.getAttributionTag();
        } else {
            h8 = h(context);
        }
        this.f7799b = h8;
        this.f7800c = aVar;
        this.f7801d = dVar;
        this.f7803f = aVar2.f7810b;
        C1357b a8 = C1357b.a(aVar, dVar, h8);
        this.f7802e = a8;
        this.f7805h = new q(this);
        C2063c u8 = C2063c.u(context2);
        this.f7807j = u8;
        this.f7804g = u8.l();
        this.f7806i = aVar2.f7809a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, u8, a8);
        }
        u8.F(this);
    }

    private final AbstractC2062b q(int i8, AbstractC2062b abstractC2062b) {
        abstractC2062b.i();
        this.f7807j.A(this, i8, abstractC2062b);
        return abstractC2062b;
    }

    private final Task r(int i8, AbstractC2064d abstractC2064d) {
        C3826j c3826j = new C3826j();
        this.f7807j.B(this, i8, abstractC2064d, c3826j, this.f7806i);
        return c3826j.a();
    }

    public f b() {
        return this.f7805h;
    }

    protected C1388d.a c() {
        Account account;
        C1388d.a aVar = new C1388d.a();
        a.d dVar = this.f7801d;
        if (dVar instanceof a.d.InterfaceC0144a) {
            account = ((a.d.InterfaceC0144a) dVar).l();
        } else {
            account = null;
        }
        aVar.d(account);
        aVar.c(Collections.emptySet());
        aVar.e(this.f7798a.getClass().getName());
        aVar.b(this.f7798a.getPackageName());
        return aVar;
    }

    public Task d(AbstractC2064d abstractC2064d) {
        return r(2, abstractC2064d);
    }

    public Task e(AbstractC2064d abstractC2064d) {
        return r(0, abstractC2064d);
    }

    public AbstractC2062b f(AbstractC2062b abstractC2062b) {
        q(1, abstractC2062b);
        return abstractC2062b;
    }

    public Task g(AbstractC2064d abstractC2064d) {
        return r(1, abstractC2064d);
    }

    protected String h(Context context) {
        return null;
    }

    public final C1357b i() {
        return this.f7802e;
    }

    public a.d j() {
        return this.f7801d;
    }

    public Context k() {
        return this.f7798a;
    }

    protected String l() {
        return this.f7799b;
    }

    public Looper m() {
        return this.f7803f;
    }

    public final int n() {
        return this.f7804g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f o(Looper looper, n nVar) {
        C1388d a8 = c().a();
        a.f a9 = ((a.AbstractC0143a) AbstractC1400p.l(this.f7800c.a())).a(this.f7798a, looper, a8, this.f7801d, nVar, nVar);
        String l8 = l();
        if (l8 != null && (a9 instanceof AbstractC1387c)) {
            ((AbstractC1387c) a9).P(l8);
        }
        if (l8 != null && (a9 instanceof P.g)) {
            android.support.v4.media.a.a(a9);
            throw null;
        }
        return a9;
    }

    public final y p(Context context, Handler handler) {
        return new y(context, handler, c().a());
    }

    public e(Context context, O.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
