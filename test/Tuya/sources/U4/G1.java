package U4;

import X4.C1505o;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l5.C3326n;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class G1 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f11154a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f11155b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f11156c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f11157d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f11158e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f11159f;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f11160a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11161b;

        public a(int i8, int i9) {
            this.f11160a = i8;
            this.f11161b = i9;
        }

        public final int a() {
            return this.f11160a;
        }

        public final int b() {
            return this.f11161b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f11160a == aVar.f11160a && this.f11161b == aVar.f11161b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f11160a * 31) + this.f11161b;
        }

        public String toString() {
            return "UserNotifiersData(downloadsCount=" + this.f11160a + ", updatesCount=" + this.f11161b + ')';
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11163b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, P5.d dVar) {
            super(2, dVar);
            this.f11163b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f11163b, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11162a == 0) {
                L5.t.b(obj);
                X4.Q.f12437k.a(this.f11163b);
                AccountManager accountManager = AccountManager.get(this.f11163b);
                String string = this.f11163b.getString(R.string.account);
                AbstractC3159y.h(string, "context.getString(R.string.account)");
                Account[] accountsByType = accountManager.getAccountsByType(string);
                AbstractC3159y.h(accountsByType, "mAccountManager.getAccountsByType(accountType)");
                for (Account account : accountsByType) {
                    if (g6.n.s(account.type, string, true)) {
                        if (Build.VERSION.SDK_INT >= 22) {
                            accountManager.removeAccount(account, null, null, null);
                        } else {
                            accountManager.removeAccount(account, null, null);
                        }
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11165b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G1 f11166c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, G1 g12, P5.d dVar) {
            super(2, dVar);
            this.f11165b = context;
            this.f11166c = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f11165b, this.f11166c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int Z7;
            Q5.b.e();
            if (this.f11164a == 0) {
                L5.t.b(obj);
                int b8 = X4.O.f12422l.b(this.f11165b);
                C3326n a8 = C3326n.f34504t.a(this.f11165b);
                a8.a();
                ArrayList c02 = a8.c0();
                a8.g();
                Iterator it = c02.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    C1505o c1505o = (C1505o) it.next();
                    if (c1505o.k() == 0 && (1 > (Z7 = c1505o.Z()) || Z7 >= 100 || c1505o.I() != 0)) {
                        i8++;
                    }
                }
                this.f11166c.f11156c.setValue(new AbstractC3337y.c(new a(i8, b8)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11167a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11168b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.Q f11169c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G1 f11170d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, X4.Q q8, G1 g12, P5.d dVar) {
            super(2, dVar);
            this.f11168b = context;
            this.f11169c = q8;
            this.f11170d = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f11168b, this.f11169c, this.f11170d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11167a == 0) {
                L5.t.b(obj);
                C3312F c3312f = new C3312F(this.f11168b);
                String id = this.f11169c.getId();
                AbstractC3159y.f(id);
                X4.I r02 = c3312f.r0(id);
                if (!r02.b() && r02.d() != null) {
                    String d8 = r02.d();
                    AbstractC3159y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("reviewsCount")) {
                            this.f11170d.f11154a.setValue(kotlin.coroutines.jvm.internal.b.c(jSONObject2.getInt("reviewsCount")));
                        }
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G1 f11173c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, G1 g12, P5.d dVar) {
            super(2, dVar);
            this.f11172b = context;
            this.f11173c = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f11172b, this.f11173c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String id;
            String d8;
            Q5.b.e();
            if (this.f11171a == 0) {
                L5.t.b(obj);
                C3312F c3312f = new C3312F(this.f11172b);
                X4.Q e8 = X4.Q.f12437k.e(this.f11172b);
                if (e8 != null && (id = e8.getId()) != null && id.length() != 0) {
                    String id2 = e8.getId();
                    AbstractC3159y.f(id2);
                    X4.I Z7 = c3312f.Z(id2);
                    if (!Z7.b() && (d8 = Z7.d()) != null && d8.length() != 0) {
                        String d9 = Z7.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                            if (!jSONObject2.isNull("url")) {
                                this.f11173c.f11158e.setValue(new AbstractC3337y.c(jSONObject2.getString("url")));
                            }
                        }
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public G1() {
        l6.v a8 = AbstractC3351M.a(0);
        this.f11154a = a8;
        this.f11155b = a8;
        l6.v a9 = AbstractC3351M.a(AbstractC3337y.b.f34548a);
        this.f11156c = a9;
        this.f11157d = a9;
        l6.v a10 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f11158e = a10;
        this.f11159f = a10;
    }

    public final void d(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, null), 2, null);
    }

    public final void e(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, this, null), 2, null);
    }

    public final void f(Context context, X4.Q user) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(user, "user");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(context, user, this, null), 2, null);
    }

    public final InterfaceC3349K g() {
        return this.f11159f;
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(context, this, null), 2, null);
    }

    public final InterfaceC3349K i() {
        return this.f11157d;
    }

    public final InterfaceC3349K j() {
        return this.f11155b;
    }
}
