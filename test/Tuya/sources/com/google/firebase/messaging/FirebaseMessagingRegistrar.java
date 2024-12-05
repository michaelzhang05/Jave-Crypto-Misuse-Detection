package com.google.firebase.messaging;

import B0.C1062c;
import B0.InterfaceC1064e;
import a1.InterfaceC1554e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC1064e interfaceC1064e) {
        y0.e eVar = (y0.e) interfaceC1064e.a(y0.e.class);
        android.support.v4.media.a.a(interfaceC1064e.a(Y0.a.class));
        return new FirebaseMessaging(eVar, null, interfaceC1064e.d(h1.i.class), interfaceC1064e.d(X0.j.class), (InterfaceC1554e) interfaceC1064e.a(InterfaceC1554e.class), (s.g) interfaceC1064e.a(s.g.class), (W0.d) interfaceC1064e.a(W0.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1062c> getComponents() {
        return Arrays.asList(C1062c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(B0.r.k(y0.e.class)).b(B0.r.h(Y0.a.class)).b(B0.r.i(h1.i.class)).b(B0.r.i(X0.j.class)).b(B0.r.h(s.g.class)).b(B0.r.k(InterfaceC1554e.class)).b(B0.r.k(W0.d.class)).f(new B0.h() { // from class: com.google.firebase.messaging.z
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC1064e);
                return lambda$getComponents$0;
            }
        }).c().d(), h1.h.b(LIBRARY_NAME, "23.2.1"));
    }
}
