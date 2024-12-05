package X4;

import a5.C1648o;
import a6.InterfaceC1668n;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import o5.AbstractC3685y;
import o5.C3660F;
import o5.C3674n;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class G1 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f12824a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f12825b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f12826c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f12827d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f12828e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f12829f;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f12830a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12831b;

        public a(int i8, int i9) {
            this.f12830a = i8;
            this.f12831b = i9;
        }

        public final int a() {
            return this.f12830a;
        }

        public final int b() {
            return this.f12831b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f12830a == aVar.f12830a && this.f12831b == aVar.f12831b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f12830a * 31) + this.f12831b;
        }

        public String toString() {
            return "UserNotifiersData(downloadsCount=" + this.f12830a + ", updatesCount=" + this.f12831b + ')';
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12832a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12833b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, S5.d dVar) {
            super(2, dVar);
            this.f12833b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f12833b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12832a == 0) {
                O5.t.b(obj);
                a5.Q.f14058k.a(this.f12833b);
                AccountManager accountManager = AccountManager.get(this.f12833b);
                String string = this.f12833b.getString(R.string.account);
                AbstractC3255y.h(string, "context.getString(R.string.account)");
                Account[] accountsByType = accountManager.getAccountsByType(string);
                AbstractC3255y.h(accountsByType, "mAccountManager.getAccountsByType(accountType)");
                for (Account account : accountsByType) {
                    if (j6.n.s(account.type, string, true)) {
                        if (Build.VERSION.SDK_INT >= 22) {
                            accountManager.removeAccount(account, null, null, null);
                        } else {
                            accountManager.removeAccount(account, null, null);
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12835b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G1 f12836c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, G1 g12, S5.d dVar) {
            super(2, dVar);
            this.f12835b = context;
            this.f12836c = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f12835b, this.f12836c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int Z7;
            T5.b.e();
            if (this.f12834a == 0) {
                O5.t.b(obj);
                int b8 = a5.O.f14043l.b(this.f12835b);
                C3674n a8 = C3674n.f36505t.a(this.f12835b);
                a8.a();
                ArrayList c02 = a8.c0();
                a8.l();
                Iterator it = c02.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    C1648o c1648o = (C1648o) it.next();
                    if (c1648o.p() == 0 && (1 > (Z7 = c1648o.Z()) || Z7 >= 100 || c1648o.z() != 0)) {
                        i8++;
                    }
                }
                this.f12836c.f12826c.setValue(new AbstractC3685y.c(new a(i8, b8)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12837a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12838b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a5.Q f12839c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G1 f12840d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, a5.Q q8, G1 g12, S5.d dVar) {
            super(2, dVar);
            this.f12838b = context;
            this.f12839c = q8;
            this.f12840d = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f12838b, this.f12839c, this.f12840d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12837a == 0) {
                O5.t.b(obj);
                C3660F c3660f = new C3660F(this.f12838b);
                String id = this.f12839c.getId();
                AbstractC3255y.f(id);
                a5.I r02 = c3660f.r0(id);
                if (!r02.b() && r02.d() != null) {
                    String d8 = r02.d();
                    AbstractC3255y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("reviewsCount")) {
                            this.f12840d.f12824a.setValue(kotlin.coroutines.jvm.internal.b.c(jSONObject2.getInt("reviewsCount")));
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12841a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12842b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G1 f12843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, G1 g12, S5.d dVar) {
            super(2, dVar);
            this.f12842b = context;
            this.f12843c = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f12842b, this.f12843c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String id;
            String d8;
            T5.b.e();
            if (this.f12841a == 0) {
                O5.t.b(obj);
                C3660F c3660f = new C3660F(this.f12842b);
                a5.Q e8 = a5.Q.f14058k.e(this.f12842b);
                if (e8 != null && (id = e8.getId()) != null && id.length() != 0) {
                    String id2 = e8.getId();
                    AbstractC3255y.f(id2);
                    a5.I Z7 = c3660f.Z(id2);
                    if (!Z7.b() && (d8 = Z7.d()) != null && d8.length() != 0) {
                        String d9 = Z7.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            AbstractC3255y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                            if (!jSONObject2.isNull("url")) {
                                this.f12843c.f12828e.setValue(new AbstractC3685y.c(jSONObject2.getString("url")));
                            }
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public G1() {
        o6.w a8 = AbstractC3700N.a(0);
        this.f12824a = a8;
        this.f12825b = a8;
        o6.w a9 = AbstractC3700N.a(AbstractC3685y.b.f36549a);
        this.f12826c = a9;
        this.f12827d = a9;
        o6.w a10 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f12828e = a10;
        this.f12829f = a10;
    }

    public final void d(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, null), 2, null);
    }

    public final void e(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, this, null), 2, null);
    }

    public final void f(Context context, a5.Q user) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(user, "user");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(context, user, this, null), 2, null);
    }

    public final InterfaceC3698L g() {
        return this.f12829f;
    }

    public final void h(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(context, this, null), 2, null);
    }

    public final InterfaceC3698L i() {
        return this.f12827d;
    }

    public final InterfaceC3698L j() {
        return this.f12825b;
    }
}
