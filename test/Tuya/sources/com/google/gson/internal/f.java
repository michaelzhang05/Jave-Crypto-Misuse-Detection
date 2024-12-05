package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f17741a;

    public f(String str) {
        this.f17741a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f17741a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f17741a;
        String str2 = ((f) obj).f17741a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f17741a);
    }

    public int hashCode() {
        return this.f17741a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f17741a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f17741a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f17741a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f17741a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f17741a).longValue();
        }
    }

    public String toString() {
        return this.f17741a;
    }
}
