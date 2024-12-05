package com.uptodown.receivers;

import a5.C1648o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3671k;
import o5.C3677q;
import o5.C3683w;

/* loaded from: classes5.dex */
public final class DownloadNotificationReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30846a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        int intExtra;
        DownloadApkWorker.a aVar;
        C1648o b8;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1881097171) {
                if (hashCode != 75902422) {
                    if (hashCode == 1980572282 && str.equals("CANCEL") && (intExtra = intent.getIntExtra("notificationID", -1)) == 261 && (b8 = (aVar = DownloadApkWorker.f31034k).b()) != null) {
                        aVar.a(b8.h());
                        if (context != null) {
                            b8.n0(context);
                            if (new C3671k().k(context).isEmpty()) {
                                C3683w.f36547a.c(context, intExtra);
                            }
                            String X7 = b8.X();
                            if (X7 != null && X7.length() != 0) {
                                File f8 = new C3677q().f(context);
                                String X8 = b8.X();
                                AbstractC3255y.f(X8);
                                File file = new File(f8, X8);
                                if (file.exists()) {
                                    file.delete();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (str.equals("PAUSE")) {
                    DownloadWorker.f31052c.f();
                    return;
                }
                return;
            }
            if (str.equals("RESUME")) {
                DownloadWorker.f31052c.h();
            }
        }
    }
}
