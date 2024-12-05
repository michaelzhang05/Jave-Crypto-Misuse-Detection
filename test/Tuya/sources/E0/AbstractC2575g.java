package e0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;

/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2575g extends ContextCompat {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i8;
        Intent registerReceiver;
        if (AbstractC2573e.a()) {
            if (true != AbstractC2573e.a()) {
                i8 = 0;
            } else {
                i8 = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i8);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
