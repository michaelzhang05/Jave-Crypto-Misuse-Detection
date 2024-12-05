package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class h {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1830b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f1831c;

    public h(int i2, Notification notification, int i3) {
        this.a = i2;
        this.f1831c = notification;
        this.f1830b = i3;
    }

    public int a() {
        return this.f1830b;
    }

    public Notification b() {
        return this.f1831c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.f1830b == hVar.f1830b) {
            return this.f1831c.equals(hVar.f1831c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.f1830b) * 31) + this.f1831c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.f1830b + ", mNotification=" + this.f1831c + '}';
    }
}
