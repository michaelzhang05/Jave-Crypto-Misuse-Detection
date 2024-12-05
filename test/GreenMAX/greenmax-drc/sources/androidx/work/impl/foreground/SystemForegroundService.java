package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.m;
import androidx.work.impl.foreground.b;
import androidx.work.n;

/* loaded from: classes.dex */
public class SystemForegroundService extends m implements b.InterfaceC0037b {

    /* renamed from: g, reason: collision with root package name */
    private static final String f1893g = n.f("SystemFgService");

    /* renamed from: h, reason: collision with root package name */
    private static SystemForegroundService f1894h = null;

    /* renamed from: i, reason: collision with root package name */
    private Handler f1895i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1896j;

    /* renamed from: k, reason: collision with root package name */
    androidx.work.impl.foreground.b f1897k;
    NotificationManager l;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1898f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Notification f1899g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f1900h;

        a(int i2, Notification notification, int i3) {
            this.f1898f = i2;
            this.f1899g = notification;
            this.f1900h = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f1898f, this.f1899g, this.f1900h);
            } else {
                SystemForegroundService.this.startForeground(this.f1898f, this.f1899g);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1902f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Notification f1903g;

        b(int i2, Notification notification) {
            this.f1902f = i2;
            this.f1903g = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.l.notify(this.f1902f, this.f1903g);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1905f;

        c(int i2) {
            this.f1905f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.l.cancel(this.f1905f);
        }
    }

    private void e() {
        this.f1895i = new Handler(Looper.getMainLooper());
        this.l = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f1897k = bVar;
        bVar.m(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0037b
    public void b(int i2, int i3, Notification notification) {
        this.f1895i.post(new a(i2, notification, i3));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0037b
    public void c(int i2, Notification notification) {
        this.f1895i.post(new b(i2, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0037b
    public void d(int i2) {
        this.f1895i.post(new c(i2));
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onCreate() {
        super.onCreate();
        f1894h = this;
        e();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f1897k.k();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f1896j) {
            n.c().d(f1893g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1897k.k();
            e();
            this.f1896j = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1897k.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0037b
    public void stop() {
        this.f1896j = true;
        n.c().a(f1893g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f1894h = null;
        stopSelf();
    }
}
