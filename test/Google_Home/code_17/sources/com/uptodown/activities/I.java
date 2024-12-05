package com.uptodown.activities;

import a5.S;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3660F;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class I extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f29352a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f29353b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f29354c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f29355d;

    /* loaded from: classes4.dex */
    public enum a {
        USERNAME,
        PASSWORD
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f29359a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f29360b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29361c;

        /* renamed from: d, reason: collision with root package name */
        private final a f29362d;

        public b(int i8, boolean z8, String str, a credential) {
            AbstractC3255y.i(credential, "credential");
            this.f29359a = i8;
            this.f29360b = z8;
            this.f29361c = str;
            this.f29362d = credential;
        }

        public final a a() {
            return this.f29362d;
        }

        public final boolean b() {
            return this.f29360b;
        }

        public final String c() {
            return this.f29361c;
        }

        public final int d() {
            return this.f29359a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f29359a == bVar.f29359a && this.f29360b == bVar.f29360b && AbstractC3255y.d(this.f29361c, bVar.f29361c) && this.f29362d == bVar.f29362d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i8 = this.f29359a * 31;
            boolean z8 = this.f29360b;
            int i9 = z8;
            if (z8 != 0) {
                i9 = 1;
            }
            int i10 = (i8 + i9) * 31;
            String str = this.f29361c;
            return ((i10 + (str == null ? 0 : str.hashCode())) * 31) + this.f29362d.hashCode();
        }

        public String toString() {
            return "CredentialChangeData(success=" + this.f29359a + ", error=" + this.f29360b + ", regErrors=" + this.f29361c + ", credential=" + this.f29362d + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29363a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29365c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29366d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29367e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f29368f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29369g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, T t8, Q q8, S5.d dVar) {
            super(2, dVar);
            this.f29365c = context;
            this.f29366d = str;
            this.f29367e = str2;
            this.f29368f = t8;
            this.f29369g = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29365c, this.f29366d, this.f29367e, this.f29368f, this.f29369g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f29363a == 0) {
                O5.t.b(obj);
                I.this.f29352a.setValue(AbstractC3685y.a.f36548a);
                a5.I e8 = new C3660F(this.f29365c).e(this.f29366d, this.f29367e);
                if (!e8.b() && (d8 = e8.d()) != null && d8.length() != 0) {
                    String d9 = e8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    this.f29368f.f34162a = e8.g(jSONObject);
                    if (!jSONObject.isNull("success")) {
                        this.f29369g.f34160a = jSONObject.getInt("success");
                    }
                }
                I.this.f29352a.setValue(new AbstractC3685y.c(new b(this.f29369g.f34160a, e8.b(), (String) this.f29368f.f34162a, a.PASSWORD)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29370a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29372c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29373d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29374e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f29375f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29376g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a5.Q f29377h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f29378i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, int i8, T t8, Q q8, a5.Q q9, String str2, S5.d dVar) {
            super(2, dVar);
            this.f29372c = context;
            this.f29373d = str;
            this.f29374e = i8;
            this.f29375f = t8;
            this.f29376g = q8;
            this.f29377h = q9;
            this.f29378i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f29372c, this.f29373d, this.f29374e, this.f29375f, this.f29376g, this.f29377h, this.f29378i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f29370a == 0) {
                O5.t.b(obj);
                I.this.f29352a.setValue(AbstractC3685y.a.f36548a);
                a5.I f8 = new C3660F(this.f29372c).f(this.f29373d, this.f29374e);
                if (!f8.b() && (d8 = f8.d()) != null && d8.length() != 0) {
                    String d9 = f8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    this.f29375f.f34162a = f8.g(jSONObject);
                    if (!jSONObject.isNull("success")) {
                        this.f29376g.f34160a = jSONObject.getInt("success");
                        if (this.f29376g.f34160a == 1) {
                            a5.Q q8 = this.f29377h;
                            if (q8 != null) {
                                q8.X(this.f29373d);
                            }
                            a5.Q q9 = this.f29377h;
                            if (q9 != null) {
                                q9.a0(this.f29378i);
                            }
                            a5.Q q10 = this.f29377h;
                            if (q10 != null) {
                                q10.H(this.f29372c);
                            }
                        }
                    }
                }
                I.this.f29352a.setValue(new AbstractC3685y.c(new b(this.f29376g.f34160a, f8.b(), (String) this.f29375f.f34162a, a.USERNAME)));
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
        int f29379a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29381c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ I f29382d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, ArrayList arrayList, I i8, S5.d dVar) {
            super(2, dVar);
            this.f29380b = context;
            this.f29381c = arrayList;
            this.f29382d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f29380b, this.f29381c, this.f29382d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f29379a == 0) {
                O5.t.b(obj);
                a5.I s02 = new C3660F(this.f29380b).s0();
                if (!s02.b() && (d8 = s02.d()) != null && d8.length() != 0) {
                    String d9 = s02.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            ArrayList arrayList = this.f29381c;
                            S s8 = new S();
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            AbstractC3255y.h(jSONObject2, "jsonArray.getJSONObject(i)");
                            s8.a(jSONObject2);
                            arrayList.add(s8);
                        }
                    }
                }
                this.f29382d.f29354c.setValue(this.f29381c);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public I() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.b.f36549a);
        this.f29352a = a8;
        this.f29353b = a8;
        o6.w a9 = AbstractC3700N.a(new ArrayList());
        this.f29354c = a9;
        this.f29355d = a9;
    }

    public final void c(Context context, String newPassword, String confirmNewPassword) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(newPassword, "newPassword");
        AbstractC3255y.i(confirmNewPassword, "confirmNewPassword");
        Q q8 = new Q();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, newPassword, confirmNewPassword, new T(), q8, null), 2, null);
    }

    public final void d(Context context, String newUsername, a5.Q q8, int i8, String usernameFormat) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(newUsername, "newUsername");
        AbstractC3255y.i(usernameFormat, "usernameFormat");
        Q q9 = new Q();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(context, newUsername, i8, new T(), q9, q8, usernameFormat, null), 2, null);
    }

    public final void e(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(context, new ArrayList(), this, null), 2, null);
    }

    public final InterfaceC3698L f() {
        return this.f29353b;
    }

    public final InterfaceC3698L g() {
        return this.f29355d;
    }
}
