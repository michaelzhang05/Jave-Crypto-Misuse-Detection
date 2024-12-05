package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final List f16048a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC2236s a(String str) {
        if (this.f16048a.contains(AbstractC2128g2.c(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract InterfaceC2236s b(String str, V2 v22, List list);
}
