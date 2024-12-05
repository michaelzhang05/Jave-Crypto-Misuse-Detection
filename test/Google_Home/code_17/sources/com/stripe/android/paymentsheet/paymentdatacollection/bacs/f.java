package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f implements G3.c {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f27239a;

    public f(ActivityResultLauncher activityResultLauncher) {
        AbstractC3255y.i(activityResultLauncher, "activityResultLauncher");
        this.f27239a = activityResultLauncher;
    }

    @Override // G3.c
    public void a(G3.e data, u.b appearance) {
        AbstractC3255y.i(data, "data");
        AbstractC3255y.i(appearance, "appearance");
        this.f27239a.launch(new BacsMandateConfirmationContract.a(data.b(), data.c(), data.d(), data.a(), appearance));
    }
}
