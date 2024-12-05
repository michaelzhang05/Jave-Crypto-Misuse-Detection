package l1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class G implements InterfaceC3297F {

    /* renamed from: b, reason: collision with root package name */
    private static final a f34264b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f34265a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public G(A0.f firebaseApp) {
        AbstractC3255y.i(firebaseApp, "firebaseApp");
        this.f34265a = firebaseApp;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return O5.I.f8278a;
        } catch (IllegalArgumentException e8) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e8));
        }
    }

    @Override // l1.InterfaceC3297F
    public void a(Messenger callback, ServiceConnection serviceConnection) {
        boolean z8;
        AbstractC3255y.i(callback, "callback");
        AbstractC3255y.i(serviceConnection, "serviceConnection");
        Context applicationContext = this.f34265a.k().getApplicationContext();
        AbstractC3255y.h(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            z8 = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e8) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e8);
            z8 = false;
        }
        if (!z8) {
            b(applicationContext, serviceConnection);
            Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
        }
    }
}
