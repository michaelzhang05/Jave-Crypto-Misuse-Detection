package com.uptodown.activities;

import X4.C1499i;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class H extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28259a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28260b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f28261c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f28262d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f28263e;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f28264a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f28265b;

        public a(ArrayList avatars, ArrayList turboAvatars) {
            AbstractC3159y.i(avatars, "avatars");
            AbstractC3159y.i(turboAvatars, "turboAvatars");
            this.f28264a = avatars;
            this.f28265b = turboAvatars;
        }

        public final ArrayList a() {
            return this.f28264a;
        }

        public final ArrayList b() {
            return this.f28265b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f28264a, aVar.f28264a) && AbstractC3159y.d(this.f28265b, aVar.f28265b);
        }

        public int hashCode() {
            return (this.f28264a.hashCode() * 31) + this.f28265b.hashCode();
        }

        public String toString() {
            return "AvatarsData(avatars=" + this.f28264a + ", turboAvatars=" + this.f28265b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28267b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28268c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f28269d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H f28270e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ArrayList arrayList, ArrayList arrayList2, H h8, P5.d dVar) {
            super(2, dVar);
            this.f28267b = context;
            this.f28268c = arrayList;
            this.f28269d = arrayList2;
            this.f28270e = h8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f28267b, this.f28268c, this.f28269d, this.f28270e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28266a == 0) {
                L5.t.b(obj);
                X4.I o02 = new C3312F(this.f28267b).o0();
                if (!o02.b() && o02.d() != null) {
                    String d8 = o02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = o02.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("basic")) {
                                JSONArray jSONArray = jSONObject2.getJSONArray("basic");
                                int length = jSONArray.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    JSONObject jsonAvatar = jSONArray.getJSONObject(i8);
                                    C1499i.a aVar = C1499i.f12624f;
                                    AbstractC3159y.h(jsonAvatar, "jsonAvatar");
                                    this.f28268c.add(aVar.a(jsonAvatar));
                                }
                            }
                            if (!jSONObject2.isNull("turbo")) {
                                JSONArray jSONArray2 = jSONObject2.getJSONArray("turbo");
                                int length2 = jSONArray2.length();
                                for (int i9 = 0; i9 < length2; i9++) {
                                    JSONObject jsonAvatar2 = jSONArray2.getJSONObject(i9);
                                    C1499i.a aVar2 = C1499i.f12624f;
                                    AbstractC3159y.h(jsonAvatar2, "jsonAvatar");
                                    this.f28269d.add(aVar2.a(jsonAvatar2));
                                }
                            }
                        }
                    }
                }
                this.f28270e.f28259a.setValue(new AbstractC3337y.c(new a(this.f28268c, this.f28269d)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28271a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28273c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1499i f28274d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, C1499i c1499i, P5.d dVar) {
            super(2, dVar);
            this.f28273c = context;
            this.f28274d = c1499i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28273c, this.f28274d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
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
                Q5.b.e()
                int r0 = r4.f28271a
                if (r0 != 0) goto Laa
                L5.t.b(r5)
                com.uptodown.activities.H r5 = com.uptodown.activities.H.this
                l6.v r5 = com.uptodown.activities.H.b(r5)
                r0 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r0)
                r5.setValue(r1)
                l5.F r5 = new l5.F
                android.content.Context r1 = r4.f28273c
                r5.<init>(r1)
                X4.i r1 = r4.f28274d
                long r1 = r1.d()
                X4.I r5 = r5.Q0(r1)
                boolean r1 = r5.b()
                r2 = 1
                if (r1 != 0) goto L89
                java.lang.String r1 = r5.d()
                if (r1 == 0) goto L89
                java.lang.String r1 = r5.d()
                kotlin.jvm.internal.AbstractC3159y.f(r1)
                int r1 = r1.length()
                if (r1 <= 0) goto L89
                org.json.JSONObject r1 = new org.json.JSONObject
                java.lang.String r5 = r5.d()
                kotlin.jvm.internal.AbstractC3159y.f(r5)
                r1.<init>(r5)
                java.lang.String r5 = "success"
                boolean r3 = r1.isNull(r5)
                if (r3 != 0) goto L89
                int r5 = r1.getInt(r5)
                if (r5 != r2) goto L8a
                com.uptodown.activities.H r1 = com.uptodown.activities.H.this
                l6.v r1 = r1.f()
                java.lang.Object r1 = r1.getValue()
                X4.Q r1 = (X4.Q) r1
                if (r1 != 0) goto L6c
                goto L75
            L6c:
                X4.i r3 = r4.f28274d
                java.lang.String r3 = r3.e()
                r1.Q(r3)
            L75:
                com.uptodown.activities.H r1 = com.uptodown.activities.H.this
                l6.v r1 = r1.f()
                java.lang.Object r1 = r1.getValue()
                X4.Q r1 = (X4.Q) r1
                if (r1 == 0) goto L8a
                android.content.Context r3 = r4.f28273c
                r1.L(r3)
                goto L8a
            L89:
                r5 = 0
            L8a:
                if (r5 != r2) goto L9a
                com.uptodown.activities.H r5 = com.uptodown.activities.H.this
                l6.v r5 = com.uptodown.activities.H.b(r5)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r2)
                r5.setValue(r0)
                goto La7
            L9a:
                com.uptodown.activities.H r5 = com.uptodown.activities.H.this
                l6.v r5 = com.uptodown.activities.H.b(r5)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
                r5.setValue(r0)
            La7:
                L5.I r5 = L5.I.f6487a
                return r5
            Laa:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.H.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public H() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f28259a = a8;
        this.f28260b = a8;
        l6.v a9 = AbstractC3351M.a(Boolean.FALSE);
        this.f28261c = a9;
        this.f28262d = a9;
        this.f28263e = AbstractC3351M.a(null);
    }

    public final void c(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, new ArrayList(), new ArrayList(), this, null), 2, null);
    }

    public final InterfaceC3349K d() {
        return this.f28260b;
    }

    public final InterfaceC3349K e() {
        return this.f28262d;
    }

    public final l6.v f() {
        return this.f28263e;
    }

    public final void g(Context context, C1499i avatar) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(avatar, "avatar");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, avatar, null), 2, null);
    }
}
