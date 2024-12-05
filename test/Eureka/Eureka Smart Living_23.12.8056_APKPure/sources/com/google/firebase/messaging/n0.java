package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n0 {
    private static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context, boolean z5) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z5);
        edit.apply();
    }
}
