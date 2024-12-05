package O;

import R.AbstractC1319p;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: O.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ServiceConnectionC1257a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f7649a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f7650b = new LinkedBlockingQueue();

    public IBinder a(long j8, TimeUnit timeUnit) {
        AbstractC1319p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f7649a) {
            this.f7649a = true;
            IBinder iBinder = (IBinder) this.f7650b.poll(j8, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7650b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
