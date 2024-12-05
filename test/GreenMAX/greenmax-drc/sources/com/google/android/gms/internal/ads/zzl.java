package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzl {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15238b;

    public zzl(String str, String str2) {
        this.a = str;
        this.f15238b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f15238b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzl.class == obj.getClass()) {
            zzl zzlVar = (zzl) obj;
            if (TextUtils.equals(this.a, zzlVar.a) && TextUtils.equals(this.f15238b, zzlVar.f15238b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f15238b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f15238b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
