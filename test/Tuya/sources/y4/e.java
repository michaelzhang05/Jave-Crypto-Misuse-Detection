package Y4;

import M5.AbstractC1246t;
import X4.C1505o;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import com.uptodown.tv.ui.activity.TvOldVersionsActivity;
import h5.b;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class e extends ResultReceiver {
    public e(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        C1505o c1505o;
        Long l8;
        Parcelable parcelable;
        Object parcelable2;
        String str = null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("download", C1505o.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = bundle.getParcelable("download");
            }
            c1505o = (C1505o) parcelable;
        } else {
            c1505o = null;
        }
        if (UptodownApp.f28003B.Q()) {
            C3307A c3307a = C3307A.f34473a;
            if (c3307a.d().size() > 0) {
                Object obj = c3307a.d().get(0);
                AbstractC3159y.h(obj, "StaticResources.activity_stack[0]");
                Activity activity = (Activity) obj;
                Activity activity2 = (Activity) AbstractC1246t.y0(c3307a.d());
                if (i8 != 202) {
                    if (i8 == 209 && (activity2 instanceof AbstractActivityC2489a)) {
                        activity2.runOnUiThread(new AbstractActivityC2489a.b());
                    }
                } else if (c1505o != null && (activity2 instanceof h5.b) && !(activity2 instanceof TvAppDetailActivity)) {
                    activity2.runOnUiThread(new b.a((h5.b) activity2, c1505o));
                }
                if ((activity instanceof MainActivity) && c1505o != null) {
                    activity.runOnUiThread(new MainActivity.RunnableC2483f((MainActivity) activity, i8, c1505o));
                }
                if (!(activity2 instanceof MainActivity)) {
                    if (activity2 instanceof MyDownloads) {
                        ((MyDownloads) activity2).v4(i8, c1505o);
                        return;
                    }
                    if (activity2 instanceof Updates) {
                        Updates updates = (Updates) activity2;
                        if (c1505o != null) {
                            str = c1505o.Y();
                        }
                        updates.k5(i8, str);
                        return;
                    }
                    if (activity2 instanceof MyApps) {
                        MyApps myApps = (MyApps) activity2;
                        if (c1505o != null) {
                            str = c1505o.Y();
                        }
                        activity2.runOnUiThread(new MyApps.a(i8, str));
                        return;
                    }
                    if (activity2 instanceof AppDetailActivity) {
                        activity2.runOnUiThread(new AppDetailActivity.d(i8, c1505o));
                        return;
                    }
                    if (activity2 instanceof TvAppDetailActivity) {
                        activity2.runOnUiThread(new TvAppDetailActivity.c(i8, c1505o));
                        return;
                    }
                    if (activity2 instanceof TvOldVersionsActivity) {
                        activity2.runOnUiThread(new TvOldVersionsActivity.a(i8, c1505o));
                        return;
                    }
                    if (activity2 instanceof TvMyDownloadsActivity) {
                        activity2.runOnUiThread(new TvMyDownloadsActivity.a(i8, c1505o));
                        return;
                    }
                    if (activity2 instanceof WishlistActivity) {
                        WishlistActivity wishlistActivity = (WishlistActivity) activity2;
                        if (c1505o != null) {
                            str = c1505o.Y();
                        }
                        wishlistActivity.U4(str);
                        return;
                    }
                    if (activity2 instanceof OldVersionsActivity) {
                        if (c1505o != null) {
                            l8 = Long.valueOf(c1505o.e0());
                        } else {
                            l8 = null;
                        }
                        if (l8 != null) {
                            activity2.runOnUiThread(new OldVersionsActivity.c(i8, c1505o));
                        }
                        if (i8 == 202 && c1505o != null) {
                            String Y7 = c1505o.Y();
                            AbstractC3159y.f(Y7);
                            long e02 = c1505o.e0();
                            String X7 = c1505o.X();
                            AbstractC3159y.f(X7);
                            activity2.runOnUiThread(new OldVersionsActivity.b((OldVersionsActivity) activity2, Y7, e02, X7));
                        }
                        if (i8 == 208) {
                            activity2.runOnUiThread(new OldVersionsActivity.c(i8, null));
                            return;
                        }
                        return;
                    }
                    if (activity2 instanceof MoreInfo) {
                        activity2.runOnUiThread(new MoreInfo.a(c1505o));
                    } else if (activity2 instanceof OrganizationActivity) {
                        ((OrganizationActivity) activity2).y3(c1505o);
                    }
                }
            }
        }
    }
}
