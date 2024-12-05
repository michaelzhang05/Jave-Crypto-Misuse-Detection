package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f1321a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f1322b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i6, CharSequence charSequence) {
        this.f1321a = i6;
        this.f1322b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String a6 = a(this.f1322b);
        String a7 = a(charSequence);
        return (a6 == null && a7 == null) || (a6 != null && a6.equals(a7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f1321a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence c() {
        return this.f1322b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1321a == eVar.f1321a && d(eVar.f1322b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1321a), a(this.f1322b)});
    }
}
