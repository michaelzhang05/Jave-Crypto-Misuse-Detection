package b5;

import H4.j;
import O5.I;
import O5.t;
import a5.C1639f;
import a5.C1643j;
import a5.C1645l;
import a5.C1648o;
import a5.C1653u;
import a5.x;
import a6.InterfaceC1668n;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import j6.n;
import java.io.File;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.N;
import o5.C3655A;
import o5.C3661a;
import o5.C3667g;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3679s;
import o5.C3683w;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1976a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final C0366a f15468a = new C0366a(null);

    /* renamed from: b, reason: collision with root package name */
    private static String f15469b;

    /* renamed from: c, reason: collision with root package name */
    private static long f15470c;

    /* renamed from: b5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0366a {
        private C0366a() {
        }

        public /* synthetic */ C0366a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b5.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f15472b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15473c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1976a f15474d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f15475e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b5.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0367a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f15476a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f15477b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0367a(BroadcastReceiver.PendingResult pendingResult, S5.d dVar) {
                super(2, dVar);
                this.f15477b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0367a(this.f15477b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f15476a == 0) {
                    t.b(obj);
                    this.f15477b.finish();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0367a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str, C1976a c1976a, BroadcastReceiver.PendingResult pendingResult, S5.d dVar) {
            super(2, dVar);
            this.f15472b = context;
            this.f15473c = str;
            this.f15474d = c1976a;
            this.f15475e = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f15472b, this.f15473c, this.f15474d, this.f15475e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = T5.b.e();
            int i8 = this.f15471a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                String h8 = new C3667g().h(this.f15472b, this.f15473c);
                boolean s8 = n.s(this.f15472b.getPackageName(), h8, true);
                if (!s8 && h8 == null) {
                    N4.a h9 = j.f3824g.h();
                    if (h9 != null) {
                        str = h9.b();
                    } else {
                        str = null;
                    }
                    s8 = n.s(str, this.f15473c, true);
                }
                this.f15474d.e(s8, new C3667g().z(this.f15472b, this.f15473c), this.f15473c, this.f15472b);
                UptodownApp.a aVar = UptodownApp.f29058B;
                String str2 = this.f15473c;
                this.f15471a = 1;
                if (aVar.O0(str2, false, this) == e8) {
                    return e8;
                }
            }
            UptodownApp.a.N0(UptodownApp.f29058B, this.f15472b, false, 2, null);
            J0 c8 = C3347b0.c();
            C0367a c0367a = new C0367a(this.f15475e, null);
            this.f15471a = 2;
            if (AbstractC3360i.g(c8, c0367a, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: b5.a$c */
    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15478a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15480c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f15481d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f15482e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, BroadcastReceiver.PendingResult pendingResult, Context context, S5.d dVar) {
            super(2, dVar);
            this.f15480c = str;
            this.f15481d = pendingResult;
            this.f15482e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f15480c, this.f15481d, this.f15482e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f15478a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C1976a c1976a = C1976a.this;
                String packagename = this.f15480c;
                AbstractC3255y.h(packagename, "packagename");
                BroadcastReceiver.PendingResult pendingResult = this.f15481d;
                AbstractC3255y.h(pendingResult, "pendingResult");
                Context context = this.f15482e;
                this.f15478a = 1;
                if (c1976a.c(packagename, pendingResult, context, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(String str, BroadcastReceiver.PendingResult pendingResult, Context context, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(context, str, this, pendingResult, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void d(Context context, String str, Bundle bundle) {
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.p() != null) {
            C1645l p8 = aVar.p();
            AbstractC3255y.f(p8);
            String i8 = new C3677q().i(p8.c());
            if (i8 != null && n.s(i8, str, true)) {
                bundle.putString("source", "deeplink");
                aVar.r0(null);
                new C3671k().j(context, str, i8);
                return;
            }
            return;
        }
        x b8 = x.f14348f.b(context);
        if (b8 != null && n.s(b8.d(), str, true)) {
            bundle.putString("source", "notification_fcm");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean z8, C1639f c1639f, String str, Context context) {
        Long l8;
        long j8;
        if (z8) {
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            d(context, str, bundle);
            g(context, c1639f);
            if (c1639f != null) {
                l8 = Long.valueOf(c1639f.f0());
            } else {
                l8 = null;
            }
            if (l8 != null) {
                C3674n a8 = C3674n.f36505t.a(context);
                a8.a();
                C1648o b02 = a8.b0(str, c1639f.f0());
                if (b02 != null) {
                    j8 = new C3661a().d(context, b02.X());
                    if (SettingsPreferences.f30353b.R(context)) {
                        new C3661a().a(context, b02.X());
                        a8.A(b02);
                    }
                    f(context, str, b02, bundle);
                } else {
                    j8 = 0;
                }
                a8.l();
            } else {
                j8 = 0;
            }
            bundle.putString("type", "success");
            bundle.putInt("update", 0);
            if (j8 > 0) {
                bundle.putString("size", C3679s.f36530a.d(j8));
            }
            new C3678r(context).b("install", bundle);
            C3683w.f36547a.k(context, str);
        }
    }

    private final void f(Context context, String str, C1648o c1648o, Bundle bundle) {
        C1643j d8 = C1643j.f14251n.d(context);
        if (d8 != null && n.s(d8.r(), str, true) && d8.m() == c1648o.y()) {
            d8.i(context);
            bundle.putString("source", d8.s());
            return;
        }
        C1653u d9 = C1653u.f14337n.d(context);
        if (d9 != null && n.s(d9.r(), str, true) && d9.m() == c1648o.y()) {
            d9.i(context);
            bundle.putString("source", d9.s());
        }
    }

    private final void g(Context context, C1639f c1639f) {
        SettingsPreferences.a aVar;
        String d8;
        if (c1639f != null && (d8 = (aVar = SettingsPreferences.f30353b).d(context)) != null) {
            File file = new File(new C3677q().f(context), d8);
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            String name = file.getName();
            AbstractC3255y.h(name, "file.name");
            C1648o Y7 = a8.Y(name);
            a8.l();
            if (Y7 != null) {
                c1639f.t0(1);
                c1639f.J0(C1639f.c.UPDATED);
                a8.a();
                a8.j1(c1639f);
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                a8.M(J8);
                a8.l();
                new C3677q().c(context);
                aVar.w0(context, null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(intent, "intent");
        Context a8 = j.f3824g.a(context);
        String action = intent.getAction();
        if (action != null) {
            boolean z8 = true;
            if (n.s(action, "android.intent.action.PACKAGE_ADDED", true) && (data = intent.getData()) != null) {
                String schemeSpecificPart = data.getSchemeSpecificPart();
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (schemeSpecificPart != null && !booleanExtra && UptodownApp.f29058B.Q()) {
                    C3655A c3655a = C3655A.f36474a;
                    if (c3655a.d().size() > 0) {
                        Object obj = c3655a.d().get(c3655a.d().size() - 1);
                        AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                        Activity activity = (Activity) obj;
                        if (activity instanceof MainActivity) {
                            activity.runOnUiThread(new MainActivity.RunnableC2678g((MainActivity) activity, getResultCode(), schemeSpecificPart));
                            return;
                        }
                        String str = action + schemeSpecificPart;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (n.s(str, f15469b, true) && currentTimeMillis - f15470c <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                            z8 = false;
                        }
                        f15470c = currentTimeMillis;
                        f15469b = str;
                        if (z8) {
                            AbstractC3364k.d(N.a(C3347b0.b()), null, null, new c(schemeSpecificPart, goAsync(), a8, null), 3, null);
                        }
                    }
                }
            }
        }
    }
}
