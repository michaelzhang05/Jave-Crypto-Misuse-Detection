package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2139y {

    /* renamed from: a, reason: collision with root package name */
    final List f15960a = new ArrayList();

    public abstract r a(String str, T1 t12, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(String str) {
        if (this.f15960a.contains(AbstractC2110u2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
