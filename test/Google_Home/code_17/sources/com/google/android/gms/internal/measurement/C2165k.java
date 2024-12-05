package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2165k implements InterfaceC2236s {

    /* renamed from: a, reason: collision with root package name */
    private final Double f16689a;

    public C2165k(Double d8) {
        if (d8 == null) {
            this.f16689a = Double.valueOf(Double.NaN);
        } else {
            this.f16689a = d8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final String A() {
        BigDecimal a8;
        int scale;
        if (Double.isNaN(this.f16689a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f16689a.doubleValue())) {
            if (this.f16689a.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.f16689a.doubleValue());
        if (valueOf.signum() == 0) {
            a8 = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            a8 = AbstractC2155j.a(valueOf);
        }
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

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s C(String str, V2 v22, List list) {
        if ("toString".equals(str)) {
            return new C2254u(A());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", A(), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s b() {
        return new C2165k(this.f16689a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2165k)) {
            return false;
        }
        return this.f16689a.equals(((C2165k) obj).f16689a);
    }

    public final int hashCode() {
        return this.f16689a.hashCode();
    }

    public final String toString() {
        return A();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Boolean y() {
        boolean z8;
        if (!Double.isNaN(this.f16689a.doubleValue()) && this.f16689a.doubleValue() != 0.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Double z() {
        return this.f16689a;
    }
}
