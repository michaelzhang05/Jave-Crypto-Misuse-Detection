package com.mbridge.msdk.e.a.a;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f18757a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.e.a.i> f18758b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18759c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f18760d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f18761e;

    public f(int i8, List<com.mbridge.msdk.e.a.i> list) {
        this(i8, list, -1, null);
    }

    public final int a() {
        return this.f18757a;
    }

    public final List<com.mbridge.msdk.e.a.i> b() {
        return DesugarCollections.unmodifiableList(this.f18758b);
    }

    public final int c() {
        return this.f18759c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f18760d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f18761e != null) {
            return new ByteArrayInputStream(this.f18761e);
        }
        return null;
    }

    public f(int i8, List<com.mbridge.msdk.e.a.i> list, int i9, InputStream inputStream) {
        this.f18757a = i8;
        this.f18758b = list;
        this.f18759c = i9;
        this.f18760d = inputStream;
        this.f18761e = null;
    }
}
