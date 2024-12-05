package com.google.firebase.sessions;

import A0.f;
import D0.C1053c;
import D0.F;
import D0.InterfaceC1055e;
import D0.h;
import D0.r;
import P5.AbstractC1378t;
import S5.g;
import android.content.Context;
import androidx.annotation.Keep;
import b1.InterfaceC1956b;
import c1.e;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l1.C3293B;
import l1.C3304g;
import l1.G;
import l1.InterfaceC3297F;
import l1.J;
import l1.k;
import l1.x;
import l6.I;
import n1.C3461f;
import s.j;

@Keep
/* loaded from: classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final F backgroundDispatcher;
    private static final F blockingDispatcher;
    private static final F firebaseApp;
    private static final F firebaseInstallationsApi;
    private static final F sessionLifecycleServiceBinder;
    private static final F sessionsSettings;
    private static final F transportFactory;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        F b8 = F.b(f.class);
        AbstractC3255y.h(b8, "unqualified(FirebaseApp::class.java)");
        firebaseApp = b8;
        F b9 = F.b(e.class);
        AbstractC3255y.h(b9, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = b9;
        F a8 = F.a(C0.a.class, I.class);
        AbstractC3255y.h(a8, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a8;
        F a9 = F.a(C0.b.class, I.class);
        AbstractC3255y.h(a9, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a9;
        F b10 = F.b(j.class);
        AbstractC3255y.h(b10, "unqualified(TransportFactory::class.java)");
        transportFactory = b10;
        F b11 = F.b(C3461f.class);
        AbstractC3255y.h(b11, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = b11;
        F b12 = F.b(InterfaceC3297F.class);
        AbstractC3255y.h(b12, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = b12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k getComponents$lambda$0(InterfaceC1055e interfaceC1055e) {
        Object b8 = interfaceC1055e.b(firebaseApp);
        AbstractC3255y.h(b8, "container[firebaseApp]");
        Object b9 = interfaceC1055e.b(sessionsSettings);
        AbstractC3255y.h(b9, "container[sessionsSettings]");
        Object b10 = interfaceC1055e.b(backgroundDispatcher);
        AbstractC3255y.h(b10, "container[backgroundDispatcher]");
        Object b11 = interfaceC1055e.b(sessionLifecycleServiceBinder);
        AbstractC3255y.h(b11, "container[sessionLifecycleServiceBinder]");
        return new k((f) b8, (C3461f) b9, (g) b10, (InterfaceC3297F) b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getComponents$lambda$1(InterfaceC1055e interfaceC1055e) {
        return new c(J.f34269a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$2(InterfaceC1055e interfaceC1055e) {
        Object b8 = interfaceC1055e.b(firebaseApp);
        AbstractC3255y.h(b8, "container[firebaseApp]");
        f fVar = (f) b8;
        Object b9 = interfaceC1055e.b(firebaseInstallationsApi);
        AbstractC3255y.h(b9, "container[firebaseInstallationsApi]");
        e eVar = (e) b9;
        Object b10 = interfaceC1055e.b(sessionsSettings);
        AbstractC3255y.h(b10, "container[sessionsSettings]");
        C3461f c3461f = (C3461f) b10;
        InterfaceC1956b f8 = interfaceC1055e.f(transportFactory);
        AbstractC3255y.h(f8, "container.getProvider(transportFactory)");
        C3304g c3304g = new C3304g(f8);
        Object b11 = interfaceC1055e.b(backgroundDispatcher);
        AbstractC3255y.h(b11, "container[backgroundDispatcher]");
        return new C3293B(fVar, eVar, c3461f, c3304g, (g) b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3461f getComponents$lambda$3(InterfaceC1055e interfaceC1055e) {
        Object b8 = interfaceC1055e.b(firebaseApp);
        AbstractC3255y.h(b8, "container[firebaseApp]");
        Object b9 = interfaceC1055e.b(blockingDispatcher);
        AbstractC3255y.h(b9, "container[blockingDispatcher]");
        Object b10 = interfaceC1055e.b(backgroundDispatcher);
        AbstractC3255y.h(b10, "container[backgroundDispatcher]");
        Object b11 = interfaceC1055e.b(firebaseInstallationsApi);
        AbstractC3255y.h(b11, "container[firebaseInstallationsApi]");
        return new C3461f((f) b8, (g) b9, (g) b10, (e) b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(InterfaceC1055e interfaceC1055e) {
        Context k8 = ((f) interfaceC1055e.b(firebaseApp)).k();
        AbstractC3255y.h(k8, "container[firebaseApp].applicationContext");
        Object b8 = interfaceC1055e.b(backgroundDispatcher);
        AbstractC3255y.h(b8, "container[backgroundDispatcher]");
        return new x(k8, (g) b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3297F getComponents$lambda$5(InterfaceC1055e interfaceC1055e) {
        Object b8 = interfaceC1055e.b(firebaseApp);
        AbstractC3255y.h(b8, "container[firebaseApp]");
        return new G((f) b8);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1053c> getComponents() {
        C1053c.b h8 = C1053c.e(k.class).h(LIBRARY_NAME);
        F f8 = firebaseApp;
        C1053c.b b8 = h8.b(r.k(f8));
        F f9 = sessionsSettings;
        C1053c.b b9 = b8.b(r.k(f9));
        F f10 = backgroundDispatcher;
        C1053c d8 = b9.b(r.k(f10)).b(r.k(sessionLifecycleServiceBinder)).f(new h() { // from class: l1.m
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                k components$lambda$0;
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC1055e);
                return components$lambda$0;
            }
        }).e().d();
        C1053c d9 = C1053c.e(c.class).h("session-generator").f(new h() { // from class: l1.n
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                com.google.firebase.sessions.c components$lambda$1;
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC1055e);
                return components$lambda$1;
            }
        }).d();
        C1053c.b b10 = C1053c.e(b.class).h("session-publisher").b(r.k(f8));
        F f11 = firebaseInstallationsApi;
        return AbstractC1378t.p(d8, d9, b10.b(r.k(f11)).b(r.k(f9)).b(r.m(transportFactory)).b(r.k(f10)).f(new h() { // from class: l1.o
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                com.google.firebase.sessions.b components$lambda$2;
                components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(interfaceC1055e);
                return components$lambda$2;
            }
        }).d(), C1053c.e(C3461f.class).h("sessions-settings").b(r.k(f8)).b(r.k(blockingDispatcher)).b(r.k(f10)).b(r.k(f11)).f(new h() { // from class: l1.p
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                C3461f components$lambda$3;
                components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(interfaceC1055e);
                return components$lambda$3;
            }
        }).d(), C1053c.e(com.google.firebase.sessions.a.class).h("sessions-datastore").b(r.k(f8)).b(r.k(f10)).f(new h() { // from class: l1.q
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                com.google.firebase.sessions.a components$lambda$4;
                components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(interfaceC1055e);
                return components$lambda$4;
            }
        }).d(), C1053c.e(InterfaceC3297F.class).h("sessions-service-binder").b(r.k(f8)).f(new h() { // from class: l1.r
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                InterfaceC3297F components$lambda$5;
                components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(interfaceC1055e);
                return components$lambda$5;
            }
        }).d(), j1.h.b(LIBRARY_NAME, "2.0.4"));
    }
}
