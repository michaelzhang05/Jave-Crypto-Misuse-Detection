package com.mbridge.msdk.e.a.a;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f19812a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.e.a.i> f19813b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19814c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f19815d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f19816e;

    public f(int i8, List<com.mbridge.msdk.e.a.i> list) {
        this(i8, list, -1, null);
    }

    public final int a() {
        return this.f19812a;
    }

    public final List<com.mbridge.msdk.e.a.i> b() {
        return DesugarCollections.unmodifiableList(this.f19813b);
    }

    public final int c() {
        return this.f19814c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f19815d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f19816e != null) {
            return new ByteArrayInputStream(this.f19816e);
        }
        return null;
    }

    public f(int i8, List<com.mbridge.msdk.e.a.i> list, int i9, InputStream inputStream) {
        this.f19812a = i8;
        this.f19813b = list;
        this.f19814c = i9;
        this.f19815d = inputStream;
        this.f19816e = null;
    }
}
