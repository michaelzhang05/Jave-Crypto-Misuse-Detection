package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.c;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.C3657j;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExternalPaymentMethodProxyActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25446b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f25447c = 8;

    /* renamed from: a, reason: collision with root package name */
    private boolean f25448a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f25448a = bundle.getBoolean("has_confirm_started");
        }
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        if (stringExtra != null && !this.f25448a) {
            this.f25448a = true;
            C3657j.f37338a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        c cVar = (c) getIntent().getParcelableExtra("external_payment_method_result");
        if (stringExtra == null && cVar == null) {
            finish();
            return;
        }
        if (cVar != null) {
            if (cVar instanceof c.C0606c) {
                setResult(-1);
            } else if (cVar instanceof c.a) {
                setResult(0);
            } else if (cVar instanceof c.d) {
                Intent putExtra = new Intent().putExtra("external_payment_method_error_message", ((c.d) cVar).b());
                AbstractC3159y.h(putExtra, "putExtra(...)");
                setResult(1, putExtra);
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC3159y.i(outState, "outState");
        outState.putBoolean("has_confirm_started", this.f25448a);
        super.onSaveInstanceState(outState);
    }
}
