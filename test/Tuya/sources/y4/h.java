package Y4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.Updates;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class h extends ResultReceiver {
    public h(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle resultData) {
        AbstractC3159y.i(resultData, "resultData");
        String string = resultData.getString("packageName");
        if (UptodownApp.f28003B.Q()) {
            C3307A c3307a = C3307A.f34473a;
            if (c3307a.d().size() > 0) {
                Object obj = c3307a.d().get(c3307a.d().size() - 1);
                AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                Activity activity = (Activity) obj;
                if (activity instanceof Updates) {
                    if (string != null) {
                        ((Updates) activity).l5(i8, string);
                        return;
                    }
                    return;
                }
                if (activity instanceof MyApps) {
                    if (string != null) {
                        ((MyApps) activity).Z4(i8, string);
                        return;
                    }
                    return;
                }
                if (activity instanceof AppDetailActivity) {
                    if (string != null) {
                        activity.runOnUiThread(new AppDetailActivity.c((AppDetailActivity) activity, string, i8));
                        return;
                    }
                    return;
                }
                if (activity instanceof MyDownloads) {
                    activity.runOnUiThread(new MyDownloads.a(i8));
                    return;
                }
                if (activity instanceof OldVersionsActivity) {
                    activity.runOnUiThread(new OldVersionsActivity.d(string, i8));
                    return;
                }
                if (activity instanceof InstallerActivity) {
                    if (i8 == 351) {
                        ((InstallerActivity) activity).f2();
                        return;
                    } else {
                        activity.finish();
                        return;
                    }
                }
                if (activity instanceof TvAppDetailActivity) {
                    if (string != null) {
                        activity.runOnUiThread(new TvAppDetailActivity.b((TvAppDetailActivity) activity, string, i8));
                    }
                } else if ((activity instanceof MainActivity) && string != null) {
                    activity.runOnUiThread(new MainActivity.RunnableC2481d((MainActivity) activity, i8, string));
                }
            }
        }
    }
}
