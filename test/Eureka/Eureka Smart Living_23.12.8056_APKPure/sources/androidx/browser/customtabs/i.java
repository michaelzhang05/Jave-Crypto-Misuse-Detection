package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1466a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final a.b f1467b;

    /* renamed from: c, reason: collision with root package name */
    private final a.a f1468c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f1469d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f1470e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(a.b bVar, a.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1467b = bVar;
        this.f1468c = aVar;
        this.f1469d = componentName;
        this.f1470e = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder a() {
        return this.f1468c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName b() {
        return this.f1469d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent c() {
        return this.f1470e;
    }
}
