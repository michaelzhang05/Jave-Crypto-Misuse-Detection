package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzdw extends zzcf<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public Long f15000b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f15001c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f15002d;

    public zzdw() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcf
    public final void a(String str) {
        HashMap b2 = zzcf.b(str);
        if (b2 != null) {
            this.f15000b = (Long) b2.get(0);
            this.f15001c = (Boolean) b2.get(1);
            this.f15002d = (Boolean) b2.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    protected final HashMap<Integer, Object> c() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f15000b);
        hashMap.put(1, this.f15001c);
        hashMap.put(2, this.f15002d);
        return hashMap;
    }

    public zzdw(String str) {
        a(str);
    }
}
