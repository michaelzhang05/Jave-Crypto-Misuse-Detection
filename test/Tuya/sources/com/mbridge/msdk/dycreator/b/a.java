package com.mbridge.msdk.dycreator.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f18305a;

    /* renamed from: b, reason: collision with root package name */
    private String f18306b;

    public a(b bVar) {
        if (bVar != null) {
            this.f18305a = bVar.a();
            this.f18306b = bVar.b();
        }
    }

    public final String toString() {
        return "DyError{errorCode=" + this.f18305a + '}';
    }

    public a(int i8, String str) {
        this.f18305a = i8;
        this.f18306b = str;
    }
}
