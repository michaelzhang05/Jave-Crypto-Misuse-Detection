package com.uptodown.receivers;

import X4.O;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3329q;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class DownloadUpdateNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        int intExtra;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1881097171) {
                if (hashCode != 75902422) {
                    if (hashCode == 1980572282 && str.equals("CANCEL") && (intExtra = intent.getIntExtra("notificationID", -1)) == 262 && context != null) {
                        UptodownApp.a aVar = UptodownApp.f28003B;
                        aVar.g();
                        DownloadWorker.f30020c.k(true);
                        Iterator it = aVar.F().iterator();
                        while (it.hasNext()) {
                            O o8 = (O) it.next();
                            DownloadUpdatesWorker.f30010k.a(o8.n());
                            UptodownApp.f28003B.c0(o8.n(), context);
                            String j8 = o8.j();
                            if (j8 != null && j8.length() != 0) {
                                File g8 = new C3329q().g(context);
                                String j9 = o8.j();
                                AbstractC3159y.f(j9);
                                File file = new File(g8, j9);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }
                        C3335w.f34546a.c(context, intExtra);
                        return;
                    }
                    return;
                }
                if (str.equals("PAUSE")) {
                    DownloadWorker.f30020c.g();
                    return;
                }
                return;
            }
            if (str.equals("RESUME")) {
                DownloadWorker.f30020c.i();
            }
        }
    }
}
