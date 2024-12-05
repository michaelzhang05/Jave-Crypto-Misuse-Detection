package Y4;

import E4.j;
import L5.I;
import L5.t;
import X4.C1496f;
import X4.C1500j;
import X4.C1502l;
import X4.C1505o;
import X4.C1510u;
import X4.x;
import X5.n;
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
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import java.io.File;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3313a;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3331s;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final C0252a f13183a = new C0252a(null);

    /* renamed from: b, reason: collision with root package name */
    private static String f13184b;

    /* renamed from: c, reason: collision with root package name */
    private static long f13185c;

    /* renamed from: Y4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0252a {
        private C0252a() {
        }

        public /* synthetic */ C0252a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13186a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13187b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13188c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f13189d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f13190e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Y4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0253a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f13191a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f13192b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0253a(BroadcastReceiver.PendingResult pendingResult, P5.d dVar) {
                super(2, dVar);
                this.f13192b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0253a(this.f13192b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0253a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f13191a == 0) {
                    t.b(obj);
                    this.f13192b.finish();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str, a aVar, BroadcastReceiver.PendingResult pendingResult, P5.d dVar) {
            super(2, dVar);
            this.f13187b = context;
            this.f13188c = str;
            this.f13189d = aVar;
            this.f13190e = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f13187b, this.f13188c, this.f13189d, this.f13190e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = Q5.b.e();
            int i8 = this.f13186a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                String h8 = new C3319g().h(this.f13187b, this.f13188c);
                boolean s8 = g6.n.s(this.f13187b.getPackageName(), h8, true);
                if (!s8 && h8 == null) {
                    K4.a h9 = j.f2274g.h();
                    if (h9 != null) {
                        str = h9.b();
                    } else {
                        str = null;
                    }
                    s8 = g6.n.s(str, this.f13188c, true);
                }
                this.f13189d.e(s8, new C3319g().z(this.f13187b, this.f13188c), this.f13188c, this.f13187b);
                UptodownApp.a aVar = UptodownApp.f28003B;
                String str2 = this.f13188c;
                this.f13186a = 1;
                if (aVar.O0(str2, false, this) == e8) {
                    return e8;
                }
            }
            UptodownApp.a.N0(UptodownApp.f28003B, this.f13187b, false, 2, null);
            J0 c8 = C2812b0.c();
            C0253a c0253a = new C0253a(this.f13190e, null);
            this.f13186a = 2;
            if (AbstractC2825i.g(c8, c0253a, this) == e8) {
                return e8;
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13193a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13195c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f13196d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f13197e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, BroadcastReceiver.PendingResult pendingResult, Context context, P5.d dVar) {
            super(2, dVar);
            this.f13195c = str;
            this.f13196d = pendingResult;
            this.f13197e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f13195c, this.f13196d, this.f13197e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f13193a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = a.this;
                String packagename = this.f13195c;
                AbstractC3159y.h(packagename, "packagename");
                BroadcastReceiver.PendingResult pendingResult = this.f13196d;
                AbstractC3159y.h(pendingResult, "pendingResult");
                Context context = this.f13197e;
                this.f13193a = 1;
                if (aVar.c(packagename, pendingResult, context, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(String str, BroadcastReceiver.PendingResult pendingResult, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(context, str, this, pendingResult, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void d(Context context, String str, Bundle bundle) {
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (aVar.p() != null) {
            C1502l p8 = aVar.p();
            AbstractC3159y.f(p8);
            String i8 = new C3329q().i(p8.c());
            if (i8 != null && g6.n.s(i8, str, true)) {
                bundle.putString("source", "deeplink");
                aVar.r0(null);
                new C3323k().j(context, str, i8);
                return;
            }
            return;
        }
        x b8 = x.f12727f.b(context);
        if (b8 != null && g6.n.s(b8.d(), str, true)) {
            bundle.putString("source", "notification_fcm");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean z8, C1496f c1496f, String str, Context context) {
        Long l8;
        long j8;
        if (z8) {
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            d(context, str, bundle);
            g(context, c1496f);
            if (c1496f != null) {
                l8 = Long.valueOf(c1496f.f0());
            } else {
                l8 = null;
            }
            if (l8 != null) {
                C3326n a8 = C3326n.f34504t.a(context);
                a8.a();
                C1505o b02 = a8.b0(str, c1496f.f0());
                if (b02 != null) {
                    j8 = new C3313a().d(context, b02.X());
                    if (SettingsPreferences.f29323b.R(context)) {
                        new C3313a().a(context, b02.X());
                        a8.x(b02);
                    }
                    f(context, str, b02, bundle);
                } else {
                    j8 = 0;
                }
                a8.g();
            } else {
                j8 = 0;
            }
            bundle.putString("type", "success");
            bundle.putInt("update", 0);
            if (j8 > 0) {
                bundle.putString("size", C3331s.f34529a.d(j8));
            }
            new C3330r(context).b("install", bundle);
            C3335w.f34546a.k(context, str);
        }
    }

    private final void f(Context context, String str, C1505o c1505o, Bundle bundle) {
        C1500j d8 = C1500j.f12630n.d(context);
        if (d8 != null && g6.n.s(d8.r(), str, true) && d8.m() == c1505o.G()) {
            d8.i(context);
            bundle.putString("source", d8.s());
            return;
        }
        C1510u d9 = C1510u.f12716n.d(context);
        if (d9 != null && g6.n.s(d9.r(), str, true) && d9.m() == c1505o.G()) {
            d9.i(context);
            bundle.putString("source", d9.s());
        }
    }

    private final void g(Context context, C1496f c1496f) {
        SettingsPreferences.a aVar;
        String d8;
        if (c1496f != null && (d8 = (aVar = SettingsPreferences.f29323b).d(context)) != null) {
            File file = new File(new C3329q().f(context), d8);
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            C1505o Y7 = a8.Y(name);
            a8.g();
            if (Y7 != null) {
                c1496f.t0(1);
                c1496f.J0(C1496f.c.UPDATED);
                a8.a();
                a8.j1(c1496f);
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                a8.M(Q8);
                a8.g();
                new C3329q().c(context);
                aVar.w0(context, null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(intent, "intent");
        Context a8 = j.f2274g.a(context);
        String action = intent.getAction();
        if (action != null) {
            boolean z8 = true;
            if (g6.n.s(action, "android.intent.action.PACKAGE_ADDED", true) && (data = intent.getData()) != null) {
                String schemeSpecificPart = data.getSchemeSpecificPart();
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (schemeSpecificPart != null && !booleanExtra && UptodownApp.f28003B.Q()) {
                    C3307A c3307a = C3307A.f34473a;
                    if (c3307a.d().size() > 0) {
                        Object obj = c3307a.d().get(c3307a.d().size() - 1);
                        AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                        Activity activity = (Activity) obj;
                        if (activity instanceof MainActivity) {
                            activity.runOnUiThread(new MainActivity.RunnableC2484g((MainActivity) activity, getResultCode(), schemeSpecificPart));
                            return;
                        }
                        String str = action + schemeSpecificPart;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (g6.n.s(str, f13184b, true) && currentTimeMillis - f13185c <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                            z8 = false;
                        }
                        f13185c = currentTimeMillis;
                        f13184b = str;
                        if (z8) {
                            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new c(schemeSpecificPart, goAsync(), a8, null), 3, null);
                        }
                    }
                }
            }
        }
    }
}
