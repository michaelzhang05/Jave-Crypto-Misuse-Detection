package com.google.firebase.sessions;

import A0.b;
import B0.C1062c;
import B0.F;
import B0.InterfaceC1064e;
import B0.h;
import B0.r;
import M5.AbstractC1246t;
import a1.InterfaceC1554e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import i1.k;
import i6.I;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import s.g;
import y0.e;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    public static final a Companion = new a(null);
    private static final F firebaseApp = F.b(e.class);
    private static final F firebaseInstallationsApi = F.b(InterfaceC1554e.class);
    private static final F backgroundDispatcher = F.a(A0.a.class, I.class);
    private static final F blockingDispatcher = F.a(b.class, I.class);
    private static final F transportFactory = F.b(g.class);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final k m5484getComponents$lambda0(InterfaceC1064e interfaceC1064e) {
        Object f8 = interfaceC1064e.f(firebaseApp);
        AbstractC3159y.h(f8, "container.get(firebaseApp)");
        e eVar = (e) f8;
        Object f9 = interfaceC1064e.f(firebaseInstallationsApi);
        AbstractC3159y.h(f9, "container.get(firebaseInstallationsApi)");
        InterfaceC1554e interfaceC1554e = (InterfaceC1554e) f9;
        Object f10 = interfaceC1064e.f(backgroundDispatcher);
        AbstractC3159y.h(f10, "container.get(backgroundDispatcher)");
        I i8 = (I) f10;
        Object f11 = interfaceC1064e.f(blockingDispatcher);
        AbstractC3159y.h(f11, "container.get(blockingDispatcher)");
        I i9 = (I) f11;
        Z0.b e8 = interfaceC1064e.e(transportFactory);
        AbstractC3159y.h(e8, "container.getProvider(transportFactory)");
        return new k(eVar, interfaceC1554e, i8, i9, e8);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1062c> getComponents() {
        return AbstractC1246t.p(C1062c.e(k.class).h(LIBRARY_NAME).b(r.j(firebaseApp)).b(r.j(firebaseInstallationsApi)).b(r.j(backgroundDispatcher)).b(r.j(blockingDispatcher)).b(r.l(transportFactory)).f(new h() { // from class: i1.l
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                k m5484getComponents$lambda0;
                m5484getComponents$lambda0 = FirebaseSessionsRegistrar.m5484getComponents$lambda0(interfaceC1064e);
                return m5484getComponents$lambda0;
            }
        }).d(), h1.h.b(LIBRARY_NAME, "1.0.2"));
    }
}
