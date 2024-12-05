package b5;

import H4.j;
import O5.I;
import O5.t;
import a5.C1635b;
import a5.C1639f;
import a5.C1645l;
import a5.O;
import a5.x;
import a6.InterfaceC1668n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import j6.n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3661a;
import o5.C3667g;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3679s;
import o5.C3683w;

/* renamed from: b5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1978c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15497a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static String f15498b;

    /* renamed from: c, reason: collision with root package name */
    private static long f15499c;

    /* renamed from: b5.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b5.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f15500a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15501b;

        /* renamed from: d, reason: collision with root package name */
        int f15503d;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15501b = obj;
            this.f15503d |= Integer.MIN_VALUE;
            return C1978c.this.c(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b5.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0369c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f15505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1978c f15507d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0369c(Context context, String str, C1978c c1978c, S5.d dVar) {
            super(2, dVar);
            this.f15505b = context;
            this.f15506c = str;
            this.f15507d = c1978c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0369c(this.f15505b, this.f15506c, this.f15507d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            long j8;
            boolean z8;
            String str2;
            Object e8 = T5.b.e();
            int i8 = this.f15504a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3674n a8 = C3674n.f36505t.a(this.f15505b);
                a8.a();
                O u02 = a8.u0(this.f15506c);
                if (u02 != null) {
                    str = u02.l();
                } else {
                    str = null;
                }
                if (str != null) {
                    j8 = new C3661a().d(this.f15505b, u02.l());
                    if (SettingsPreferences.f30353b.R(this.f15505b)) {
                        new C3661a().a(this.f15505b, u02.l());
                        new C3661a().b(this.f15505b, u02.l());
                    }
                    a8.M(this.f15506c);
                    String l8 = u02.l();
                    AbstractC3255y.f(l8);
                    a8.D(l8);
                } else {
                    j8 = 0;
                }
                long j9 = j8;
                a8.l();
                String h8 = new C3667g().h(this.f15505b, this.f15506c);
                boolean s8 = n.s(this.f15505b.getPackageName(), h8, true);
                if (!s8 && h8 == null) {
                    N4.a h9 = j.f3824g.h();
                    if (h9 != null) {
                        str2 = h9.b();
                    } else {
                        str2 = null;
                    }
                    z8 = n.s(str2, this.f15506c, true);
                } else {
                    z8 = s8;
                }
                this.f15507d.e(z8, new C3667g().z(this.f15505b, this.f15506c), this.f15506c, this.f15505b, j9);
                UptodownApp.a aVar = UptodownApp.f29058B;
                String str3 = this.f15506c;
                this.f15504a = 1;
                if (aVar.O0(str3, true, this) == e8) {
                    return e8;
                }
            }
            UptodownApp.a.N0(UptodownApp.f29058B, this.f15505b, false, 2, null);
            C3683w.f36547a.e(this.f15505b);
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0369c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b5.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f15509b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BroadcastReceiver.PendingResult pendingResult, S5.d dVar) {
            super(2, dVar);
            this.f15509b = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f15509b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f15508a == 0) {
                t.b(obj);
                this.f15509b.finish();
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: b5.c$e */
    /* loaded from: classes5.dex */
    static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15510a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15512c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f15513d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f15514e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, BroadcastReceiver.PendingResult pendingResult, Context context, S5.d dVar) {
            super(2, dVar);
            this.f15512c = str;
            this.f15513d = pendingResult;
            this.f15514e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f15512c, this.f15513d, this.f15514e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f15510a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C1978c c1978c = C1978c.this;
                String packagename = this.f15512c;
                AbstractC3255y.h(packagename, "packagename");
                BroadcastReceiver.PendingResult pendingResult = this.f15513d;
                AbstractC3255y.h(pendingResult, "pendingResult");
                Context context = this.f15514e;
                this.f15510a = 1;
                if (c1978c.c(packagename, pendingResult, context, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, android.content.BroadcastReceiver.PendingResult r8, android.content.Context r9, S5.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof b5.C1978c.b
            if (r0 == 0) goto L13
            r0 = r10
            b5.c$b r0 = (b5.C1978c.b) r0
            int r1 = r0.f15503d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15503d = r1
            goto L18
        L13:
            b5.c$b r0 = new b5.c$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15501b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f15503d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r10)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f15500a
            r8 = r7
            android.content.BroadcastReceiver$PendingResult r8 = (android.content.BroadcastReceiver.PendingResult) r8
            O5.t.b(r10)
            goto L55
        L3e:
            O5.t.b(r10)
            l6.I r10 = l6.C3347b0.b()
            b5.c$c r2 = new b5.c$c
            r2.<init>(r9, r7, r6, r5)
            r0.f15500a = r8
            r0.f15503d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r10, r2, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            b5.c$d r9 = new b5.c$d
            r9.<init>(r8, r5)
            r0.f15500a = r5
            r0.f15503d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r9, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C1978c.c(java.lang.String, android.content.BroadcastReceiver$PendingResult, android.content.Context, S5.d):java.lang.Object");
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
    public final void e(boolean z8, C1639f c1639f, String str, Context context, long j8) {
        if (z8) {
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            d(context, str, bundle);
            bundle.putString("type", "success");
            bundle.putInt("update", 1);
            if (j8 > 0) {
                bundle.putString("size", C3679s.f36530a.d(j8));
            }
            new C3678r(context).b("install", bundle);
            f(context, c1639f);
        }
    }

    private final void f(Context context, C1639f c1639f) {
        if (!UptodownApp.f29058B.Q() && c1639f != null) {
            C1635b c1635b = new C1635b();
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            c1635b.k(c1639f, a8);
            a8.l();
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
            if (n.s(action, "android.intent.action.PACKAGE_REPLACED", true) && (data = intent.getData()) != null) {
                String schemeSpecificPart = data.getSchemeSpecificPart();
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (schemeSpecificPart != null && booleanExtra) {
                    String str = action + schemeSpecificPart;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (n.s(str, f15498b, true) && currentTimeMillis - f15499c <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        z8 = false;
                    }
                    f15499c = currentTimeMillis;
                    f15498b = str;
                    if (z8) {
                        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new e(schemeSpecificPart, goAsync(), a8, null), 3, null);
                    }
                }
            }
        }
    }
}
