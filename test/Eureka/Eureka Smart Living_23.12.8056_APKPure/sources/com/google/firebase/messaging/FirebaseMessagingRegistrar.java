package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(z3.e eVar) {
        w3.e eVar2 = (w3.e) eVar.a(w3.e.class);
        androidx.appcompat.app.f0.a(eVar.a(j4.a.class));
        return new FirebaseMessaging(eVar2, null, eVar.b(s4.i.class), eVar.b(i4.j.class), (l4.e) eVar.a(l4.e.class), (b1.g) eVar.a(b1.g.class), (h4.d) eVar.a(h4.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<z3.c> getComponents() {
        return Arrays.asList(z3.c.c(FirebaseMessaging.class).g(LIBRARY_NAME).b(z3.r.i(w3.e.class)).b(z3.r.g(j4.a.class)).b(z3.r.h(s4.i.class)).b(z3.r.h(i4.j.class)).b(z3.r.g(b1.g.class)).b(z3.r.i(l4.e.class)).b(z3.r.i(h4.d.class)).e(new z3.h() { // from class: com.google.firebase.messaging.z
            @Override // z3.h
            public final Object a(z3.e eVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).c().d(), s4.h.b(LIBRARY_NAME, "23.1.2"));
    }
}
