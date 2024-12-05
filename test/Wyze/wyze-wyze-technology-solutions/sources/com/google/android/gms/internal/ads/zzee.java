package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzee extends zzcf<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f15015b;

    /* renamed from: c, reason: collision with root package name */
    public Long f15016c;

    /* renamed from: d, reason: collision with root package name */
    public Long f15017d;

    /* renamed from: e, reason: collision with root package name */
    public Long f15018e;

    /* renamed from: f, reason: collision with root package name */
    public Long f15019f;

    /* renamed from: g, reason: collision with root package name */
    public Long f15020g;

    /* renamed from: h, reason: collision with root package name */
    public Long f15021h;

    /* renamed from: i, reason: collision with root package name */
    public Long f15022i;

    /* renamed from: j, reason: collision with root package name */
    public Long f15023j;

    /* renamed from: k, reason: collision with root package name */
    public Long f15024k;
    public Long l;

    public zzee() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcf
    public final void a(String str) {
        HashMap b2 = zzcf.b(str);
        if (b2 != null) {
            this.f15015b = (Long) b2.get(0);
            this.f15016c = (Long) b2.get(1);
            this.f15017d = (Long) b2.get(2);
            this.f15018e = (Long) b2.get(3);
            this.f15019f = (Long) b2.get(4);
            this.f15020g = (Long) b2.get(5);
            this.f15021h = (Long) b2.get(6);
            this.f15022i = (Long) b2.get(7);
            this.f15023j = (Long) b2.get(8);
            this.f15024k = (Long) b2.get(9);
            this.l = (Long) b2.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    protected final HashMap<Integer, Long> c() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f15015b);
        hashMap.put(1, this.f15016c);
        hashMap.put(2, this.f15017d);
        hashMap.put(3, this.f15018e);
        hashMap.put(4, this.f15019f);
        hashMap.put(5, this.f15020g);
        hashMap.put(6, this.f15021h);
        hashMap.put(7, this.f15022i);
        hashMap.put(8, this.f15023j);
        hashMap.put(9, this.f15024k);
        hashMap.put(10, this.l);
        return hashMap;
    }

    public zzee(String str) {
        a(str);
    }
}
