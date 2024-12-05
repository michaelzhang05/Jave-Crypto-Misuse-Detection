package P7;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.storage.SharedStorage;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class g implements ViewModelProvider.Factory {
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
        SharedStorage m8 = dVar.m();
        ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
        return new f(m8, choiceCmp.getCallback(), dVar.p().b(), choiceCmp.getPortalConfig$app_release(), dVar.o(), dVar.e());
    }
}
