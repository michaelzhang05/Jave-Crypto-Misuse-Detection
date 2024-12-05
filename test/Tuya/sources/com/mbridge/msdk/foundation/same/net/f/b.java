package com.mbridge.msdk.foundation.same.net.f;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f19652a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.foundation.same.net.d.b> f19653b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19654c;

    public b(int i8, List<com.mbridge.msdk.foundation.same.net.d.b> list, InputStream inputStream) {
        this.f19654c = i8;
        this.f19653b = list;
        this.f19652a = inputStream;
    }

    public final InputStream a() {
        return this.f19652a;
    }

    public final List<com.mbridge.msdk.foundation.same.net.d.b> b() {
        return DesugarCollections.unmodifiableList(this.f19653b);
    }

    public final int c() {
        return this.f19654c;
    }
}
