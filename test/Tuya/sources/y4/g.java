package Y4;

import L5.I;
import L5.t;
import N4.q;
import X4.C1502l;
import X4.x;
import X5.n;
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
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3329q;
import l5.C3330r;
import l5.C3331s;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class g extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f13239a;

    /* loaded from: classes5.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13240a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f13240a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                if (UptodownApp.f28003B.Q()) {
                    C3307A c3307a = C3307A.f34473a;
                    if (c3307a.d().size() > 0) {
                        Object obj2 = c3307a.d().get(c3307a.d().size() - 1);
                        AbstractC3159y.h(obj2, "StaticResources.activity….activity_stack.size - 1]");
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
                                this.f13240a = 1;
                                if (mainActivity.C7(this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (activity instanceof AppDetailActivity) {
                            AppDetailActivity appDetailActivity = (AppDetailActivity) activity;
                            if (appDetailActivity.q2()) {
                                this.f13240a = 2;
                                if (appDetailActivity.w3(this) == e8) {
                                    return e8;
                                }
                            }
                        }
                    }
                }
            }
            return I.f6487a;
        }
    }

    public g(Handler handler) {
        super(handler);
    }

    private final void b(Context context, String str, Bundle bundle) {
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (aVar.p() != null) {
            C1502l p8 = aVar.p();
            AbstractC3159y.f(p8);
            String i8 = new C3329q().i(p8.c());
            if (i8 != null && g6.n.s(i8, str, true)) {
                bundle.putString("source", "deeplink");
                aVar.r0(null);
                return;
            }
            return;
        }
        x b8 = x.f12727f.b(context);
        if (b8 != null && g6.n.s(b8.d(), str, true)) {
            bundle.putString("source", "notification_fcm");
        }
    }

    private final String c(int i8) {
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

    public final void e(Context context) {
        this.f13239a = context;
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
                    Context context = this.f13239a;
                    if (context != null) {
                        C3335w c3335w = C3335w.f34546a;
                        AbstractC3159y.f(context);
                        c3335w.e(context);
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
                    bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, c(i9));
                    bundle2.putString("type", "failed");
                    if (str != null) {
                        bundle2.putString("packagename", str);
                        Context context2 = this.f13239a;
                        if (context2 != null) {
                            try {
                                AbstractC3159y.f(context2);
                                PackageManager packageManager = context2.getPackageManager();
                                AbstractC3159y.h(packageManager, "context!!.packageManager");
                                q.a(packageManager, str, 0);
                                bundle2.putInt("update", 1);
                            } catch (Exception unused) {
                                bundle2.putInt("update", 0);
                            }
                            Context context3 = this.f13239a;
                            AbstractC3159y.f(context3);
                            b(context3, str, bundle2);
                        }
                    }
                    if (j8 > 0) {
                        bundle2.putString("size", C3331s.f34529a.d(j8));
                    }
                    new C3330r(this.f13239a).b("install", bundle2);
                    Context context4 = this.f13239a;
                    if (context4 != null) {
                        UptodownApp.a aVar = UptodownApp.f28003B;
                        AbstractC3159y.f(context4);
                        UptodownApp.a.N0(aVar, context4, false, 2, null);
                    }
                    AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(null), 3, null);
                    return;
                }
                return;
            }
            C3335w c3335w2 = C3335w.f34546a;
            Context context5 = this.f13239a;
            AbstractC3159y.f(context5);
            c3335w2.e(context5);
            return;
        }
        if (bundle != null) {
            str2 = bundle.getString("appNameAndVersion");
        }
        if (str2 == null) {
            str2 = "";
        }
        C3335w c3335w3 = C3335w.f34546a;
        Context context6 = this.f13239a;
        AbstractC3159y.f(context6);
        c3335w3.l(context6, str2);
    }
}
