package e4;

import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f implements o {

    /* renamed from: b, reason: collision with root package name */
    private final CardScanSheet f31627b;

    public f(CardScanSheet cardScanSheet) {
        AbstractC3255y.i(cardScanSheet, "cardScanSheet");
        this.f31627b = cardScanSheet;
    }

    @Override // e4.o
    public void a() {
        this.f31627b.present();
    }
}
