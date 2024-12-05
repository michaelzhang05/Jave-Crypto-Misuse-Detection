package b5;

import H4.j;
import O5.I;
import O5.t;
import a5.O;
import a6.InterfaceC1668n;
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
import o5.C3674n;
import o5.C3677q;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1977b extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final a f15483b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static String f15484c;

    /* renamed from: d, reason: collision with root package name */
    private static long f15485d;

    /* renamed from: a, reason: collision with root package name */
    private Context f15486a;

    /* renamed from: b5.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b5.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0368b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15487a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15489c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f15490d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b5.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f15491a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f15492b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BroadcastReceiver.PendingResult pendingResult, S5.d dVar) {
                super(2, dVar);
                this.f15492b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f15492b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f15491a == 0) {
                    t.b(obj);
                    this.f15492b.finish();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0368b(String str, BroadcastReceiver.PendingResult pendingResult, S5.d dVar) {
            super(2, dVar);
            this.f15489c = str;
            this.f15490d = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0368b(this.f15489c, this.f15490d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = T5.b.e();
            int i8 = this.f15487a;
            try {
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2 && i8 != 3) {
                    if (i8 == 4) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3674n.a aVar = C3674n.f36505t;
                Context context = C1977b.this.f15486a;
                AbstractC3255y.f(context);
                C3674n a8 = aVar.a(context);
                a8.a();
                O u02 = a8.u0(this.f15489c);
                if (u02 != null) {
                    str = u02.l();
                } else {
                    str = null;
                }
                if (str != null) {
                    C3677q c3677q = new C3677q();
                    Context context2 = C1977b.this.f15486a;
                    AbstractC3255y.f(context2);
                    File g8 = c3677q.g(context2);
                    String l8 = u02.l();
                    AbstractC3255y.f(l8);
                    new File(g8, l8).delete();
                }
                a8.M(this.f15489c);
                a8.v(this.f15489c);
                a8.l();
                Thread.sleep(200L);
                if (UptodownApp.f29058B.Q()) {
                    C3655A c3655a = C3655A.f36474a;
                    if (c3655a.d().size() > 0) {
                        Object obj2 = c3655a.d().get(c3655a.d().size() - 1);
                        AbstractC3255y.h(obj2, "StaticResources.activity….activity_stack.size - 1]");
                        Activity activity = (Activity) obj2;
                        if (activity instanceof OldVersionsActivity) {
                            if (((OldVersionsActivity) activity).q2()) {
                                ((OldVersionsActivity) activity).t3(this.f15489c);
                            }
                        } else if (activity instanceof AppDetailActivity) {
                            if (((AppDetailActivity) activity).q2()) {
                                String str2 = this.f15489c;
                                this.f15487a = 1;
                                if (((AppDetailActivity) activity).v3(str2, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (activity instanceof MyApps) {
                            if (((MyApps) activity).q2()) {
                                String str3 = this.f15489c;
                                this.f15487a = 2;
                                if (((MyApps) activity).J4("app_uninstalled", str3, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (activity instanceof Updates) {
                            if (((Updates) activity).q2()) {
                                String str4 = this.f15489c;
                                this.f15487a = 3;
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
            j.f3824g.I(null);
            J0 c8 = C3347b0.c();
            a aVar2 = new a(this.f15490d, null);
            this.f15487a = 4;
            if (AbstractC3360i.g(c8, aVar2, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0368b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: b5.b$c */
    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15493a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15495c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f15496d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, BroadcastReceiver.PendingResult pendingResult, S5.d dVar) {
            super(2, dVar);
            this.f15495c = str;
            this.f15496d = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f15495c, this.f15496d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f15493a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C1977b c1977b = C1977b.this;
                String packagenameDeleted = this.f15495c;
                AbstractC3255y.h(packagenameDeleted, "packagenameDeleted");
                BroadcastReceiver.PendingResult pendingResult = this.f15496d;
                AbstractC3255y.h(pendingResult, "pendingResult");
                this.f15493a = 1;
                if (c1977b.c(packagenameDeleted, pendingResult, this) == e8) {
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
    public final Object c(String str, BroadcastReceiver.PendingResult pendingResult, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new C0368b(str, pendingResult, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        String schemeSpecificPart;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(intent, "intent");
        this.f15486a = j.f3824g.a(context);
        try {
            String action = intent.getAction();
            if (action != null) {
                boolean z8 = true;
                if (n.s(action, "android.intent.action.PACKAGE_REMOVED", true) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
                    String str = action + schemeSpecificPart;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (n.s(str, f15484c, true) && currentTimeMillis - f15485d <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        z8 = false;
                    }
                    f15485d = currentTimeMillis;
                    f15484c = str;
                    if (z8) {
                        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new c(schemeSpecificPart, goAsync(), null), 3, null);
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
