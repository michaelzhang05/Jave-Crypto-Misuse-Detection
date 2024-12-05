package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.m;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.utils.j;
import androidx.work.n;

/* loaded from: classes.dex */
public class SystemAlarmService extends m implements e.c {

    /* renamed from: g, reason: collision with root package name */
    private static final String f1843g = n.f("SystemAlarmService");

    /* renamed from: h, reason: collision with root package name */
    private e f1844h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1845i;

    private void e() {
        e eVar = new e(this);
        this.f1844h = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.f1845i = true;
        n.c().a(f1843g, "All commands completed in dispatcher", new Throwable[0]);
        j.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f1845i = false;
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f1845i = true;
        this.f1844h.j();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f1845i) {
            n.c().d(f1843g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1844h.j();
            e();
            this.f1845i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1844h.a(intent, i3);
        return 3;
    }
}
