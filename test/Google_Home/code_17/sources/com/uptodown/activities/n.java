package com.uptodown.activities;

import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3674n;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class n extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30309a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30310b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30311a;

        public a(ArrayList notificationsRegistry) {
            AbstractC3255y.i(notificationsRegistry, "notificationsRegistry");
            this.f30311a = notificationsRegistry;
        }

        public final ArrayList a() {
            return this.f30311a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f30311a, ((a) obj).f30311a);
        }

        public int hashCode() {
            return this.f30311a.hashCode();
        }

        public String toString() {
            return "NotificationRegistryData(notificationsRegistry=" + this.f30311a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30312a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30313b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f30314c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, n nVar, S5.d dVar) {
            super(2, dVar);
            this.f30313b = context;
            this.f30314c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f30313b, this.f30314c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30312a == 0) {
                O5.t.b(obj);
                C3674n a8 = C3674n.f36505t.a(this.f30313b);
                a8.a();
                a8.o();
                a8.l();
                this.f30314c.d(this.f30313b);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30315a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30316b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i8, S5.d dVar) {
            super(2, dVar);
            this.f30316b = context;
            this.f30317c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f30316b, this.f30317c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30315a == 0) {
                O5.t.b(obj);
                C3674n a8 = C3674n.f36505t.a(this.f30316b);
                a8.a();
                a8.H(this.f30317c);
                a8.l();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30318a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30319b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f30320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, n nVar, S5.d dVar) {
            super(2, dVar);
            this.f30319b = context;
            this.f30320c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f30319b, this.f30320c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30318a == 0) {
                O5.t.b(obj);
                C3674n a8 = C3674n.f36505t.a(this.f30319b);
                a8.a();
                ArrayList l02 = a8.l0();
                a8.l();
                this.f30320c.f30309a.setValue(new AbstractC3685y.c(new a(l02)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30322b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a5.y f30323c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30324d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, a5.y yVar, String str, S5.d dVar) {
            super(2, dVar);
            this.f30322b = context;
            this.f30323c = yVar;
            this.f30324d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f30322b, this.f30323c, this.f30324d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30321a == 0) {
                O5.t.b(obj);
                C3674n a8 = C3674n.f36505t.a(this.f30322b);
                a8.a();
                a5.y yVar = this.f30323c;
                String string = this.f30322b.getString(R.string.file_deleted_notification, this.f30324d);
                AbstractC3255y.h(string, "context.getString(R.stri…notification, dateString)");
                a8.u1(yVar, "no_action", string);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public n() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30309a = a8;
        this.f30310b = a8;
    }

    public final void b(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, this, null), 2, null);
    }

    public final void c(Context context, int i8) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, i8, null), 2, null);
    }

    public final void d(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(context, this, null), 2, null);
    }

    public final InterfaceC3698L e() {
        return this.f30310b;
    }

    public final void f(Context context, a5.y notification, String dateString) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(notification, "notification");
        AbstractC3255y.i(dateString, "dateString");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(context, notification, dateString, null), 2, null);
    }
}
