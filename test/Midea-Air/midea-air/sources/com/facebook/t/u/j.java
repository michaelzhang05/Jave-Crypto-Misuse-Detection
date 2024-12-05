package com.facebook.t.u;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionInfo.java */
/* loaded from: classes.dex */
public class j {
    private Long a;

    /* renamed from: b, reason: collision with root package name */
    private Long f9638b;

    /* renamed from: c, reason: collision with root package name */
    private int f9639c;

    /* renamed from: d, reason: collision with root package name */
    private Long f9640d;

    /* renamed from: e, reason: collision with root package name */
    private l f9641e;

    /* renamed from: f, reason: collision with root package name */
    private UUID f9642f;

    public j(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public static void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        l.a();
    }

    public static j h() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e());
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
        long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j2 == 0 || j3 == 0 || string == null) {
            return null;
        }
        j jVar = new j(Long.valueOf(j2), Long.valueOf(j3));
        jVar.f9639c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        jVar.f9641e = l.b();
        jVar.f9640d = Long.valueOf(System.currentTimeMillis());
        jVar.f9642f = UUID.fromString(string);
        return jVar;
    }

    public long b() {
        Long l = this.f9640d;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public int c() {
        return this.f9639c;
    }

    public UUID d() {
        return this.f9642f;
    }

    public Long e() {
        return this.f9638b;
    }

    public long f() {
        Long l;
        if (this.a == null || (l = this.f9638b) == null) {
            return 0L;
        }
        return l.longValue() - this.a.longValue();
    }

    public l g() {
        return this.f9641e;
    }

    public void i() {
        this.f9639c++;
    }

    public void j(Long l) {
        this.f9638b = l;
    }

    public void k() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f9638b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f9639c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f9642f.toString());
        edit.apply();
        l lVar = this.f9641e;
        if (lVar != null) {
            lVar.c();
        }
    }

    public j(Long l, Long l2, UUID uuid) {
        this.a = l;
        this.f9638b = l2;
        this.f9642f = uuid;
    }
}
