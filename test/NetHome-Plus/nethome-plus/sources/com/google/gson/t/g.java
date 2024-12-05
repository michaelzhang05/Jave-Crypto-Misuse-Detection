package com.google.gson.t;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes2.dex */
public final class g extends Number {

    /* renamed from: f, reason: collision with root package name */
    private final String f16894f;

    public g(String str) {
        this.f16894f = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f16894f);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f16894f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f16894f;
        String str2 = ((g) obj).f16894f;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f16894f);
    }

    public int hashCode() {
        return this.f16894f.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f16894f);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f16894f);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f16894f).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f16894f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f16894f).longValue();
        }
    }

    public String toString() {
        return this.f16894f;
    }
}
