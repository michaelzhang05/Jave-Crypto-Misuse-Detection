package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.R;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3326n;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class o extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29279a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29280b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29281a;

        public a(ArrayList notificationsRegistry) {
            AbstractC3159y.i(notificationsRegistry, "notificationsRegistry");
            this.f29281a = notificationsRegistry;
        }

        public final ArrayList a() {
            return this.f29281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f29281a, ((a) obj).f29281a);
        }

        public int hashCode() {
            return this.f29281a.hashCode();
        }

        public String toString() {
            return "NotificationRegistryData(notificationsRegistry=" + this.f29281a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f29284c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, o oVar, P5.d dVar) {
            super(2, dVar);
            this.f29283b = context;
            this.f29284c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29283b, this.f29284c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29282a == 0) {
                L5.t.b(obj);
                C3326n a8 = C3326n.f34504t.a(this.f29283b);
                a8.a();
                a8.m();
                a8.g();
                this.f29284c.d(this.f29283b);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29285a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29286b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29287c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i8, P5.d dVar) {
            super(2, dVar);
            this.f29286b = context;
            this.f29287c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29286b, this.f29287c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29285a == 0) {
                L5.t.b(obj);
                C3326n a8 = C3326n.f34504t.a(this.f29286b);
                a8.a();
                a8.H(this.f29287c);
                a8.g();
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29288a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29289b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f29290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, o oVar, P5.d dVar) {
            super(2, dVar);
            this.f29289b = context;
            this.f29290c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29289b, this.f29290c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29288a == 0) {
                L5.t.b(obj);
                C3326n a8 = C3326n.f34504t.a(this.f29289b);
                a8.a();
                ArrayList l02 = a8.l0();
                a8.g();
                this.f29290c.f29279a.setValue(new AbstractC3337y.c(new a(l02)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29291a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.y f29293c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29294d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, X4.y yVar, String str, P5.d dVar) {
            super(2, dVar);
            this.f29292b = context;
            this.f29293c = yVar;
            this.f29294d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f29292b, this.f29293c, this.f29294d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29291a == 0) {
                L5.t.b(obj);
                C3326n a8 = C3326n.f34504t.a(this.f29292b);
                a8.a();
                X4.y yVar = this.f29293c;
                String string = this.f29292b.getString(R.string.file_deleted_notification, this.f29294d);
                AbstractC3159y.h(string, "context.getString(R.stri…notification, dateString)");
                a8.u1(yVar, "no_action", string);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public o() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f29279a = a8;
        this.f29280b = a8;
    }

    public final void b(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, this, null), 2, null);
    }

    public final void c(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, i8, null), 2, null);
    }

    public final void d(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(context, this, null), 2, null);
    }

    public final InterfaceC3349K e() {
        return this.f29280b;
    }

    public final void f(Context context, X4.y notification, String dateString) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(notification, "notification");
        AbstractC3159y.i(dateString, "dateString");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(context, notification, dateString, null), 2, null);
    }
}
