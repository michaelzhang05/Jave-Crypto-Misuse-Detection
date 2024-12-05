package com.uptodown;

import H4.i;
import H4.j;
import I4.r;
import M4.f;
import O5.I;
import O5.t;
import Q4.q;
import V4.m;
import W4.C1496u;
import Z4.K;
import a5.C1639f;
import a5.C1645l;
import a5.C1646m;
import a5.C1648o;
import a5.H;
import a5.O;
import a5.Q;
import a6.InterfaceC1668n;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import b5.C1976a;
import b5.C1977b;
import b5.C1978c;
import b5.ResultReceiverC1982g;
import b5.ResultReceiverC1983h;
import b5.ResultReceiverC1984i;
import c5.C2047a;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.GetUserDataWorker;
import com.uptodown.workers.PreRegisterWorker;
import com.uptodown.workers.SearchApksWorker;
import com.uptodown.workers.TrackingWorker;
import d5.InterfaceC2755a;
import g2.InterfaceC2865e;
import j6.h;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.Y;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3655A;
import o5.C3659E;
import o5.C3667g;
import o5.C3671k;
import o5.C3674n;
import o5.C3678r;
import o5.C3680t;
import o5.C3682v;
import o5.C3683w;
import s5.C4003g;
import z0.InterfaceFutureC4218d;

/* loaded from: classes4.dex */
public final class UptodownApp extends j implements ChoiceCmpCallback {

    /* renamed from: D, reason: collision with root package name */
    private static String f29060D;

    /* renamed from: E, reason: collision with root package name */
    private static String f29061E;

    /* renamed from: F, reason: collision with root package name */
    private static String f29062F;

    /* renamed from: G, reason: collision with root package name */
    private static String f29063G;

    /* renamed from: H, reason: collision with root package name */
    private static String f29064H;

    /* renamed from: I, reason: collision with root package name */
    private static String f29065I;

    /* renamed from: J, reason: collision with root package name */
    private static String f29066J;

    /* renamed from: K, reason: collision with root package name */
    private static String f29067K;

    /* renamed from: L, reason: collision with root package name */
    private static String f29068L;

    /* renamed from: M, reason: collision with root package name */
    private static String f29069M;

    /* renamed from: N, reason: collision with root package name */
    private static int f29070N;

    /* renamed from: O, reason: collision with root package name */
    private static int f29071O;

    /* renamed from: P, reason: collision with root package name */
    private static int f29072P;

    /* renamed from: Q, reason: collision with root package name */
    private static int f29073Q;

    /* renamed from: R, reason: collision with root package name */
    private static int f29074R;

    /* renamed from: S, reason: collision with root package name */
    private static InterfaceC2865e f29075S;

    /* renamed from: T, reason: collision with root package name */
    private static InterfaceC2865e f29076T;

    /* renamed from: W, reason: collision with root package name */
    private static boolean f29079W;

    /* renamed from: X, reason: collision with root package name */
    private static int f29080X;

    /* renamed from: Y, reason: collision with root package name */
    private static int f29081Y;

    /* renamed from: Z, reason: collision with root package name */
    private static boolean f29082Z;

    /* renamed from: p0, reason: collision with root package name */
    private static C1645l f29083p0;

    /* renamed from: q0, reason: collision with root package name */
    private static boolean f29084q0;

    /* renamed from: s0, reason: collision with root package name */
    private static ArrayList f29086s0;

    /* renamed from: t0, reason: collision with root package name */
    private static boolean f29087t0;

    /* renamed from: u0, reason: collision with root package name */
    private static long f29088u0;

    /* renamed from: v0, reason: collision with root package name */
    private static ArrayList f29089v0;

    /* renamed from: A, reason: collision with root package name */
    private C1977b f29094A;

    /* renamed from: y, reason: collision with root package name */
    private C1976a f29095y;

    /* renamed from: z, reason: collision with root package name */
    private C1978c f29096z;

    /* renamed from: B, reason: collision with root package name */
    public static final a f29058B = new a(null);

    /* renamed from: C, reason: collision with root package name */
    private static float f29059C = 1.0f;

    /* renamed from: U, reason: collision with root package name */
    private static final HashMap f29077U = new HashMap();

    /* renamed from: V, reason: collision with root package name */
    private static ResultReceiverC1984i f29078V = new ResultReceiverC1984i(null);

    /* renamed from: r0, reason: collision with root package name */
    private static final Object f29085r0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    private static final Object f29090w0 = new Object();

    /* renamed from: x0, reason: collision with root package name */
    private static final Object f29091x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    private static final Object f29092y0 = new Object();

    /* renamed from: z0, reason: collision with root package name */
    private static final Object f29093z0 = new Object();

    /* renamed from: A0, reason: collision with root package name */
    private static ArrayList f29057A0 = new ArrayList();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: com.uptodown.UptodownApp$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0692a implements InterfaceC2755a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f29097a;

            C0692a(Context context) {
                this.f29097a = context;
            }

