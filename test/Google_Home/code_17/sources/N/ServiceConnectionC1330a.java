package N;

import Q.AbstractC1400p;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: N.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ServiceConnectionC1330a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f7450a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f7451b = new LinkedBlockingQueue();

    public IBinder a(long j8, TimeUnit timeUnit) {
        AbstractC1400p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f7450a) {
            this.f7450a = true;
            IBinder iBinder = (IBinder) this.f7451b.poll(j8, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7451b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
