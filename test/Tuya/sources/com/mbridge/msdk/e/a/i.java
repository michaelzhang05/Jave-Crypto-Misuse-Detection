package com.mbridge.msdk.e.a;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f18806a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18807b;

    public i(String str, String str2) {
        this.f18806a = str;
        this.f18807b = str2;
    }

    public final String a() {
        return this.f18806a;
    }

    public final String b() {
        return this.f18807b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (TextUtils.equals(this.f18806a, iVar.f18806a) && TextUtils.equals(this.f18807b, iVar.f18807b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18806a.hashCode() * 31) + this.f18807b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f18806a + ",value=" + this.f18807b + "]";
    }
}
