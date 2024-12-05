package b5;

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
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;

/* renamed from: b5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC1983h extends ResultReceiver {
    public ResultReceiverC1983h(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle resultData) {
        AbstractC3255y.i(resultData, "resultData");
        String string = resultData.getString("packageName");
        if (UptodownApp.f29058B.Q()) {
            C3655A c3655a = C3655A.f36474a;
            if (c3655a.d().size() > 0) {
                Object obj = c3655a.d().get(c3655a.d().size() - 1);
                AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
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
                    activity.runOnUiThread(new MainActivity.RunnableC2675d((MainActivity) activity, i8, string));
                }
            }
        }
    }
}
