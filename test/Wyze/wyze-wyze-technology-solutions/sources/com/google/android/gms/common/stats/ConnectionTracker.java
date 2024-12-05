package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.Collections;
import java.util.List;

@KeepForSdk
/* loaded from: classes2.dex */
public class ConnectionTracker {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile ConnectionTracker f10971b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f10972c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f10973d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f10974e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f10975f;

    private ConnectionTracker() {
        List<String> list = Collections.EMPTY_LIST;
        this.f10972c = list;
        this.f10973d = list;
        this.f10974e = list;
        this.f10975f = list;
    }

    @KeepForSdk
    public static ConnectionTracker b() {
        if (f10971b == null) {
            synchronized (a) {
                if (f10971b == null) {
                    f10971b = new ConnectionTracker();
                }
            }
        }
        return f10971b;
    }

    @KeepForSdk
    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i2);
    }

    @KeepForSdk
    @SuppressLint({"UntrackedBindService"})
    public void c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : ClientLibraryUtils.d(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        return context.bindService(intent, serviceConnection, i2);
    }
}
