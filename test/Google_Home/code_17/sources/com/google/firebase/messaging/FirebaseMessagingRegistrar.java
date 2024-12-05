package com.google.firebase.messaging;

import D0.C1053c;
import D0.InterfaceC1055e;
import a1.InterfaceC1612a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(D0.F f8, InterfaceC1055e interfaceC1055e) {
        A0.f fVar = (A0.f) interfaceC1055e.a(A0.f.class);
        android.support.v4.media.a.a(interfaceC1055e.a(InterfaceC1612a.class));
        return new FirebaseMessaging(fVar, null, interfaceC1055e.c(j1.i.class), interfaceC1055e.c(Z0.j.class), (c1.e) interfaceC1055e.a(c1.e.class), interfaceC1055e.f(f8), (Y0.d) interfaceC1055e.a(Y0.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1053c> getComponents() {
        final D0.F a8 = D0.F.a(S0.b.class, s.j.class);
        return Arrays.asList(C1053c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(D0.r.l(A0.f.class)).b(D0.r.h(InterfaceC1612a.class)).b(D0.r.j(j1.i.class)).b(D0.r.j(Z0.j.class)).b(D0.r.l(c1.e.class)).b(D0.r.i(a8)).b(D0.r.l(Y0.d.class)).f(new D0.h() { // from class: com.google.firebase.messaging.B
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(D0.F.this, interfaceC1055e);
                return lambda$getComponents$0;
            }
        }).c().d(), j1.h.b(LIBRARY_NAME, "24.0.1"));
    }
}
