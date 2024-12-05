package j2;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3062b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3062b f32966a = new C3062b();

    private C3062b() {
    }

    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        int i8 = 0;
        boolean z8 = true;
        for (int length = str.length() - 1; -1 < length; length--) {
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(charAt);
            z8 = !z8;
            if (z8) {
                numericValue *= 2;
            }
            if (numericValue > 9) {
                numericValue -= 9;
            }
            i8 += numericValue;
        }
        if (i8 % 10 != 0) {
            return false;
        }
        return true;
    }
}
