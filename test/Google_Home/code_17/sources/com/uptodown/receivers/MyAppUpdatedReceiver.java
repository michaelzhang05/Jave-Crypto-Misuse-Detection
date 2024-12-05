package com.uptodown.receivers;

import O5.I;
import O5.t;
import S5.d;
import a5.O;
import a6.InterfaceC1668n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.N;
import o5.C3661a;
import o5.C3674n;
import o5.C3678r;
import o5.C3683w;

/* loaded from: classes5.dex */
public final class MyAppUpdatedReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f30847a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30848a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f30850c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.receivers.MyAppUpdatedReceiver$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0706a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30851a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f30852b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0706a(BroadcastReceiver.PendingResult pendingResult, d dVar) {
                super(2, dVar);
                this.f30852b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0706a(this.f30852b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30851a == 0) {
                    t.b(obj);
                    this.f30852b.finish();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((C0706a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BroadcastReceiver.PendingResult pendingResult, d dVar) {
            super(2, dVar);
            this.f30850c = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(this.f30850c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = T5.b.e();
            int i8 = this.f30848a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    Context context = MyAppUpdatedReceiver.this.f30847a;
                    AbstractC3255y.f(context);
                    String myPackagename = context.getPackageName();
                    C3674n.a aVar = C3674n.f36505t;
                    Context context2 = MyAppUpdatedReceiver.this.f30847a;
                    AbstractC3255y.f(context2);
                    C3674n a8 = aVar.a(context2);
                    a8.a();
                    AbstractC3255y.h(myPackagename, "myPackagename");
                    O u02 = a8.u0(myPackagename);
                    if (u02 != null) {
                        str = u02.l();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
                        Context context3 = MyAppUpdatedReceiver.this.f30847a;
                        AbstractC3255y.f(context3);
                        if (aVar2.R(context3)) {
                            C3661a c3661a = new C3661a();
                            Context context4 = MyAppUpdatedReceiver.this.f30847a;
                            AbstractC3255y.f(context4);
                            c3661a.a(context4, u02.l());
                            C3661a c3661a2 = new C3661a();
                            Context context5 = MyAppUpdatedReceiver.this.f30847a;
                            AbstractC3255y.f(context5);
                            c3661a2.b(context5, u02.l());
                        }
                        a8.M(myPackagename);
                        String l8 = u02.l();
                        AbstractC3255y.f(l8);
                        a8.D(l8);
                    }
                    a8.v(myPackagename);
                    a8.l();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3347b0.c();
                C0706a c0706a = new C0706a(this.f30850c, null);
                this.f30848a = 1;
                if (AbstractC3360i.g(c8, c0706a, this) == e8) {
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
        int f30853a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f30855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BroadcastReceiver.PendingResult pendingResult, d dVar) {
            super(2, dVar);
            this.f30855c = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(this.f30855c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30853a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                MyAppUpdatedReceiver myAppUpdatedReceiver = MyAppUpdatedReceiver.this;
                BroadcastReceiver.PendingResult pendingResult = this.f30855c;
                AbstractC3255y.h(pendingResult, "pendingResult");
                this.f30853a = 1;
                if (myAppUpdatedReceiver.c(pendingResult, this) == e8) {
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
    public final Object c(BroadcastReceiver.PendingResult pendingResult, d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new a(pendingResult, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context != null) {
            this.f30847a = context;
            Bundle bundle = new Bundle();
            bundle.putString("packagename", context.getPackageName());
            bundle.putString("type", "success");
            bundle.putInt("update", 1);
            new C3678r(context).b("install", bundle);
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            aVar.X0(context, false);
            aVar.c1(context, false);
            aVar.i1(context, null);
            C3683w.f36547a.f(context);
            AbstractC3364k.d(N.a(C3347b0.b()), null, null, new b(goAsync(), null), 3, null);
        }
    }
}
