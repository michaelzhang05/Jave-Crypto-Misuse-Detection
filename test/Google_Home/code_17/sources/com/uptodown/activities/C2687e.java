package com.uptodown.activities;

import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3660F;
import o5.C3678r;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import org.json.JSONObject;

/* renamed from: com.uptodown.activities.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2687e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30238a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30239b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f30240c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f30241d;

    /* renamed from: com.uptodown.activities.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f30242a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30243b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30244c;

        public a(int i8, String str, String str2) {
            this.f30242a = i8;
            this.f30243b = str;
            this.f30244c = str2;
        }

        public final String a() {
            return this.f30243b;
        }

        public final String b() {
            return this.f30244c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30242a == aVar.f30242a && AbstractC3255y.d(this.f30243b, aVar.f30243b) && AbstractC3255y.d(this.f30244c, aVar.f30244c);
        }

        public int hashCode() {
            int i8 = this.f30242a * 31;
            String str = this.f30243b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f30244c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "LoginData(loginResult=" + this.f30242a + ", loginMessage=" + this.f30243b + ", regErrors=" + this.f30244c + ')';
        }
    }

    /* renamed from: com.uptodown.activities.e$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f30245a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30246b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30247c;

        public b(int i8, String str, String str2) {
            this.f30245a = i8;
            this.f30246b = str;
            this.f30247c = str2;
        }

        public final String a() {
            return this.f30247c;
        }

        public final String b() {
            return this.f30246b;
        }

        public final int c() {
            return this.f30245a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30245a == bVar.f30245a && AbstractC3255y.d(this.f30246b, bVar.f30246b) && AbstractC3255y.d(this.f30247c, bVar.f30247c);
        }

        public int hashCode() {
            int i8 = this.f30245a * 31;
            String str = this.f30246b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f30247c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SignUpData(success=" + this.f30245a + ", signUpMessage=" + this.f30246b + ", regErrors=" + this.f30247c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30248a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30251d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30252e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f30253f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f30254g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f30255h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f30256i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, T t8, Q q8, T t9, T t10, S5.d dVar) {
            super(2, dVar);
            this.f30250c = context;
            this.f30251d = str;
            this.f30252e = str2;
            this.f30253f = t8;
            this.f30254g = q8;
            this.f30255h = t9;
            this.f30256i = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f30250c, this.f30251d, this.f30252e, this.f30253f, this.f30254g, this.f30255h, this.f30256i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f30248a == 0) {
                O5.t.b(obj);
                C2687e.this.f30238a.setValue(AbstractC3685y.a.f36548a);
                a5.I A02 = new C3660F(this.f30250c).A0(this.f30251d, this.f30252e);
                if (!A02.b() && (d8 = A02.d()) != null && d8.length() != 0) {
                    T t8 = new T();
                    String d9 = A02.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    t8.f34162a = jSONObject;
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = ((JSONObject) t8.f34162a).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3255y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                        t8.f34162a = jSONObject2;
                        T t9 = this.f30253f;
                        a5.Q q8 = new a5.Q();
                        q8.l(this.f30250c, (JSONObject) t8.f34162a);
                        t9.f34162a = q8;
                        String J8 = SettingsPreferences.f30353b.J(this.f30250c);
                        if (J8 != null && J8.length() != 0) {
                            a5.Q q9 = (a5.Q) this.f30253f.f34162a;
                            if (q9 != null) {
                                q9.H(this.f30250c);
                            }
                            this.f30254g.f34160a = 1;
                        } else {
                            a5.Q.f14058k.b(this.f30250c);
                        }
                        if (!((JSONObject) t8.f34162a).isNull("message")) {
                            this.f30255h.f34162a = ((JSONObject) t8.f34162a).getString("message");
                        }
                    }
                    this.f30256i.f34162a = A02.g((JSONObject) t8.f34162a);
                }
                if (this.f30253f.f34162a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signin");
                    new C3678r(this.f30250c).b("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("responseCode", String.valueOf(A02.e()));
                    String c8 = A02.c();
                    if (c8 != null && c8.length() != 0) {
                        String c9 = A02.c();
                        AbstractC3255y.f(c9);
                        bundle2.putString("exception", c9);
                    }
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signin");
                    new C3678r(this.f30250c).b("login", bundle2);
                }
                C2687e.this.f30238a.setValue(new AbstractC3685y.c(new a(this.f30254g.f34160a, (String) this.f30255h.f34162a, (String) this.f30256i.f34162a)));
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
    /* renamed from: com.uptodown.activities.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30257a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30259c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30260d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30261e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30262f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f30263g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f30264h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f30265i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, String str2, String str3, Q q8, T t8, T t9, S5.d dVar) {
            super(2, dVar);
            this.f30259c = context;
            this.f30260d = str;
            this.f30261e = str2;
            this.f30262f = str3;
            this.f30263g = q8;
            this.f30264h = t8;
            this.f30265i = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f30259c, this.f30260d, this.f30261e, this.f30262f, this.f30263g, this.f30264h, this.f30265i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f30257a == 0) {
                O5.t.b(obj);
                C2687e.this.f30240c.setValue(AbstractC3685y.a.f36548a);
                a5.I R02 = new C3660F(this.f30259c).R0(this.f30260d, this.f30261e, this.f30262f);
                if (!R02.b() && (d8 = R02.d()) != null && d8.length() != 0) {
                    String d9 = R02.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success")) {
                        this.f30263g.f34160a = jSONObject.getInt("success");
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("message")) {
                            this.f30264h.f34162a = jSONObject2.getString("message");
                        }
                    }
                    this.f30265i.f34162a = R02.g(jSONObject);
                }
                if (this.f30263g.f34160a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signup");
                    new C3678r(this.f30259c).b("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signup");
                    bundle2.putString("responseCode", String.valueOf(R02.e()));
                    if (R02.c() != null) {
                        String c8 = R02.c();
                        AbstractC3255y.f(c8);
                        bundle2.putString("exception", c8);
                    }
                    new C3678r(this.f30259c).b("login", bundle2);
                }
                C2687e.this.f30240c.setValue(new AbstractC3685y.c(new b(this.f30263g.f34160a, (String) this.f30264h.f34162a, (String) this.f30265i.f34162a)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public C2687e() {
        AbstractC3685y.b bVar = AbstractC3685y.b.f36549a;
        o6.w a8 = AbstractC3700N.a(bVar);
        this.f30238a = a8;
        this.f30239b = a8;
        o6.w a9 = AbstractC3700N.a(bVar);
        this.f30240c = a9;
        this.f30241d = a9;
    }

    public final void c(Context context, String username, String password) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(username, "username");
        AbstractC3255y.i(password, "password");
        Q q8 = new Q();
        q8.f34160a = -2;
        T t8 = new T();
        T t9 = new T();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, username, password, new T(), q8, t8, t9, null), 2, null);
    }

    public final void d(Context context, String username, String email, String pass) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(username, "username");
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(pass, "pass");
        T t8 = new T();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(context, username, pass, email, new Q(), t8, new T(), null), 2, null);
    }

    public final InterfaceC3698L e() {
        return this.f30239b;
    }

    public final InterfaceC3698L f() {
        return this.f30241d;
    }

    public final boolean g(String username, String password) {
        AbstractC3255y.i(username, "username");
        AbstractC3255y.i(password, "password");
        if (username.length() > 0 && password.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean h(String username, String email, String password) {
        AbstractC3255y.i(username, "username");
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(password, "password");
        if (username.length() > 0 && email.length() > 0 && password.length() > 5) {
            return true;
        }
        return false;
    }

    public final boolean i(String email) {
        AbstractC3255y.i(email, "email");
        return Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(email).matches();
    }
}
