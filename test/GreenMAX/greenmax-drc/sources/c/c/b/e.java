package c.c.b;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class e {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final b.b.a.b f2376b;

    /* renamed from: c, reason: collision with root package name */
    private final b.b.a.a f2377c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f2378d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(b.b.a.b bVar, b.b.a.a aVar, ComponentName componentName) {
        this.f2376b = bVar;
        this.f2377c = aVar;
        this.f2378d = componentName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder a() {
        return this.f2377c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName b() {
        return this.f2378d;
    }

    public boolean c(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f2376b.b1(this.f2377c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
