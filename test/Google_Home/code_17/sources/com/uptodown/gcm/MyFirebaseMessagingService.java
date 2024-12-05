package com.uptodown.gcm;

import O5.I;
import O5.t;
import S5.d;
import a5.x;
import a6.InterfaceC1668n;
import android.app.Activity;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.S;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2683a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.S;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.N;
import o5.C3655A;
import o5.C3667g;

/* loaded from: classes5.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f30831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30832c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MyFirebaseMessagingService f30833d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30834e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30835f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.gcm.MyFirebaseMessagingService$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0705a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30836a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30837b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30838c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f30839d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0705a(String str, String str2, long j8, d dVar) {
                super(2, dVar);
                this.f30837b = str;
                this.f30838c = str2;
                this.f30839d = j8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0705a(this.f30837b, this.f30838c, this.f30839d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30836a == 0) {
                    t.b(obj);
                    if (UptodownApp.f29058B.Q()) {
                        C3655A c3655a = C3655A.f36474a;
                        if (c3655a.d().size() > 0) {
                            Object obj2 = c3655a.d().get(c3655a.d().size() - 1);
                            AbstractC3255y.h(obj2, "StaticResources.activity….activity_stack.size - 1]");
                            Activity activity = (Activity) obj2;
                            if (activity instanceof AbstractActivityC2683a) {
                                ((AbstractActivityC2683a) activity).f2(this.f30837b, this.f30838c, this.f30839d);
                            }
                        }
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((C0705a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, String str, MyFirebaseMessagingService myFirebaseMessagingService, String str2, String str3, d dVar) {
            super(2, dVar);
            this.f30831b = j8;
            this.f30832c = str;
            this.f30833d = myFirebaseMessagingService;
            this.f30834e = str2;
            this.f30835f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(this.f30831b, this.f30832c, this.f30833d, this.f30834e, this.f30835f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30830a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                x xVar = new x();
                xVar.j(this.f30831b);
                xVar.m(this.f30832c);
                Context applicationContext = this.f30833d.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                xVar.n(applicationContext);
                J0 c8 = C3347b0.c();
                C0705a c0705a = new C0705a(this.f30834e, this.f30835f, this.f30831b, null);
                this.f30830a = 1;
                if (AbstractC3360i.g(c8, c0705a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30840a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30842c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30843d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S f30844e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30845f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, S s8, String str3, d dVar) {
            super(2, dVar);
            this.f30842c = str;
            this.f30843d = str2;
            this.f30844e = s8;
            this.f30845f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(this.f30842c, this.f30843d, this.f30844e, this.f30845f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30840a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                MyFirebaseMessagingService myFirebaseMessagingService = MyFirebaseMessagingService.this;
                String str = this.f30842c;
                String str2 = this.f30843d;
                long j8 = this.f30844e.f34161a;
                String str3 = this.f30845f;
                this.f30840a = 1;
                if (myFirebaseMessagingService.x(str, str2, j8, str3, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(String str, String str2, long j8, String str3, d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new a(j8, str3, this, str, str2, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void y(String str) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(com.google.firebase.messaging.S remoteMessage) {
        String str;
        AbstractC3255y.i(remoteMessage, "remoteMessage");
        AbstractC3255y.h(remoteMessage.p(), "remoteMessage.data");
        if ((!r0.isEmpty()) && (str = (String) remoteMessage.p().get("appId")) != null) {
            S s8 = new S();
            s8.f34161a = -1L;
            try {
                s8.f34161a = Long.parseLong(str);
            } catch (NumberFormatException e8) {
                e8.printStackTrace();
            }
            if (s8.f34161a > 0) {
                String str2 = (String) remoteMessage.p().get("packageName");
                if (!new C3667g().r(str2, getApplicationContext()) && remoteMessage.u() != null) {
                    S.b u8 = remoteMessage.u();
                    AbstractC3255y.f(u8);
                    String a8 = u8.a();
                    S.b u9 = remoteMessage.u();
                    AbstractC3255y.f(u9);
                    AbstractC3364k.d(N.a(C3347b0.b()), null, null, new b(u9.c(), a8, s8, str2, null), 3, null);
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void t(String token) {
        AbstractC3255y.i(token, "token");
        y(token);
    }
}
