package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2020j implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Double f15738a;

    public C2020j(Double d8) {
        if (d8 == null) {
            this.f15738a = Double.valueOf(Double.NaN);
        } else {
            this.f15738a = d8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C2020j(this.f15738a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2020j)) {
            return false;
        }
        return this.f15738a.equals(((C2020j) obj).f15738a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return this.f15738a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        int scale;
        if (Double.isNaN(this.f15738a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f15738a.doubleValue())) {
            if (this.f15738a.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal a8 = AbstractC2012i.a(BigDecimal.valueOf(this.f15738a.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (a8.scale() > 0) {
            scale = a8.precision();
        } else {
            scale = a8.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(a8);
        int indexOf = format.indexOf(ExifInterface.LONGITUDE_EAST);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return a8.toPlainString();
            }
            return format.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        boolean z8 = false;
        if (!Double.isNaN(this.f15738a.doubleValue()) && this.f15738a.doubleValue() != 0.0d) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }

    public final int hashCode() {
        return this.f15738a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        if ("toString".equals(str)) {
            return new C2115v(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }

    public final String toString() {
        return g();
    }
}
