package com.uptodown.activities;

import a5.C1632D;
import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3660F;
import o5.C3678r;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class x extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30461a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30462b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f30463c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f30464d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f30465e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30466f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30467g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30468h;

    /* loaded from: classes4.dex */
    public enum a {
        NAME,
        DATE
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30472a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f30473b;

        public b(ArrayList userPreRegisterApps, ArrayList preRegisterApps) {
            AbstractC3255y.i(userPreRegisterApps, "userPreRegisterApps");
            AbstractC3255y.i(preRegisterApps, "preRegisterApps");
            this.f30472a = userPreRegisterApps;
            this.f30473b = preRegisterApps;
        }

        public final ArrayList a() {
            return this.f30473b;
        }

        public final ArrayList b() {
            return this.f30472a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f30472a, bVar.f30472a) && AbstractC3255y.d(this.f30473b, bVar.f30473b);
        }

        public int hashCode() {
            return (this.f30472a.hashCode() * 31) + this.f30473b.hashCode();
        }

        public String toString() {
            return "UpcomingReleasesData(userPreRegisterApps=" + this.f30472a + ", preRegisterApps=" + this.f30473b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30474a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30475b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1632D f30476c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f30477d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30478a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f30479b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0, S5.d dVar) {
                super(2, dVar);
                this.f30479b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30479b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30478a == 0) {
                    O5.t.b(obj);
                    this.f30479b.invoke();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, C1632D c1632d, Function0 function0, S5.d dVar) {
            super(2, dVar);
            this.f30475b = context;
            this.f30476c = c1632d;
            this.f30477d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f30475b, this.f30476c, this.f30477d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = T5.b.e();
            int i8 = this.f30474a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                a5.I d9 = new C3660F(this.f30475b).d(this.f30476c.b());
                if (!d9.b() && (d8 = d9.d()) != null && d8.length() != 0) {
                    String d10 = d9.d();
                    AbstractC3255y.f(d10);
                    JSONObject jSONObject = new JSONObject(d10);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "removed");
                        new C3678r(this.f30475b).b("preregister", bundle);
                        this.f30476c.i(this.f30475b);
                        J0 c8 = C3347b0.c();
                        a aVar = new a(this.f30477d, null);
                        this.f30474a = 1;
                        if (AbstractC3360i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f30480a;

        /* renamed from: b, reason: collision with root package name */
        int f30481b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f30483d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f30484e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f30485f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f30486g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, Context context, a aVar, boolean z9, S5.d dVar) {
            super(2, dVar);
            this.f30483d = z8;
            this.f30484e = context;
            this.f30485f = aVar;
            this.f30486g = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f30483d, this.f30484e, this.f30485f, this.f30486g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o6.w wVar;
            o6.w wVar2;
            Object e8 = T5.b.e();
            int i8 = this.f30481b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        wVar2 = (o6.w) this.f30480a;
                        O5.t.b(obj);
                        wVar2.setValue(obj);
                        x.this.f30461a.setValue(new AbstractC3685y.c(new b((ArrayList) x.this.f30463c.getValue(), (ArrayList) x.this.f30465e.getValue())));
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (o6.w) this.f30480a;
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                x.this.r(false);
                if (this.f30483d) {
                    x.this.f30461a.setValue(AbstractC3685y.a.f36548a);
                }
                wVar = x.this.f30463c;
                x xVar = x.this;
                Context context = this.f30484e;
                this.f30480a = wVar;
                this.f30481b = 1;
                obj = xVar.p(context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            wVar.setValue(obj);
            o6.w wVar3 = x.this.f30465e;
            x xVar2 = x.this;
            Context context2 = this.f30484e;
            a aVar = this.f30485f;
            boolean z8 = this.f30486g;
            this.f30480a = wVar3;
            this.f30481b = 2;
            Object n8 = x.n(xVar2, context2, aVar, z8, 0, this, 8, null);
            if (n8 == e8) {
                return e8;
            }
            wVar2 = wVar3;
            obj = n8;
            wVar2.setValue(obj);
            x.this.f30461a.setValue(new AbstractC3685y.c(new b((ArrayList) x.this.f30463c.getValue(), (ArrayList) x.this.f30465e.getValue())));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30487a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30489c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f30490d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f30491e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, a aVar, boolean z8, S5.d dVar) {
            super(2, dVar);
            this.f30489c = context;
            this.f30490d = aVar;
            this.f30491e = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f30489c, this.f30490d, this.f30491e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30487a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                x xVar = x.this;
                Context context = this.f30489c;
                a aVar = this.f30490d;
                boolean z8 = this.f30491e;
                int size = ((ArrayList) xVar.f30465e.getValue()).size();
                this.f30487a = 1;
                obj = xVar.m(context, aVar, z8, size, this);
                if (obj == e8) {
                    return e8;
                }
            }
            ArrayList arrayList = (ArrayList) obj;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll((Collection) x.this.f30465e.getValue());
                arrayList2.addAll(arrayList);
                x.this.f30465e.setValue(arrayList2);
                x.this.f30461a.setValue(new AbstractC3685y.c(new b((ArrayList) x.this.f30463c.getValue(), (ArrayList) x.this.f30465e.getValue())));
            } else {
                x.this.f30461a.setValue(AbstractC3685y.b.f36549a);
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30492a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30494c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f30495d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f30496e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f30497f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, boolean z8, a aVar, int i8, S5.d dVar) {
            super(2, dVar);
            this.f30494c = context;
            this.f30495d = z8;
            this.f30496e = aVar;
            this.f30497f = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f30494c, this.f30495d, this.f30496e, this.f30497f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            T5.b.e();
            if (this.f30492a == 0) {
                O5.t.b(obj);
                x.this.s(true);
                ArrayList arrayList = new ArrayList();
                C3660F c3660f = new C3660F(this.f30494c);
                if (this.f30495d) {
                    str = CampaignEx.JSON_KEY_DESC;
                } else {
                    str = "asc";
                }
                if (this.f30496e == a.DATE) {
                    str2 = "expireDate";
                } else {
                    str2 = "name";
                }
                a5.I O8 = c3660f.O(x.this.f30468h, this.f30497f, str2, str);
                if (!O8.b() && O8.d() != null) {
                    String d8 = O8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = O8.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i8 = 0; i8 < length; i8++) {
                                JSONObject jsonUpcomingRelease = jSONArray.getJSONObject(i8);
                                C1632D.a aVar = C1632D.f13956f;
                                AbstractC3255y.h(jsonUpcomingRelease, "jsonUpcomingRelease");
                                arrayList.add(aVar.b(jsonUpcomingRelease));
                            }
                        } else if (jSONObject.getInt("success") == 1) {
                            x.this.r(true);
                        }
                    }
                }
                x.this.s(false);
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, S5.d dVar) {
            super(2, dVar);
            this.f30499b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f30499b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f30498a == 0) {
                O5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                a5.I P8 = new C3660F(this.f30499b).P();
                if (!P8.b() && (d8 = P8.d()) != null && d8.length() != 0) {
                    String d9 = P8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            JSONObject jsonUpcomingRelease = jSONArray.getJSONObject(i8);
                            C1632D.a aVar = C1632D.f13956f;
                            AbstractC3255y.h(jsonUpcomingRelease, "jsonUpcomingRelease");
                            arrayList.add(aVar.b(jsonUpcomingRelease));
                        }
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30501b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1632D f30502c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f30503d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30504a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f30505b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0, S5.d dVar) {
                super(2, dVar);
                this.f30505b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30505b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30504a == 0) {
                    O5.t.b(obj);
                    this.f30505b.invoke();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, C1632D c1632d, Function0 function0, S5.d dVar) {
            super(2, dVar);
            this.f30501b = context;
            this.f30502c = c1632d;
            this.f30503d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f30501b, this.f30502c, this.f30503d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = T5.b.e();
            int i8 = this.f30500a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                a5.I a8 = new C3660F(this.f30501b).a(this.f30502c.b());
                if (!a8.b() && (d8 = a8.d()) != null && d8.length() != 0) {
                    String d9 = a8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "added");
                        new C3678r(this.f30501b).b("preregister", bundle);
                        this.f30502c.h(this.f30501b);
                        J0 c8 = C3347b0.c();
                        a aVar = new a(this.f30503d, null);
                        this.f30500a = 1;
                        if (AbstractC3360i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public x() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30461a = a8;
        this.f30462b = a8;
        o6.w a9 = AbstractC3700N.a(new ArrayList());
        this.f30463c = a9;
        this.f30464d = a9;
        this.f30465e = AbstractC3700N.a(new ArrayList());
        this.f30468h = 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Context context, a aVar, boolean z8, int i8, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new f(context, z8, aVar, i8, null), dVar);
    }

    static /* synthetic */ Object n(x xVar, Context context, a aVar, boolean z8, int i8, S5.d dVar, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        return xVar.m(context, aVar, z8, i10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(Context context, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new g(context, null), dVar);
    }

    public final void g(Context context, C1632D preRegister, Function0 callback) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(preRegister, "preRegister");
        AbstractC3255y.i(callback, "callback");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, preRegister, callback, null), 2, null);
    }

    public final void h(Context context, a sortByActive, boolean z8, boolean z9) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(sortByActive, "sortByActive");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(z9, context, sortByActive, z8, null), 2, null);
    }

    public final void i(Context context, a sortByActive, boolean z8) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(sortByActive, "sortByActive");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(context, sortByActive, z8, null), 2, null);
    }

    public final boolean j() {
        return this.f30466f;
    }

    public final InterfaceC3698L k() {
        return this.f30462b;
    }

    public final boolean l() {
        return this.f30467g;
    }

    public final InterfaceC3698L o() {
        return this.f30464d;
    }

    public final void q(Context context, C1632D preRegister, Function0 callback) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(preRegister, "preRegister");
        AbstractC3255y.i(callback, "callback");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new h(context, preRegister, callback, null), 2, null);
    }

    public final void r(boolean z8) {
        this.f30466f = z8;
    }

    public final void s(boolean z8) {
        this.f30467g = z8;
    }
}
