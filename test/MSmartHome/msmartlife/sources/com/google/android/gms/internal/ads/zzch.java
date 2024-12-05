package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzch extends zzcf<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public String f14052b;

    /* renamed from: c, reason: collision with root package name */
    public long f14053c;

    /* renamed from: d, reason: collision with root package name */
    public String f14054d;

    /* renamed from: e, reason: collision with root package name */
    public String f14055e;

    /* renamed from: f, reason: collision with root package name */
    public String f14056f;

    public zzch(String str) {
        this();
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcf
    public final void a(String str) {
        HashMap b2 = zzcf.b(str);
        if (b2 != null) {
            this.f14052b = b2.get(0) == null ? "E" : (String) b2.get(0);
            this.f14053c = b2.get(1) == null ? -1L : ((Long) b2.get(1)).longValue();
            this.f14054d = b2.get(2) == null ? "E" : (String) b2.get(2);
            this.f14055e = b2.get(3) == null ? "E" : (String) b2.get(3);
            this.f14056f = b2.get(4) != null ? (String) b2.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    protected final HashMap<Integer, Object> c() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f14052b);
        hashMap.put(4, this.f14056f);
        hashMap.put(3, this.f14055e);
        hashMap.put(2, this.f14054d);
        hashMap.put(1, Long.valueOf(this.f14053c));
        return hashMap;
    }

    public zzch() {
        this.f14052b = "E";
        this.f14053c = -1L;
        this.f14054d = "E";
        this.f14055e = "E";
        this.f14056f = "E";
    }
}
