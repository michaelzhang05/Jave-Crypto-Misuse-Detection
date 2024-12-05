package Y4;

import E4.j;
import L5.I;
import L5.t;
import X4.C1492b;
import X4.C1496f;
import X4.C1502l;
import X4.O;
import X4.x;
import X5.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3313a;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3331s;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13212a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static String f13213b;

    /* renamed from: c, reason: collision with root package name */
    private static long f13214c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13215a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13216b;

        /* renamed from: d, reason: collision with root package name */
        int f13218d;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13216b = obj;
            this.f13218d |= Integer.MIN_VALUE;
            return c.this.c(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y4.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0255c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13219a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13221c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f13222d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0255c(Context context, String str, c cVar, P5.d dVar) {
            super(2, dVar);
            this.f13220b = context;
            this.f13221c = str;
            this.f13222d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0255c(this.f13220b, this.f13221c, this.f13222d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0255c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            long j8;
            boolean z8;
            String str2;
            Object e8 = Q5.b.e();
            int i8 = this.f13219a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3326n a8 = C3326n.f34504t.a(this.f13220b);
                a8.a();
                O u02 = a8.u0(this.f13221c);
                if (u02 != null) {
                    str = u02.j();
                } else {
                    str = null;
                }
                if (str != null) {
                    j8 = new C3313a().d(this.f13220b, u02.j());
                    if (SettingsPreferences.f29323b.R(this.f13220b)) {
                        new C3313a().a(this.f13220b, u02.j());
                        new C3313a().b(this.f13220b, u02.j());
                    }
                    a8.M(this.f13221c);
                    String j9 = u02.j();
                    AbstractC3159y.f(j9);
                    a8.A(j9);
                } else {
                    j8 = 0;
                }
                long j10 = j8;
                a8.g();
                String h8 = new C3319g().h(this.f13220b, this.f13221c);
                boolean s8 = g6.n.s(this.f13220b.getPackageName(), h8, true);
                if (!s8 && h8 == null) {
                    K4.a h9 = j.f2274g.h();
                    if (h9 != null) {
                        str2 = h9.b();
                    } else {
                        str2 = null;
                    }
                    z8 = g6.n.s(str2, this.f13221c, true);
                } else {
                    z8 = s8;
                }
                this.f13222d.e(z8, new C3319g().z(this.f13220b, this.f13221c), this.f13221c, this.f13220b, j10);
                UptodownApp.a aVar = UptodownApp.f28003B;
                String str3 = this.f13221c;
                this.f13219a = 1;
                if (aVar.O0(str3, true, this) == e8) {
                    return e8;
                }
            }
            UptodownApp.a.N0(UptodownApp.f28003B, this.f13220b, false, 2, null);
            C3335w.f34546a.e(this.f13220b);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13223a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f13224b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BroadcastReceiver.PendingResult pendingResult, P5.d dVar) {
            super(2, dVar);
            this.f13224b = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f13224b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f13223a == 0) {
                t.b(obj);
                this.f13224b.finish();
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13225a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13227c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f13228d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f13229e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, BroadcastReceiver.PendingResult pendingResult, Context context, P5.d dVar) {
            super(2, dVar);
            this.f13227c = str;
            this.f13228d = pendingResult;
            this.f13229e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f13227c, this.f13228d, this.f13229e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f13225a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                String packagename = this.f13227c;
                AbstractC3159y.h(packagename, "packagename");
                BroadcastReceiver.PendingResult pendingResult = this.f13228d;
                AbstractC3159y.h(pendingResult, "pendingResult");
                Context context = this.f13229e;
                this.f13225a = 1;
                if (cVar.c(packagename, pendingResult, context, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
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
    public final java.lang.Object c(java.lang.String r7, android.content.BroadcastReceiver.PendingResult r8, android.content.Context r9, P5.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof Y4.c.b
            if (r0 == 0) goto L13
            r0 = r10
            Y4.c$b r0 = (Y4.c.b) r0
            int r1 = r0.f13218d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13218d = r1
            goto L18
        L13:
            Y4.c$b r0 = new Y4.c$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f13216b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f13218d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r10)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f13215a
            r8 = r7
            android.content.BroadcastReceiver$PendingResult r8 = (android.content.BroadcastReceiver.PendingResult) r8
            L5.t.b(r10)
            goto L55
        L3e:
            L5.t.b(r10)
            i6.I r10 = i6.C2812b0.b()
            Y4.c$c r2 = new Y4.c$c
            r2.<init>(r9, r7, r6, r5)
            r0.f13215a = r8
            r0.f13218d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r10, r2, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            Y4.c$d r9 = new Y4.c$d
            r9.<init>(r8, r5)
            r0.f13215a = r5
            r0.f13218d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r9, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.c.c(java.lang.String, android.content.BroadcastReceiver$PendingResult, android.content.Context, P5.d):java.lang.Object");
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
    public final void e(boolean z8, C1496f c1496f, String str, Context context, long j8) {
        if (z8) {
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            d(context, str, bundle);
            bundle.putString("type", "success");
            bundle.putInt("update", 1);
            if (j8 > 0) {
                bundle.putString("size", C3331s.f34529a.d(j8));
            }
            new C3330r(context).b("install", bundle);
            f(context, c1496f);
        }
    }

    private final void f(Context context, C1496f c1496f) {
        if (!UptodownApp.f28003B.Q() && c1496f != null) {
            C1492b c1492b = new C1492b();
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            c1492b.k(c1496f, a8);
            a8.g();
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
            if (g6.n.s(action, "android.intent.action.PACKAGE_REPLACED", true) && (data = intent.getData()) != null) {
                String schemeSpecificPart = data.getSchemeSpecificPart();
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (schemeSpecificPart != null && booleanExtra) {
                    String str = action + schemeSpecificPart;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (g6.n.s(str, f13213b, true) && currentTimeMillis - f13214c <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        z8 = false;
                    }
                    f13214c = currentTimeMillis;
                    f13213b = str;
                    if (z8) {
                        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new e(schemeSpecificPart, goAsync(), a8, null), 3, null);
                    }
                }
            }
        }
    }
}
