package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static String f873b;

    /* renamed from: e, reason: collision with root package name */
    private static c f876e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f877f;

    /* renamed from: g, reason: collision with root package name */
    private final NotificationManager f878g;
    private static final Object a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Set<String> f874c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f875d = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a implements d {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final int f879b;

        /* renamed from: c, reason: collision with root package name */
        final String f880c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f881d;

        a(String str, int i2, String str2, Notification notification) {
            this.a = str;
            this.f879b = i2;
            this.f880c = str2;
            this.f881d = notification;
        }

        @Override // androidx.core.app.l.d
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            aVar.d7(this.a, this.f879b, this.f880c, this.f881d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.a + ", id:" + this.f879b + ", tag:" + this.f880c + "]";
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    private static class b {
        final ComponentName a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f882b;

        b(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.f882b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: f, reason: collision with root package name */
        private final Context f883f;

        /* renamed from: g, reason: collision with root package name */
        private final HandlerThread f884g;

        /* renamed from: h, reason: collision with root package name */
        private final Handler f885h;

        /* renamed from: i, reason: collision with root package name */
        private final Map<ComponentName, a> f886i = new HashMap();

        /* renamed from: j, reason: collision with root package name */
        private Set<String> f887j = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NotificationManagerCompat.java */
        /* loaded from: classes.dex */
        public static class a {
            final ComponentName a;

            /* renamed from: c, reason: collision with root package name */
            android.support.v4.app.a f889c;

            /* renamed from: b, reason: collision with root package name */
            boolean f888b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<d> f890d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f891e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        c(Context context) {
            this.f883f = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f884g = handlerThread;
            handlerThread.start();
            this.f885h = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f888b) {
                return true;
            }
            boolean bindService = this.f883f.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
            aVar.f888b = bindService;
            if (bindService) {
                aVar.f891e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.a);
                this.f883f.unbindService(this);
            }
            return aVar.f888b;
        }

        private void b(a aVar) {
            if (aVar.f888b) {
                this.f883f.unbindService(this);
                aVar.f888b = false;
            }
            aVar.f889c = null;
        }

        private void c(d dVar) {
            j();
            for (a aVar : this.f886i.values()) {
                aVar.f890d.add(dVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f886i.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f886i.get(componentName);
            if (aVar != null) {
                aVar.f889c = a.AbstractBinderC0000a.u(iBinder);
                aVar.f891e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f886i.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.a + ", " + aVar.f890d.size() + " queued tasks");
            }
            if (aVar.f890d.isEmpty()) {
                return;
            }
            if (a(aVar) && aVar.f889c != null) {
                while (true) {
                    d peek = aVar.f890d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f889c);
                        aVar.f890d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.a);
                        }
                    } catch (RemoteException e2) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.a, e2);
                    }
                }
                if (aVar.f890d.isEmpty()) {
                    return;
                }
                i(aVar);
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f885h.hasMessages(3, aVar.a)) {
                return;
            }
            int i2 = aVar.f891e + 1;
            aVar.f891e = i2;
            if (i2 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + aVar.f890d.size() + " tasks to " + aVar.a + " after " + aVar.f891e + " retries");
                aVar.f890d.clear();
                return;
            }
            int i3 = (1 << (i2 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            this.f885h.sendMessageDelayed(this.f885h.obtainMessage(3, aVar.a), i3);
        }

        private void j() {
            Set<String> b2 = l.b(this.f883f);
            if (b2.equals(this.f887j)) {
                return;
            }
            this.f887j = b2;
            List<ResolveInfo> queryIntentServices = this.f883f.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (b2.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f886i.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f886i.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f886i.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(d dVar) {
            this.f885h.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c((d) message.obj);
                return true;
            }
            if (i2 == 1) {
                b bVar = (b) message.obj;
                e(bVar.a, bVar.f882b);
                return true;
            }
            if (i2 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f885h.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f885h.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(android.support.v4.app.a aVar) throws RemoteException;
    }

    private l(Context context) {
        this.f877f = context;
        this.f878g = (NotificationManager) context.getSystemService("notification");
    }

    public static l a(Context context) {
        return new l(context);
    }

    public static Set<String> b(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(f873b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f874c = hashSet;
                    f873b = string;
                }
            }
            set = f874c;
        }
        return set;
    }

    private void e(d dVar) {
        synchronized (f875d) {
            if (f876e == null) {
                f876e = new c(this.f877f.getApplicationContext());
            }
            f876e.h(dVar);
        }
    }

    private static boolean f(Notification notification) {
        Bundle a2 = i.a(notification);
        return a2 != null && a2.getBoolean("android.support.useSideChannel");
    }

    public void c(int i2, Notification notification) {
        d(null, i2, notification);
    }

    public void d(String str, int i2, Notification notification) {
        if (f(notification)) {
            e(new a(this.f877f.getPackageName(), i2, str, notification));
            this.f878g.cancel(str, i2);
        } else {
            this.f878g.notify(str, i2, notification);
        }
    }
}
