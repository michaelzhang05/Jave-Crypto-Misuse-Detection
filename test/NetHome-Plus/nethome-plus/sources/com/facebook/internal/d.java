package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CallbackManagerImpl.java */
/* loaded from: classes.dex */
public final class d implements com.facebook.d {
    private static Map<Integer, a> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<Integer, a> f9145b = new HashMap();

    /* compiled from: CallbackManagerImpl.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i2, Intent intent);
    }

    /* compiled from: CallbackManagerImpl.java */
    /* loaded from: classes.dex */
    public enum b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10);

        private final int r;

        b(int i2) {
            this.r = i2;
        }

        public int d() {
            return com.facebook.f.j() + this.r;
        }
    }

    private static synchronized a a(Integer num) {
        a aVar;
        synchronized (d.class) {
            aVar = a.get(num);
        }
        return aVar;
    }

    public static synchronized void c(int i2, a aVar) {
        synchronized (d.class) {
            y.i(aVar, "callback");
            if (a.containsKey(Integer.valueOf(i2))) {
                return;
            }
            a.put(Integer.valueOf(i2), aVar);
        }
    }

    private static boolean d(int i2, int i3, Intent intent) {
        a a2 = a(Integer.valueOf(i2));
        if (a2 != null) {
            return a2.a(i3, intent);
        }
        return false;
    }

    public void b(int i2, a aVar) {
        y.i(aVar, "callback");
        this.f9145b.put(Integer.valueOf(i2), aVar);
    }

    @Override // com.facebook.d
    public boolean onActivityResult(int i2, int i3, Intent intent) {
        a aVar = this.f9145b.get(Integer.valueOf(i2));
        if (aVar != null) {
            return aVar.a(i3, intent);
        }
        return d(i2, i3, intent);
    }
}
