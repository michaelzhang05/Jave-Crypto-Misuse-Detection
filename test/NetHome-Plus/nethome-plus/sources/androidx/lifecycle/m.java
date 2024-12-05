package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: LifecycleService.java */
/* loaded from: classes.dex */
public class m extends Service implements j {

    /* renamed from: f, reason: collision with root package name */
    private final t f1271f = new t(this);

    @Override // androidx.lifecycle.j
    public f getLifecycle() {
        return this.f1271f.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f1271f.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1271f.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f1271f.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        this.f1271f.e();
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
