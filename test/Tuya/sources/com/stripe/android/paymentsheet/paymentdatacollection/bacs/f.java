package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f implements D3.d {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f26184a;

    public f(ActivityResultLauncher activityResultLauncher) {
        AbstractC3159y.i(activityResultLauncher, "activityResultLauncher");
        this.f26184a = activityResultLauncher;
    }

    @Override // D3.d
    public void a(D3.f data, u.b appearance) {
        AbstractC3159y.i(data, "data");
        AbstractC3159y.i(appearance, "appearance");
        this.f26184a.launch(new BacsMandateConfirmationContract.a(data.b(), data.c(), data.d(), data.a(), appearance));
    }
}
