package Y4;

import L5.I;
import L5.t;
import X5.n;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3310D;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class i extends ResultReceiver {

    /* loaded from: classes5.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f13242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, P5.d dVar) {
            super(2, dVar);
            this.f13242b = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f13242b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f13241a == 0) {
                t.b(obj);
                ((MyApps) this.f13242b).S4(false);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public i(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        if (i8 == 602) {
            AbstractC3310D.f34482a.b();
            return;
        }
        if (UptodownApp.f28003B.Q()) {
            C3307A c3307a = C3307A.f34473a;
            if (c3307a.d().size() > 0) {
                Object obj = c3307a.d().get(c3307a.d().size() - 1);
                AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                Activity activity = (Activity) obj;
                if (activity instanceof Updates) {
                    if (i8 != 600) {
                        if (i8 == 601) {
                            ((Updates) activity).i5();
                            return;
                        }
                        return;
                    }
                    ((Updates) activity).j5();
                    return;
                }
                if (activity instanceof MyApps) {
                    if (i8 == 601) {
                        AbstractC2829k.d(N.a(C2812b0.c()), null, null, new a(activity, null), 3, null);
                        return;
                    }
                    return;
                }
                if (activity instanceof SecurityActivity) {
                    if (i8 == 601) {
                        ((SecurityActivity) activity).Y4();
                        return;
                    }
                    return;
                }
                if (activity instanceof TvMyAppsActivity) {
                    if (i8 == 601) {
                        activity.runOnUiThread(new TvMyAppsActivity.a());
                        return;
                    }
                    return;
                }
                if (activity instanceof MainActivity) {
                    if (i8 != 603) {
                        if (i8 == 604) {
                            activity.runOnUiThread(new MainActivity.RunnableC2478a());
                            return;
                        }
                        return;
                    }
                    ((MainActivity) activity).O6();
                    return;
                }
                if (activity instanceof AppDetailActivity) {
                    if (i8 == 603) {
                        ((AppDetailActivity) activity).p3();
                    }
                } else if (activity instanceof WishlistActivity) {
                    if (i8 == 601) {
                        ((WishlistActivity) activity).U4(null);
                    }
                } else if (activity instanceof RollbackActivity) {
                    if (i8 == 601) {
                        activity.runOnUiThread(new RollbackActivity.a());
                    }
                } else if ((activity instanceof TvAppDetailActivity) && i8 == 603) {
                    activity.runOnUiThread(new TvAppDetailActivity.a());
                }
            }
        }
    }
}
