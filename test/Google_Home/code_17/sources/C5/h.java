package C5;

import B5.s;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
        return n.a(this, interfaceC2963c, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return n.c(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass) {
        AbstractC3255y.i(modelClass, "modelClass");
        R7.d dVar = R7.d.f9662a;
        s n8 = dVar.n();
        if (R7.d.f9686y == null) {
            R7.d.f9686y = new O7.h(dVar.i(), dVar.l(), new P7.e());
        }
        O7.g gVar = R7.d.f9686y;
        if (gVar == null) {
            AbstractC3255y.y("disclosureRepository_");
            gVar = null;
        }
        return new g(n8, gVar, dVar.p());
    }
}
