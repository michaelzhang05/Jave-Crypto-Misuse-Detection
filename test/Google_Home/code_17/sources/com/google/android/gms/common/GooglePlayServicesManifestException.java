package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes3.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private final int f15884a;

    public GooglePlayServicesManifestException(int i8, String str) {
        super(str);
        this.f15884a = i8;
    }
}
