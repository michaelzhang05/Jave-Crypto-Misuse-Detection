package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzhx extends zzhw {

    /* renamed from: b, reason: collision with root package name */
    private final Map<UUID, byte[]> f15120b;

    public zzhx(String str) {
        super(str);
        this.f15120b = new HashMap();
    }

    public final void a(Map<UUID, byte[]> map) {
        this.f15120b.putAll(map);
    }
}
