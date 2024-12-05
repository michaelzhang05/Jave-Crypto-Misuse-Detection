package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
/* loaded from: classes2.dex */
public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: f, reason: collision with root package name */
    private boolean f10491f = false;

    /* renamed from: g, reason: collision with root package name */
    private final BlockingQueue<IBinder> f10492g = new LinkedBlockingQueue();

    @KeepForSdk
    public IBinder a(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f10491f) {
            this.f10491f = true;
            IBinder poll = this.f10492g.poll(j2, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10492g.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
