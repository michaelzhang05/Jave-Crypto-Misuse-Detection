package b4;

/* loaded from: classes4.dex */
public final class e implements j {
    @Override // b4.j
    public boolean invoke() {
        try {
            Class.forName("com.stripe.android.stripecardscan.cardscan.CardScanSheet");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
