package com.stripe.android.ui.core.cardscan;

import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import P5.a0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import e4.o;
import g4.C2879a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import m2.r;
import n3.i;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardScanActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28160b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f28161c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f28162a = l.b(new c());

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class b extends C3252v implements Function1 {
        b(Object obj) {
            super(1, obj, CardScanActivity.class, "onScanFinished", "onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", 0);
        }

        public final void d(CardScanSheetResult p02) {
            AbstractC3255y.i(p02, "p0");
            ((CardScanActivity) this.receiver).p(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((CardScanSheetResult) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2879a invoke() {
            return C2879a.c(CardScanActivity.this.getLayoutInflater());
        }
    }

    private final C2879a o() {
        return (C2879a) this.f28162a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(CardScanSheetResult cardScanSheetResult) {
        Intent putExtra = new Intent().putExtra("CardScanActivityResult", (Parcelable) cardScanSheetResult);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        setResult(-1, putExtra);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o().getRoot());
        o.a aVar = o.f31772a;
        String g8 = r.f35037c.a(this).g();
        b bVar = new b(this);
        i.a aVar2 = i.f35386a;
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
        o.a.b(aVar, this, g8, bVar, aVar2.a(applicationContext, a0.d("CardScan")), null, null, 48, null).a();
    }
}
