package com.uptodown.activities;

import X4.S;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class J extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28302a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28303b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f28304c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f28305d;

    /* loaded from: classes4.dex */
    public enum a {
        USERNAME,
        PASSWORD
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f28309a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28310b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28311c;

        /* renamed from: d, reason: collision with root package name */
        private final a f28312d;

        public b(int i8, boolean z8, String str, a credential) {
            AbstractC3159y.i(credential, "credential");
            this.f28309a = i8;
            this.f28310b = z8;
            this.f28311c = str;
            this.f28312d = credential;
        }

        public final a a() {
            return this.f28312d;
        }

        public final boolean b() {
            return this.f28310b;
        }

        public final String c() {
            return this.f28311c;
        }

        public final int d() {
            return this.f28309a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f28309a == bVar.f28309a && this.f28310b == bVar.f28310b && AbstractC3159y.d(this.f28311c, bVar.f28311c) && this.f28312d == bVar.f28312d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i8 = this.f28309a * 31;
            boolean z8 = this.f28310b;
            int i9 = z8;
            if (z8 != 0) {
                i9 = 1;
            }
            int i10 = (i8 + i9) * 31;
            String str = this.f28311c;
            return ((i10 + (str == null ? 0 : str.hashCode())) * 31) + this.f28312d.hashCode();
        }

        public String toString() {
            return "CredentialChangeData(success=" + this.f28309a + ", error=" + this.f28310b + ", regErrors=" + this.f28311c + ", credential=" + this.f28312d + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28313a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28315c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28316d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28317e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f28318f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f28319g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, T t8, Q q8, P5.d dVar) {
            super(2, dVar);
            this.f28315c = context;
            this.f28316d = str;
            this.f28317e = str2;
            this.f28318f = t8;
            this.f28319g = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28315c, this.f28316d, this.f28317e, this.f28318f, this.f28319g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f28313a == 0) {
                L5.t.b(obj);
                J.this.f28302a.setValue(AbstractC3337y.a.f34547a);
                X4.I e8 = new C3312F(this.f28315c).e(this.f28316d, this.f28317e);
                if (!e8.b() && (d8 = e8.d()) != null && d8.length() != 0) {
                    String d9 = e8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    this.f28318f.f33761a = e8.g(jSONObject);
                    if (!jSONObject.isNull("success")) {
                        this.f28319g.f33759a = jSONObject.getInt("success");
                    }
                }
                J.this.f28302a.setValue(new AbstractC3337y.c(new b(this.f28319g.f33759a, e8.b(), (String) this.f28318f.f33761a, a.PASSWORD)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28320a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28322c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28323d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f28324e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f28325f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f28326g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ X4.Q f28327h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f28328i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, int i8, T t8, Q q8, X4.Q q9, String str2, P5.d dVar) {
            super(2, dVar);
            this.f28322c = context;
            this.f28323d = str;
            this.f28324e = i8;
            this.f28325f = t8;
            this.f28326g = q8;
            this.f28327h = q9;
            this.f28328i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f28322c, this.f28323d, this.f28324e, this.f28325f, this.f28326g, this.f28327h, this.f28328i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f28320a == 0) {
                L5.t.b(obj);
                J.this.f28302a.setValue(AbstractC3337y.a.f34547a);
                X4.I f8 = new C3312F(this.f28322c).f(this.f28323d, this.f28324e);
                if (!f8.b() && (d8 = f8.d()) != null && d8.length() != 0) {
                    String d9 = f8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    this.f28325f.f33761a = f8.g(jSONObject);
                    if (!jSONObject.isNull("success")) {
                        this.f28326g.f33759a = jSONObject.getInt("success");
                        if (this.f28326g.f33759a == 1) {
                            X4.Q q8 = this.f28327h;
                            if (q8 != null) {
                                q8.X(this.f28323d);
                            }
                            X4.Q q9 = this.f28327h;
                            if (q9 != null) {
                                q9.a0(this.f28328i);
                            }
                            X4.Q q10 = this.f28327h;
                            if (q10 != null) {
                                q10.L(this.f28322c);
                            }
                        }
                    }
                }
                J.this.f28302a.setValue(new AbstractC3337y.c(new b(this.f28326g.f33759a, f8.b(), (String) this.f28325f.f33761a, a.USERNAME)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J f28332d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, ArrayList arrayList, J j8, P5.d dVar) {
            super(2, dVar);
            this.f28330b = context;
            this.f28331c = arrayList;
            this.f28332d = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28330b, this.f28331c, this.f28332d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f28329a == 0) {
                L5.t.b(obj);
                X4.I s02 = new C3312F(this.f28330b).s0();
                if (!s02.b() && (d8 = s02.d()) != null && d8.length() != 0) {
                    String d9 = s02.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            ArrayList arrayList = this.f28331c;
                            S s8 = new S();
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            AbstractC3159y.h(jSONObject2, "jsonArray.getJSONObject(i)");
                            s8.a(jSONObject2);
                            arrayList.add(s8);
                        }
                    }
                }
                this.f28332d.f28304c.setValue(this.f28331c);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public J() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.b.f34548a);
        this.f28302a = a8;
        this.f28303b = a8;
        l6.v a9 = AbstractC3351M.a(new ArrayList());
        this.f28304c = a9;
        this.f28305d = a9;
    }

    public final void c(Context context, String newPassword, String confirmNewPassword) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(newPassword, "newPassword");
        AbstractC3159y.i(confirmNewPassword, "confirmNewPassword");
        Q q8 = new Q();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, newPassword, confirmNewPassword, new T(), q8, null), 2, null);
    }

    public final void d(Context context, String newUsername, X4.Q q8, int i8, String usernameFormat) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(newUsername, "newUsername");
        AbstractC3159y.i(usernameFormat, "usernameFormat");
        Q q9 = new Q();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(context, newUsername, i8, new T(), q9, q8, usernameFormat, null), 2, null);
    }

    public final void e(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(context, new ArrayList(), this, null), 2, null);
    }

    public final InterfaceC3349K f() {
        return this.f28303b;
    }

    public final InterfaceC3349K g() {
        return this.f28305d;
    }
}
