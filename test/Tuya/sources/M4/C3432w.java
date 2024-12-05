package m4;

/* renamed from: m4.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3432w implements I {
    @Override // m4.I
    public boolean invoke() {
        try {
            Class.forName("com.google.android.libraries.places.api.Places");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
