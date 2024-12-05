package i1;

import L5.I;
import a1.InterfaceC1554e;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import j1.C3047a;
import j1.InterfaceC3048b;
import k1.C3106f;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: h, reason: collision with root package name */
    public static final a f31485h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final y0.e f31486a;

    /* renamed from: b, reason: collision with root package name */
    private final C2768b f31487b;

    /* renamed from: c, reason: collision with root package name */
    private final C3106f f31488c;

    /* renamed from: d, reason: collision with root package name */
    private final w f31489d;

    /* renamed from: e, reason: collision with root package name */
    private final r f31490e;

    /* renamed from: f, reason: collision with root package name */
    private final g f31491f;

    /* renamed from: g, reason: collision with root package name */
    private final n f31492g;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31493a;

        /* renamed from: b, reason: collision with root package name */
        Object f31494b;

        /* renamed from: c, reason: collision with root package name */
        Object f31495c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31496d;

        /* renamed from: f, reason: collision with root package name */
        int f31498f;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31496d = obj;
            this.f31498f |= Integer.MIN_VALUE;
            return k.this.b(null, this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements t {
        c() {
        }

        @Override // i1.t
        public Object a(o oVar, P5.d dVar) {
            Object b8 = k.this.b(oVar, dVar);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return I.f6487a;
        }
    }

    public k(y0.e firebaseApp, InterfaceC1554e firebaseInstallations, i6.I backgroundDispatcher, i6.I blockingDispatcher, Z0.b transportFactoryProvider) {
        AbstractC3159y.i(firebaseApp, "firebaseApp");
        AbstractC3159y.i(firebaseInstallations, "firebaseInstallations");
        AbstractC3159y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3159y.i(blockingDispatcher, "blockingDispatcher");
        AbstractC3159y.i(transportFactoryProvider, "transportFactoryProvider");
        this.f31486a = firebaseApp;
        C2768b a8 = q.f31523a.a(firebaseApp);
        this.f31487b = a8;
        Context k8 = firebaseApp.k();
        AbstractC3159y.h(k8, "firebaseApp.applicationContext");
        C3106f c3106f = new C3106f(k8, blockingDispatcher, backgroundDispatcher, firebaseInstallations, a8);
        this.f31488c = c3106f;
        v vVar = new v();
        this.f31489d = vVar;
        g gVar = new g(transportFactoryProvider);
        this.f31491f = gVar;
        this.f31492g = new n(firebaseInstallations, gVar);
        r rVar = new r(d(), vVar, null, 4, null);
        this.f31490e = rVar;
        final u uVar = new u(vVar, backgroundDispatcher, new c(), c3106f, rVar);
        final Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(uVar.d());
            firebaseApp.h(new y0.f() { // from class: i1.j
            });
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(3:20|21|(2:23|24)(2:25|(2:27|28)(5:29|(1:31)|13|14|15))))(1:32))(2:60|(1:62)(1:63))|33|(2:35|36)(7:37|(2:40|38)|41|42|(3:48|(3:51|(3:53|54|(1:56)(3:57|21|(0)(0)))(1:58)|49)|59)|46|47)))|66|6|7|(0)(0)|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0032, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
    
        android.util.Log.w("FirebaseSessions", "FirebaseApp is not initialized. Sessions library will not collect session data.", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(i1.o r11, P5.d r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.k.b(i1.o, P5.d):java.lang.Object");
    }

    private final boolean d() {
        if (Math.random() <= this.f31488c.b()) {
            return true;
        }
        return false;
    }

    public final void c(InterfaceC3048b subscriber) {
        AbstractC3159y.i(subscriber, "subscriber");
        C3047a.f32719a.e(subscriber);
        Log.d("FirebaseSessions", "Registering Sessions SDK subscriber with name: " + subscriber.c() + ", data collection enabled: " + subscriber.b());
        if (this.f31490e.e()) {
            subscriber.a(new InterfaceC3048b.C0764b(this.f31490e.d().b()));
        }
    }
}
