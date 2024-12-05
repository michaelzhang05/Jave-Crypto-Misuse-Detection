package androidx.work.impl.utils;

import O5.I;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class WakeLocks {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WakeLocks");
        AbstractC3255y.h(tagWithPrefix, "tagWithPrefix(\"WakeLocks\")");
        TAG = tagWithPrefix;
    }

    public static final void checkWakeLocks() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WakeLocksHolder wakeLocksHolder = WakeLocksHolder.INSTANCE;
        synchronized (wakeLocksHolder) {
            linkedHashMap.putAll(wakeLocksHolder.getWakeLocks());
            I i8 = I.f8278a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.get().warning(TAG, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock newWakeLock(Context context, String tag) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        WakeLocksHolder wakeLocksHolder = WakeLocksHolder.INSTANCE;
        synchronized (wakeLocksHolder) {
            wakeLocksHolder.getWakeLocks().put(wakeLock, str);
        }
        AbstractC3255y.h(wakeLock, "wakeLock");
        return wakeLock;
    }
}
