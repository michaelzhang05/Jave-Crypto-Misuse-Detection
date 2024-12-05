package com.stripe.android.ui.core.cardscan;

import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import M5.a0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import b4.o;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import d4.C2555a;
import j2.r;
import k3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardScanActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final a f27105b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f27106c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f27107a = l.b(new c());

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class b extends C3156v implements Function1 {
        b(Object obj) {
            super(1, obj, CardScanActivity.class, "onScanFinished", "onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", 0);
        }

        public final void d(CardScanSheetResult p02) {
            AbstractC3159y.i(p02, "p0");
            ((CardScanActivity) this.receiver).p(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((CardScanSheetResult) obj);
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2555a invoke() {
            return C2555a.c(CardScanActivity.this.getLayoutInflater());
        }
    }

    private final C2555a o() {
        return (C2555a) this.f27107a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(CardScanSheetResult cardScanSheetResult) {
        Intent putExtra = new Intent().putExtra("CardScanActivityResult", (Parcelable) cardScanSheetResult);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        setResult(-1, putExtra);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o().getRoot());
        o.a aVar = o.f14766a;
        String e8 = r.f33061c.a(this).e();
        b bVar = new b(this);
        i.a aVar2 = i.f33394a;
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
        o.a.b(aVar, this, e8, bVar, aVar2.a(applicationContext, a0.d("CardScan")), null, null, 48, null).a();
    }
}
