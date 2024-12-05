package com.mbridge.msdk.e.a;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f19861a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19862b;

    public i(String str, String str2) {
        this.f19861a = str;
        this.f19862b = str2;
    }

    public final String a() {
        return this.f19861a;
    }

    public final String b() {
        return this.f19862b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (TextUtils.equals(this.f19861a, iVar.f19861a) && TextUtils.equals(this.f19862b, iVar.f19862b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19861a.hashCode() * 31) + this.f19862b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f19861a + ",value=" + this.f19862b + "]";
    }
}
