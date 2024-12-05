package j$.time.format;

import com.mbridge.msdk.MBridgeConstans;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j implements f {

    /* renamed from: d, reason: collision with root package name */
    static final String[] f31947d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e, reason: collision with root package name */
    static final j f31948e = new j("+HH:MM:ss", "Z");

    /* renamed from: a, reason: collision with root package name */
    private final String f31949a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31950b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31951c;

    static {
        new j("+HH:MM:ss", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i8 = 0;
        while (true) {
            String[] strArr = f31947d;
            if (i8 >= 22) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
            if (strArr[i8].equals(str)) {
                this.f31950b = i8;
                this.f31951c = i8 % 11;
                this.f31949a = str2;
                return;
            }
            i8++;
        }
    }

    private static void a(boolean z8, int i8, StringBuilder sb) {
        sb.append(z8 ? ":" : "");
        sb.append((char) ((i8 / 10) + 48));
        sb.append((char) ((i8 % 10) + 48));
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        Long e8 = pVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z8 = false;
        if (e8 == null) {
            return false;
        }
        long longValue = e8.longValue();
        int i8 = (int) longValue;
        if (longValue != i8) {
            throw new ArithmeticException();
        }
        String str = this.f31949a;
        if (i8 != 0) {
            int abs = Math.abs((i8 / 3600) % 100);
            int abs2 = Math.abs((i8 / 60) % 60);
            int abs3 = Math.abs(i8 % 60);
            int length = sb.length();
            sb.append(i8 < 0 ? "-" : "+");
            if (this.f31950b >= 11 && abs < 10) {
                sb.append((char) (abs + 48));
            } else {
                a(false, abs, sb);
            }
            int i9 = this.f31951c;
            if ((i9 >= 3 && i9 <= 8) || ((i9 >= 9 && abs3 > 0) || (i9 >= 1 && abs2 > 0))) {
                a(i9 > 0 && i9 % 2 == 0, abs2, sb);
                abs += abs2;
                if (i9 == 7 || i9 == 8 || (i9 >= 5 && abs3 > 0)) {
                    if (i9 > 0 && i9 % 2 == 0) {
                        z8 = true;
                    }
                    a(z8, abs3, sb);
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb.setLength(length);
            }
            return true;
        }
        sb.append(str);
        return true;
    }

    public final String toString() {
        String replace = this.f31949a.replace("'", "''");
        return "Offset(" + f31947d[this.f31950b] + ",'" + replace + "')";
    }
}