            @Override // d5.InterfaceC2755a
            public void a(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "failed");
                new C3678r(this.f29097a).b("uptodown_services_init", bundle);
            }

            @Override // d5.InterfaceC2755a
            public void b() {
                Bundle bundle = new Bundle();
                bundle.putString("type", "success");
                new C3678r(this.f29097a).b("uptodown_services_init", bundle);
            }

            @Override // d5.InterfaceC2755a
            public void c() {
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29098a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f29099b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InstallerActivity installerActivity, S5.d dVar) {
                super(2, dVar);
                this.f29099b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f29099b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29098a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InstallerActivity installerActivity = this.f29099b;
                    this.f29098a = 1;
                    if (installerActivity.k2(1, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29100a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29101b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29102c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Activity activity, String str, S5.d dVar) {
                super(2, dVar);
                this.f29101b = activity;
                this.f29102c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f29101b, this.f29102c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29100a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) this.f29101b;
                    String str = this.f29102c;
                    this.f29100a = 1;
                    if (oldVersionsActivity.E3(str, this) == e8) {
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

        /* loaded from: classes4.dex */
        static final class d extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29103a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29104b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29105c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f29106d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Activity activity, String str, boolean z8, S5.d dVar) {
                super(2, dVar);
                this.f29104b = activity;
                this.f29105c = str;
                this.f29106d = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f29104b, this.f29105c, this.f29106d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29103a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    MainActivity mainActivity = (MainActivity) this.f29104b;
                    String str = this.f29105c;
                    this.f29103a = 1;
                    if (mainActivity.z7(str, this) == e8) {
                        return e8;
                    }
                }
                if (this.f29106d) {
                    ((MainActivity) this.f29104b).F7();
                }
                ((MainActivity) this.f29104b).I7(this.f29105c);
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29107a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29108b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Activity activity, S5.d dVar) {
                super(2, dVar);
                this.f29108b = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f29108b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29107a == 0) {
                    t.b(obj);
                    ((MyDownloads) this.f29108b).n4(false);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        static final class f extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29109a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29110b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29111c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(Activity activity, String str, S5.d dVar) {
                super(2, dVar);
                this.f29110b = activity;
                this.f29111c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new f(this.f29110b, this.f29111c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29109a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    MyApps myApps = (MyApps) this.f29110b;
                    String str = this.f29111c;
                    this.f29109a = 1;
                    if (myApps.J4("app_updated", str, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        static final class g extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29112a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f29113b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f29114c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29115d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(boolean z8, Activity activity, String str, S5.d dVar) {
                super(2, dVar);
                this.f29113b = z8;
                this.f29114c = activity;
                this.f29115d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new g(this.f29113b, this.f29114c, this.f29115d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29112a;
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    if (this.f29113b) {
                        Updates updates = (Updates) this.f29114c;
                        String str = this.f29115d;
                        this.f29112a = 1;
                        if (updates.Q4("app_updated", str, this) == e8) {
                            return e8;
                        }
                    } else {
                        Updates updates2 = (Updates) this.f29114c;
                        String str2 = this.f29115d;
                        this.f29112a = 2;
                        if (updates2.Q4("app_installed", str2, this) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        static final class h extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29116a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f29117b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f29118c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(boolean z8, Activity activity, S5.d dVar) {
                super(2, dVar);
                this.f29117b = z8;
                this.f29118c = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new h(this.f29117b, this.f29118c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29116a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    if (this.f29117b) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = (AppInstalledDetailsActivity) this.f29118c;
                        this.f29116a = 1;
                        if (appInstalledDetailsActivity.S4("app_updated", this) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        static final class i extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29119a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29120b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29121c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(Activity activity, String str, S5.d dVar) {
                super(2, dVar);
                this.f29120b = activity;
                this.f29121c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new i(this.f29120b, this.f29121c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29119a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailActivity tvAppDetailActivity = (TvAppDetailActivity) this.f29120b;
                    String str = this.f29121c;
                    this.f29119a = 1;
                    if (tvAppDetailActivity.p(str, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        static final class j extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29122a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29123b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29124c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Activity activity, String str, S5.d dVar) {
                super(2, dVar);
                this.f29123b = activity;
                this.f29124c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new j(this.f29123b, this.f29124c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29122a == 0) {
                    t.b(obj);
                    ((WishlistActivity) this.f29123b).U4(this.f29124c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        private a() {
        }

        private final void L0(Context context, boolean z8) {
            Data build = new Data.Builder().putBoolean("isCompressed", z8).build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(TrackingWorker.class).addTag("TrackingWorkerSingle").setBackoffCriteria(BackoffPolicy.LINEAR, 1L, TimeUnit.MINUTES).setInputData(build).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        }

        public static /* synthetic */ boolean N0(a aVar, Context context, boolean z8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return aVar.M0(context, z8);
        }

        public static /* synthetic */ void Z(a aVar, File file, Context context, String str, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                str = null;
            }
            aVar.Y(file, context, str);
        }

        private final int d(float f8) {
            return (int) (f8 * UptodownApp.f29059C);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            r7 = com.uptodown.UptodownApp.f29086s0;
            kotlin.jvm.internal.AbstractC3255y.f(r7);
            r7.remove(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            r2 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean d0(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.Object r0 = com.uptodown.UptodownApp.m0()
                monitor-enter(r0)
                java.util.ArrayList r1 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                r2 = 0
                if (r1 == 0) goto L43
                java.util.ArrayList r1 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3255y.f(r1)     // Catch: java.lang.Throwable -> L3e
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L3e
                r3 = 0
            L18:
                if (r3 >= r1) goto L43
                java.util.ArrayList r4 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3255y.f(r4)     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3e
                a5.f r4 = (a5.C1639f) r4     // Catch: java.lang.Throwable -> L3e
                java.lang.String r4 = r4.J()     // Catch: java.lang.Throwable -> L3e
                r5 = 1
                boolean r4 = j6.n.s(r7, r4, r5)     // Catch: java.lang.Throwable -> L3e
                if (r4 == 0) goto L40
                java.util.ArrayList r7 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3255y.f(r7)     // Catch: java.lang.Throwable -> L3e
                r7.remove(r3)     // Catch: java.lang.Throwable -> L3e
                r2 = 1
                goto L43
            L3e:
                r7 = move-exception
                goto L45
            L40:
                int r3 = r3 + 1
                goto L18
            L43:
                monitor-exit(r0)
                return r2
            L45:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.UptodownApp.a.d0(java.lang.String):boolean");
        }

        private final void k0(Context context) {
            Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) TrackingWorker.class, 30L, timeUnit).addTag("TrackingWorkerPeriodic").setBackoffCriteria(BackoffPolicy.LINEAR, 1L, timeUnit).setConstraints(build).build());
        }

        public final int A() {
            return UptodownApp.f29072P;
        }

        public final void A0(String str) {
            UptodownApp.f29060D = str;
        }

        public final int B() {
            return UptodownApp.f29073Q;
        }

        public final void B0(ArrayList arrayList) {
            UptodownApp.f29089v0 = arrayList;
        }

        public final String C() {
            return UptodownApp.f29067K;
        }

        public final void C0(boolean z8) {
            UptodownApp.f29079W = z8;
        }

        public final String D() {
            return UptodownApp.f29066J;
        }

        public final void D0(int i8) {
            UptodownApp.f29071O = i8;
        }

        public final ResultReceiverC1984i E() {
            return UptodownApp.f29078V;
        }

        public final void E0(int i8) {
            UptodownApp.f29070N = i8;
        }

        public final ArrayList F() {
            ArrayList arrayList;
            synchronized (UptodownApp.f29093z0) {
                arrayList = UptodownApp.f29057A0;
            }
            return arrayList;
        }

        public final void F0(int i8) {
            UptodownApp.f29072P = i8;
        }

        public final ArrayList G() {
            ArrayList arrayList;
            synchronized (UptodownApp.f29085r0) {
                arrayList = UptodownApp.f29086s0;
            }
            return arrayList;
        }

        public final void G0(int i8) {
            UptodownApp.f29073Q = i8;
        }

        public final int H() {
            return UptodownApp.f29074R;
        }

        public final void H0(String str) {
            UptodownApp.f29067K = str;
        }

        public final WorkInfo.State I(String str, Context context) {
            WorkInfo.State state = WorkInfo.State.SUCCEEDED;
            if (context != null) {
                WorkManager workManager = WorkManager.getInstance(context);
                AbstractC3255y.h(workManager, "getInstance(context)");
                AbstractC3255y.f(str);
                InterfaceFutureC4218d workInfosByTag = workManager.getWorkInfosByTag(str);
                AbstractC3255y.h(workInfosByTag, "instance.getWorkInfosByTag(tag!!)");
                Iterator it = ((List) workInfosByTag.get()).iterator();
                while (it.hasNext() && (state = ((WorkInfo) it.next()).getState()) != WorkInfo.State.RUNNING && state != WorkInfo.State.ENQUEUED) {
                }
            }
            return state;
        }

        public final void I0(String str) {
            UptodownApp.f29066J = str;
        }

        public final HashMap J() {
            return UptodownApp.f29077U;
        }

        public final void J0(ArrayList arrayList) {
            synchronized (UptodownApp.f29085r0) {
                UptodownApp.f29086s0 = arrayList;
                I i8 = I.f8278a;
            }
        }

        public final void K(Context context) {
            AbstractC3255y.i(context, "context");
            if (SettingsPreferences.f30353b.k0(context)) {
                new C2047a(context).c("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ2YWx1ZSI6IjRhOTRiN2I1MTk1NGVkNGMyMjZjZGM1MGMxZDE5Yjk2MTY4MzY5OTE1NCJ9.1j7HuORIuuZDp0wTf1f9A__sAHEnqaGDiuCNY5OQXYN", new C0692a(context));
            }
        }

        public final void K0(int i8) {
            UptodownApp.f29074R = i8;
        }

        public final boolean L() {
            return UptodownApp.f29082Z;
        }

        public final boolean M() {
            return false;
        }

        public final boolean M0(Context context, boolean z8) {
            AbstractC3255y.i(context, "context");
            if (!W("TrackingWorkerSingle", context) && !V("TrackingWorkerPeriodic", context) && !V("GenerateQueueWorker", context) && !V("DownloadUpdatesWorker", context)) {
                L0(context, z8);
                return true;
            }
            return false;
        }

        public final boolean N() {
            return UptodownApp.f29084q0;
        }

        public final boolean O(Context context) {
            AbstractC3255y.i(context, "context");
            return W("DownloadUpdatesWorker", context);
        }

        public final Object O0(String str, boolean z8, S5.d dVar) {
            if (Q()) {
                C3655A c3655a = C3655A.f36474a;
                if (c3655a.d().size() > 0) {
                    Object obj = c3655a.d().get(c3655a.d().size() - 1);
                    AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                    Activity activity = (Activity) obj;
                    if (activity instanceof OldVersionsActivity) {
                        if (((OldVersionsActivity) activity).q2()) {
                            Object g8 = AbstractC3360i.g(C3347b0.c(), new c(activity, str, null), dVar);
                            if (g8 == T5.b.e()) {
                                return g8;
                            }
                            return I.f8278a;
                        }
                    } else if (activity instanceof AppDetailActivity) {
                        AppDetailActivity appDetailActivity = (AppDetailActivity) activity;
                        if (appDetailActivity.q2()) {
                            Object v32 = appDetailActivity.v3(str, dVar);
                            if (v32 == T5.b.e()) {
                                return v32;
                            }
                            return I.f8278a;
                        }
                    } else if (activity instanceof MainActivity) {
                        if (((MainActivity) activity).q2()) {
                            Object g9 = AbstractC3360i.g(C3347b0.c(), new d(activity, str, z8, null), dVar);
                            if (g9 == T5.b.e()) {
                                return g9;
                            }
                            return I.f8278a;
                        }
                    } else if (activity instanceof MyDownloads) {
                        if (((MyDownloads) activity).q2()) {
                            Object g10 = AbstractC3360i.g(C3347b0.c(), new e(activity, null), dVar);
                            if (g10 == T5.b.e()) {
                                return g10;
                            }
                            return I.f8278a;
                        }
                    } else if (activity instanceof MyApps) {
                        if (((MyApps) activity).q2()) {
                            Object g11 = AbstractC3360i.g(C3347b0.c(), new f(activity, str, null), dVar);
                            if (g11 == T5.b.e()) {
                                return g11;
                            }
                            return I.f8278a;
                        }
                    } else if (activity instanceof Updates) {
                        if (((Updates) activity).q2()) {
                            Object g12 = AbstractC3360i.g(C3347b0.c(), new g(z8, activity, str, null), dVar);
                            if (g12 == T5.b.e()) {
                                return g12;
                            }
                            return I.f8278a;
                        }
                    } else if (activity instanceof AppInstalledDetailsActivity) {
                        if (((AppInstalledDetailsActivity) activity).q2()) {
                            Object g13 = AbstractC3360i.g(C3347b0.c(), new h(z8, activity, null), dVar);
                            if (g13 == T5.b.e()) {
                                return g13;
                            }
                            return I.f8278a;
                        }
                    } else if (activity instanceof TvAppDetailActivity) {
                        if (((TvAppDetailActivity) activity).n()) {
                            Object g14 = AbstractC3360i.g(C3347b0.c(), new i(activity, str, null), dVar);
                            if (g14 == T5.b.e()) {
                                return g14;
                            }
                            return I.f8278a;
                        }
                    } else if ((activity instanceof WishlistActivity) && ((WishlistActivity) activity).q2()) {
                        Object g15 = AbstractC3360i.g(C3347b0.c(), new j(activity, str, null), dVar);
                        if (g15 == T5.b.e()) {
                            return g15;
                        }
                        return I.f8278a;
                    }
                    return I.f8278a;
                }
            }
            j.a aVar = H4.j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof InstallerActivity)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.InstallerActivity");
                Object g16 = AbstractC3360i.g(C3347b0.b(), new b((InstallerActivity) f8, null), dVar);
                if (g16 == T5.b.e()) {
                    return g16;
                }
                return I.f8278a;
            }
            return I.f8278a;
        }

        public final boolean P(O update) {
            boolean z8;
            AbstractC3255y.i(update, "update");
            synchronized (UptodownApp.f29093z0) {
                Iterator it = UptodownApp.f29057A0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC3255y.d(((O) it.next()).b(), update.b())) {
                            z8 = true;
                            break;
                        }
                    } else {
                        z8 = false;
                        break;
                    }
                }
            }
            return z8;
        }

        public final boolean Q() {
            if (UptodownApp.f29080X > UptodownApp.f29081Y) {
                return true;
            }
            return false;
        }

        public final boolean R(String packagename) {
            AbstractC3255y.i(packagename, "packagename");
            synchronized (UptodownApp.f29085r0) {
                if (UptodownApp.f29086s0 != null) {
                    ArrayList arrayList = UptodownApp.f29086s0;
                    AbstractC3255y.f(arrayList);
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ArrayList arrayList2 = UptodownApp.f29086s0;
                        AbstractC3255y.f(arrayList2);
                        if (n.s(packagename, ((C1639f) arrayList2.get(i8)).J(), true)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean S() {
            return false;
        }

        public final boolean T(Context context) {
            AbstractC3255y.i(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3255y.h(packageManager, "context.packageManager");
                return new Q4.f().r(q.d(packageManager, "com.npg.smarttvnpg", 4096));
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public final boolean U(Context context) {
            AbstractC3255y.i(context, "context");
            Object systemService = context.getSystemService("uimode");
            AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() != 4 && !T(context)) {
                return false;
            }
            return true;
        }

        public final boolean V(String str, Context context) {
            AbstractC3255y.i(context, "context");
            WorkManager workManager = WorkManager.getInstance(context);
            AbstractC3255y.h(workManager, "getInstance(context)");
            AbstractC3255y.f(str);
            InterfaceFutureC4218d workInfosByTag = workManager.getWorkInfosByTag(str);
            AbstractC3255y.h(workInfosByTag, "instance.getWorkInfosByTag(tag!!)");
            Iterator it = ((List) workInfosByTag.get()).iterator();
            while (it.hasNext()) {
                if (((WorkInfo) it.next()).getState() == WorkInfo.State.RUNNING) {
                    return true;
                }
            }
            return false;
        }

        public final boolean W(String str, Context context) {
            if (context != null) {
                WorkManager workManager = WorkManager.getInstance(context);
                AbstractC3255y.h(workManager, "getInstance(context)");
                AbstractC3255y.f(str);
                InterfaceFutureC4218d workInfosByTag = workManager.getWorkInfosByTag(str);
                AbstractC3255y.h(workInfosByTag, "instance.getWorkInfosByTag(tag!!)");
                Iterator it = ((List) workInfosByTag.get()).iterator();
                while (it.hasNext()) {
                    WorkInfo.State state = ((WorkInfo) it.next()).getState();
                    if (state == WorkInfo.State.RUNNING || state == WorkInfo.State.ENQUEUED) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final void X(File item, Context context, String str) {
            AbstractC3255y.i(item, "item");
            AbstractC3255y.i(context, "context");
            new H4.i(context).a(item, str, new C3667g().x(context));
        }

        public final void Y(File item, Context context, String str) {
            AbstractC3255y.i(item, "item");
            AbstractC3255y.i(context, "context");
            new H4.i(context).c(item, str, new C3667g().x(context));
        }

        public final Bundle a(Activity activity) {
            AbstractC3255y.i(activity, "<this>");
            Bundle bundle = ActivityOptions.makeCustomAnimation(activity, R.anim.left_to_right_in, R.anim.fade_out).toBundle();
            AbstractC3255y.h(bundle, "makeCustomAnimation(this…anim.fade_out).toBundle()");
            return bundle;
        }

        public final boolean a0() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - UptodownApp.f29088u0 > 600) {
                UptodownApp.f29088u0 = currentTimeMillis;
                return true;
            }
            return false;
        }

        public final ActivityOptionsCompat b(Activity activity) {
            AbstractC3255y.i(activity, "<this>");
            ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(activity, R.anim.left_to_right_in, R.anim.fade_out);
            AbstractC3255y.h(makeCustomAnimation, "makeCustomAnimation(this…ight_in, R.anim.fade_out)");
            return makeCustomAnimation;
        }

        public final void b0(O update) {
            AbstractC3255y.i(update, "update");
            synchronized (UptodownApp.f29093z0) {
                try {
                    Iterator it = UptodownApp.f29057A0.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            int i9 = i8 + 1;
                            if (AbstractC3255y.d(((O) it.next()).b(), update.b())) {
                                break;
                            } else {
                                i8 = i9;
                            }
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    if (i8 >= 0 && i8 < UptodownApp.f29057A0.size()) {
                        UptodownApp.f29057A0.remove(i8);
                    }
                    I i10 = I.f8278a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final ArrayList c(C1639f app) {
            ArrayList arrayList;
            AbstractC3255y.i(app, "app");
            synchronized (UptodownApp.f29085r0) {
                try {
                    if (UptodownApp.f29086s0 != null) {
                        ArrayList arrayList2 = UptodownApp.f29086s0;
                        AbstractC3255y.f(arrayList2);
                        arrayList2.add(app);
                    } else {
                        UptodownApp.f29086s0 = new ArrayList();
                        ArrayList arrayList3 = UptodownApp.f29086s0;
                        AbstractC3255y.f(arrayList3);
                        arrayList3.add(app);
                    }
                    arrayList = UptodownApp.f29086s0;
                    AbstractC3255y.f(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        }

        public final void c0(String packagename, Context context) {
            AbstractC3255y.i(packagename, "packagename");
            AbstractC3255y.i(context, "context");
            if (d0(packagename)) {
                Bundle bundle = new Bundle();
                bundle.putString("packagename", packagename);
                C3655A.f36474a.g().send(106, bundle);
            }
            if (O(context)) {
                DownloadUpdatesWorker.f31042k.a(packagename);
            }
        }

        public final void e(Context context) {
            AbstractC3255y.i(context, "context");
            int i8 = context.getResources().getDisplayMetrics().widthPixels;
            if (!n.s(context.getString(R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                i8 = 1024;
            }
            K0((int) (i8 - (4 * context.getResources().getDimension(R.dimen.margin_m))));
            E0((int) (H() / 2.048d));
            D0((int) (i8 / 2.048d));
            float f8 = context.getResources().getDisplayMetrics().density;
            int i9 = context.getResources().getDisplayMetrics().heightPixels;
            float dimension = context.getResources().getDimension(R.dimen.icon_size_xl);
            float dimension2 = context.getResources().getDimension(R.dimen.icon_size_m);
            float dimension3 = context.getResources().getDimension(R.dimen.icon_size_s);
            float dimension4 = context.getResources().getDimension(R.dimen.gallery_height);
            float dimension5 = context.getResources().getDimension(R.dimen.user_avatar_profile_size);
            float dimension6 = context.getResources().getDimension(R.dimen.user_avatar_review_size);
            float dimension7 = context.getResources().getDimension(R.dimen.gallery_feature_horizontal_height);
            float c8 = q5.i.f38337a.c(context);
            if (c8 != f8) {
                UptodownApp.f29059C = c8 / f8;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(':');
            sb.append(d(dimension));
            y0(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(':');
            sb2.append(d(dimension2));
            z0(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(':');
            sb3.append(d(dimension3));
            A0(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(':');
            sb4.append(d(dimension5));
            m0(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(':');
            sb5.append(d(dimension6));
            n0(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(':');
            sb6.append(d(dimension4));
            I0(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(':');
            sb7.append(d(i9));
            H0(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(':');
            sb8.append(d(y()));
            w0(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(':');
            sb9.append(d(z()));
            v0(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(':');
            sb10.append(d(dimension7));
            x0(sb10.toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C4003g e0(Context context) {
            AbstractC3255y.i(context, "context");
            return new C4003g((int) context.getResources().getDimension(R.dimen.border_radius_m), null, 2, 0 == true ? 1 : 0);
        }

        public final boolean f(Context context) {
            AbstractC3255y.i(context, "context");
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            if ((aVar.f(context) == 0 && C3680t.f36531a.f()) || aVar.f(context) == 1) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C4003g f0(Context context) {
            AbstractC3255y.i(context, "context");
            int i8 = 2;
            C4003g.a aVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (SettingsPreferences.f30353b.l(context) > 0 && C3680t.f36531a.c()) {
                return new C4003g((int) context.getResources().getDimension(R.dimen.border_radius_m), aVar, i8, objArr3 == true ? 1 : 0);
            }
            return new C4003g((int) context.getResources().getDimension(R.dimen.border_radius_xs), objArr2 == true ? 1 : 0, i8, objArr == true ? 1 : 0);
        }

        public final void g() {
            synchronized (UptodownApp.f29085r0) {
                UptodownApp.f29086s0 = null;
                I i8 = I.f8278a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C4003g g0(Context context) {
            AbstractC3255y.i(context, "context");
            int i8 = 2;
            C4003g.a aVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (SettingsPreferences.f30353b.l(context) > 0 && C3680t.f36531a.c()) {
                return new C4003g((int) context.getResources().getDimension(R.dimen.border_radius_s), aVar, i8, objArr3 == true ? 1 : 0);
            }
            return new C4003g((int) context.getResources().getDimension(R.dimen.border_radius_xs), objArr2 == true ? 1 : 0, i8, objArr == true ? 1 : 0);
        }

        public final boolean h() {
            return UptodownApp.f29087t0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C4003g h0(Context context) {
            AbstractC3255y.i(context, "context");
            return new C4003g((int) context.getResources().getDimension(R.dimen.border_radius_s), null, 2, 0 == true ? 1 : 0);
        }

        public final Object i() {
            return UptodownApp.f29092y0;
        }

        public final void i0(Context context) {
            AbstractC3255y.i(context, "context");
            if (!W("GetUserDataWorker", context)) {
                WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) GetUserDataWorker.class, 24L, TimeUnit.HOURS).addTag("GetUserDataWorker").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
            }
        }

        public final Object j() {
            return UptodownApp.f29090w0;
        }

        public final void j0(Context context) {
            AbstractC3255y.i(context, "context");
            if (!W("PreRegisterWorker", context)) {
                WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) PreRegisterWorker.class, 4L, TimeUnit.HOURS).addTag("PreRegisterWorker").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
            }
        }

        public final Object k() {
            return UptodownApp.f29091x0;
        }

        public final String l() {
            return UptodownApp.f29068L;
        }

        public final void l0(Context context) {
            AbstractC3255y.i(context, "context");
            if (!W("TrackingWorkerPeriodic", context)) {
                k0(context);
            }
        }

        public final String m() {
            return UptodownApp.f29069M;
        }

        public final void m0(String str) {
            UptodownApp.f29068L = str;
        }

        public final InterfaceC2865e n() {
            return UptodownApp.f29075S;
        }

        public final void n0(String str) {
            UptodownApp.f29069M = str;
        }

        public final InterfaceC2865e o() {
            return UptodownApp.f29076T;
        }

        public final void o0(InterfaceC2865e interfaceC2865e) {
            UptodownApp.f29075S = interfaceC2865e;
        }

        public final C1645l p() {
            return UptodownApp.f29083p0;
        }

        public final void p0(InterfaceC2865e interfaceC2865e) {
            UptodownApp.f29076T = interfaceC2865e;
        }

        public final String q() {
            return UptodownApp.f29064H;
        }

        public final void q0(boolean z8) {
            UptodownApp.f29082Z = z8;
        }

        public final String r() {
            return UptodownApp.f29063G;
        }

        public final void r0(C1645l c1645l) {
            UptodownApp.f29083p0 = c1645l;
        }

        public final String s() {
            return UptodownApp.f29065I;
        }

        public final void s0(boolean z8) {
            UptodownApp.f29084q0 = z8;
        }

        public final String t() {
            return UptodownApp.f29062F;
        }

        public final void t0(boolean z8) {
            UptodownApp.f29087t0 = z8;
        }

        public final String u() {
            return UptodownApp.f29061E;
        }

        public final void u0(O update) {
            AbstractC3255y.i(update, "update");
            synchronized (UptodownApp.f29093z0) {
                try {
                    Iterator it = UptodownApp.f29057A0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC3255y.d(((O) it.next()).b(), update.b())) {
                                break;
                            }
                        } else {
                            UptodownApp.f29057A0.add(update);
                            break;
                        }
                    }
                    I i8 = I.f8278a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C1639f v() {
            C1639f c1639f;
            synchronized (UptodownApp.f29085r0) {
                if (UptodownApp.f29086s0 != null) {
                    ArrayList arrayList = UptodownApp.f29086s0;
                    AbstractC3255y.f(arrayList);
                    if (arrayList.size() > 0) {
                        ArrayList arrayList2 = UptodownApp.f29086s0;
                        AbstractC3255y.f(arrayList2);
                        c1639f = (C1639f) arrayList2.remove(0);
                    }
                }
                c1639f = null;
            }
            return c1639f;
        }

        public final void v0(String str) {
            UptodownApp.f29064H = str;
        }

        public final ArrayList w() {
            return UptodownApp.f29089v0;
        }

        public final void w0(String str) {
            UptodownApp.f29063G = str;
        }

        public final boolean x() {
            return UptodownApp.f29079W;
        }

        public final void x0(String str) {
            UptodownApp.f29065I = str;
        }

        public final int y() {
            return UptodownApp.f29071O;
        }

        public final void y0(String str) {
            UptodownApp.f29062F = str;
        }

        public final int z() {
            return UptodownApp.f29070N;
        }

        public final void z0(String str) {
            UptodownApp.f29061E = str;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f29126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f29127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29128d;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f29129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f29130b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f29131c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, File file, boolean z8) {
                super(0);
                this.f29129a = rVar;
                this.f29130b = file;
                this.f29131c = z8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5566invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5566invoke() {
                new i(this.f29129a).c(this.f29130b, null, this.f29131c);
            }
        }

        b(r rVar, File file, boolean z8) {
            this.f29126b = rVar;
            this.f29127c = file;
            this.f29128d = z8;
        }

        @Override // Z4.K
        public void a() {
        }

        @Override // Z4.K
        public void b(H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            if (reportVT.h() > 0) {
                UptodownApp.this.j1(reportVT, new a(this.f29126b, this.f29127c, this.f29128d), this.f29126b);
            } else {
                new i(this.f29126b).c(this.f29127c, null, this.f29128d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f29133b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f29134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ UptodownApp f29135d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f29136e;

        /* loaded from: classes4.dex */
        public static final class a extends ClickableSpan {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownApp f29137a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ H f29138b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f29139c;

            a(UptodownApp uptodownApp, H h8, r rVar) {
                this.f29137a = uptodownApp;
                this.f29138b = h8;
                this.f29139c = rVar;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                AbstractC3255y.i(widget, "widget");
                this.f29137a.o1(this.f29138b.l(), this.f29139c);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                AbstractC3255y.i(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(ContextCompat.getColor(this.f29139c, R.color.main_blue));
                ds.setTypeface(j.f3824g.t());
                ds.setUnderlineText(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f29140a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(h it) {
                AbstractC3255y.i(it, "it");
                return (CharSequence) it.a().get(1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar, H h8, UptodownApp uptodownApp, Function0 function0, S5.d dVar) {
            super(2, dVar);
            this.f29133b = rVar;
            this.f29134c = h8;
            this.f29135d = uptodownApp;
            this.f29136e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(Function0 function0, r rVar, View view) {
            function0.invoke();
            AlertDialog R8 = rVar.R();
            if (R8 != null) {
                R8.dismiss();
            }
            UptodownApp.f29058B.s0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(r rVar, View view) {
            AlertDialog R8 = rVar.R();
            if (R8 != null) {
                R8.dismiss();
            }
            UptodownApp.f29058B.s0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(UptodownApp uptodownApp, H h8, r rVar, View view) {
            uptodownApp.o1(h8.l(), rVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29133b, this.f29134c, this.f29135d, this.f29136e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29132a == 0) {
                t.b(obj);
                if (!this.f29133b.isFinishing()) {
                    AlertDialog R8 = this.f29133b.R();
                    if (R8 != null) {
                        R8.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f29133b);
                    C1496u c8 = C1496u.c(this.f29133b.getLayoutInflater());
                    AbstractC3255y.h(c8, "inflate(coreBaseActivity.layoutInflater)");
                    final H h8 = this.f29134c;
                    final UptodownApp uptodownApp = this.f29135d;
                    final r rVar = this.f29133b;
                    final Function0 function0 = this.f29136e;
                    TextView textView = c8.f12574f;
                    j.a aVar = j.f3824g;
                    textView.setTypeface(aVar.u());
                    c8.f12574f.setText(aVar.g().getString(R.string.positives_detected_in_downloaded_file));
                    String obj2 = c8.f12574f.getText().toString();
                    List<C1646m> a8 = C1646m.f14265f.a(obj2, "\\[xx](.*?)\\[/xx]");
                    SpannableString spannableString = new SpannableString(new j6.j("\\[xx](.*?)\\[/xx]").g(obj2, b.f29140a));
                    for (C1646m c1646m : a8) {
                        SpannableString spannableString2 = spannableString;
                        int S8 = n.S(spannableString, c1646m.d(), 0, false, 6, null);
                        int length = c1646m.d().length() + S8;
                        if (S8 >= 0) {
                            spannableString2.setSpan(new a(uptodownApp, h8, rVar), S8, length, 33);
                        }
                        spannableString = spannableString2;
                    }
                    c8.f12574f.setText(spannableString);
                    c8.f12574f.setMovementMethod(LinkMovementMethod.getInstance());
                    TextView textView2 = c8.f12576h;
                    j.a aVar2 = j.f3824g;
                    textView2.setTypeface(aVar2.t());
                    c8.f12576h.setText(String.valueOf(h8.h()));
                    c8.f12575g.setTypeface(aVar2.u());
                    TextView textView3 = c8.f12575g;
                    C3655A c3655a = C3655A.f36474a;
                    Y y8 = Y.f34167a;
                    String string = aVar2.g().getString(R.string.virustotal_report_msg);
                    AbstractC3255y.h(string, "appContext.getString(R.s…ng.virustotal_report_msg)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(h8.i())}, 1));
                    AbstractC3255y.h(format, "format(...)");
                    textView3.setText(c3655a.c(format));
                    c8.f12573e.setTypeface(aVar2.u());
                    c8.f12573e.setText(aVar2.g().getString(R.string.virustotal_report_previous_scan, h8.g()));
                    c8.f12572d.setTypeface(aVar2.t());
                    c8.f12572d.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.c.o(Function0.this, rVar, view);
                        }
                    });
                    c8.f12571c.setTypeface(aVar2.t());
                    c8.f12571c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.c.q(r.this, view);
                        }
                    });
                    c8.f12570b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.c.s(UptodownApp.this, h8, rVar, view);
                        }
                    });
                    builder.setCancelable(false);
                    builder.setView(c8.getRoot());
                    this.f29133b.s0(builder.create());
                    if (!this.f29133b.isFinishing() && this.f29133b.R() != null) {
                        AlertDialog R9 = this.f29133b.R();
                        AbstractC3255y.f(R9);
                        Window window = R9.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        AlertDialog R10 = this.f29133b.R();
                        AbstractC3255y.f(R10);
                        R10.show();
                        UptodownApp.f29058B.s0(true);
                    }
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29141a;

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29141a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                UptodownApp uptodownApp = UptodownApp.this;
                this.f29141a = 1;
                if (uptodownApp.q1(uptodownApp, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29143a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, S5.d dVar) {
            super(2, dVar);
            this.f29144b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f29144b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29143a == 0) {
                t.b(obj);
                ArrayList A8 = new C3667g().A(this.f29144b);
                new C3667g().e(A8, this.f29144b);
                return new C3667g().f(A8, this.f29144b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    private final void i1() {
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getSystemService("notification");
            AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            String string = getString(R.string.app_name);
            AbstractC3255y.h(string, "getString(R.string.app_name)");
            String string2 = getString(R.string.notification_channel_description);
            AbstractC3255y.h(string2, "getString(R.string.notif…tion_channel_description)");
            NotificationChannel a8 = androidx.browser.trusted.h.a("CHANNEL_ID_UPTODOWN", string, 3);
            a8.setSound(null, null);
            a8.setDescription(string2);
            a8.enableLights(true);
            ((NotificationManager) systemService).createNotificationChannel(a8);
        }
    }

    private final void k1(boolean z8, String str) {
        Bundle bundle = new Bundle();
        if (z8) {
            bundle.putString("type", "accepted");
        } else {
            bundle.putString("type", "rejected");
        }
        bundle.putString("consent_version", str);
        new C3678r(this).b("user_consent_mintegral", bundle);
    }

    private final void l1() {
        Q e8 = Q.f14058k.e(this);
        if (e8 == null || !e8.y()) {
            String packageName = getPackageName();
            AbstractC3255y.h(packageName, "this.packageName");
            ChoiceCmp.startChoice$default(this, packageName, "p-PLc5NudJ4X36X", this, null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(String str, r rVar) {
        if (str != null && !rVar.isFinishing()) {
            String q8 = new C3667g().q(str);
            String string = rVar.getString(R.string.virustotal_safety_report_title);
            AbstractC3255y.h(string, "coreBaseActivity.getStri…otal_safety_report_title)");
            new C3671k().q(rVar, q8, string);
        }
    }

    private final void p1() {
        AbstractC3360i.d(N.a(C3347b0.b()), null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q1(Context context, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(context, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void r1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C1976a c1976a = new C1976a();
        this.f29095y = c1976a;
        registerReceiver(c1976a, intentFilter);
    }

    private final void s1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        C1977b c1977b = new C1977b();
        this.f29094A = c1977b;
        registerReceiver(c1977b, intentFilter);
    }

    private final void t1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        C1978c c1978c = new C1978c();
        this.f29096z = c1978c;
        registerReceiver(c1978c, intentFilter);
    }

    private final void u1(Context context) {
        if (!f29058B.W("SearchApksWorker", context)) {
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(SearchApksWorker.class).addTag("SearchApksWorker").build());
        }
    }

    private final void v1() {
        try {
            C1976a c1976a = this.f29095y;
            if (c1976a != null) {
                unregisterReceiver(c1976a);
                this.f29095y = null;
            }
            C1978c c1978c = this.f29096z;
            if (c1978c != null) {
                unregisterReceiver(c1978c);
                this.f29096z = null;
            }
            C1977b c1977b = this.f29094A;
            if (c1977b != null) {
                unregisterReceiver(c1977b);
                this.f29094A = null;
            }
        } catch (IllegalArgumentException e8) {
            e8.printStackTrace();
        }
    }

    @Override // H4.j
    public void G(File file, f listener, r coreBaseActivity) {
        String str;
        AbstractC3255y.i(file, "file");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(coreBaseActivity, "coreBaseActivity");
        boolean x8 = new C3667g().x(this);
        Q e8 = Q.f14058k.e(this);
        C3674n a8 = C3674n.f36505t.a(this);
        a8.a();
        String name = file.getName();
        AbstractC3255y.h(name, "file.name");
        C1648o Y7 = a8.Y(name);
        a8.l();
        if (e8 != null && e8.y()) {
            if (Y7 != null) {
                str = Y7.w();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                new m(this, null, Q4.d.f9161a.e(file.getAbsolutePath()), new b(coreBaseActivity, file, x8), N.a(C3347b0.b()));
                return;
            }
        }
        new i(this).c(file, null, x8);
    }

    @Override // H4.j
    public void M(String event) {
        AbstractC3255y.i(event, "event");
        Bundle bundle = new Bundle();
        if (event.length() > 30) {
            event = event.substring(0, 30);
            AbstractC3255y.h(event, "substring(...)");
        }
        bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, event);
        new C3678r(this).b("nsd", bundle);
    }

    public final void j1(H reportVT, Function0 installAction, r coreBaseActivity) {
        AbstractC3255y.i(reportVT, "reportVT");
        AbstractC3255y.i(installAction, "installAction");
        AbstractC3255y.i(coreBaseActivity, "coreBaseActivity");
        AbstractC3360i.d(LifecycleOwnerKt.getLifecycleScope(coreBaseActivity), C3347b0.c(), null, new c(coreBaseActivity, reportVT, this, installAction, null), 2, null);
    }

    public final void m1() {
        f29081Y++;
    }

    public final void n1() {
        f29080X++;
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCCPAConsentGiven(String consentString) {
        AbstractC3255y.i(consentString, "consentString");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpError(ChoiceError error) {
        AbstractC3255y.i(error, "error");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpLoaded(PingReturn info) {
        AbstractC3255y.i(info, "info");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpUIShown(PingReturn info) {
        AbstractC3255y.i(info, "info");
    }

    @Override // H4.j, android.app.Application
    public void onCreate() {
        String str;
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        new C3678r(this).f();
        new Y4.b().b();
        new C3682v(this).b();
        r1();
        t1();
        s1();
        int i8 = getResources().getConfiguration().uiMode & 48;
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        String j8 = aVar.j(this);
        if (n.s(j8, "yes", true)) {
            if (i8 != 32) {
                AppCompatDelegate.setDefaultNightMode(2);
            }
            str = "dark";
        } else if (n.s(j8, "no", true)) {
            if (i8 != 16) {
                AppCompatDelegate.setDefaultNightMode(1);
            }
            str = "light";
        } else {
            AppCompatDelegate.setDefaultNightMode(-1);
            if (i8 != 16) {
                if (i8 != 32) {
                    str = "followSystem";
                } else {
                    str = "followSystem_dark";
                }
            } else {
                str = "followSystem_light";
            }
        }
        if (aVar.k(this) == -1) {
            aVar.C0(this);
            Bundle bundle = new Bundle();
            bundle.putString("type", str);
            new C3678r(this).b("darkMode", bundle);
        }
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        if (aVar.q(applicationContext) == null) {
            String language = Locale.getDefault().getLanguage();
            Context applicationContext2 = getApplicationContext();
            AbstractC3255y.h(applicationContext2, "applicationContext");
            aVar.K0(applicationContext2, language);
        }
        p1();
        Context applicationContext3 = getApplicationContext();
        AbstractC3255y.h(applicationContext3, "applicationContext");
        if (aVar.j0(applicationContext3)) {
            Context applicationContext4 = getApplicationContext();
            AbstractC3255y.h(applicationContext4, "applicationContext");
            if (628 != aVar.K(applicationContext4)) {
                Context applicationContext5 = getApplicationContext();
                AbstractC3255y.h(applicationContext5, "applicationContext");
                aVar.c1(applicationContext5, false);
                Context applicationContext6 = getApplicationContext();
                AbstractC3255y.h(applicationContext6, "applicationContext");
                aVar.i1(applicationContext6, null);
            }
        }
        a aVar2 = f29058B;
        aVar2.e(this);
        i1();
        aVar2.l0(this);
        if (Q.f14058k.e(this) != null) {
            aVar2.j0(this);
            aVar2.i0(this);
        }
        J4.a aVar3 = new J4.a(this);
        aVar3.h();
        if (aVar3.l() || aVar3.s()) {
            j.f3824g.J(new ResultReceiverC1983h(null));
        }
        if (aVar3.p()) {
            u1(this);
        }
        T(new ResultReceiverC1982g(null));
        ResultReceiver J8 = J();
        AbstractC3255y.g(J8, "null cannot be cast to non-null type com.uptodown.receivers.InstallerActivityReceiver");
        ((ResultReceiverC1982g) J8).g(getApplicationContext());
        C3683w c3683w = C3683w.f36547a;
        Context applicationContext7 = getApplicationContext();
        AbstractC3255y.h(applicationContext7, "applicationContext");
        c3683w.h(applicationContext7);
        aVar2.K(this);
        j.f3824g.b();
        new C3659E().d(this);
        l1();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onGoogleBasicConsentChange(GoogleBasicConsents consents) {
        AbstractC3255y.i(consents, "consents");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onGoogleVendorConsentGiven(ACData acData) {
        AbstractC3255y.i(acData, "acData");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onIABVendorConsentGiven(GDPRData gdprData) {
        boolean z8;
        AbstractC3255y.i(gdprData, "gdprData");
        Boolean bool = gdprData.getVendor().getConsents().get("867");
        if (bool != null) {
            z8 = bool.booleanValue();
        } else {
            z8 = false;
        }
        new C3659E().a(j.f3824g.g(), z8);
        k1(z8, "gdpr");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onNonIABVendorConsentGiven(NonIABData nonIABData) {
        AbstractC3255y.i(nonIABData, "nonIABData");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onReceiveUSRegulationsConsent(USRegulationData usRegulationData) {
        boolean z8;
        boolean z9;
        boolean z10;
        AbstractC3255y.i(usRegulationData, "usRegulationData");
        boolean z11 = false;
        if (usRegulationData.getSaleOptOut() == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (usRegulationData.getSharingOptOut() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (usRegulationData.getPersonalDataConsents() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z8 && z9 && z10) {
            z11 = true;
        }
        new C3659E().b(!z11);
        k1(z11, "mspa");
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        new C3682v(this).c();
        v1();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onUserMovedToOtherState() {
    }
}
