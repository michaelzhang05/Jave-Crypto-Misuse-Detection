package com.uptodown.activities;

import a5.C1642i;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
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
public final class G extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f29302a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f29303b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f29304c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f29305d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f29306e;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29307a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29308b;

        public a(ArrayList avatars, ArrayList turboAvatars) {
            AbstractC3255y.i(avatars, "avatars");
            AbstractC3255y.i(turboAvatars, "turboAvatars");
            this.f29307a = avatars;
            this.f29308b = turboAvatars;
        }

        public final ArrayList a() {
            return this.f29307a;
        }

        public final ArrayList b() {
            return this.f29308b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f29307a, aVar.f29307a) && AbstractC3255y.d(this.f29308b, aVar.f29308b);
        }

        public int hashCode() {
            return (this.f29307a.hashCode() * 31) + this.f29308b.hashCode();
        }

        public String toString() {
            return "AvatarsData(avatars=" + this.f29307a + ", turboAvatars=" + this.f29308b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f29312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ G f29313e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ArrayList arrayList, ArrayList arrayList2, G g8, S5.d dVar) {
            super(2, dVar);
            this.f29310b = context;
            this.f29311c = arrayList;
            this.f29312d = arrayList2;
            this.f29313e = g8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f29310b, this.f29311c, this.f29312d, this.f29313e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29309a == 0) {
                O5.t.b(obj);
                a5.I o02 = new C3660F(this.f29310b).o0();
                if (!o02.b() && o02.d() != null) {
                    String d8 = o02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = o02.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("basic")) {
                                JSONArray jSONArray = jSONObject2.getJSONArray("basic");
                                int length = jSONArray.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    JSONObject jsonAvatar = jSONArray.getJSONObject(i8);
                                    C1642i.a aVar = C1642i.f14245f;
                                    AbstractC3255y.h(jsonAvatar, "jsonAvatar");
                                    this.f29311c.add(aVar.a(jsonAvatar));
                                }
                            }
                            if (!jSONObject2.isNull("turbo")) {
                                JSONArray jSONArray2 = jSONObject2.getJSONArray("turbo");
                                int length2 = jSONArray2.length();
                                for (int i9 = 0; i9 < length2; i9++) {
                                    JSONObject jsonAvatar2 = jSONArray2.getJSONObject(i9);
                                    C1642i.a aVar2 = C1642i.f14245f;
                                    AbstractC3255y.h(jsonAvatar2, "jsonAvatar");
                                    this.f29312d.add(aVar2.a(jsonAvatar2));
                                }
                            }
                        }
                    }
                }
                this.f29313e.f29302a.setValue(new AbstractC3685y.c(new a(this.f29311c, this.f29312d)));
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
        int f29314a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29316c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1642i f29317d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, C1642i c1642i, S5.d dVar) {
            super(2, dVar);
            this.f29316c = context;
            this.f29317d = c1642i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29316c, this.f29317d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                T5.b.e()
                int r0 = r4.f29314a
                if (r0 != 0) goto Laa
                O5.t.b(r5)
                com.uptodown.activities.G r5 = com.uptodown.activities.G.this
                o6.w r5 = com.uptodown.activities.G.b(r5)
                r0 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r0)
                r5.setValue(r1)
                o5.F r5 = new o5.F
                android.content.Context r1 = r4.f29316c
                r5.<init>(r1)
                a5.i r1 = r4.f29317d
                long r1 = r1.d()
                a5.I r5 = r5.Q0(r1)
                boolean r1 = r5.b()
                r2 = 1
                if (r1 != 0) goto L89
                java.lang.String r1 = r5.d()
                if (r1 == 0) goto L89
                java.lang.String r1 = r5.d()
                kotlin.jvm.internal.AbstractC3255y.f(r1)
                int r1 = r1.length()
                if (r1 <= 0) goto L89
                org.json.JSONObject r1 = new org.json.JSONObject
                java.lang.String r5 = r5.d()
                kotlin.jvm.internal.AbstractC3255y.f(r5)
                r1.<init>(r5)
                java.lang.String r5 = "success"
                boolean r3 = r1.isNull(r5)
                if (r3 != 0) goto L89
                int r5 = r1.getInt(r5)
                if (r5 != r2) goto L8a
                com.uptodown.activities.G r1 = com.uptodown.activities.G.this
                o6.w r1 = r1.f()
                java.lang.Object r1 = r1.getValue()
                a5.Q r1 = (a5.Q) r1
                if (r1 != 0) goto L6c
                goto L75
            L6c:
                a5.i r3 = r4.f29317d
                java.lang.String r3 = r3.e()
                r1.J(r3)
            L75:
                com.uptodown.activities.G r1 = com.uptodown.activities.G.this
                o6.w r1 = r1.f()
                java.lang.Object r1 = r1.getValue()
                a5.Q r1 = (a5.Q) r1
                if (r1 == 0) goto L8a
                android.content.Context r3 = r4.f29316c
                r1.H(r3)
                goto L8a
            L89:
                r5 = 0
            L8a:
                if (r5 != r2) goto L9a
                com.uptodown.activities.G r5 = com.uptodown.activities.G.this
                o6.w r5 = com.uptodown.activities.G.b(r5)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r2)
                r5.setValue(r0)
                goto La7
            L9a:
                com.uptodown.activities.G r5 = com.uptodown.activities.G.this
                o6.w r5 = com.uptodown.activities.G.b(r5)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
                r5.setValue(r0)
            La7:
                O5.I r5 = O5.I.f8278a
                return r5
            Laa:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.G.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public G() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f29302a = a8;
        this.f29303b = a8;
        o6.w a9 = AbstractC3700N.a(Boolean.FALSE);
        this.f29304c = a9;
        this.f29305d = a9;
        this.f29306e = AbstractC3700N.a(null);
    }

    public final void c(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, new ArrayList(), new ArrayList(), this, null), 2, null);
    }

    public final InterfaceC3698L d() {
        return this.f29303b;
    }

    public final InterfaceC3698L e() {
        return this.f29305d;
    }

    public final o6.w f() {
        return this.f29306e;
    }

    public final void g(Context context, C1642i avatar) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(avatar, "avatar");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, avatar, null), 2, null);
    }
}
