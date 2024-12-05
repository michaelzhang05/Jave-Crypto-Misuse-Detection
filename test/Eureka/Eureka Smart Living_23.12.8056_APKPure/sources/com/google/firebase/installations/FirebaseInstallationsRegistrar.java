package com.google.firebase.installations;

import a4.k;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import z3.e0;
import z3.r;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l4.e lambda$getComponents$0(z3.e eVar) {
        return new c((w3.e) eVar.a(w3.e.class), eVar.b(i4.i.class), (ExecutorService) eVar.g(e0.a(y3.a.class, ExecutorService.class)), k.a((Executor) eVar.g(e0.a(y3.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<z3.c> getComponents() {
        return Arrays.asList(z3.c.c(l4.e.class).g(LIBRARY_NAME).b(r.i(w3.e.class)).b(r.h(i4.i.class)).b(r.j(e0.a(y3.a.class, ExecutorService.class))).b(r.j(e0.a(y3.b.class, Executor.class))).e(new z3.h() { // from class: l4.f
            @Override // z3.h
            public final Object a(z3.e eVar) {
                e lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).d(), i4.h.a(), s4.h.b(LIBRARY_NAME, "17.1.3"));
    }
}
