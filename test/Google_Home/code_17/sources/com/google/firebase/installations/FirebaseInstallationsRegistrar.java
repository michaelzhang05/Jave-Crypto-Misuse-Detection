package com.google.firebase.installations;

import D0.C1053c;
import D0.F;
import D0.InterfaceC1055e;
import D0.r;
import E0.k;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c1.e lambda$getComponents$0(InterfaceC1055e interfaceC1055e) {
        return new c((A0.f) interfaceC1055e.a(A0.f.class), interfaceC1055e.c(Z0.i.class), (ExecutorService) interfaceC1055e.b(F.a(C0.a.class, ExecutorService.class)), k.a((Executor) interfaceC1055e.b(F.a(C0.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1053c> getComponents() {
        return Arrays.asList(C1053c.e(c1.e.class).h(LIBRARY_NAME).b(r.l(A0.f.class)).b(r.j(Z0.i.class)).b(r.k(F.a(C0.a.class, ExecutorService.class))).b(r.k(F.a(C0.b.class, Executor.class))).f(new D0.h() { // from class: c1.f
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                e lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC1055e);
                return lambda$getComponents$0;
            }
        }).d(), Z0.h.a(), j1.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
