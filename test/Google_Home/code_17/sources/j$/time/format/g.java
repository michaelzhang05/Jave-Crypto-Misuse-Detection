package j$.time.format;

import j$.time.temporal.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33134g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j$.time.temporal.r rVar, int i8, int i9, boolean z8, int i10) {
        super(rVar, i8, i9, u.NOT_NEGATIVE, i10);
        this.f33134g = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.i
    public final i b() {
        if (this.f33140e == -1) {
            return this;
        }
        return new g(this.f33136a, this.f33137b, this.f33138c, this.f33134g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.i
    public final i c(int i8) {
        return new g(this.f33136a, this.f33137b, this.f33138c, this.f33134g, this.f33140e + i8);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        j$.time.temporal.r rVar = this.f33136a;
        Long e8 = pVar.e(rVar);
        if (e8 == null) {
            return false;
        }
        s b8 = pVar.b();
        long longValue = e8.longValue();
        w j8 = rVar.j();
        j8.b(longValue, rVar);
        BigDecimal valueOf = BigDecimal.valueOf(j8.e());
        BigDecimal add = BigDecimal.valueOf(j8.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z8 = this.f33134g;
        int i8 = this.f33137b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i8), this.f33138c), roundingMode).toPlainString().substring(2);
            b8.getClass();
            if (z8) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i8 <= 0) {
            return true;
        }
        if (z8) {
            b8.getClass();
            sb.append('.');
        }
        for (int i9 = 0; i9 < i8; i9++) {
            b8.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f33136a + "," + this.f33137b + "," + this.f33138c + (this.f33134g ? ",DecimalPoint" : "") + ")";
    }
}
