package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class zabu extends zal {

    /* renamed from: k, reason: collision with root package name */
    private TaskCompletionSource<Void> f10702k;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void f() {
        super.f();
        this.f10702k.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.zal
    public final void l(ConnectionResult connectionResult, int i2) {
        this.f10702k.b(ApiExceptionUtil.a(new Status(connectionResult.w(), connectionResult.z(), connectionResult.D())));
    }

    @Override // com.google.android.gms.common.api.internal.zal
    protected final void n() {
        int i2 = this.f10744j.i(this.f10603f.c());
        if (i2 == 0) {
            this.f10702k.c(null);
        } else {
            if (this.f10702k.a().e()) {
                return;
            }
            m(new ConnectionResult(i2, null), 0);
        }
    }
}
