package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzdqs extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f14874f;

    public zzdqs(zzdpk zzdpkVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f14874f = null;
    }

    public final zzdok a() {
        return new zzdok(getMessage());
    }
}
