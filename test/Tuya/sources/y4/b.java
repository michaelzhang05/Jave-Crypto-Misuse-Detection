package Y4;

import E4.j;
import L5.I;
import L5.t;
import X4.O;
import X5.n;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.Updates;
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
import l5.C3326n;
import l5.C3329q;

/* loaded from: classes5.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13198b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static String f13199c;

    /* renamed from: d, reason: collision with root package name */
    private static long f13200d;

    /* renamed from: a, reason: collision with root package name */
    private Context f13201a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0254b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13202a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f13205d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Y4.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f13206a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f13207b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BroadcastReceiver.PendingResult pendingResult, P5.d dVar) {
                super(2, dVar);
                this.f13207b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f13207b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f13206a == 0) {
                    t.b(obj);
                    this.f13207b.finish();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0254b(String str, BroadcastReceiver.PendingResult pendingResult, P5.d dVar) {
            super(2, dVar);
            this.f13204c = str;
            this.f13205d = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0254b(this.f13204c, this.f13205d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0254b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = Q5.b.e();
            int i8 = this.f13202a;
            try {
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2 && i8 != 3) {
                    if (i8 == 4) {
                        t.b(obj);
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3326n.a aVar = C3326n.f34504t;
                Context context = b.this.f13201a;
                AbstractC3159y.f(context);
                C3326n a8 = aVar.a(context);
                a8.a();
                O u02 = a8.u0(this.f13204c);
                if (u02 != null) {
                    str = u02.j();
                } else {
                    str = null;
                }
                if (str != null) {
                    C3329q c3329q = new C3329q();
                    Context context2 = b.this.f13201a;
                    AbstractC3159y.f(context2);
                    File g8 = c3329q.g(context2);
                    String j8 = u02.j();
                    AbstractC3159y.f(j8);
                    new File(g8, j8).delete();
                }
                a8.M(this.f13204c);
                a8.t(this.f13204c);
                a8.g();
                Thread.sleep(200L);
                if (UptodownApp.f28003B.Q()) {
                    C3307A c3307a = C3307A.f34473a;
                    if (c3307a.d().size() > 0) {
                        Object obj2 = c3307a.d().get(c3307a.d().size() - 1);
                        AbstractC3159y.h(obj2, "StaticResources.activity….activity_stack.size - 1]");
                        Activity activity = (Activity) obj2;
                        if (activity instanceof OldVersionsActivity) {
                            if (((OldVersionsActivity) activity).q2()) {
                                ((OldVersionsActivity) activity).t3(this.f13204c);
                            }
                        } else if (activity instanceof AppDetailActivity) {
                            if (((AppDetailActivity) activity).q2()) {
                                String str2 = this.f13204c;
                                this.f13202a = 1;
                                if (((AppDetailActivity) activity).v3(str2, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (activity instanceof MyApps) {
                            if (((MyApps) activity).q2()) {
                                String str3 = this.f13204c;
                                this.f13202a = 2;
                                if (((MyApps) activity).J4("app_uninstalled", str3, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (activity instanceof Updates) {
                            if (((Updates) activity).q2()) {
                                String str4 = this.f13204c;
                                this.f13202a = 3;
                                if (((Updates) activity).Q4("app_uninstalled", str4, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if ((activity instanceof SecurityActivity) && ((SecurityActivity) activity).q2()) {
                            ((SecurityActivity) activity).W4();
                        }
                    }
                }
            }
            j.f2274g.I(null);
            J0 c8 = C2812b0.c();
            a aVar2 = new a(this.f13205d, null);
            this.f13202a = 4;
            if (AbstractC2825i.g(c8, aVar2, this) == e8) {
                return e8;
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13208a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f13211d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, BroadcastReceiver.PendingResult pendingResult, P5.d dVar) {
            super(2, dVar);
            this.f13210c = str;
            this.f13211d = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f13210c, this.f13211d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f13208a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                String packagenameDeleted = this.f13210c;
                AbstractC3159y.h(packagenameDeleted, "packagenameDeleted");
                BroadcastReceiver.PendingResult pendingResult = this.f13211d;
                AbstractC3159y.h(pendingResult, "pendingResult");
                this.f13208a = 1;
                if (bVar.c(packagenameDeleted, pendingResult, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(String str, BroadcastReceiver.PendingResult pendingResult, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new C0254b(str, pendingResult, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        String schemeSpecificPart;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(intent, "intent");
        this.f13201a = j.f2274g.a(context);
        try {
            String action = intent.getAction();
            if (action != null) {
                boolean z8 = true;
                if (g6.n.s(action, "android.intent.action.PACKAGE_REMOVED", true) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
                    String str = action + schemeSpecificPart;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (g6.n.s(str, f13199c, true) && currentTimeMillis - f13200d <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        z8 = false;
                    }
                    f13200d = currentTimeMillis;
                    f13199c = str;
                    if (z8) {
                        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new c(schemeSpecificPart, goAsync(), null), 3, null);
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
