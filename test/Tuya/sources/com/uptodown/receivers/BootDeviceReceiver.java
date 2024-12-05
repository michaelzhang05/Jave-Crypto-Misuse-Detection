package com.uptodown.receivers;

import E4.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.UptodownApp;
import g6.n;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class BootDeviceReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (intent.getAction() != null && n.s(intent.getAction(), "android.intent.action.BOOT_COMPLETED", true) && context != null) {
                    UptodownApp.f28003B.l0(context);
                    C3335w.f34546a.y(j.f2274g.a(context));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
