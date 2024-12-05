package com.mbridge.msdk.foundation.same.net.d;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f19627a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19628b;

    public b(String str, String str2) {
        this.f19627a = str;
        this.f19628b = str2;
    }

    public final String a() {
        return this.f19627a;
    }

    public final String b() {
        return this.f19628b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f19627a, bVar.f19627a) && TextUtils.equals(this.f19628b, bVar.f19628b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19627a.hashCode() * 31) + this.f19628b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f19627a + ",value=" + this.f19628b + "]";
    }
}
