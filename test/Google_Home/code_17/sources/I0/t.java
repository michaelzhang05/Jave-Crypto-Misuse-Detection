package i0;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import q0.C3826j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t extends s {

    /* renamed from: a, reason: collision with root package name */
    private final C3826j f32855a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(C3826j c3826j) {
        this.f32855a = c3826j;
    }

    @Override // i0.s, i0.q
    public final void C(int i8, boolean z8, Bundle bundle) {
        P.m.a(new Status(i8), Boolean.valueOf(z8), this.f32855a);
    }

    @Override // i0.s, i0.q
    public final void v(Status status, boolean z8, Bundle bundle) {
        P.m.a(status, Boolean.valueOf(z8), this.f32855a);
    }
}
