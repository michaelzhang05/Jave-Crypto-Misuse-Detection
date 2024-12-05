package com.uptodown.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.AbstractC3337y;
import l5.C3312F;
import l5.C3330r;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONObject;

/* renamed from: com.uptodown.activities.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2494f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29208a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29209b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29210c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f29211d;

    /* renamed from: com.uptodown.activities.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f29212a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29213b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29214c;

        public a(int i8, String str, String str2) {
            this.f29212a = i8;
            this.f29213b = str;
            this.f29214c = str2;
        }

        public final String a() {
            return this.f29213b;
        }

        public final String b() {
            return this.f29214c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29212a == aVar.f29212a && AbstractC3159y.d(this.f29213b, aVar.f29213b) && AbstractC3159y.d(this.f29214c, aVar.f29214c);
        }

        public int hashCode() {
            int i8 = this.f29212a * 31;
            String str = this.f29213b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f29214c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "LoginData(loginResult=" + this.f29212a + ", loginMessage=" + this.f29213b + ", regErrors=" + this.f29214c + ')';
        }
    }

    /* renamed from: com.uptodown.activities.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f29215a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29216b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29217c;

        public b(int i8, String str, String str2) {
            this.f29215a = i8;
            this.f29216b = str;
            this.f29217c = str2;
        }

        public final String a() {
            return this.f29217c;
        }

        public final String b() {
            return this.f29216b;
        }

        public final int c() {
            return this.f29215a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f29215a == bVar.f29215a && AbstractC3159y.d(this.f29216b, bVar.f29216b) && AbstractC3159y.d(this.f29217c, bVar.f29217c);
        }

        public int hashCode() {
            int i8 = this.f29215a * 31;
            String str = this.f29216b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f29217c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SignUpData(success=" + this.f29215a + ", signUpMessage=" + this.f29216b + ", regErrors=" + this.f29217c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29218a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29220c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29221d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29222e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f29223f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29224g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f29225h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f29226i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, T t8, Q q8, T t9, T t10, P5.d dVar) {
            super(2, dVar);
            this.f29220c = context;
            this.f29221d = str;
            this.f29222e = str2;
            this.f29223f = t8;
            this.f29224g = q8;
            this.f29225h = t9;
            this.f29226i = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29220c, this.f29221d, this.f29222e, this.f29223f, this.f29224g, this.f29225h, this.f29226i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29218a == 0) {
                L5.t.b(obj);
                C2494f.this.f29208a.setValue(AbstractC3337y.a.f34547a);
                X4.I A02 = new C3312F(this.f29220c).A0(this.f29221d, this.f29222e);
                if (!A02.b() && (d8 = A02.d()) != null && d8.length() != 0) {
                    T t8 = new T();
                    String d9 = A02.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    t8.f33761a = jSONObject;
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = ((JSONObject) t8.f33761a).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                        t8.f33761a = jSONObject2;
                        T t9 = this.f29223f;
                        X4.Q q8 = new X4.Q();
                        q8.j(this.f29220c, (JSONObject) t8.f33761a);
                        t9.f33761a = q8;
                        String J8 = SettingsPreferences.f29323b.J(this.f29220c);
                        if (J8 != null && J8.length() != 0) {
                            X4.Q q9 = (X4.Q) this.f29223f.f33761a;
                            if (q9 != null) {
                                q9.L(this.f29220c);
                            }
                            this.f29224g.f33759a = 1;
                        } else {
                            X4.Q.f12437k.b(this.f29220c);
                        }
                        if (!((JSONObject) t8.f33761a).isNull("message")) {
                            this.f29225h.f33761a = ((JSONObject) t8.f33761a).getString("message");
                        }
                    }
                    this.f29226i.f33761a = A02.g((JSONObject) t8.f33761a);
                }
                if (this.f29223f.f33761a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signin");
                    new C3330r(this.f29220c).b("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("responseCode", String.valueOf(A02.e()));
                    String c8 = A02.c();
                    if (c8 != null && c8.length() != 0) {
                        String c9 = A02.c();
                        AbstractC3159y.f(c9);
                        bundle2.putString("exception", c9);
                    }
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signin");
                    new C3330r(this.f29220c).b("login", bundle2);
                }
                C2494f.this.f29208a.setValue(new AbstractC3337y.c(new a(this.f29224g.f33759a, (String) this.f29225h.f33761a, (String) this.f29226i.f33761a)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.f$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29227a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29229c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29230d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29231e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f29232f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29233g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f29234h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f29235i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, String str2, String str3, Q q8, T t8, T t9, P5.d dVar) {
            super(2, dVar);
            this.f29229c = context;
            this.f29230d = str;
            this.f29231e = str2;
            this.f29232f = str3;
            this.f29233g = q8;
            this.f29234h = t8;
            this.f29235i = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29229c, this.f29230d, this.f29231e, this.f29232f, this.f29233g, this.f29234h, this.f29235i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29227a == 0) {
                L5.t.b(obj);
                C2494f.this.f29210c.setValue(AbstractC3337y.a.f34547a);
                X4.I R02 = new C3312F(this.f29229c).R0(this.f29230d, this.f29231e, this.f29232f);
                if (!R02.b() && (d8 = R02.d()) != null && d8.length() != 0) {
                    String d9 = R02.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success")) {
                        this.f29233g.f33759a = jSONObject.getInt("success");
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("message")) {
                            this.f29234h.f33761a = jSONObject2.getString("message");
                        }
                    }
                    this.f29235i.f33761a = R02.g(jSONObject);
                }
                if (this.f29233g.f33759a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signup");
                    new C3330r(this.f29229c).b("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signup");
                    bundle2.putString("responseCode", String.valueOf(R02.e()));
                    if (R02.c() != null) {
                        String c8 = R02.c();
                        AbstractC3159y.f(c8);
                        bundle2.putString("exception", c8);
                    }
                    new C3330r(this.f29229c).b("login", bundle2);
                }
                C2494f.this.f29210c.setValue(new AbstractC3337y.c(new b(this.f29233g.f33759a, (String) this.f29234h.f33761a, (String) this.f29235i.f33761a)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C2494f() {
        AbstractC3337y.b bVar = AbstractC3337y.b.f34548a;
        l6.v a8 = AbstractC3351M.a(bVar);
        this.f29208a = a8;
        this.f29209b = a8;
        l6.v a9 = AbstractC3351M.a(bVar);
        this.f29210c = a9;
        this.f29211d = a9;
    }

    public final void c(Context context, String username, String password) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(password, "password");
        Q q8 = new Q();
        q8.f33759a = -2;
        T t8 = new T();
        T t9 = new T();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, username, password, new T(), q8, t8, t9, null), 2, null);
    }

    public final void d(Context context, String username, String email, String pass) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(pass, "pass");
        T t8 = new T();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(context, username, pass, email, new Q(), t8, new T(), null), 2, null);
    }

    public final InterfaceC3349K e() {
        return this.f29209b;
    }

    public final InterfaceC3349K f() {
        return this.f29211d;
    }

    public final boolean g(String username, String password) {
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(password, "password");
        if (username.length() > 0 && password.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean h(String username, String email, String password) {
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(password, "password");
        if (username.length() > 0 && email.length() > 0 && password.length() > 5) {
            return true;
        }
        return false;
    }

    public final boolean i(String email) {
        AbstractC3159y.i(email, "email");
        return Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(email).matches();
    }
}
