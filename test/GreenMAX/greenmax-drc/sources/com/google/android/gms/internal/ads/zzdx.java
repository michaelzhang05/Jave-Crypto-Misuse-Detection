package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzdx extends zzcf<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f15003b;

    /* renamed from: c, reason: collision with root package name */
    public Long f15004c;

    public zzdx() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcf
    public final void a(String str) {
        HashMap b2 = zzcf.b(str);
        if (b2 != null) {
            this.f15003b = (Long) b2.get(0);
            this.f15004c = (Long) b2.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    protected final HashMap<Integer, Long> c() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f15003b);
        hashMap.put(1, this.f15004c);
        return hashMap;
    }

    public zzdx(String str) {
        a(str);
    }
}
