package com.uptodown.receivers;

import H4.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.UptodownApp;
import j6.n;
import o5.C3683w;

/* loaded from: classes5.dex */
public final class BootDeviceReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (intent.getAction() != null && n.s(intent.getAction(), "android.intent.action.BOOT_COMPLETED", true) && context != null) {
                    UptodownApp.f29058B.l0(context);
                    C3683w.f36547a.y(j.f3824g.a(context));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
