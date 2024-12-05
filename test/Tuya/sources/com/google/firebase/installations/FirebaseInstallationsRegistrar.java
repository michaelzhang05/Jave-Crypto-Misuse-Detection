package com.google.firebase.installations;

import B0.C1062c;
import B0.F;
import B0.InterfaceC1064e;
import B0.r;
import C0.k;
import a1.InterfaceC1554e;
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
    public static /* synthetic */ InterfaceC1554e lambda$getComponents$0(InterfaceC1064e interfaceC1064e) {
        return new c((y0.e) interfaceC1064e.a(y0.e.class), interfaceC1064e.d(X0.i.class), (ExecutorService) interfaceC1064e.f(F.a(A0.a.class, ExecutorService.class)), k.a((Executor) interfaceC1064e.f(F.a(A0.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1062c> getComponents() {
        return Arrays.asList(C1062c.e(InterfaceC1554e.class).h(LIBRARY_NAME).b(r.k(y0.e.class)).b(r.i(X0.i.class)).b(r.j(F.a(A0.a.class, ExecutorService.class))).b(r.j(F.a(A0.b.class, Executor.class))).f(new B0.h() { // from class: a1.f
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                InterfaceC1554e lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC1064e);
                return lambda$getComponents$0;
            }
        }).d(), X0.h.a(), h1.h.b(LIBRARY_NAME, "17.1.4"));
    }
}
