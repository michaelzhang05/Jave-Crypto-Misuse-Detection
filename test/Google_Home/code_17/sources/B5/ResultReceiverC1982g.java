package b5;

import O5.I;
import O5.t;
import Q4.q;
import a5.C1645l;
import a5.x;
import a6.InterfaceC1668n;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.Updates;
import j6.n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3655A;
import o5.C3677q;
import o5.C3678r;
import o5.C3679s;
import o5.C3683w;

/* renamed from: b5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC1982g extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f15524a;

    /* renamed from: b5.g$a */
    /* loaded from: classes5.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15525a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f15525a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                if (UptodownApp.f29058B.Q()) {
                    C3655A c3655a = C3655A.f36474a;
                    if (c3655a.d().size() > 0) {
                        Object obj2 = c3655a.d().get(c3655a.d().size() - 1);
                        AbstractC3255y.h(obj2, "StaticResources.activity….activity_stack.size - 1]");
                        Activity activity = (Activity) obj2;
                        if (activity instanceof Updates) {
                            Updates updates = (Updates) activity;
                            if (updates.q2()) {
                                updates.e5(false);
                            }
                        } else if (activity instanceof MyApps) {
                            MyApps myApps = (MyApps) activity;
                            if (myApps.q2()) {
                                myApps.S4(false);
                            }
                        } else if (activity instanceof MainActivity) {
                            MainActivity mainActivity = (MainActivity) activity;
                            if (mainActivity.q2()) {
                                this.f15525a = 1;
                                if (mainActivity.A7(this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (activity instanceof AppDetailActivity) {
                            AppDetailActivity appDetailActivity = (AppDetailActivity) activity;
                            if (appDetailActivity.q2()) {
                                this.f15525a = 2;
                                if (appDetailActivity.w3(this) == e8) {
                                    return e8;
                                }
                            }
                        }
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public ResultReceiverC1982g(Handler handler) {
        super(handler);
    }

    private final void a(Context context, String str, Bundle bundle) {
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.p() != null) {
            C1645l p8 = aVar.p();
            AbstractC3255y.f(p8);
            String i8 = new C3677q().i(p8.c());
            if (i8 != null && n.s(i8, str, true)) {
                bundle.putString("source", "deeplink");
                aVar.r0(null);
                return;
            }
            return;
        }
        x b8 = x.f14348f.b(context);
        if (b8 != null && n.s(b8.d(), str, true)) {
            bundle.putString("source", "notification_fcm");
        }
    }

    private final String b(int i8) {
        switch (i8) {
            case 1:
                return "STATUS_FAILURE";
            case 2:
                return "STATUS_FAILURE_BLOCKED";
            case 3:
                return "STATUS_FAILURE_ABORTED";
            case 4:
                return "STATUS_FAILURE_INVALID";
            case 5:
                return "STATUS_FAILURE_CONFLICT";
            case 6:
                return "STATUS_FAILURE_STORAGE";
            case 7:
                return "STATUS_FAILURE_INCOMPATIBLE";
            default:
                return String.valueOf(i8);
        }
    }

    public final void g(Context context) {
        this.f15524a = context;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        long j8;
        String str;
        int i9;
        String str2 = null;
        if (i8 != 222) {
            if (i8 != 223) {
                if (i8 == 227) {
                    Context context = this.f15524a;
                    if (context != null) {
                        C3683w c3683w = C3683w.f36547a;
                        AbstractC3255y.f(context);
                        c3683w.e(context);
                    }
                    if (bundle != null) {
                        i9 = bundle.getInt("piStatus");
                        str = bundle.getString("packagename");
                        j8 = bundle.getLong("size");
                    } else {
                        j8 = -1;
                        str = null;
                        i9 = 0;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, b(i9));
                    bundle2.putString("type", "failed");
                    if (str != null) {
                        bundle2.putString("packagename", str);
                        Context context2 = this.f15524a;
                        if (context2 != null) {
                            try {
                                AbstractC3255y.f(context2);
                                PackageManager packageManager = context2.getPackageManager();
                                AbstractC3255y.h(packageManager, "context!!.packageManager");
                                q.a(packageManager, str, 0);
                                bundle2.putInt("update", 1);
                            } catch (Exception unused) {
                                bundle2.putInt("update", 0);
                            }
                            Context context3 = this.f15524a;
                            AbstractC3255y.f(context3);
                            a(context3, str, bundle2);
                        }
                    }
                    if (j8 > 0) {
                        bundle2.putString("size", C3679s.f36530a.d(j8));
                    }
                    new C3678r(this.f15524a).b("install", bundle2);
                    Context context4 = this.f15524a;
                    if (context4 != null) {
                        UptodownApp.a aVar = UptodownApp.f29058B;
                        AbstractC3255y.f(context4);
                        UptodownApp.a.N0(aVar, context4, false, 2, null);
                    }
                    AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(null), 3, null);
                    return;
                }
                return;
            }
            C3683w c3683w2 = C3683w.f36547a;
            Context context5 = this.f15524a;
            AbstractC3255y.f(context5);
            c3683w2.e(context5);
            return;
        }
        if (bundle != null) {
            str2 = bundle.getString("appNameAndVersion");
        }
        if (str2 == null) {
            str2 = "";
        }
        C3683w c3683w3 = C3683w.f36547a;
        Context context6 = this.f15524a;
        AbstractC3255y.f(context6);
        c3683w3.l(context6, str2);
    }
}
