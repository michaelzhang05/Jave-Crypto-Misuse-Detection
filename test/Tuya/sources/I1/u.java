package i1;

import L5.I;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import h6.C2758a;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import k1.C3106f;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final w f31538a;

    /* renamed from: b, reason: collision with root package name */
    private final P5.g f31539b;

    /* renamed from: c, reason: collision with root package name */
    private final t f31540c;

    /* renamed from: d, reason: collision with root package name */
    private final C3106f f31541d;

    /* renamed from: e, reason: collision with root package name */
    private final r f31542e;

    /* renamed from: f, reason: collision with root package name */
    private long f31543f;

    /* renamed from: g, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f31544g;

    /* loaded from: classes3.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC3159y.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC3159y.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC3159y.i(activity, "activity");
            u.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC3159y.i(activity, "activity");
            u.this.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            AbstractC3159y.i(activity, "activity");
            AbstractC3159y.i(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC3159y.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC3159y.i(activity, "activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f31546a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f31548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar, P5.d dVar) {
            super(2, dVar);
            this.f31548c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f31548c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f31546a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                t tVar = u.this.f31540c;
                o oVar = this.f31548c;
                this.f31546a = 1;
                if (tVar.a(oVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public u(w timeProvider, P5.g backgroundDispatcher, t sessionInitiateListener, C3106f sessionsSettings, r sessionGenerator) {
        AbstractC3159y.i(timeProvider, "timeProvider");
        AbstractC3159y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3159y.i(sessionInitiateListener, "sessionInitiateListener");
        AbstractC3159y.i(sessionsSettings, "sessionsSettings");
        AbstractC3159y.i(sessionGenerator, "sessionGenerator");
        this.f31538a = timeProvider;
        this.f31539b = backgroundDispatcher;
        this.f31540c = sessionInitiateListener;
        this.f31541d = sessionsSettings;
        this.f31542e = sessionGenerator;
        this.f31543f = timeProvider.a();
        e();
        this.f31544g = new a();
    }

    private final void e() {
        AbstractC2829k.d(N.a(this.f31539b), null, null, new b(this.f31542e.a(), null), 3, null);
    }

    public final void b() {
        this.f31543f = this.f31538a.a();
    }

    public final void c() {
        if (C2758a.g(C2758a.D(this.f31538a.a(), this.f31543f), this.f31541d.c()) > 0) {
            e();
        }
    }

    public final Application.ActivityLifecycleCallbacks d() {
        return this.f31544g;
    }
}
