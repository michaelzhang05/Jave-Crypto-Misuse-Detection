package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3518n implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
        return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return androidx.lifecycle.n.c(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass) {
        AbstractC3159y.i(modelClass, "modelClass");
        O7.d dVar = O7.d.f7806a;
        return new C3517m(dVar.n(), dVar.j(), dVar.j().f2376c, dVar.p(), dVar.j().f2375b.b(), dVar.j().f2375b.f2342j, dVar.j().f2375b.f2344l, dVar.j().f2375b.f2341i, dVar.j().f2375b.f2343k);
    }
}
