package j0;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import r0.C3679j;
import s0.AbstractC3711a;
import s0.C3719i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC3044u extends AbstractBinderC3042s {

    /* renamed from: a, reason: collision with root package name */
    private final C3679j f32713a;

    public BinderC3044u(C3679j c3679j) {
        this.f32713a = c3679j;
    }

    @Override // j0.AbstractBinderC3042s, j0.InterfaceC3040q
    public final void a0(Status status, C3719i c3719i, Bundle bundle) {
        AbstractC3711a.b(status, c3719i, this.f32713a);
    }
}
