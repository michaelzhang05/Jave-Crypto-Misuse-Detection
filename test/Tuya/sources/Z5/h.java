package z5;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;
import y5.s;

/* loaded from: classes5.dex */
public final class h implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
        return n.a(this, interfaceC2643c, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return n.c(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass) {
        AbstractC3159y.i(modelClass, "modelClass");
        O7.d dVar = O7.d.f7806a;
        s n8 = dVar.n();
        if (O7.d.f7830y == null) {
            O7.d.f7830y = new L7.h(dVar.i(), dVar.l(), new M7.e());
        }
        L7.g gVar = O7.d.f7830y;
        if (gVar == null) {
            AbstractC3159y.y("disclosureRepository_");
            gVar = null;
        }
        return new g(n8, gVar, dVar.p());
    }
}
