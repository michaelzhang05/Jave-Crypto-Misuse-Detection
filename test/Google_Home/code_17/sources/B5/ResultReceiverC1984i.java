package b5;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
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
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.AbstractC3658D;
import o5.C3655A;

/* renamed from: b5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC1984i extends ResultReceiver {

    /* renamed from: b5.i$a */
    /* loaded from: classes5.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f15527b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, S5.d dVar) {
            super(2, dVar);
            this.f15527b = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f15527b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f15526a == 0) {
                t.b(obj);
                ((MyApps) this.f15527b).S4(false);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public ResultReceiverC1984i(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        if (i8 == 602) {
            AbstractC3658D.f36483a.b();
            return;
        }
        if (UptodownApp.f29058B.Q()) {
            C3655A c3655a = C3655A.f36474a;
            if (c3655a.d().size() > 0) {
                Object obj = c3655a.d().get(c3655a.d().size() - 1);
                AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
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
                        AbstractC3364k.d(N.a(C3347b0.c()), null, null, new a(activity, null), 3, null);
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
                            activity.runOnUiThread(new MainActivity.RunnableC2672a());
                            return;
                        }
                        return;
                    }
                    ((MainActivity) activity).M6();
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
