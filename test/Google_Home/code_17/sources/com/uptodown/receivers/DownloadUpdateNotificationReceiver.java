package com.uptodown.receivers;

import a5.O;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3677q;
import o5.C3683w;

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
                        UptodownApp.a aVar = UptodownApp.f29058B;
                        aVar.g();
                        DownloadWorker.f31052c.k(true);
                        Iterator it = aVar.F().iterator();
                        while (it.hasNext()) {
                            O o8 = (O) it.next();
                            DownloadUpdatesWorker.f31042k.a(o8.s());
                            UptodownApp.f29058B.c0(o8.s(), context);
                            String l8 = o8.l();
                            if (l8 != null && l8.length() != 0) {
                                File g8 = new C3677q().g(context);
                                String l9 = o8.l();
                                AbstractC3255y.f(l9);
                                File file = new File(g8, l9);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }
                        C3683w.f36547a.c(context, intExtra);
                        return;
                    }
                    return;
                }
                if (str.equals("PAUSE")) {
                    DownloadWorker.f31052c.g();
                    return;
                }
                return;
            }
            if (str.equals("RESUME")) {
                DownloadWorker.f31052c.i();
            }
        }
    }
}
