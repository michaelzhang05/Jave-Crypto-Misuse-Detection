package j0;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import r0.C3679j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC3043t extends AbstractBinderC3042s {

    /* renamed from: a, reason: collision with root package name */
    private final C3679j f32712a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3043t(C3679j c3679j) {
        this.f32712a = c3679j;
    }

    @Override // j0.AbstractBinderC3042s, j0.InterfaceC3040q
    public final void w(Status status, boolean z8, Bundle bundle) {
        Q.m.a(status, Boolean.valueOf(z8), this.f32712a);
    }

    @Override // j0.AbstractBinderC3042s, j0.InterfaceC3040q
    public final void y(int i8, boolean z8, Bundle bundle) {
        Q.m.a(new Status(i8), Boolean.valueOf(z8), this.f32712a);
    }
}
