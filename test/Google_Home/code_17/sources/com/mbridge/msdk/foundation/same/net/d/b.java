package com.mbridge.msdk.foundation.same.net.d;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f20682a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20683b;

    public b(String str, String str2) {
        this.f20682a = str;
        this.f20683b = str2;
    }

    public final String a() {
        return this.f20682a;
    }

    public final String b() {
        return this.f20683b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f20682a, bVar.f20682a) && TextUtils.equals(this.f20683b, bVar.f20683b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20682a.hashCode() * 31) + this.f20683b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f20682a + ",value=" + this.f20683b + "]";
    }
}
