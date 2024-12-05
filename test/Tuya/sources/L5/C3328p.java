package l5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3328p {
    public final long a(Context context) {
        AbstractC3159y.i(context, "context");
        return new C3329q().f(context).getFreeSpace();
    }

    public final long b(Context context) {
        AbstractC3159y.i(context, "context");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object systemService = context.getSystemService("activity");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public final boolean c(Context context) {
        boolean z8;
        AbstractC3159y.i(context, "context");
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
        if (intExtra3 != 1 && intExtra3 != 2) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (((int) ((intExtra / intExtra2) * 100.0f)) < 25 && !z8) {
            return false;
        }
        return true;
    }

    public final long d(Context context) {
        AbstractC3159y.i(context, "context");
        return new C3329q().f(context).getTotalSpace();
    }

    public final long e(Context context) {
        AbstractC3159y.i(context, "context");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object systemService = context.getSystemService("activity");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
