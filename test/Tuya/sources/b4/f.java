package b4;

import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f implements o {

    /* renamed from: b, reason: collision with root package name */
    private final CardScanSheet f14621b;

    public f(CardScanSheet cardScanSheet) {
        AbstractC3159y.i(cardScanSheet, "cardScanSheet");
        this.f14621b = cardScanSheet;
    }

    @Override // b4.o
    public void a() {
        this.f14621b.present();
    }
}
